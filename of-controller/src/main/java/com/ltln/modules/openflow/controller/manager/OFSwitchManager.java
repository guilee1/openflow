package com.ltln.modules.openflow.controller.manager;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelOption;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.util.HashedWheelTimer;
import io.netty.util.Timer;
import io.netty.util.concurrent.GlobalEventExecutor;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.ltln.modules.openflow.controller.config.Constraints;
import com.ltln.modules.openflow.controller.inf.HARole;
import com.ltln.modules.openflow.controller.inf.IAppHandshakePluginFactory;
import com.ltln.modules.openflow.controller.inf.INewOFConnectionListener;
import com.ltln.modules.openflow.controller.inf.IOFConnectionBackend;
import com.ltln.modules.openflow.controller.inf.IOFSwitch;
import com.ltln.modules.openflow.controller.inf.IOFSwitch.SwitchStatus;
import com.ltln.modules.openflow.controller.inf.IOFSwitchBackend;
import com.ltln.modules.openflow.controller.inf.IOFSwitchDriver;
import com.ltln.modules.openflow.controller.inf.IOFSwitchManager;
import com.ltln.modules.openflow.controller.inf.IOFSwitchService;
import com.ltln.modules.openflow.controller.inf.ISwitchDriverRegistry;
import com.ltln.modules.openflow.controller.inf.LogicalOFMessageCategory;
import com.ltln.modules.openflow.controller.inf.PortChangeType;
import com.ltln.modules.openflow.controller.inf.SwitchDescription;
import com.ltln.modules.openflow.core.protocol.OFControllerRole;
import com.ltln.modules.openflow.core.protocol.OFFactories;
import com.ltln.modules.openflow.core.protocol.OFFactory;
import com.ltln.modules.openflow.core.protocol.OFFeaturesReply;
import com.ltln.modules.openflow.core.protocol.OFMessage;
import com.ltln.modules.openflow.core.protocol.OFPortDesc;
import com.ltln.modules.openflow.core.protocol.OFVersion;
import com.ltln.modules.openflow.core.types.DatapathId;
import com.ltln.modules.openflow.core.types.IPv4Address;
import com.ltln.modules.openflow.core.types.OFAuxId;
import com.ltln.modules.openflow.core.types.TableId;
import com.ltln.modules.openflow.core.types.U32;

/**
 * The Switch Manager class contains most of the code involved with dealing
 * with switches. The Switch manager keeps track of the switches known to the controller,
 * their status, and any important information about the switch lifecycle. The
 * Switch Manager also provides the switch service, which allows other modules
 * to hook in switch listeners and get basic access to switch information.
 *
 * @author gregor, capveg, sovietaced
 *
 */
public class OFSwitchManager implements IOFSwitchManager, INewOFConnectionListener, IOFSwitchService {
	private static final Logger log = LoggerFactory.getLogger(OFSwitchManager.class);

	private volatile OFControllerRole role;

	private static String keyStorePassword;
	private static String keyStore;

	protected static boolean clearTablesOnInitialConnectAsMaster = false;
	protected static boolean clearTablesOnEachTransitionToMaster = false;

	protected static Map<DatapathId, TableId> forwardToControllerFlowsUpToTableByDpid;
	protected static TableId forwardToControllerFlowsUpToTable = TableId.of(4); /* this should cover most HW switches that have a couple SW-based flow tables */

	protected static List<U32> ofBitmaps;
	protected static OFFactory defaultFactory;

	private ConcurrentHashMap<DatapathId, OFSwitchHandshakeHandler> switchHandlers;
	private ConcurrentHashMap<DatapathId, IOFSwitchBackend> switches;

	private ISwitchDriverRegistry driverRegistry;

	private Set<LogicalOFMessageCategory> logicalOFMessageCategories = new CopyOnWriteArraySet<LogicalOFMessageCategory>();
	private final List<IAppHandshakePluginFactory> handshakePlugins = new CopyOnWriteArrayList<IAppHandshakePluginFactory>();
	private int numRequiredConnections = -1;


