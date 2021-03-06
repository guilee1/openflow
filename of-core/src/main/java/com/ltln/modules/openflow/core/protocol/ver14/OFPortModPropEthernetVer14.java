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

class OFPortModPropEthernetVer14 implements OFPortModPropEthernet {
    private static final Logger logger = LoggerFactory.getLogger(OFPortModPropEthernetVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 8;

        private final static long DEFAULT_ADVERTISE = 0x0L;

    // OF message fields
    private final long advertise;
//
    // Immutable default instance
    final static OFPortModPropEthernetVer14 DEFAULT = new OFPortModPropEthernetVer14(
        DEFAULT_ADVERTISE
    );

    // package private constructor - used by readers, builders, and factory
    OFPortModPropEthernetVer14(long advertise) {
        this.advertise = advertise;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public long getAdvertise() {
        return advertise;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFPortModPropEthernet.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortModPropEthernet.Builder {
        final OFPortModPropEthernetVer14 parentMessage;

        // OF message fields
        private boolean advertiseSet;
        private long advertise;

        BuilderWithParent(OFPortModPropEthernetVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public long getAdvertise() {
        return advertise;
    }

    @Override
    public OFPortModPropEthernet.Builder setAdvertise(long advertise) {
        this.advertise = advertise;
        this.advertiseSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFPortModPropEthernet build() {
                long advertise = this.advertiseSet ? this.advertise : parentMessage.advertise;

                //
                return new OFPortModPropEthernetVer14(
                    advertise
                );
        }

    }

    static class Builder implements OFPortModPropEthernet.Builder {
        // OF message fields
        private boolean advertiseSet;
        private long advertise;

    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public long getAdvertise() {
        return advertise;
    }

    @Override
    public OFPortModPropEthernet.Builder setAdvertise(long advertise) {
        this.advertise = advertise;
        this.advertiseSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFPortModPropEthernet build() {
            long advertise = this.advertiseSet ? this.advertise : DEFAULT_ADVERTISE;


            return new OFPortModPropEthernetVer14(
                    advertise
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortModPropEthernet> {
        @Override
        public OFPortModPropEthernet readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x0
            short type = bb.readShort();
            if(type != (short) 0x0)
                throw new OFParseError("Wrong type: Expected=0x0(0x0), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long advertise = U32.f(bb.readInt());

            OFPortModPropEthernetVer14 portModPropEthernetVer14 = new OFPortModPropEthernetVer14(
                    advertise
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portModPropEthernetVer14);
            return portModPropEthernetVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortModPropEthernetVer14Funnel FUNNEL = new OFPortModPropEthernetVer14Funnel();
    static class OFPortModPropEthernetVer14Funnel implements Funnel<OFPortModPropEthernetVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortModPropEthernetVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x0
            sink.putShort((short) 0x0);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putLong(message.advertise);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortModPropEthernetVer14> {
        @Override
        public void write(ByteBuf bb, OFPortModPropEthernetVer14 message) {
            // fixed value property type = 0x0
            bb.writeShort((short) 0x0);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeInt(U32.t(message.advertise));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortModPropEthernetVer14(");
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
        OFPortModPropEthernetVer14 other = (OFPortModPropEthernetVer14) obj;

        if( advertise != other.advertise)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (advertise ^ (advertise >>> 32));
        return result;
    }

}
