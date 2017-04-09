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

import java.util.Arrays;

class OFBsnPduRxRequestVer14 implements OFBsnPduRxRequest {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnPduRxRequestVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 28;

        private final static long DEFAULT_XID = 0x0L;
        private final static long DEFAULT_TIMEOUT_MS = 0x0L;
        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static short DEFAULT_SLOT_NUM = (short) 0x0;
        private final static byte[] DEFAULT_DATA = new byte[0];

    // OF message fields
    private final long xid;
    private final long timeoutMs;
    private final OFPort portNo;
    private final short slotNum;
    private final byte[] data;
//
    // Immutable default instance
    final static OFBsnPduRxRequestVer14 DEFAULT = new OFBsnPduRxRequestVer14(
        DEFAULT_XID, DEFAULT_TIMEOUT_MS, DEFAULT_PORT_NO, DEFAULT_SLOT_NUM, DEFAULT_DATA
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnPduRxRequestVer14(long xid, long timeoutMs, OFPort portNo, short slotNum, byte[] data) {
        if(portNo == null) {
            throw new NullPointerException("OFBsnPduRxRequestVer14: property portNo cannot be null");
        }
        if(data == null) {
            throw new NullPointerException("OFBsnPduRxRequestVer14: property data cannot be null");
        }
        this.xid = xid;
        this.timeoutMs = timeoutMs;
        this.portNo = portNo;
        this.slotNum = slotNum;
        this.data = data;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
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
        return 0x21L;
    }

    @Override
    public long getTimeoutMs() {
        return timeoutMs;
    }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public short getSlotNum() {
        return slotNum;
    }

    @Override
    public byte[] getData() {
        return data;
    }



    public OFBsnPduRxRequest.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnPduRxRequest.Builder {
        final OFBsnPduRxRequestVer14 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean timeoutMsSet;
        private long timeoutMs;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean slotNumSet;
        private short slotNum;
        private boolean dataSet;
        private byte[] data;

        BuilderWithParent(OFBsnPduRxRequestVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
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
    public OFBsnPduRxRequest.Builder setXid(long xid) {
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
        return 0x21L;
    }

    @Override
    public long getTimeoutMs() {
        return timeoutMs;
    }

    @Override
    public OFBsnPduRxRequest.Builder setTimeoutMs(long timeoutMs) {
        this.timeoutMs = timeoutMs;
        this.timeoutMsSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnPduRxRequest.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public short getSlotNum() {
        return slotNum;
    }

    @Override
    public OFBsnPduRxRequest.Builder setSlotNum(short slotNum) {
        this.slotNum = slotNum;
        this.slotNumSet = true;
        return this;
    }
    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFBsnPduRxRequest.Builder setData(byte[] data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }


        @Override
        public OFBsnPduRxRequest build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                long timeoutMs = this.timeoutMsSet ? this.timeoutMs : parentMessage.timeoutMs;
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                short slotNum = this.slotNumSet ? this.slotNum : parentMessage.slotNum;
                byte[] data = this.dataSet ? this.data : parentMessage.data;
                if(data == null)
                    throw new NullPointerException("Property data must not be null");

                //
                return new OFBsnPduRxRequestVer14(
                    xid,
                    timeoutMs,
                    portNo,
                    slotNum,
                    data
                );
        }

    }

    static class Builder implements OFBsnPduRxRequest.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean timeoutMsSet;
        private long timeoutMs;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean slotNumSet;
        private short slotNum;
        private boolean dataSet;
        private byte[] data;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
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
    public OFBsnPduRxRequest.Builder setXid(long xid) {
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
        return 0x21L;
    }

    @Override
    public long getTimeoutMs() {
        return timeoutMs;
    }

    @Override
    public OFBsnPduRxRequest.Builder setTimeoutMs(long timeoutMs) {
        this.timeoutMs = timeoutMs;
        this.timeoutMsSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFBsnPduRxRequest.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public short getSlotNum() {
        return slotNum;
    }

    @Override
    public OFBsnPduRxRequest.Builder setSlotNum(short slotNum) {
        this.slotNum = slotNum;
        this.slotNumSet = true;
        return this;
    }
    @Override
    public byte[] getData() {
        return data;
    }

    @Override
    public OFBsnPduRxRequest.Builder setData(byte[] data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
//
        @Override
        public OFBsnPduRxRequest build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            long timeoutMs = this.timeoutMsSet ? this.timeoutMs : DEFAULT_TIMEOUT_MS;
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            short slotNum = this.slotNumSet ? this.slotNum : DEFAULT_SLOT_NUM;
            byte[] data = this.dataSet ? this.data : DEFAULT_DATA;
            if(data == null)
                throw new NullPointerException("Property data must not be null");


            return new OFBsnPduRxRequestVer14(
                    xid,
                    timeoutMs,
                    portNo,
                    slotNum,
                    data
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnPduRxRequest> {
        @Override
        public OFBsnPduRxRequest readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
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
            // fixed value property subtype == 0x21L
            int subtype = bb.readInt();
            if(subtype != 0x21)
                throw new OFParseError("Wrong subtype: Expected=0x21L(0x21L), got="+subtype);
            long timeoutMs = U32.f(bb.readInt());
            OFPort portNo = OFPort.read4Bytes(bb);
            short slotNum = U8.f(bb.readByte());
            // pad: 3 bytes
            bb.skipBytes(3);
            byte[] data = ChannelUtils.readBytes(bb, length - (bb.readerIndex() - start));

            OFBsnPduRxRequestVer14 bsnPduRxRequestVer14 = new OFBsnPduRxRequestVer14(
                    xid,
                      timeoutMs,
                      portNo,
                      slotNum,
                      data
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnPduRxRequestVer14);
            return bsnPduRxRequestVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnPduRxRequestVer14Funnel FUNNEL = new OFBsnPduRxRequestVer14Funnel();
    static class OFBsnPduRxRequestVer14Funnel implements Funnel<OFBsnPduRxRequestVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnPduRxRequestVer14 message, PrimitiveSink sink) {
            // fixed value property version = 5
            sink.putByte((byte) 0x5);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x21L
            sink.putInt(0x21);
            sink.putLong(message.timeoutMs);
            message.portNo.putTo(sink);
            sink.putShort(message.slotNum);
            // skip pad (3 bytes)
            sink.putBytes(message.data);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnPduRxRequestVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnPduRxRequestVer14 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 5
            bb.writeByte((byte) 0x5);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x21L
            bb.writeInt(0x21);
            bb.writeInt(U32.t(message.timeoutMs));
            message.portNo.write4Bytes(bb);
            bb.writeByte(U8.t(message.slotNum));
            // pad: 3 bytes
            bb.writeZero(3);
            bb.writeBytes(message.data);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnPduRxRequestVer14(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("timeoutMs=").append(timeoutMs);
        b.append(", ");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("slotNum=").append(slotNum);
        b.append(", ");
        b.append("data=").append(Arrays.toString(data));
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
        OFBsnPduRxRequestVer14 other = (OFBsnPduRxRequestVer14) obj;

        if( xid != other.xid)
            return false;
        if( timeoutMs != other.timeoutMs)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if( slotNum != other.slotNum)
            return false;
        if (!Arrays.equals(data, other.data))
                return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime *  (int) (timeoutMs ^ (timeoutMs >>> 32));
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + slotNum;
        result = prime * result + Arrays.hashCode(data);
        return result;
    }

}