	private NioEventLoopGroup bossGroup;
	private NioEventLoopGroup workerGroup;
	private DefaultChannelGroup cg;

	
	
	/**roleManager here*/
	RoleManager roleManager = new RoleManager(HARole.ACTIVE, "Controller startup.");
	protected Timer timer = new HashedWheelTimer();
	

	@Override
	public synchronized void switchAdded(IOFSwitchBackend sw) {
		DatapathId dpid = sw.getId();
		IOFSwitchBackend oldSw = this.switches.put(dpid, sw);
		// Update event history

		if (oldSw == sw)  {
			// Note == for object equality, not .equals for value
			log.error("Switch {} added twice?", sw);
			return;
		} else if (oldSw != null) {
			// This happens either when we have switches with duplicate
			// DPIDs or when a switch reconnects before we saw the
			// disconnect
			log.warn("New switch added {} for already-added switch {}", sw, oldSw);
			// We need to disconnect and remove the old switch
			// TODO: we notify switch listeners that the switch has been
			// removed and then we notify them that the new one has been
			// added. One could argue that a switchChanged notification
			// might be more appropriate in this case....
			oldSw.cancelAllPendingRequests();
//			addUpdateToQueue(new SwitchUpdate(dpid, SwitchUpdateType.REMOVED));
			oldSw.disconnect();
		}

		/*
		 * Set some other config options for this switch.
		 */
		if (sw.getOFFactory().getVersion().compareTo(OFVersion.OF_13) >= 0) {
			if (forwardToControllerFlowsUpToTableByDpid.containsKey(sw.getId())) {
				sw.setMaxTableForTableMissFlow(forwardToControllerFlowsUpToTableByDpid.get(sw.getId()));
			} else {
				sw.setMaxTableForTableMissFlow(forwardToControllerFlowsUpToTable);
			}
		}
	}

	@Override
	public synchronized void switchStatusChanged(IOFSwitchBackend sw, SwitchStatus oldStatus, SwitchStatus newStatus) {
		DatapathId dpid = sw.getId();
		IOFSwitchBackend presentSw = this.switches.get(dpid);

		if (presentSw != sw)  {
			// Note == for object equality, not .equals for value
			log.debug("Switch {} status change but not present in sync manager", sw);
			return;
		}

		if(newStatus == SwitchStatus.MASTER  && role != OFControllerRole.ROLE_MASTER) {
			log.error("Switch {} activated but controller not MASTER", sw);
			sw.disconnect();
			return; // only react to switch connections when master
		}

		if(!oldStatus.isVisible() && newStatus.isVisible()) {
			// the switch has just become visible. Send 'add' notification to our
			// listeners
//			addUpdateToQueue(new SwitchUpdate(dpid, SwitchUpdateType.ADDED));
		} else if((oldStatus.isVisible() && !newStatus.isVisible())) {
//			addUpdateToQueue(new SwitchUpdate(dpid, SwitchUpdateType.REMOVED));
		}

		// note: no else if - both may be true
		if(oldStatus != SwitchStatus.MASTER && newStatus == SwitchStatus.MASTER ) {
//			addUpdateToQueue(new SwitchUpdate(dpid,
//					SwitchUpdateType.ACTIVATED));
		} else if(oldStatus == SwitchStatus.MASTER && newStatus != SwitchStatus.MASTER ) {
//			addUpdateToQueue(new SwitchUpdate(dpid, SwitchUpdateType.DEACTIVATED));
		}
	}

	@Override
	public synchronized void switchDisconnected(IOFSwitchBackend sw) {
		DatapathId dpid = sw.getId();
		IOFSwitchBackend presentSw = this.switches.get(dpid);

		if (presentSw != sw)  {
			// Note == for object equality, not .equals for value
			log.warn("Switch {} disconnect but not present in sync manager", sw);
			return;
		}

		this.switches.remove(dpid);
	}

	@Override public void handshakeDisconnected(DatapathId dpid) {
		this.switchHandlers.remove(dpid);
	}

