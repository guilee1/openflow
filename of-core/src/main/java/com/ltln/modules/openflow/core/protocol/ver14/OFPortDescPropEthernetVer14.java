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

class OFPortDescPropEthernetVer14 implements OFPortDescPropEthernet {
    private static final Logger logger = LoggerFactory.getLogger(OFPortDescPropEthernetVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 32;

        private final static long DEFAULT_CURR = 0x0L;
        private final static long DEFAULT_ADVERTISED = 0x0L;
        private final static long DEFAULT_SUPPORTED = 0x0L;
        private final static long DEFAULT_PEER = 0x0L;
        private final static long DEFAULT_CURR_SPEED = 0x0L;
        private final static long DEFAULT_MAX_SPEED = 0x0L;

    // OF message fields
    private final long curr;
    private final long advertised;
    private final long supported;
    private final long peer;
    private final long currSpeed;
    private final long maxSpeed;
//
    // Immutable default instance
    final static OFPortDescPropEthernetVer14 DEFAULT = new OFPortDescPropEthernetVer14(
        DEFAULT_CURR, DEFAULT_ADVERTISED, DEFAULT_SUPPORTED, DEFAULT_PEER, DEFAULT_CURR_SPEED, DEFAULT_MAX_SPEED
    );

    // package private constructor - used by readers, builders, and factory
    OFPortDescPropEthernetVer14(long curr, long advertised, long supported, long peer, long currSpeed, long maxSpeed) {
        this.curr = curr;
        this.advertised = advertised;
        this.supported = supported;
        this.peer = peer;
        this.currSpeed = currSpeed;
        this.maxSpeed = maxSpeed;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public long getCurr() {
        return curr;
    }

    @Override
    public long getAdvertised() {
        return advertised;
    }

    @Override
    public long getSupported() {
        return supported;
    }

    @Override
    public long getPeer() {
        return peer;
    }

    @Override
    public long getCurrSpeed() {
        return currSpeed;
    }

    @Override
    public long getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFPortDescPropEthernet.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortDescPropEthernet.Builder {
        final OFPortDescPropEthernetVer14 parentMessage;

        // OF message fields
        private boolean currSet;
        private long curr;
        private boolean advertisedSet;
        private long advertised;
        private boolean supportedSet;
        private long supported;
        private boolean peerSet;
        private long peer;
        private boolean currSpeedSet;
        private long currSpeed;
        private boolean maxSpeedSet;
        private long maxSpeed;

        BuilderWithParent(OFPortDescPropEthernetVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public long getCurr() {
        return curr;
    }

    @Override
    public OFPortDescPropEthernet.Builder setCurr(long curr) {
        this.curr = curr;
        this.currSet = true;
        return this;
    }
    @Override
    public long getAdvertised() {
        return advertised;
    }

    @Override
    public OFPortDescPropEthernet.Builder setAdvertised(long advertised) {
        this.advertised = advertised;
        this.advertisedSet = true;
        return this;
    }
    @Override
    public long getSupported() {
        return supported;
    }

    @Override
    public OFPortDescPropEthernet.Builder setSupported(long supported) {
        this.supported = supported;
        this.supportedSet = true;
        return this;
    }
    @Override
    public long getPeer() {
        return peer;
    }

    @Override
    public OFPortDescPropEthernet.Builder setPeer(long peer) {
        this.peer = peer;
        this.peerSet = true;
        return this;
    }
    @Override
    public long getCurrSpeed() {
        return currSpeed;
    }

    @Override
    public OFPortDescPropEthernet.Builder setCurrSpeed(long currSpeed) {
        this.currSpeed = currSpeed;
        this.currSpeedSet = true;
        return this;
    }
    @Override
    public long getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public OFPortDescPropEthernet.Builder setMaxSpeed(long maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.maxSpeedSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFPortDescPropEthernet build() {
                long curr = this.currSet ? this.curr : parentMessage.curr;
                long advertised = this.advertisedSet ? this.advertised : parentMessage.advertised;
                long supported = this.supportedSet ? this.supported : parentMessage.supported;
                long peer = this.peerSet ? this.peer : parentMessage.peer;
                long currSpeed = this.currSpeedSet ? this.currSpeed : parentMessage.currSpeed;
                long maxSpeed = this.maxSpeedSet ? this.maxSpeed : parentMessage.maxSpeed;

                //
                return new OFPortDescPropEthernetVer14(
                    curr,
                    advertised,
                    supported,
                    peer,
                    currSpeed,
                    maxSpeed
                );
        }

    }

    static class Builder implements OFPortDescPropEthernet.Builder {
        // OF message fields
        private boolean currSet;
        private long curr;
        private boolean advertisedSet;
        private long advertised;
        private boolean supportedSet;
        private long supported;
        private boolean peerSet;
        private long peer;
        private boolean currSpeedSet;
        private long currSpeed;
        private boolean maxSpeedSet;
        private long maxSpeed;

    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public long getCurr() {
        return curr;
    }

    @Override
    public OFPortDescPropEthernet.Builder setCurr(long curr) {
        this.curr = curr;
        this.currSet = true;
        return this;
    }
    @Override
    public long getAdvertised() {
        return advertised;
    }

    @Override
    public OFPortDescPropEthernet.Builder setAdvertised(long advertised) {
        this.advertised = advertised;
        this.advertisedSet = true;
        return this;
    }
    @Override
    public long getSupported() {
        return supported;
    }

    @Override
    public OFPortDescPropEthernet.Builder setSupported(long supported) {
        this.supported = supported;
        this.supportedSet = true;
        return this;
    }
    @Override
    public long getPeer() {
        return peer;
    }

    @Override
    public OFPortDescPropEthernet.Builder setPeer(long peer) {
        this.peer = peer;
        this.peerSet = true;
        return this;
    }
    @Override
    public long getCurrSpeed() {
        return currSpeed;
    }

    @Override
    public OFPortDescPropEthernet.Builder setCurrSpeed(long currSpeed) {
        this.currSpeed = currSpeed;
        this.currSpeedSet = true;
        return this;
    }
    @Override
    public long getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public OFPortDescPropEthernet.Builder setMaxSpeed(long maxSpeed) {
        this.maxSpeed = maxSpeed;
        this.maxSpeedSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFPortDescPropEthernet build() {
            long curr = this.currSet ? this.curr : DEFAULT_CURR;
            long advertised = this.advertisedSet ? this.advertised : DEFAULT_ADVERTISED;
            long supported = this.supportedSet ? this.supported : DEFAULT_SUPPORTED;
            long peer = this.peerSet ? this.peer : DEFAULT_PEER;
            long currSpeed = this.currSpeedSet ? this.currSpeed : DEFAULT_CURR_SPEED;
            long maxSpeed = this.maxSpeedSet ? this.maxSpeed : DEFAULT_MAX_SPEED;


            return new OFPortDescPropEthernetVer14(
                    curr,
                    advertised,
                    supported,
                    peer,
                    currSpeed,
                    maxSpeed
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortDescPropEthernet> {
        @Override
        public OFPortDescPropEthernet readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x0
            short type = bb.readShort();
            if(type != (short) 0x0)
                throw new OFParseError("Wrong type: Expected=0x0(0x0), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 32)
                throw new OFParseError("Wrong length: Expected=32(32), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // pad: 4 bytes
            bb.skipBytes(4);
            long curr = U32.f(bb.readInt());
            long advertised = U32.f(bb.readInt());
            long supported = U32.f(bb.readInt());
            long peer = U32.f(bb.readInt());
            long currSpeed = U32.f(bb.readInt());
            long maxSpeed = U32.f(bb.readInt());

            OFPortDescPropEthernetVer14 portDescPropEthernetVer14 = new OFPortDescPropEthernetVer14(
                    curr,
                      advertised,
                      supported,
                      peer,
                      currSpeed,
                      maxSpeed
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portDescPropEthernetVer14);
            return portDescPropEthernetVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortDescPropEthernetVer14Funnel FUNNEL = new OFPortDescPropEthernetVer14Funnel();
    static class OFPortDescPropEthernetVer14Funnel implements Funnel<OFPortDescPropEthernetVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortDescPropEthernetVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x0
            sink.putShort((short) 0x0);
            // fixed value property length = 32
            sink.putShort((short) 0x20);
            // skip pad (4 bytes)
            sink.putLong(message.curr);
            sink.putLong(message.advertised);
            sink.putLong(message.supported);
            sink.putLong(message.peer);
            sink.putLong(message.currSpeed);
            sink.putLong(message.maxSpeed);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortDescPropEthernetVer14> {
        @Override
        public void write(ByteBuf bb, OFPortDescPropEthernetVer14 message) {
            // fixed value property type = 0x0
            bb.writeShort((short) 0x0);
            // fixed value property length = 32
            bb.writeShort((short) 0x20);
            // pad: 4 bytes
            bb.writeZero(4);
            bb.writeInt(U32.t(message.curr));
            bb.writeInt(U32.t(message.advertised));
            bb.writeInt(U32.t(message.supported));
            bb.writeInt(U32.t(message.peer));
            bb.writeInt(U32.t(message.currSpeed));
            bb.writeInt(U32.t(message.maxSpeed));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortDescPropEthernetVer14(");
        b.append("curr=").append(curr);
        b.append(", ");
        b.append("advertised=").append(advertised);
        b.append(", ");
        b.append("supported=").append(supported);
        b.append(", ");
        b.append("peer=").append(peer);
        b.append(", ");
        b.append("currSpeed=").append(currSpeed);
        b.append(", ");
        b.append("maxSpeed=").append(maxSpeed);
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
        OFPortDescPropEthernetVer14 other = (OFPortDescPropEthernetVer14) obj;

        if( curr != other.curr)
            return false;
        if( advertised != other.advertised)
            return false;
        if( supported != other.supported)
            return false;
        if( peer != other.peer)
            return false;
        if( currSpeed != other.currSpeed)
            return false;
        if( maxSpeed != other.maxSpeed)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (curr ^ (curr >>> 32));
        result = prime *  (int) (advertised ^ (advertised >>> 32));
        result = prime *  (int) (supported ^ (supported >>> 32));
        result = prime *  (int) (peer ^ (peer >>> 32));
        result = prime *  (int) (currSpeed ^ (currSpeed >>> 32));
        result = prime *  (int) (maxSpeed ^ (maxSpeed >>> 32));
        return result;
    }

}
