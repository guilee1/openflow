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
import java.util.List;
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

class OFPortModVer13 implements OFPortMod {
    private static final Logger logger = LoggerFactory.getLogger(OFPortModVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 40;

        private final static long DEFAULT_XID = 0x0L;
        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static MacAddress DEFAULT_HW_ADDR = MacAddress.NONE;
        private final static long DEFAULT_CONFIG = 0x0L;
        private final static long DEFAULT_MASK = 0x0L;
        private final static long DEFAULT_ADVERTISE = 0x0L;

    // OF message fields
    private final long xid;
    private final OFPort portNo;
    private final MacAddress hwAddr;
    private final long config;
    private final long mask;
    private final long advertise;
//
    // Immutable default instance
    final static OFPortModVer13 DEFAULT = new OFPortModVer13(
        DEFAULT_XID, DEFAULT_PORT_NO, DEFAULT_HW_ADDR, DEFAULT_CONFIG, DEFAULT_MASK, DEFAULT_ADVERTISE
    );

    // package private constructor - used by readers, builders, and factory
    OFPortModVer13(long xid, OFPort portNo, MacAddress hwAddr, long config, long mask, long advertise) {
        if(portNo == null) {
            throw new NullPointerException("OFPortModVer13: property portNo cannot be null");
        }
        if(hwAddr == null) {
            throw new NullPointerException("OFPortModVer13: property hwAddr cannot be null");
        }
        this.xid = xid;
        this.portNo = portNo;
        this.hwAddr = hwAddr;
        this.config = config;
        this.mask = mask;
        this.advertise = advertise;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public long getConfig() {
        return config;
    }

    @Override
    public long getMask() {
        return mask;
    }

    @Override
    public long getAdvertise() {
        return advertise;
    }

    @Override
    public List<OFPortModProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }



    public OFPortMod.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortMod.Builder {
        final OFPortModVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean hwAddrSet;
        private MacAddress hwAddr;
        private boolean configSet;
        private long config;
        private boolean maskSet;
        private long mask;
        private boolean advertiseSet;
        private long advertise;

        BuilderWithParent(OFPortModVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPortMod.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPortMod.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public OFPortMod.Builder setHwAddr(MacAddress hwAddr) {
        this.hwAddr = hwAddr;
        this.hwAddrSet = true;
        return this;
    }
    @Override
    public long getConfig() {
        return config;
    }

    @Override
    public OFPortMod.Builder setConfig(long config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public long getMask() {
        return mask;
    }

    @Override
    public OFPortMod.Builder setMask(long mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public long getAdvertise() {
        return advertise;
    }

    @Override
    public OFPortMod.Builder setAdvertise(long advertise) {
        this.advertise = advertise;
        this.advertiseSet = true;
        return this;
    }
    @Override
    public List<OFPortModProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }

    @Override
    public OFPortMod.Builder setProperties(List<OFPortModProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }


        @Override
        public OFPortMod build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                MacAddress hwAddr = this.hwAddrSet ? this.hwAddr : parentMessage.hwAddr;
                if(hwAddr == null)
                    throw new NullPointerException("Property hwAddr must not be null");
                long config = this.configSet ? this.config : parentMessage.config;
                long mask = this.maskSet ? this.mask : parentMessage.mask;
                long advertise = this.advertiseSet ? this.advertise : parentMessage.advertise;

                //
                return new OFPortModVer13(
                    xid,
                    portNo,
                    hwAddr,
                    config,
                    mask,
                    advertise
                );
        }

    }

    static class Builder implements OFPortMod.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean portNoSet;
        private OFPort portNo;
        private boolean hwAddrSet;
        private MacAddress hwAddr;
        private boolean configSet;
        private long config;
        private boolean maskSet;
        private long mask;
        private boolean advertiseSet;
        private long advertise;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.PORT_MOD;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFPortMod.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPortMod.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public OFPortMod.Builder setHwAddr(MacAddress hwAddr) {
        this.hwAddr = hwAddr;
        this.hwAddrSet = true;
        return this;
    }
    @Override
    public long getConfig() {
        return config;
    }

    @Override
    public OFPortMod.Builder setConfig(long config) {
        this.config = config;
        this.configSet = true;
        return this;
    }
    @Override
    public long getMask() {
        return mask;
    }

    @Override
    public OFPortMod.Builder setMask(long mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public long getAdvertise() {
        return advertise;
    }

    @Override
    public OFPortMod.Builder setAdvertise(long advertise) {
        this.advertise = advertise;
        this.advertiseSet = true;
        return this;
    }
    @Override
    public List<OFPortModProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }

    @Override
    public OFPortMod.Builder setProperties(List<OFPortModProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }
//
        @Override
        public OFPortMod build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            MacAddress hwAddr = this.hwAddrSet ? this.hwAddr : DEFAULT_HW_ADDR;
            if(hwAddr == null)
                throw new NullPointerException("Property hwAddr must not be null");
            long config = this.configSet ? this.config : DEFAULT_CONFIG;
            long mask = this.maskSet ? this.mask : DEFAULT_MASK;
            long advertise = this.advertiseSet ? this.advertise : DEFAULT_ADVERTISE;


            return new OFPortModVer13(
                    xid,
                    portNo,
                    hwAddr,
                    config,
                    mask,
                    advertise
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortMod> {
        @Override
        public OFPortMod readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
            // fixed value property type == 16
            byte type = bb.readByte();
            if(type != (byte) 0x10)
                throw new OFParseError("Wrong type: Expected=OFType.PORT_MOD(16), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 40)
                throw new OFParseError("Wrong length: Expected=40(40), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            OFPort portNo = OFPort.read4Bytes(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            MacAddress hwAddr = MacAddress.read6Bytes(bb);
            // pad: 2 bytes
            bb.skipBytes(2);
            long config = U32.f(bb.readInt());
            long mask = U32.f(bb.readInt());
            long advertise = U32.f(bb.readInt());
            // pad: 4 bytes
            bb.skipBytes(4);

            OFPortModVer13 portModVer13 = new OFPortModVer13(
                    xid,
                      portNo,
                      hwAddr,
                      config,
                      mask,
                      advertise
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portModVer13);
            return portModVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortModVer13Funnel FUNNEL = new OFPortModVer13Funnel();
    static class OFPortModVer13Funnel implements Funnel<OFPortModVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortModVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 16
            sink.putByte((byte) 0x10);
            // fixed value property length = 40
            sink.putShort((short) 0x28);
            sink.putLong(message.xid);
            message.portNo.putTo(sink);
            // skip pad (4 bytes)
            message.hwAddr.putTo(sink);
            // skip pad (2 bytes)
            sink.putLong(message.config);
            sink.putLong(message.mask);
            sink.putLong(message.advertise);
            // skip pad (4 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortModVer13> {
        @Override
        public void write(ByteBuf bb, OFPortModVer13 message) {
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 16
            bb.writeByte((byte) 0x10);
            // fixed value property length = 40
            bb.writeShort((short) 0x28);
            bb.writeInt(U32.t(message.xid));
            message.portNo.write4Bytes(bb);
            // pad: 4 bytes
            bb.writeZero(4);
            message.hwAddr.write6Bytes(bb);
            // pad: 2 bytes
            bb.writeZero(2);
            bb.writeInt(U32.t(message.config));
            bb.writeInt(U32.t(message.mask));
            bb.writeInt(U32.t(message.advertise));
            // pad: 4 bytes
            bb.writeZero(4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortModVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("hwAddr=").append(hwAddr);
        b.append(", ");
        b.append("config=").append(config);
        b.append(", ");
        b.append("mask=").append(mask);
        b.append(", ");
        b.append("advertise=").append(advertise);
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
        OFPortModVer13 other = (OFPortModVer13) obj;

        if( xid != other.xid)
            return false;
        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if (hwAddr == null) {
            if (other.hwAddr != null)
                return false;
        } else if (!hwAddr.equals(other.hwAddr))
            return false;
        if( config != other.config)
            return false;
        if( mask != other.mask)
            return false;
        if( advertise != other.advertise)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + ((hwAddr == null) ? 0 : hwAddr.hashCode());
        result = prime *  (int) (config ^ (config >>> 32));
        result = prime *  (int) (mask ^ (mask >>> 32));
        result = prime *  (int) (advertise ^ (advertise >>> 32));
        return result;
    }

}