	public Iterable<IOFSwitch> getActiveSwitches() {
		ImmutableList.Builder<IOFSwitch> builder = ImmutableList.builder();
		for(IOFSwitch sw: switches.values()) {
			if(sw.getStatus().isControllable())
				builder.add(sw);
		}
		return builder.build();
	}

	public Map<DatapathId, IOFSwitch> getAllSwitchMap(boolean showInvisible) {
		if(showInvisible) {
			return ImmutableMap.<DatapathId, IOFSwitch>copyOf(switches);
		} else {
			ImmutableMap.Builder<DatapathId, IOFSwitch> builder = ImmutableMap.builder();
			for(IOFSwitch sw: switches.values()) {
				if(sw.getStatus().isVisible())
					builder.put(sw.getId(), sw);
			}
			return builder.build();
		}
	}

	@Override
	public Map<DatapathId, IOFSwitch> getAllSwitchMap() {
		return getAllSwitchMap(true);
	}

	@Override
	public Set<DatapathId> getAllSwitchDpids() {
		return getAllSwitchMap().keySet();
	}

	public Set<DatapathId> getAllSwitchDpids(boolean showInvisible) {
		return getAllSwitchMap(showInvisible).keySet();
	}

	@Override
	public IOFSwitch getSwitch(DatapathId dpid) {
		return this.switches.get(dpid);
	}

	@Override
	public IOFSwitch getActiveSwitch(DatapathId dpid) {
		IOFSwitchBackend sw = this.switches.get(dpid);
		if(sw != null && sw.getStatus().isVisible())
			return sw;
		else
			return null;
	}

	enum SwitchUpdateType {
		ADDED,
		REMOVED,
		ACTIVATED,
		DEACTIVATED,
		PORTCHANGED,
		OTHERCHANGE
	}


	/**
	 * Handles a new OF Connection
	 * @param IOFConnectionBackend connection an opened OF Connection
	 * @param OFFeaturesReply featuresReply the features reply received for the opened connection.
	 * It is needed for the rest of the switch handshake.
	 */
	@Override
	public void connectionOpened(IOFConnectionBackend connection, OFFeaturesReply featuresReply) {
		DatapathId dpid = connection.getDatapathId();
		OFAuxId auxId = connection.getAuxId();

		log.debug("{} opened", connection);

		if(auxId.equals(OFAuxId.MAIN)) {

			// Create a new switch handshake handler
			OFSwitchHandshakeHandler handler =
					new OFSwitchHandshakeHandler(connection, featuresReply, this,
							this.roleManager, this.timer);

			OFSwitchHandshakeHandler oldHandler = switchHandlers.put(dpid, handler);

			// Disconnect all the handler's connections
			if(oldHandler != null){
				log.debug("{} is a new main connection, killing old handler connections", connection);
				oldHandler.cleanup();
			}

			handler.beginHandshake();

		} else {
			OFSwitchHandshakeHandler handler = switchHandlers.get(dpid);

			if(handler != null) {
				handler.auxConnectionOpened(connection);
			}
			// Connections have arrived before the switchhandler is ready
			else {
				log.warn("{} arrived before main connection, closing connection", connection);
				connection.disconnect();
			}
		}
	}

	@Override
	public void addSwitchEvent(DatapathId dpid, String reason, boolean flushNow) {
//		if (flushNow)
//			evSwitch.newEventWithFlush(new SwitchEvent(dpid, reason));
//		else
//			evSwitch.newEventNoFlush(new SwitchEvent(dpid, reason));
	}

	@Override
	public synchronized void notifyPortChanged(IOFSwitchBackend sw,
			OFPortDesc port,
			PortChangeType changeType) {
		Preconditions.checkNotNull(sw, "switch must not be null");
		Preconditions.checkNotNull(port, "port must not be null");
		Preconditions.checkNotNull(changeType, "changeType must not be null");

		if (role != OFControllerRole.ROLE_MASTER) {
			return;
		}
		if (!this.switches.containsKey(sw.getId())) {
			return;
		}

		if(sw.getStatus().isVisible()) {
			// no need to count here. SwitchUpdate.dispatch will count
			// the portchanged
//			SwitchUpdate update = new SwitchUpdate(sw.getId(),
//					SwitchUpdateType.PORTCHANGED,
//					port, changeType);
//			addUpdateToQueue(update);
		}
	}

