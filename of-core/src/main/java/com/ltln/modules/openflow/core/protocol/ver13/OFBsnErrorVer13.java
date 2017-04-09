// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver13;

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

class OFBsnErrorVer13 implements OFBsnError {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnErrorVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 272;

        private final static long DEFAULT_XID = 0x0L;
        private final static String DEFAULT_ERR_MSG = "";
        private final static OFErrorCauseData DEFAULT_DATA = OFErrorCauseData.NONE;

    // OF message fields
    private final long xid;
    private final String errMsg;
    private final OFErrorCauseData data;
//
    // Immutable default instance
    final static OFBsnErrorVer13 DEFAULT = new OFBsnErrorVer13(
        DEFAULT_XID, DEFAULT_ERR_MSG, DEFAULT_DATA
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnErrorVer13(long xid, String errMsg, OFErrorCauseData data) {
        if(errMsg == null) {
            throw new NullPointerException("OFBsnErrorVer13: property errMsg cannot be null");
        }
        if(data == null) {
            throw new NullPointerException("OFBsnErrorVer13: property data cannot be null");
        }
        this.xid = xid;
        this.errMsg = errMsg;
        this.data = data;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.ERROR;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFErrorType getErrType() {
        return OFErrorType.EXPERIMENTER;
    }

    @Override
    public int getSubtype() {
        return 0x1;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public OFErrorCauseData getData() {
        return data;
    }



    public OFBsnError.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnError.Builder {
        final OFBsnErrorVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean errMsgSet;
        private String errMsg;
        private boolean dataSet;
        private OFErrorCauseData data;

        BuilderWithParent(OFBsnErrorVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.ERROR;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnError.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFErrorType getErrType() {
        return OFErrorType.EXPERIMENTER;
    }

    @Override
    public int getSubtype() {
        return 0x1;
    }

    @Override
    public OFBsnError.Builder setSubtype(int subtype) {
            throw new UnsupportedOperationException("Property subtype is not writeable");
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public OFBsnError.Builder setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        this.errMsgSet = true;
        return this;
    }
    @Override
    public OFErrorCauseData getData() {
        return data;
    }

    @Override
    public OFBsnError.Builder setData(OFErrorCauseData data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }


        @Override
        public OFBsnError build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                String errMsg = this.errMsgSet ? this.errMsg : parentMessage.errMsg;
                if(errMsg == null)
                    throw new NullPointerException("Property errMsg must not be null");
                OFErrorCauseData data = this.dataSet ? this.data : parentMessage.data;
                if(data == null)
                    throw new NullPointerException("Property data must not be null");

                //
                return new OFBsnErrorVer13(
                    xid,
                    errMsg,
                    data
                );
        }

    }

    static class Builder implements OFBsnError.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean errMsgSet;
        private String errMsg;
        private boolean dataSet;
        private OFErrorCauseData data;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.ERROR;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnError.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFErrorType getErrType() {
        return OFErrorType.EXPERIMENTER;
    }

    @Override
    public int getSubtype() {
        return 0x1;
    }

    @Override
    public OFBsnError.Builder setSubtype(int subtype) {
            throw new UnsupportedOperationException("Property subtype is not writeable");
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public String getErrMsg() {
        return errMsg;
    }

    @Override
    public OFBsnError.Builder setErrMsg(String errMsg) {
        this.errMsg = errMsg;
        this.errMsgSet = true;
        return this;
    }
    @Override
    public OFErrorCauseData getData() {
        return data;
    }

    @Override
    public OFBsnError.Builder setData(OFErrorCauseData data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
//
        @Override
        public OFBsnError build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            String errMsg = this.errMsgSet ? this.errMsg : DEFAULT_ERR_MSG;
            if(errMsg == null)
                throw new NullPointerException("Property errMsg must not be null");
            OFErrorCauseData data = this.dataSet ? this.data : DEFAULT_DATA;
            if(data == null)
                throw new NullPointerException("Property data must not be null");


            return new OFBsnErrorVer13(
                    xid,
                    errMsg,
                    data
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnError> {
        @Override
        public OFBsnError readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
            // fixed value property type == 1
            byte type = bb.readByte();
            if(type != (byte) 0x1)
                throw new OFParseError("Wrong type: Expected=OFType.ERROR(1), got="+type);
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
            // fixed value property errType == 65535
            short errType = bb.readShort();
            if(errType != (short) 0xffff)
                throw new OFParseError("Wrong errType: Expected=OFErrorType.EXPERIMENTER(65535), got="+errType);
            // fixed value property subtype == 0x1
            short subtype = bb.readShort();
            if(subtype != (short) 0x1)
                throw new OFParseError("Wrong subtype: Expected=0x1(0x1), got="+subtype);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            String errMsg = ChannelUtils.readFixedLengthString(bb, 256);
            OFErrorCauseData data = OFErrorCauseData.read(bb, length - (bb.readerIndex() - start), OFVersion.OF_13);

            OFBsnErrorVer13 bsnErrorVer13 = new OFBsnErrorVer13(
                    xid,
                      errMsg,
                      data
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnErrorVer13);
            return bsnErrorVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnErrorVer13Funnel FUNNEL = new OFBsnErrorVer13Funnel();
    static class OFBsnErrorVer13Funnel implements Funnel<OFBsnErrorVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnErrorVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 1
            sink.putByte((byte) 0x1);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property errType = 65535
            sink.putShort((short) 0xffff);
            // fixed value property subtype = 0x1
            sink.putShort((short) 0x1);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            sink.putUnencodedChars(message.errMsg);
            message.data.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnErrorVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnErrorVer13 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 1
            bb.writeByte((byte) 0x1);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property errType = 65535
            bb.writeShort((short) 0xffff);
            // fixed value property subtype = 0x1
            bb.writeShort((short) 0x1);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            ChannelUtils.writeFixedLengthString(bb, message.errMsg, 256);
            message.data.writeTo(bb);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnErrorVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("errMsg=").append(errMsg);
        b.append(", ");
        b.append("data=").append(data);
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
        OFBsnErrorVer13 other = (OFBsnErrorVer13) obj;

        if( xid != other.xid)
            return false;
        if (errMsg == null) {
            if (other.errMsg != null)
                return false;
        } else if (!errMsg.equals(other.errMsg))
            return false;
        if (data == null) {
            if (other.data != null)
                return false;
        } else if (!data.equals(other.data))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((errMsg == null) ? 0 : errMsg.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

}
