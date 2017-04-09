// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver11;

import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

class OFBsnSetPktinSuppressionReplyVer11 implements OFBsnSetPktinSuppressionReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnSetPktinSuppressionReplyVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 20;

        private final static long DEFAULT_XID = 0x0L;
        private final static long DEFAULT_STATUS = 0x0L;

    // OF message fields
    private final long xid;
    private final long status;
//
    // Immutable default instance
    final static OFBsnSetPktinSuppressionReplyVer11 DEFAULT = new OFBsnSetPktinSuppressionReplyVer11(
        DEFAULT_XID, DEFAULT_STATUS
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnSetPktinSuppressionReplyVer11(long xid, long status) {
        this.xid = xid;
        this.status = status;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x19L;
    }

    @Override
    public long getStatus() {
        return status;
    }



    public OFBsnSetPktinSuppressionReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnSetPktinSuppressionReply.Builder {
        final OFBsnSetPktinSuppressionReplyVer11 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean statusSet;
        private long status;

        BuilderWithParent(OFBsnSetPktinSuppressionReplyVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnSetPktinSuppressionReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x19L;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public OFBsnSetPktinSuppressionReply.Builder setStatus(long status) {
        this.status = status;
        this.statusSet = true;
        return this;
    }


        @Override
        public OFBsnSetPktinSuppressionReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                long status = this.statusSet ? this.status : parentMessage.status;

                //
                return new OFBsnSetPktinSuppressionReplyVer11(
                    xid,
                    status
                );
        }

    }

    static class Builder implements OFBsnSetPktinSuppressionReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean statusSet;
        private long status;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnSetPktinSuppressionReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x19L;
    }

    @Override
    public long getStatus() {
        return status;
    }

    @Override
    public OFBsnSetPktinSuppressionReply.Builder setStatus(long status) {
        this.status = status;
        this.statusSet = true;
        return this;
    }
//
        @Override
        public OFBsnSetPktinSuppressionReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            long status = this.statusSet ? this.status : DEFAULT_STATUS;


            return new OFBsnSetPktinSuppressionReplyVer11(
                    xid,
                    status
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnSetPktinSuppressionReply> {
        @Override
        public OFBsnSetPktinSuppressionReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 2
            byte version = bb.readByte();
            if(version != (byte) 0x2)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_11(2), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 20)
                throw new OFParseError("Wrong length: Expected=20(20), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x19L
            int subtype = bb.readInt();
            if(subtype != 0x19)
                throw new OFParseError("Wrong subtype: Expected=0x19L(0x19L), got="+subtype);
            long status = U32.f(bb.readInt());

            OFBsnSetPktinSuppressionReplyVer11 bsnSetPktinSuppressionReplyVer11 = new OFBsnSetPktinSuppressionReplyVer11(
                    xid,
                      status
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnSetPktinSuppressionReplyVer11);
            return bsnSetPktinSuppressionReplyVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnSetPktinSuppressionReplyVer11Funnel FUNNEL = new OFBsnSetPktinSuppressionReplyVer11Funnel();
    static class OFBsnSetPktinSuppressionReplyVer11Funnel implements Funnel<OFBsnSetPktinSuppressionReplyVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnSetPktinSuppressionReplyVer11 message, PrimitiveSink sink) {
            // fixed value property version = 2
            sink.putByte((byte) 0x2);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 20
            sink.putShort((short) 0x14);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x19L
            sink.putInt(0x19);
            sink.putLong(message.status);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnSetPktinSuppressionReplyVer11> {
        @Override
        public void write(ByteBuf bb, OFBsnSetPktinSuppressionReplyVer11 message) {
            // fixed value property version = 2
            bb.writeByte((byte) 0x2);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 20
            bb.writeShort((short) 0x14);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x19L
            bb.writeInt(0x19);
            bb.writeInt(U32.t(message.status));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnSetPktinSuppressionReplyVer11(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("status=").append(status);
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
        OFBsnSetPktinSuppressionReplyVer11 other = (OFBsnSetPktinSuppressionReplyVer11) obj;

        if( xid != other.xid)
            return false;
        if( status != other.status)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime *  (int) (status ^ (status >>> 32));
        return result;
    }

}