	@Override
	public IOFSwitchBackend getOFSwitchInstance(IOFConnectionBackend connection,
			SwitchDescription description,
			OFFactory factory, DatapathId datapathId) {

		return this.driverRegistry.getOFSwitchInstance(connection, description, factory, datapathId);
	}

	@Override
	public void handleMessage(IOFSwitchBackend sw, OFMessage m) {
		//controller receive msg here
	}

	@Override
	public void handleOutgoingMessage(IOFSwitch sw, OFMessage m) {
		//controller receive msg here
	}

	@Override
	public void addOFSwitchDriver(String manufacturerDescriptionPrefix,
			IOFSwitchDriver driver) {
		this.driverRegistry.addSwitchDriver(manufacturerDescriptionPrefix, driver);
	}

	@Override
	public ImmutableList<OFSwitchHandshakeHandler> getSwitchHandshakeHandlers() {
		return ImmutableList.copyOf(this.switchHandlers.values());
	}

	@Override
	public int getNumRequiredConnections() {
		Preconditions.checkState(numRequiredConnections >= 0, "numRequiredConnections not calculated");
		return numRequiredConnections;
	}

	public Set<LogicalOFMessageCategory> getLogicalOFMessageCategories() {
		return logicalOFMessageCategories;
	}

	private int calcNumRequiredConnections() {
		if(!this.logicalOFMessageCategories.isEmpty()){
			// We use tree set here to maintain ordering
			TreeSet<OFAuxId> auxConnections = new TreeSet<OFAuxId>();

			for(LogicalOFMessageCategory category : this.logicalOFMessageCategories){
				auxConnections.add(category.getAuxId());
			}

			OFAuxId first = auxConnections.first();
			OFAuxId last = auxConnections.last();

			// Check for contiguous set (1....size())
			if(first.equals(OFAuxId.MAIN)) {
				if(last.getValue() != auxConnections.size() - 1){
					throw new IllegalStateException("Logical OF message categories must maintain contiguous OF Aux Ids! i.e. (0,1,2,3,4,5)");
				}
				return auxConnections.size() - 1;
			} else if(first.equals(OFAuxId.of(1))) {
				if(last.getValue() != auxConnections.size()){
					throw new IllegalStateException("Logical OF message categories must maintain contiguous OF Aux Ids! i.e. (1,2,3,4,5)");
				}
				return auxConnections.size();
			} else {
				throw new IllegalStateException("Logical OF message categories must start at 0 (MAIN) or 1");
			}
		} else {
			return 0;
		}
	}


	@Override
	public void registerLogicalOFMessageCategory(LogicalOFMessageCategory category) {
		logicalOFMessageCategories.add(category);
	}

	@Override
	public boolean isCategoryRegistered(LogicalOFMessageCategory category) {
		return logicalOFMessageCategories.contains(category);
	}

	@Override
	public List<IAppHandshakePluginFactory> getHandshakePlugins() {
		return handshakePlugins;
	}


