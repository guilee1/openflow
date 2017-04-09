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

class OFBsnInterfaceVer10 implements OFBsnInterface {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnInterfaceVer10.class);
    // version: 1.0
    final static byte WIRE_VERSION = 1;
    final static int LENGTH = 32;

        private final static MacAddress DEFAULT_HW_ADDR = MacAddress.NONE;
        private final static String DEFAULT_NAME = "";
        private final static IPv4Address DEFAULT_IPV4_ADDR = IPv4Address.NONE;
        private final static IPv4Address DEFAULT_IPV4_NETMASK = IPv4Address.NONE;

    // OF message fields
    private final MacAddress hwAddr;
    private final String name;
    private final IPv4Address ipv4Addr;
    private final IPv4Address ipv4Netmask;
//
    // Immutable default instance
    final static OFBsnInterfaceVer10 DEFAULT = new OFBsnInterfaceVer10(
        DEFAULT_HW_ADDR, DEFAULT_NAME, DEFAULT_IPV4_ADDR, DEFAULT_IPV4_NETMASK
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnInterfaceVer10(MacAddress hwAddr, String name, IPv4Address ipv4Addr, IPv4Address ipv4Netmask) {
        if(hwAddr == null) {
            throw new NullPointerException("OFBsnInterfaceVer10: property hwAddr cannot be null");
        }
        if(name == null) {
            throw new NullPointerException("OFBsnInterfaceVer10: property name cannot be null");
        }
        if(ipv4Addr == null) {
            throw new NullPointerException("OFBsnInterfaceVer10: property ipv4Addr cannot be null");
        }
        if(ipv4Netmask == null) {
            throw new NullPointerException("OFBsnInterfaceVer10: property ipv4Netmask cannot be null");
        }
        this.hwAddr = hwAddr;
        this.name = name;
        this.ipv4Addr = ipv4Addr;
        this.ipv4Netmask = ipv4Netmask;
    }

    // Accessors for OF message fields
    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public IPv4Address getIpv4Addr() {
        return ipv4Addr;
    }

    @Override
    public IPv4Address getIpv4Netmask() {
        return ipv4Netmask;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



    public OFBsnInterface.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnInterface.Builder {
        final OFBsnInterfaceVer10 parentMessage;

        // OF message fields
        private boolean hwAddrSet;
        private MacAddress hwAddr;
        private boolean nameSet;
        private String name;
        private boolean ipv4AddrSet;
        private IPv4Address ipv4Addr;
        private boolean ipv4NetmaskSet;
        private IPv4Address ipv4Netmask;

        BuilderWithParent(OFBsnInterfaceVer10 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public OFBsnInterface.Builder setHwAddr(MacAddress hwAddr) {
        this.hwAddr = hwAddr;
        this.hwAddrSet = true;
        return this;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public OFBsnInterface.Builder setName(String name) {
        this.name = name;
        this.nameSet = true;
        return this;
    }
    @Override
    public IPv4Address getIpv4Addr() {
        return ipv4Addr;
    }

    @Override
    public OFBsnInterface.Builder setIpv4Addr(IPv4Address ipv4Addr) {
        this.ipv4Addr = ipv4Addr;
        this.ipv4AddrSet = true;
        return this;
    }
    @Override
    public IPv4Address getIpv4Netmask() {
        return ipv4Netmask;
    }

    @Override
    public OFBsnInterface.Builder setIpv4Netmask(IPv4Address ipv4Netmask) {
        this.ipv4Netmask = ipv4Netmask;
        this.ipv4NetmaskSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }



        @Override
        public OFBsnInterface build() {
                MacAddress hwAddr = this.hwAddrSet ? this.hwAddr : parentMessage.hwAddr;
                if(hwAddr == null)
                    throw new NullPointerException("Property hwAddr must not be null");
                String name = this.nameSet ? this.name : parentMessage.name;
                if(name == null)
                    throw new NullPointerException("Property name must not be null");
                IPv4Address ipv4Addr = this.ipv4AddrSet ? this.ipv4Addr : parentMessage.ipv4Addr;
                if(ipv4Addr == null)
                    throw new NullPointerException("Property ipv4Addr must not be null");
                IPv4Address ipv4Netmask = this.ipv4NetmaskSet ? this.ipv4Netmask : parentMessage.ipv4Netmask;
                if(ipv4Netmask == null)
                    throw new NullPointerException("Property ipv4Netmask must not be null");

                //
                return new OFBsnInterfaceVer10(
                    hwAddr,
                    name,
                    ipv4Addr,
                    ipv4Netmask
                );
        }

    }

    static class Builder implements OFBsnInterface.Builder {
        // OF message fields
        private boolean hwAddrSet;
        private MacAddress hwAddr;
        private boolean nameSet;
        private String name;
        private boolean ipv4AddrSet;
        private IPv4Address ipv4Addr;
        private boolean ipv4NetmaskSet;
        private IPv4Address ipv4Netmask;

    @Override
    public MacAddress getHwAddr() {
        return hwAddr;
    }

    @Override
    public OFBsnInterface.Builder setHwAddr(MacAddress hwAddr) {
        this.hwAddr = hwAddr;
        this.hwAddrSet = true;
        return this;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public OFBsnInterface.Builder setName(String name) {
        this.name = name;
        this.nameSet = true;
        return this;
    }
    @Override
    public IPv4Address getIpv4Addr() {
        return ipv4Addr;
    }

    @Override
    public OFBsnInterface.Builder setIpv4Addr(IPv4Address ipv4Addr) {
        this.ipv4Addr = ipv4Addr;
        this.ipv4AddrSet = true;
        return this;
    }
    @Override
    public IPv4Address getIpv4Netmask() {
        return ipv4Netmask;
    }

    @Override
    public OFBsnInterface.Builder setIpv4Netmask(IPv4Address ipv4Netmask) {
        this.ipv4Netmask = ipv4Netmask;
        this.ipv4NetmaskSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_10;
    }

//
        @Override
        public OFBsnInterface build() {
            MacAddress hwAddr = this.hwAddrSet ? this.hwAddr : DEFAULT_HW_ADDR;
            if(hwAddr == null)
                throw new NullPointerException("Property hwAddr must not be null");
            String name = this.nameSet ? this.name : DEFAULT_NAME;
            if(name == null)
                throw new NullPointerException("Property name must not be null");
            IPv4Address ipv4Addr = this.ipv4AddrSet ? this.ipv4Addr : DEFAULT_IPV4_ADDR;
            if(ipv4Addr == null)
                throw new NullPointerException("Property ipv4Addr must not be null");
            IPv4Address ipv4Netmask = this.ipv4NetmaskSet ? this.ipv4Netmask : DEFAULT_IPV4_NETMASK;
            if(ipv4Netmask == null)
                throw new NullPointerException("Property ipv4Netmask must not be null");


            return new OFBsnInterfaceVer10(
                    hwAddr,
                    name,
                    ipv4Addr,
                    ipv4Netmask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnInterface> {
        @Override
        public OFBsnInterface readFrom(ByteBuf bb) throws OFParseError {
            MacAddress hwAddr = MacAddress.read6Bytes(bb);
            // pad: 2 bytes
            bb.skipBytes(2);
            String name = ChannelUtils.readFixedLengthString(bb, 16);
            IPv4Address ipv4Addr = IPv4Address.read4Bytes(bb);
            IPv4Address ipv4Netmask = IPv4Address.read4Bytes(bb);

            OFBsnInterfaceVer10 bsnInterfaceVer10 = new OFBsnInterfaceVer10(
                    hwAddr,
                      name,
                      ipv4Addr,
                      ipv4Netmask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnInterfaceVer10);
            return bsnInterfaceVer10;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnInterfaceVer10Funnel FUNNEL = new OFBsnInterfaceVer10Funnel();
    static class OFBsnInterfaceVer10Funnel implements Funnel<OFBsnInterfaceVer10> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnInterfaceVer10 message, PrimitiveSink sink) {
            message.hwAddr.putTo(sink);
            // skip pad (2 bytes)
            sink.putUnencodedChars(message.name);
            message.ipv4Addr.putTo(sink);
            message.ipv4Netmask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnInterfaceVer10> {
        @Override
        public void write(ByteBuf bb, OFBsnInterfaceVer10 message) {
            message.hwAddr.write6Bytes(bb);
            // pad: 2 bytes
            bb.writeZero(2);
            ChannelUtils.writeFixedLengthString(bb, message.name, 16);
            message.ipv4Addr.write4Bytes(bb);
            message.ipv4Netmask.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnInterfaceVer10(");
        b.append("hwAddr=").append(hwAddr);
        b.append(", ");
        b.append("name=").append(name);
        b.append(", ");
        b.append("ipv4Addr=").append(ipv4Addr);
        b.append(", ");
        b.append("ipv4Netmask=").append(ipv4Netmask);
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
        OFBsnInterfaceVer10 other = (OFBsnInterfaceVer10) obj;

        if (hwAddr == null) {
            if (other.hwAddr != null)
                return false;
        } else if (!hwAddr.equals(other.hwAddr))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (ipv4Addr == null) {
            if (other.ipv4Addr != null)
                return false;
        } else if (!ipv4Addr.equals(other.ipv4Addr))
            return false;
        if (ipv4Netmask == null) {
            if (other.ipv4Netmask != null)
                return false;
        } else if (!ipv4Netmask.equals(other.ipv4Netmask))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((hwAddr == null) ? 0 : hwAddr.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((ipv4Addr == null) ? 0 : ipv4Addr.hashCode());
        result = prime * result + ((ipv4Netmask == null) ? 0 : ipv4Netmask.hashCode());
        return result;
    }

}