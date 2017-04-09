// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver10;

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

class OFTableStatsRequestVer10 implements OFTableStatsRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFTableStatsRequestVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int LENGTH = 12;

        private final static long DEFAULT_XID = 0x0L;
        private final static Set<OFStatsRequestFlags> DEFAULT_FLAGS = ImmutableSet.<OFStatsRequestFlags>of();

    // OF message fields
    private final long xid;
    private final Set<OFStatsRequestFlags> flags;
//
    // Immutable default instance
    final static OFTableStatsRequestVer10 DEFAULT = new OFTableStatsRequestVer10(
        DEFAULT_XID, DEFAULT_FLAGS
    );

    // package private constructor - used by readers, builders, and factory
    OFTableStatsRequestVer10(long xid, Set<OFStatsRequestFlags> flags) {
        if(flags == null) {
            throw new NullPointerException("OFTableStatsRequestVer10: property flags cannot be null");
        }
        this.xid = xid;
        this.flags = flags;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.TABLE;
    }

    @Override
    public Set<OFStatsRequestFlags> getFlags() {
        return flags;
    }



    public OFTableStatsRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFTableStatsRequest.Builder {
        final OFTableStatsRequestVer10 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsRequestFlags> flags;

        BuilderWithParent(OFTableStatsRequestVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFTableStatsRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.TABLE;
    }

    @Override
    public Set<OFStatsRequestFlags> getFlags() {
        return flags;
    }

    @Override
    public OFTableStatsRequest.Builder setFlags(Set<OFStatsRequestFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }


        @Override
        public OFTableStatsRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                Set<OFStatsRequestFlags> flags = this.flagsSet ? this.flags : parentMessage.flags;
                if(flags == null)
                    throw new NullPointerException("Property flags must not be null");

                //
                return new OFTableStatsRequestVer10(
                    xid,
                    flags
                );
        }

    }

    static class Builder implements OFTableStatsRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean flagsSet;
        private Set<OFStatsRequestFlags> flags;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

    @Override
    public OFType getType() {
        return OFType.STATS_REQUEST;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFTableStatsRequest.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFStatsType getStatsType() {
        return OFStatsType.TABLE;
    }

    @Override
    public Set<OFStatsRequestFlags> getFlags() {
        return flags;
    }

    @Override
    public OFTableStatsRequest.Builder setFlags(Set<OFStatsRequestFlags> flags) {
        this.flags = flags;
        this.flagsSet = true;
        return this;
    }
//
        @Override
        public OFTableStatsRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            Set<OFStatsRequestFlags> flags = this.flagsSet ? this.flags : DEFAULT_FLAGS;
            if(flags == null)
                throw new NullPointerException("Property flags must not be null");


            return new OFTableStatsRequestVer10(
                    xid,
                    flags
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFTableStatsRequest> {
        @Override
        public OFTableStatsRequest readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 1
            byte version = bb.readByte();
            if(version != (byte) 0x1)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_10(1), got="+version);
            // fixed value property type == 16
            byte type = bb.readByte();
            if(type != (byte) 0x10)
                throw new OFParseError("Wrong type: Expected=OFType.STATS_REQUEST(16), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 12)
                throw new OFParseError("Wrong length: Expected=12(12), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property statsType == 3
            short statsType = bb.readShort();
            if(statsType != (short) 0x3)
                throw new OFParseError("Wrong statsType: Expected=OFStatsType.TABLE(3), got="+statsType);
            Set<OFStatsRequestFlags> flags = OFStatsRequestFlagsSerializerVer10.readFrom(bb);

            OFTableStatsRequestVer10 tableStatsRequestVer10 = new OFTableStatsRequestVer10(
                    xid,
                      flags
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", tableStatsRequestVer10);
            return tableStatsRequestVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFTableStatsRequestVer10Funnel FUNNEL = new OFTableStatsRequestVer10Funnel();
    static class OFTableStatsRequestVer10Funnel implements Funnel<OFTableStatsRequestVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFTableStatsRequestVer10 message, PrimitiveSink sink) {
            // fixed value property version = 1
            sink.putByte((byte) 0x1);
            // fixed value property type = 16
            sink.putByte((byte) 0x10);
            // fixed value property length = 12
            sink.putShort((short) 0xc);
            sink.putLong(message.xid);
            // fixed value property statsType = 3
            sink.putShort((short) 0x3);
            OFStatsRequestFlagsSerializerVer10.putTo(message.flags, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFTableStatsRequestVer10> {
        @Override
        public void write(ByteBuf bb, OFTableStatsRequestVer10 message) {
            // fixed value property version = 1
            bb.writeByte((byte) 0x1);
            // fixed value property type = 16
            bb.writeByte((byte) 0x10);
            // fixed value property length = 12
            bb.writeShort((short) 0xc);
            bb.writeInt(U32.t(message.xid));
            // fixed value property statsType = 3
            bb.writeShort((short) 0x3);
            OFStatsRequestFlagsSerializerVer10.writeTo(bb, message.flags);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFTableStatsRequestVer10(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("flags=").append(flags);
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
        OFTableStatsRequestVer10 other = (OFTableStatsRequestVer10) obj;

        if( xid != other.xid)
            return false;
        if (flags == null) {
            if (other.flags != null)
                return false;
        } else if (!flags.equals(other.flags))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((flags == null) ? 0 : flags.hashCode());
        return result;
    }

}