	public void init()  {

		switchHandlers = new ConcurrentHashMap<DatapathId, OFSwitchHandshakeHandler>();
		switches = new ConcurrentHashMap<DatapathId, IOFSwitchBackend>();
		driverRegistry = new NaiveSwitchDriverRegistry(this);


		/* 
		 * Get SSL config.
		 * 
		 * If a password is blank, the password field may or may not be specified.
		 * If it is specified, an empty string will be expected for blank.
		 * 
		 * The path MUST be specified if SSL is enabled.
		 */
		Map<String, String> configParams = Constraints.getConfigParams();
		String path = configParams.get("keyStorePath");
		String pass = configParams.get("keyStorePassword");
		String useSsl = configParams.get("useSsl");

		if (useSsl == null || path == null || path.isEmpty() || 
				(!useSsl.equalsIgnoreCase("yes") && !useSsl.equalsIgnoreCase("true") &&
						!useSsl.equalsIgnoreCase("yep") && !useSsl.equalsIgnoreCase("ja") &&
						!useSsl.equalsIgnoreCase("stimmt")
						)
				) {
			log.warn("SSL disabled. Using unsecure connections between controller and switches.");
			OFSwitchManager.keyStore = null;
			OFSwitchManager.keyStorePassword = null;
		} else {
			log.info("SSL enabled. Using secure connections between controller and switches.");
			log.info("SSL keystore path: {}, password: {}", path, (pass == null ? "" : pass)); 
			OFSwitchManager.keyStore = path;
			OFSwitchManager.keyStorePassword = (pass == null ? "" : pass);
		}

		/*
		 * Get config to define what to do when a switch connects.
		 * 
		 * If a field is blank or unspecified, it will default
		 */
		String clearInitial = configParams.get("clearTablesOnInitialHandshakeAsMaster");
		String clearLater = configParams.get("clearTablesOnEachTransitionToMaster");

		if (clearInitial == null || clearInitial.isEmpty() || 
				(!clearInitial.equalsIgnoreCase("yes") && !clearInitial.equalsIgnoreCase("true") &&
						!clearInitial.equalsIgnoreCase("yep") && !clearInitial.equalsIgnoreCase("ja") &&
						!clearInitial.equalsIgnoreCase("stimmt"))) {
			log.info("Clear switch flow tables on initial handshake as master: FALSE");
			OFSwitchManager.clearTablesOnInitialConnectAsMaster = false;
		} else {
			log.info("Clear switch flow tables on initial handshake as master: TRUE");
			OFSwitchManager.clearTablesOnInitialConnectAsMaster = true;
		}

		if (clearLater == null || clearLater.isEmpty() || 
				(!clearLater.equalsIgnoreCase("yes") && !clearLater.equalsIgnoreCase("true") &&
						!clearLater.equalsIgnoreCase("yep") && !clearLater.equalsIgnoreCase("ja") &&
						!clearLater.equalsIgnoreCase("stimmt"))) {
			log.info("Clear switch flow tables on each transition to master: FALSE");
			OFSwitchManager.clearTablesOnEachTransitionToMaster = false;
		} else {
			log.info("Clear switch flow tables on each transition to master: TRUE");
			OFSwitchManager.clearTablesOnEachTransitionToMaster = true;
		}

		/*
		 * Get default max table for forward to controller flows. 
		 * Internal default set as class variable at top of OFSwitchManager.
		 */
		String defaultFlowsUpToTable = configParams.get("defaultMaxTablesToReceiveTableMissFlow");
		/* Backward compatibility */
		if (defaultFlowsUpToTable == null || defaultFlowsUpToTable.isEmpty()) {
			defaultFlowsUpToTable = configParams.get("defaultMaxTableToReceiveTableMissFlow");
		}
		if (defaultFlowsUpToTable != null && !defaultFlowsUpToTable.isEmpty()) {
			defaultFlowsUpToTable = defaultFlowsUpToTable.toLowerCase().trim();
			try {
				forwardToControllerFlowsUpToTable = TableId.of(defaultFlowsUpToTable.startsWith("0x") 
						? Integer.parseInt(defaultFlowsUpToTable.replaceFirst("0x", ""), 16) 
								: Integer.parseInt(defaultFlowsUpToTable));
				log.info("Setting {} as the default max tables to receive table-miss flow", forwardToControllerFlowsUpToTable.toString());
			} catch (IllegalArgumentException e) {
				log.error("Invalid table ID {} for default max tables to receive table-miss flow. Using pre-set of {}", 
						defaultFlowsUpToTable, forwardToControllerFlowsUpToTable.toString());
			}
		} else {
			log.info("Default max tables to receive table-miss flow not configured. Using {}", forwardToControllerFlowsUpToTable.toString());
		}

		/*
		 * Get config to define which tables per switch will get a
		 * default forward-to-controller flow. This can be used to
		 * reduce the number of such flows if only a reduced set of
		 * tables are being used.
		 */
		String maxPerDpid = configParams.get("maxTablesToReceiveTableMissFlowPerDpid");
		/* Backward compatibility */
		if (maxPerDpid == null || maxPerDpid.isEmpty()) {
			maxPerDpid = configParams.get("maxTableToReceiveTableMissFlowPerDpid");
		}
		forwardToControllerFlowsUpToTableByDpid = jsonToSwitchTableIdMap(maxPerDpid);

		/*
		 * Get config to determine what versions of OpenFlow we will
		 * support. The versions will determine the hello's header
		 * version as well as the OF1.3.1 version bitmap contents.
		 */
		String protocols = configParams.get("supportedOpenFlowVersions");
		Set<OFVersion> ofVersions = new HashSet<OFVersion>();
		if (protocols != null && !protocols.isEmpty()) {
			protocols = protocols.toLowerCase();
			/* 
			 * Brute-force check for all known versions. 
			 */
			if (protocols.contains("1.0") || protocols.contains("10")) {
				ofVersions.add(OFVersion.OF_10);
			}
			if (protocols.contains("1.1") || protocols.contains("11")) {
				ofVersions.add(OFVersion.OF_11);
			}
			if (protocols.contains("1.2") || protocols.contains("12")) {
				ofVersions.add(OFVersion.OF_12);
			}
			if (protocols.contains("1.3") || protocols.contains("13")) {
				ofVersions.add(OFVersion.OF_13);
			}
			if (protocols.contains("1.4") || protocols.contains("14")) {
				ofVersions.add(OFVersion.OF_14);
			}
			/*
			 * TODO This will need to be updated if/when 
			 * Loxi is updated to support > 1.4.
			 * 
			 * if (protocols.contains("1.5") || protocols.contains("15")) {
			 *     ofVersions.add(OFVersion.OF_15);
			 * }
			 */
		} else {
			log.warn("Supported OpenFlow versions not specified. Using Loxi-defined {}", OFVersion.values());
			ofVersions.addAll(Arrays.asList(OFVersion.values()));
		}
		/* Sanity check */
		if (ofVersions.isEmpty()) {
			throw new IllegalStateException("OpenFlow version list should never be empty at this point. Make sure it's being populated in OFSwitchManager's init function.");
		}
		defaultFactory = computeInitialFactory(ofVersions);
		ofBitmaps = computeOurVersionBitmaps(ofVersions);
		
		/**---here for init geek--*/
		registerLogicalOFMessageCategory(LogicalOFMessageCategory.MAIN);
	}

