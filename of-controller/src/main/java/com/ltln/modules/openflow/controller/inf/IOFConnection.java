package com.ltln.modules.openflow.controller.inf;

import java.net.SocketAddress;
import java.util.Date;


import com.ltln.modules.openflow.core.protocol.OFFactory;
import com.ltln.modules.openflow.core.types.DatapathId;
import com.ltln.modules.openflow.core.types.OFAuxId;
import com.ltln.modules.openflow.core.types.U64;


/** Contract for an openflow connection to a switch.
 *  Provides message write and request/response handling capabilities.
 *
 * @author Andreas Wundsam <andreas.wundsam@bigswitch.com>
 */
public interface IOFConnection extends IOFMessageWriter {

    /**
     * Retrieves the date the connection connected to this controller
     * @return the date
     */
    Date getConnectedSince();

    /** @return the DatapathId of the switch associated with the connection */
    DatapathId getDatapathId();

    /** @return the OFAuxId of the this connection */
    OFAuxId getAuxId();

    /**
    * Get the IP address of the remote (switch) end of the connection
    * @return the inet address
    */
    SocketAddress getRemoteInetAddress();

    /**
     * Get the IP address of the local end of the connection
     *
     * @return the inet address
     */
    SocketAddress getLocalInetAddress();

    /**
     * Get's the OFFactory that this connection was constructed with.
     * This is the factory that was found in the features reply during
     * the channel handshake
     * @return The connection's OFFactory
     */
    OFFactory getOFFactory();

    /** @return whether this connection is currently (still) connected to the controller.
     */
    boolean isConnected();

	/**
	 * Get the one-way latency from the switch to the controller.
	 * @return milliseconds
	 */
	public U64 getLatency();
}
