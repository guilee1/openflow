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

class OFBsnLogVer13 implements OFBsnLog {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnLogVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 17;

        private final static long DEFAULT_XID = 0x0L;
        private final static String DEFAULT_DATA = "";

    // OF message fields
    private final long xid;
    private final OFBsnLoglevel loglevel;
    private final String data;
//

    // package private constructor - used by readers, builders, and factory
    OFBsnLogVer13(long xid, OFBsnLoglevel loglevel, String data) {
        if(loglevel == null) {
            throw new NullPointerException("OFBsnLogVer13: property loglevel cannot be null");
        }
        if(data == null) {
            throw new NullPointerException("OFBsnLogVer13: property data cannot be null");
        }
        this.xid = xid;
        this.loglevel = loglevel;
        this.data = data;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
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
        return 0x3fL;
    }

    @Override
    public OFBsnLoglevel getLoglevel() {
        return loglevel;
    }

    @Override
    public String getData() {
        return data;
    }



    public OFBsnLog.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnLog.Builder {
        final OFBsnLogVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean loglevelSet;
        private OFBsnLoglevel loglevel;
        private boolean dataSet;
        private String data;

        BuilderWithParent(OFBsnLogVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
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
    public OFBsnLog.Builder setXid(long xid) {
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
        return 0x3fL;
    }

    @Override
    public OFBsnLoglevel getLoglevel() {
        return loglevel;
    }

    @Override
    public OFBsnLog.Builder setLoglevel(OFBsnLoglevel loglevel) {
        this.loglevel = loglevel;
        this.loglevelSet = true;
        return this;
    }
    @Override
    public String getData() {
        return data;
    }

    @Override
    public OFBsnLog.Builder setData(String data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }


        @Override
        public OFBsnLog build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFBsnLoglevel loglevel = this.loglevelSet ? this.loglevel : parentMessage.loglevel;
                if(loglevel == null)
                    throw new NullPointerException("Property loglevel must not be null");
                String data = this.dataSet ? this.data : parentMessage.data;
                if(data == null)
                    throw new NullPointerException("Property data must not be null");

                //
                return new OFBsnLogVer13(
                    xid,
                    loglevel,
                    data
                );
        }

    }

    static class Builder implements OFBsnLog.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean loglevelSet;
        private OFBsnLoglevel loglevel;
        private boolean dataSet;
        private String data;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
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
    public OFBsnLog.Builder setXid(long xid) {
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
        return 0x3fL;
    }

    @Override
    public OFBsnLoglevel getLoglevel() {
        return loglevel;
    }

    @Override
    public OFBsnLog.Builder setLoglevel(OFBsnLoglevel loglevel) {
        this.loglevel = loglevel;
        this.loglevelSet = true;
        return this;
    }
    @Override
    public String getData() {
        return data;
    }

    @Override
    public OFBsnLog.Builder setData(String data) {
        this.data = data;
        this.dataSet = true;
        return this;
    }
//
        @Override
        public OFBsnLog build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            if(!this.loglevelSet)
                throw new IllegalStateException("Property loglevel doesn't have default value -- must be set");
            if(loglevel == null)
                throw new NullPointerException("Property loglevel must not be null");
            String data = this.dataSet ? this.data : DEFAULT_DATA;
            if(data == null)
                throw new NullPointerException("Property data must not be null");


            return new OFBsnLogVer13(
                    xid,
                    loglevel,
                    data
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnLog> {
        @Override
        public OFBsnLog readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
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
            // fixed value property subtype == 0x3fL
            int subtype = bb.readInt();
            if(subtype != 0x3f)
                throw new OFParseError("Wrong subtype: Expected=0x3fL(0x3fL), got="+subtype);
            OFBsnLoglevel loglevel = OFBsnLoglevelSerializerVer13.readFrom(bb);
            String data = ChannelUtils.readFixedLengthString(bb, length - (bb.readerIndex() - start));

            OFBsnLogVer13 bsnLogVer13 = new OFBsnLogVer13(
                    xid,
                      loglevel,
                      data
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnLogVer13);
            return bsnLogVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnLogVer13Funnel FUNNEL = new OFBsnLogVer13Funnel();
    static class OFBsnLogVer13Funnel implements Funnel<OFBsnLogVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnLogVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // FIXME: skip funnel of length
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x3fL
            sink.putInt(0x3f);
            OFBsnLoglevelSerializerVer13.putTo(message.loglevel, sink);
            sink.putUnencodedChars(message.data);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnLogVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnLogVer13 message) {
            int startIndex = bb.writerIndex();
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x3fL
            bb.writeInt(0x3f);
            OFBsnLoglevelSerializerVer13.writeTo(bb, message.loglevel);
            ChannelUtils.writeFixedLengthString(bb, message.data, message.data.length());

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnLogVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("loglevel=").append(loglevel);
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
        OFBsnLogVer13 other = (OFBsnLogVer13) obj;

        if( xid != other.xid)
            return false;
        if (loglevel == null) {
            if (other.loglevel != null)
                return false;
        } else if (!loglevel.equals(other.loglevel))
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
        result = prime * result + ((loglevel == null) ? 0 : loglevel.hashCode());
        result = prime * result + ((data == null) ? 0 : data.hashCode());
        return result;
    }

}