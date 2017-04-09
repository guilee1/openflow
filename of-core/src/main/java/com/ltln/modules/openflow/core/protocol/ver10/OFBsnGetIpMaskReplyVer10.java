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

class OFBsnGetIpMaskReplyVer10 implements OFBsnGetIpMaskReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnGetIpMaskReplyVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int LENGTH = 24;

        private final static long DEFAULT_XID = 0x0L;
        private final static short DEFAULT_INDEX = (short) 0x0;
        private final static long DEFAULT_MASK = 0x0L;

    // OF message fields
    private final long xid;
    private final short index;
    private final long mask;
//
    // Immutable default instance
    final static OFBsnGetIpMaskReplyVer10 DEFAULT = new OFBsnGetIpMaskReplyVer10(
        DEFAULT_XID, DEFAULT_INDEX, DEFAULT_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnGetIpMaskReplyVer10(long xid, short index, long mask) {
        this.xid = xid;
        this.index = index;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
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
        return 0x2L;
    }

    @Override
    public short getIndex() {
        return index;
    }

    @Override
    public long getMask() {
        return mask;
    }



    public OFBsnGetIpMaskReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnGetIpMaskReply.Builder {
        final OFBsnGetIpMaskReplyVer10 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean indexSet;
        private short index;
        private boolean maskSet;
        private long mask;

        BuilderWithParent(OFBsnGetIpMaskReplyVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
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
    public OFBsnGetIpMaskReply.Builder setXid(long xid) {
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
        return 0x2L;
    }

    @Override
    public short getIndex() {
        return index;
    }

    @Override
    public OFBsnGetIpMaskReply.Builder setIndex(short index) {
        this.index = index;
        this.indexSet = true;
        return this;
    }
    @Override
    public long getMask() {
        return mask;
    }

    @Override
    public OFBsnGetIpMaskReply.Builder setMask(long mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }


        @Override
        public OFBsnGetIpMaskReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                short index = this.indexSet ? this.index : parentMessage.index;
                long mask = this.maskSet ? this.mask : parentMessage.mask;

                //
                return new OFBsnGetIpMaskReplyVer10(
                    xid,
                    index,
                    mask
                );
        }

    }

    static class Builder implements OFBsnGetIpMaskReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean indexSet;
        private short index;
        private boolean maskSet;
        private long mask;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
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
    public OFBsnGetIpMaskReply.Builder setXid(long xid) {
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
        return 0x2L;
    }

    @Override
    public short getIndex() {
        return index;
    }

    @Override
    public OFBsnGetIpMaskReply.Builder setIndex(short index) {
        this.index = index;
        this.indexSet = true;
        return this;
    }
    @Override
    public long getMask() {
        return mask;
    }

    @Override
    public OFBsnGetIpMaskReply.Builder setMask(long mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
//
        @Override
        public OFBsnGetIpMaskReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            short index = this.indexSet ? this.index : DEFAULT_INDEX;
            long mask = this.maskSet ? this.mask : DEFAULT_MASK;


            return new OFBsnGetIpMaskReplyVer10(
                    xid,
                    index,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnGetIpMaskReply> {
        @Override
        public OFBsnGetIpMaskReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 1
            byte version = bb.readByte();
            if(version != (byte) 0x1)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_10(1), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 24)
                throw new OFParseError("Wrong length: Expected=24(24), got="+length);
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
            // fixed value property subtype == 0x2L
            int subtype = bb.readInt();
            if(subtype != 0x2)
                throw new OFParseError("Wrong subtype: Expected=0x2L(0x2L), got="+subtype);
            short index = U8.f(bb.readByte());
            // pad: 3 bytes
            bb.skipBytes(3);
            long mask = U32.f(bb.readInt());

            OFBsnGetIpMaskReplyVer10 bsnGetIpMaskReplyVer10 = new OFBsnGetIpMaskReplyVer10(
                    xid,
                      index,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnGetIpMaskReplyVer10);
            return bsnGetIpMaskReplyVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnGetIpMaskReplyVer10Funnel FUNNEL = new OFBsnGetIpMaskReplyVer10Funnel();
    static class OFBsnGetIpMaskReplyVer10Funnel implements Funnel<OFBsnGetIpMaskReplyVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnGetIpMaskReplyVer10 message, PrimitiveSink sink) {
            // fixed value property version = 1
            sink.putByte((byte) 0x1);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 24
            sink.putShort((short) 0x18);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x2L
            sink.putInt(0x2);
            sink.putShort(message.index);
            // skip pad (3 bytes)
            sink.putLong(message.mask);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnGetIpMaskReplyVer10> {
        @Override
        public void write(ByteBuf bb, OFBsnGetIpMaskReplyVer10 message) {
            // fixed value property version = 1
            bb.writeByte((byte) 0x1);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 24
            bb.writeShort((short) 0x18);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x2L
            bb.writeInt(0x2);
            bb.writeByte(U8.t(message.index));
            // pad: 3 bytes
            bb.writeZero(3);
            bb.writeInt(U32.t(message.mask));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnGetIpMaskReplyVer10(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("index=").append(index);
        b.append(", ");
        b.append("mask=").append(mask);
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
        OFBsnGetIpMaskReplyVer10 other = (OFBsnGetIpMaskReplyVer10) obj;

        if( xid != other.xid)
            return false;
        if( index != other.index)
            return false;
        if( mask != other.mask)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + index;
        result = prime *  (int) (mask ^ (mask >>> 32));
        return result;
    }

}