	private Map<DatapathId, TableId> jsonToSwitchTableIdMap(String maxPerDpid) {
		Map<DatapathId, TableId> map = new HashMap<DatapathId, TableId>();
		DatapathId dpid = DatapathId.of(1);
		TableId tbId = TableId.of(16);
		map.put(dpid, tbId);
		return map;
	}

	/**
	 * Find the max version supplied in the supported
	 * versions list and use it as the default, which
	 * will subsequently be used in our hello message
	 * header's version field.
	 * 
	 * The factory can be later "downgraded" to a lower
	 * version depending on what's computed during the
	 * version-negotiation part of the handshake.
	 * 
	 * Assumption: The Set of OFVersion ofVersions
	 * variable has been set already and is NOT EMPTY.
	 * 
	 * @return the highest-version OFFactory we support
	 */
	private OFFactory computeInitialFactory(Set<OFVersion> ofVersions) {
		/* This should NEVER happen. Double-checking. */
		if (ofVersions == null || ofVersions.isEmpty()) {
			throw new IllegalStateException("OpenFlow version list should never be null or empty at this point. Make sure it's set in the OFSwitchManager.");
		}
		OFVersion highest = null;
		for (OFVersion v : ofVersions) {
			if (highest == null) {
				highest = v;
			} else if (v.compareTo(highest) > 0) {
				highest = v;
			}
		}
		/* 
		 * This assumes highest != null, which
		 * it won't be if the list of versions
		 * is not empty.
		 */
		return OFFactories.getFactory(highest);
	}

