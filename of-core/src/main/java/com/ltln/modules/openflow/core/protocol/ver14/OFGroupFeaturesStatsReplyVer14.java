// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Set;
import com.google.common.collect.ImmutableSet;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;
import com.ltln.modules.openflow.core.exceptions.*;
import com.ltln.modules.openflow.core.protocol.*;
import com.ltln.modules.openflow.core.protocol.action.*;
import com.ltln.modules.openflow.core.protocol.actionid.*;
import com.ltln.modules.openflow.core.protocol.bsntlv.*;
import com.ltln.modules.openflow.core.protocol.errormsg.*;
import com.ltln.modules.openflow.core.protocol.instruction.*;
import com.ltln.modules.openflow.core.protocol.instructionid.*;
import com.ltln.modules.openflow.core.protocol.match.*;
import com.ltln.modules.openflow.core.protocol.meterband.*;
import com.ltln.modules.openflow.core.protocol.oxm.*;
import com.ltln.modules.openflow.core.protocol.queueprop.*;
import com.ltln.modules.openflow.core.types.*;
import com.ltln.modules.openflow.core.util.*;

class OFGroupFeaturesStatsReplyVer14 implements OFGroupFeaturesStatsReply {
    private static final Logger logger = LoggerFactory.getLogger(OFGroupFeaturesStatsReplyVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 56;

        private final static long DEFAULT_XID = 0x0L;
        private final static Set<OFStatsReplyFlags> DEFAULT_FLAGS = ImmutableSet.<OFStatsReplyFlags>of();
        private final static long DEFAULT_TYPES = 0x0L;
        private final static long DEFAULT_CAPABILITIES = 0x0L;
        private final static long DEFAULT_MAX_GROUPS_ALL = 0x0L;
        private final static long DEFAULT_MAX_GROUPS_SELECT = 0x0L;
        private final static long DEFAULT_MAX_GROUPS_INDIRECT = 0x0L;
        private final static long DEFAULT_MAX_GROUPS_FF = 0x0L;
        private final static long DEFAULT_ACTIONS_ALL = 0x0L;
        private final static long DEFAULT_ACTIONS_SELECT = 0x0L;
        private final static long DEFAULT_ACTIONS_INDIRECT = 0x0L;
        private final static long DEFAULT_ACTIONS_FF = 0x0L;

    // OF message fields
    private final long xid;
    private final Set<OFStatsReplyFlags> flags;
    private final long types;
    private final long capabilities;
    private final long maxGroupsAll;
    private final long maxGroupsSelect;
    private final long maxGroupsIndirect;
    private final long maxGroupsFf;
    private final long actionsAll;
    private final long actionsSelect;
    private final long actionsIndirect;
    private final long actionsFf;
//
    // Immutable default instance
    final static OFGroupFeaturesStatsReplyVer14 DEFAULT = new OFGroupFeaturesStatsReplyVer14(
        DEFAULT_XID, DEFAULT_FLAGS, DEFAULT_TYPES, DEFAULT_CAPABILITIES, DEFAULT_MAX_GROUPS_ALL, DEFAULT_MAX_GROUPS_SELECT, DEFAULT_MAX_GROUPS_INDIRECT, DEFAULT_MAX_GROUPS_FF, DEFAULT_ACTIONS_ALL, DEFAULT_ACTIONS_SELECT, DEFAULT_ACTIONS_INDIRECT, DEFAULT_ACTIONS_FF
    );

    // package private constructor - used by readers, builders, and factory
    OFGroupFeaturesStatsReplyVer14(long xid, Set<OFStatsReplyFlags> flags, long types, long capabilities, long maxGroupsAll, long maxGroupsSelect, long maxGroupsIndirect, long maxGroupsFf, long actionsAll, long actionsSelect, long actionsIndirect, long actionsFf) {
        if(flags == null) {
            throw new NullPointerException("OFGroupFeaturesStatsReplyVer14: property flags cannot be null");
        }
        this.xid = xid;
        this.flags = flags;
        this.types = types;
        this.capabilities = capabilities;
        this.maxGroupsAll = maxGroupsAll;
        this.maxGroupsSelect = maxGroupsSelect;
        this.maxGroupsIndirect = maxGroupsIndirect;
        this.maxGroupsFf = maxGroupsFf;
        this.actionsAll = actionsAll;
        this.actionsSelect = actionsSelect;
        this.actionsIndirect = actionsIndirect;
        this.actionsFf = actionsFf;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.GROUP_FEATURES;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public long getTypes() {
        return types;
    }

    @Override
    public long getCapabilities() {
        return capabilities;
    }

    @Override
    public long getMaxGroupsAll() {
        return maxGroupsAll;
    }

    @Override
    public long getMaxGroupsSelect() {
        return maxGroupsSelect;
    }

    @Override
    public long getMaxGroupsIndirect() {
        return maxGroupsIndirect;
    }

    @Override
    public long getMaxGroupsFf() {
        return maxGroupsFf;
    }

    @Override
    public long getActionsAll() {
        return actionsAll;
    }

    @Override
    public long getActionsSelect() {
        return actionsSelect;
    }

    @Override
    public long getActionsIndirect() {
        return actionsIndirect;
    }

    @Override
    public long getActionsFf() {
        return actionsFf;
    }



    public OFGroupFeaturesStatsReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFGroupFeaturesStatsReply.Builder {
        final OFGroupFeaturesStatsReplyVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsReplyFlags> flags;
        private boolean typesSet;
        private long types;
        private boolean capabilitiesSet;
        private long capabilities;
        private boolean maxGroupsAllSet;
        private long maxGroupsAll;
        private boolean maxGroupsSelectSet;
        private long maxGroupsSelect;
        private boolean maxGroupsIndirectSet;
        private long maxGroupsIndirect;
        private boolean maxGroupsFfSet;
        private long maxGroupsFf;
        private boolean actionsAllSet;
        private long actionsAll;
        private boolean actionsSelectSet;
        private long actionsSelect;
        private boolean actionsIndirectSet;
        private long actionsIndirect;
        private boolean actionsFfSet;
        private long actionsFf;

        BuilderWithParent(OFGroupFeaturesStatsReplyVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.GROUP_FEATURES;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setFlags(Set<OFStatsReplyFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getTypes() {
        return types;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setTypes(long types) {
        this.types = types;
        this.typesSet = true;
        return this;
    }
    @Override
    public long getCapabilities() {
        return capabilities;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setCapabilities(long capabilities) {
        this.capabilities = capabilities;
        this.capabilitiesSet = true;
        return this;
    }
    @Override
    public long getMaxGroupsAll() {
        return maxGroupsAll;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setMaxGroupsAll(long maxGroupsAll) {
        this.maxGroupsAll = maxGroupsAll;
        this.maxGroupsAllSet = true;
        return this;
    }
    @Override
    public long getMaxGroupsSelect() {
        return maxGroupsSelect;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setMaxGroupsSelect(long maxGroupsSelect) {
        this.maxGroupsSelect = maxGroupsSelect;
        this.maxGroupsSelectSet = true;
        return this;
    }
    @Override
    public long getMaxGroupsIndirect() {
        return maxGroupsIndirect;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setMaxGroupsIndirect(long maxGroupsIndirect) {
        this.maxGroupsIndirect = maxGroupsIndirect;
        this.maxGroupsIndirectSet = true;
        return this;
    }
    @Override
    public long getMaxGroupsFf() {
        return maxGroupsFf;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setMaxGroupsFf(long maxGroupsFf) {
        this.maxGroupsFf = maxGroupsFf;
        this.maxGroupsFfSet = true;
        return this;
    }
    @Override
    public long getActionsAll() {
        return actionsAll;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setActionsAll(long actionsAll) {
        this.actionsAll = actionsAll;
        this.actionsAllSet = true;
        return this;
    }
    @Override
    public long getActionsSelect() {
        return actionsSelect;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setActionsSelect(long actionsSelect) {
        this.actionsSelect = actionsSelect;
        this.actionsSelectSet = true;
        return this;
    }
    @Override
    public long getActionsIndirect() {
        return actionsIndirect;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setActionsIndirect(long actionsIndirect) {
        this.actionsIndirect = actionsIndirect;
        this.actionsIndirectSet = true;
        return this;
    }
    @Override
    public long getActionsFf() {
        return actionsFf;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setActionsFf(long actionsFf) {
        this.actionsFf = actionsFf;
        this.actionsFfSet = true;
        return this;
    }


        @Override
        public OFGroupFeaturesStatsReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                Set<OFStatsReplyFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");
                long types = this.typesSet ? this.types : parentMessage.types;
                long capabilities = this.capabilitiesSet ? this.capabilities : parentMessage.capabilities;
                long maxGroupsAll = this.maxGroupsAllSet ? this.maxGroupsAll : parentMessage.maxGroupsAll;
                long maxGroupsSelect = this.maxGroupsSelectSet ? this.maxGroupsSelect : parentMessage.maxGroupsSelect;
                long maxGroupsIndirect = this.maxGroupsIndirectSet ? this.maxGroupsIndirect : parentMessage.maxGroupsIndirect;
                long maxGroupsFf = this.maxGroupsFfSet ? this.maxGroupsFf : parentMessage.maxGroupsFf;
                long actionsAll = this.actionsAllSet ? this.actionsAll : parentMessage.actionsAll;
                long actionsSelect = this.actionsSelectSet ? this.actionsSelect : parentMessage.actionsSelect;
                long actionsIndirect = this.actionsIndirectSet ? this.actionsIndirect : parentMessage.actionsIndirect;
                long actionsFf = this.actionsFfSet ? this.actionsFf : parentMessage.actionsFf;

                //
                return new OFGroupFeaturesStatsReplyVer14(
                    xid,
                    flags,
                    types,
                    capabilities,
                    maxGroupsAll,
                    maxGroupsSelect,
                    maxGroupsIndirect,
                    maxGroupsFf,
                    actionsAll,
                    actionsSelect,
                    actionsIndirect,
                    actionsFf
                );
        }

    }

    static class Builder implements OFGroupFeaturesStatsReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsReplyFlags> flags;
        private boolean typesSet;
        private long types;
        private boolean capabilitiesSet;
        private long capabilities;
        private boolean maxGroupsAllSet;
        private long maxGroupsAll;
        private boolean maxGroupsSelectSet;
        private long maxGroupsSelect;
        private boolean maxGroupsIndirectSet;
        private long maxGroupsIndirect;
        private boolean maxGroupsFfSet;
        private long maxGroupsFf;
        private boolean actionsAllSet;
        private long actionsAll;
        private boolean actionsSelectSet;
        private long actionsSelect;
        private boolean actionsIndirectSet;
        private long actionsIndirect;
        private boolean actionsFfSet;
        private long actionsFf;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REPLY;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.GROUP_FEATURES;
    }

    @Override
    public Set<OFStatsReplyFlags> getFlags() {
        return flags;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setFlags(Set<OFStatsReplyFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
    @Override
    public long getTypes() {
        return types;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setTypes(long types) {
        this.types = types;
        this.typesSet = true;
        return this;
    }
    @Override
    public long getCapabilities() {
        return capabilities;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setCapabilities(long capabilities) {
        this.capabilities = capabilities;
        this.capabilitiesSet = true;
        return this;
    }
    @Override
    public long getMaxGroupsAll() {
        return maxGroupsAll;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setMaxGroupsAll(long maxGroupsAll) {
        this.maxGroupsAll = maxGroupsAll;
        this.maxGroupsAllSet = true;
        return this;
    }
    @Override
    public long getMaxGroupsSelect() {
        return maxGroupsSelect;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setMaxGroupsSelect(long maxGroupsSelect) {
        this.maxGroupsSelect = maxGroupsSelect;
        this.maxGroupsSelectSet = true;
        return this;
    }
    @Override
    public long getMaxGroupsIndirect() {
        return maxGroupsIndirect;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setMaxGroupsIndirect(long maxGroupsIndirect) {
        this.maxGroupsIndirect = maxGroupsIndirect;
        this.maxGroupsIndirectSet = true;
        return this;
    }
    @Override
    public long getMaxGroupsFf() {
        return maxGroupsFf;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setMaxGroupsFf(long maxGroupsFf) {
        this.maxGroupsFf = maxGroupsFf;
        this.maxGroupsFfSet = true;
        return this;
    }
    @Override
    public long getActionsAll() {
        return actionsAll;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setActionsAll(long actionsAll) {
        this.actionsAll = actionsAll;
        this.actionsAllSet = true;
        return this;
    }
    @Override
    public long getActionsSelect() {
        return actionsSelect;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setActionsSelect(long actionsSelect) {
        this.actionsSelect = actionsSelect;
        this.actionsSelectSet = true;
        return this;
    }
    @Override
    public long getActionsIndirect() {
        return actionsIndirect;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setActionsIndirect(long actionsIndirect) {
        this.actionsIndirect = actionsIndirect;
        this.actionsIndirectSet = true;
        return this;
    }
    @Override
    public long getActionsFf() {
        return actionsFf;
    }

    @Override
    public OFGroupFeaturesStatsReply.Builder setActionsFf(long actionsFf) {
        this.actionsFf = actionsFf;
        this.actionsFfSet = true;
        return this;
    }
//
        @Override
        public OFGroupFeaturesStatsReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            Set<OFStatsReplyFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");
            long types = this.typesSet ? this.types : DEFAULT_TYPES;
            long capabilities = this.capabilitiesSet ? this.capabilities : DEFAULT_CAPABILITIES;
            long maxGroupsAll = this.maxGroupsAllSet ? this.maxGroupsAll : DEFAULT_MAX_GROUPS_ALL;
            long maxGroupsSelect = this.maxGroupsSelectSet ? this.maxGroupsSelect : DEFAULT_MAX_GROUPS_SELECT;
            long maxGroupsIndirect = this.maxGroupsIndirectSet ? this.maxGroupsIndirect : DEFAULT_MAX_GROUPS_INDIRECT;
            long maxGroupsFf = this.maxGroupsFfSet ? this.maxGroupsFf : DEFAULT_MAX_GROUPS_FF;
            long actionsAll = this.actionsAllSet ? this.actionsAll : DEFAULT_ACTIONS_ALL;
            long actionsSelect = this.actionsSelectSet ? this.actionsSelect : DEFAULT_ACTIONS_SELECT;
            long actionsIndirect = this.actionsIndirectSet ? this.actionsIndirect : DEFAULT_ACTIONS_INDIRECT;
            long actionsFf = this.actionsFfSet ? this.actionsFf : DEFAULT_ACTIONS_FF;


            return new OFGroupFeaturesStatsReplyVer14(
                    xid,
                    flags,
                    types,
                    capabilities,
                    maxGroupsAll,
                    maxGroupsSelect,
                    maxGroupsIndirect,
                    maxGroupsFf,
                    actionsAll,
                    actionsSelect,
                    actionsIndirect,
                    actionsFf
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFGroupFeaturesStatsReply> {
        @Override
        public OFGroupFeaturesStatsReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 19
            byte type = bb.readByte();
            if(type != (byte) 0x13)
                throw new OFParseError("Wrong type: Expected=OFType.STATS_REPLY(19), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 56)
                throw new OFParseError("Wrong length: Expected=56(56), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property statsType == 8
            short statsType = bb.readShort();
            if(statsType != (short) 0x8)
                throw new OFParseError("Wrong statsType: Expected=OFStatsType.GROUP_FEATURES(8), got="+statsType);
            Set<OFStatsReplyFlags> flags = OFStatsReplyFlagsSerializerVer14.readFrom(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            long types = U32.f(bb.readInt());
            long capabilities = U32.f(bb.readInt());
            long maxGroupsAll = U32.f(bb.readInt());
            long maxGroupsSelect = U32.f(bb.readInt());
            long maxGroupsIndirect = U32.f(bb.readInt());
            long maxGroupsFf = U32.f(bb.readInt());
            long actionsAll = U32.f(bb.readInt());
            long actionsSelect = U32.f(bb.readInt());
            long actionsIndirect = U32.f(bb.readInt());
            long actionsFf = U32.f(bb.readInt());

            OFGroupFeaturesStatsReplyVer14 groupFeaturesStatsReplyVer14 = new OFGroupFeaturesStatsReplyVer14(
                    xid,
                      flags,
                      types,
                      capabilities,
                      maxGroupsAll,
                      maxGroupsSelect,
                      maxGroupsIndirect,
                      maxGroupsFf,
                      actionsAll,
                      actionsSelect,
                      actionsIndirect,
                      actionsFf
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", groupFeaturesStatsReplyVer14);
            return groupFeaturesStatsReplyVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFGroupFeaturesStatsReplyVer14Funnel FUNNEL = new OFGroupFeaturesStatsReplyVer14Funnel();
    static class OFGroupFeaturesStatsReplyVer14Funnel implements Funnel<OFGroupFeaturesStatsReplyVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFGroupFeaturesStatsReplyVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 19
            sink.putByte((byte) 0x13);
            // fixed value property length = 56
            sink.putShort((short) 0x38);
            sink.putLong(message.xid);
            // fixed value property statsType = 8
            sink.putShort((short) 0x8);
            OFStatsReplyFlagsSerializerVer14.putTo(message.flags, sink);
            // skip pad (4 bytes)
            sink.putLong(message.types);
            sink.putLong(message.capabilities);
            sink.putLong(message.maxGroupsAll);
            sink.putLong(message.maxGroupsSelect);
            sink.putLong(message.maxGroupsIndirect);
            sink.putLong(message.maxGroupsFf);
            sink.putLong(message.actionsAll);
            sink.putLong(message.actionsSelect);
            sink.putLong(message.actionsIndirect);
            sink.putLong(message.actionsFf);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFGroupFeaturesStatsReplyVer14> {
        @Override
        public void write(ByteBuf bb, OFGroupFeaturesStatsReplyVer14 message) {
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 19
            bb.writeByte((byte) 0x13);
            // fixed value property length = 56
            bb.writeShort((short) 0x38);
            bb.writeInt(U32.t(message.xid));
            // fixed value property statsType = 8
            bb.writeShort((short) 0x8);
            OFStatsReplyFlagsSerializerVer14.writeTo(bb, message.flags);
            // pad: 4 bytes
            bb.writeZero(4);
            bb.writeInt(U32.t(message.types));
            bb.writeInt(U32.t(message.capabilities));
            bb.writeInt(U32.t(message.maxGroupsAll));
            bb.writeInt(U32.t(message.maxGroupsSelect));
            bb.writeInt(U32.t(message.maxGroupsIndirect));
            bb.writeInt(U32.t(message.maxGroupsFf));
            bb.writeInt(U32.t(message.actionsAll));
            bb.writeInt(U32.t(message.actionsSelect));
            bb.writeInt(U32.t(message.actionsIndirect));
            bb.writeInt(U32.t(message.actionsFf));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFGroupFeaturesStatsReplyVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("flags=").append(flags);
        b.append(", ");
        b.append("types=").append(types);
        b.append(", ");
        b.append("capabilities=").append(capabilities);
        b.append(", ");
        b.append("maxGroupsAll=").append(maxGroupsAll);
        b.append(", ");
        b.append("maxGroupsSelect=").append(maxGroupsSelect);
        b.append(", ");
        b.append("maxGroupsIndirect=").append(maxGroupsIndirect);
        b.append(", ");
        b.append("maxGroupsFf=").append(maxGroupsFf);
        b.append(", ");
        b.append("actionsAll=").append(actionsAll);
        b.append(", ");
        b.append("actionsSelect=").append(actionsSelect);
        b.append(", ");
        b.append("actionsIndirect=").append(actionsIndirect);
        b.append(", ");
        b.append("actionsFf=").append(actionsFf);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFGroupFeaturesStatsReplyVer14 other = (OFGroupFeaturesStatsReplyVer14) obj;

        if( xid != other.xid)
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        if( types != other.types)
            return false;
        if( capabilities != other.capabilities)
            return false;
        if( maxGroupsAll != other.maxGroupsAll)
            return false;
        if( maxGroupsSelect != other.maxGroupsSelect)
            return false;
        if( maxGroupsIndirect != other.maxGroupsIndirect)
            return false;
        if( maxGroupsFf != other.maxGroupsFf)
            return false;
        if( actionsAll != other.actionsAll)
            return false;
        if( actionsSelect != other.actionsSelect)
            return false;
        if( actionsIndirect != other.actionsIndirect)
            return false;
        if( actionsFf != other.actionsFf)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        result = prime *  (int) (types ^ (types >>> 32));
        result = prime *  (int) (capabilities ^ (capabilities >>> 32));
        result = prime *  (int) (maxGroupsAll ^ (maxGroupsAll >>> 32));
        result = prime *  (int) (maxGroupsSelect ^ (maxGroupsSelect >>> 32));
        result = prime *  (int) (maxGroupsIndirect ^ (maxGroupsIndirect >>> 32));
        result = prime *  (int) (maxGroupsFf ^ (maxGroupsFf >>> 32));
        result = prime *  (int) (actionsAll ^ (actionsAll >>> 32));
        result = prime *  (int) (actionsSelect ^ (actionsSelect >>> 32));
        result = prime *  (int) (actionsIndirect ^ (actionsIndirect >>> 32));
        result = prime *  (int) (actionsFf ^ (actionsFf >>> 32));
        return result;
    }

}