	/**
	 * Based on the list of OFVersions provided as input (or from Loxi),
	 * create a list of bitmaps for use in version negotiation during a
	 * cross-version OpenFlow handshake where both parties support 
	 * OpenFlow versions >= 1.3.1.
	 * 
	 * Type Set is used as input to guarantee all unique versions.
	 * 
	 * @param ofVersions, the list of bitmaps. Supply to an OFHello message.
	 * @return list of bitmaps for the versions of OpenFlow we support
	 */
	private List<U32> computeOurVersionBitmaps(Set<OFVersion> ofVersions) {
		/* This should NEVER happen. Double-checking. */
		if (ofVersions == null || ofVersions.isEmpty()) {
			throw new IllegalStateException("OpenFlow version list should never be null or empty at this point. Make sure it's set in the OFSwitchManager.");
		}

		int pos = 1; /* initial bitmap in list */
		int size = 32; /* size of a U32 */
		int tempBitmap = 0; /* maintain the current bitmap we're working on */
		List<U32> bitmaps = new ArrayList<U32>();
		ArrayList<OFVersion> sortedVersions = new ArrayList<OFVersion>(ofVersions);
		Collections.sort(sortedVersions);
		for (OFVersion v : sortedVersions) {
			/* Move on to another bitmap */
			if (v.getWireVersion() > pos * size - 1 ) {
				bitmaps.add(U32.ofRaw(tempBitmap));
				tempBitmap = 0;
				pos++;
			}
			tempBitmap = tempBitmap | (1 << (v.getWireVersion() % size));
		}
		if (tempBitmap != 0) {
			bitmaps.add(U32.ofRaw(tempBitmap));
		}
		log.info("Computed OpenFlow version bitmap as {}", Arrays.asList(tempBitmap));
		return bitmaps;
	}


//	@Override
	public void startUp() {
		startUpBase();
		bootstrapNetty();
	}

	/**
	 * Startup method that includes everything besides the netty boostrap.
	 * This has been isolated for testing.
	 */
	public void startUpBase() {
		// Initial Role
		role = OFControllerRole.ROLE_MASTER;
		loadLogicalCategories();

	}

	/**
	 * Bootstraps netty, the server that handles all openflow connections
	 */
	public void bootstrapNetty() {
		try {
			bossGroup = new NioEventLoopGroup();
			workerGroup = new NioEventLoopGroup();

			ServerBootstrap bootstrap = new ServerBootstrap()
			.group(bossGroup, workerGroup)
			.channel(NioServerSocketChannel.class)
			.option(ChannelOption.SO_REUSEADDR, true)
			.option(ChannelOption.SO_KEEPALIVE, true)
			.option(ChannelOption.TCP_NODELAY, true)
			.option(ChannelOption.SO_SNDBUF, 4*1024*1024);


			OFChannelInitializer initializer = new OFChannelInitializer(
					this, 
					this, 
					this.timer, 
					ofBitmaps, 
					defaultFactory, 
					keyStore, 
					keyStorePassword);

			bootstrap.childHandler(initializer);

			cg = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

//			Set<InetSocketAddress> addrs = new HashSet<InetSocketAddress>();
			cg.add(bootstrap.bind(new InetSocketAddress(InetAddress.getByAddress(IPv4Address.NONE.getBytes()), Constraints.getPort())).channel());
			
//			for (InetSocketAddress sa : addrs) {
//				cg.add(bootstrap.bind(sa).channel());
//				log.info("Listening for switch connections on {}", sa);
//			}

		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * Performs startup related actions for logical OF message categories.
	 * Setting the categories list to immutable ensures that unsupported operation
	 * exceptions will be activated if modifications are attempted.
	 */
	public void loadLogicalCategories() {
		logicalOFMessageCategories = ImmutableSet.copyOf(logicalOFMessageCategories);
		numRequiredConnections = calcNumRequiredConnections();
	}

}
