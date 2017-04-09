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

class OFBsnTlvBroadcastQueryTimeoutVer14 implements OFBsnTlvBroadcastQueryTimeout {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvBroadcastQueryTimeoutVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 8;

        private final static long DEFAULT_VALUE = 0x0L;

    // OF message fields
    private final long value;
//
    // Immutable default instance
    final static OFBsnTlvBroadcastQueryTimeoutVer14 DEFAULT = new OFBsnTlvBroadcastQueryTimeoutVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvBroadcastQueryTimeoutVer14(long value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0xa;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvBroadcastQueryTimeout.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvBroadcastQueryTimeout.Builder {
        final OFBsnTlvBroadcastQueryTimeoutVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private long value;

        BuilderWithParent(OFBsnTlvBroadcastQueryTimeoutVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0xa;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public OFBsnTlvBroadcastQueryTimeout.Builder setValue(long value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvBroadcastQueryTimeout build() {
                long value = this.valueSet ? this.value : parentMessage.value;

                //
                return new OFBsnTlvBroadcastQueryTimeoutVer14(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvBroadcastQueryTimeout.Builder {
        // OF message fields
        private boolean valueSet;
        private long value;

    @Override
    public int getType() {
        return 0xa;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public OFBsnTlvBroadcastQueryTimeout.Builder setValue(long value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBsnTlvBroadcastQueryTimeout build() {
            long value = this.valueSet ? this.value : DEFAULT_VALUE;


            return new OFBsnTlvBroadcastQueryTimeoutVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvBroadcastQueryTimeout> {
        @Override
        public OFBsnTlvBroadcastQueryTimeout readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0xa
            short type = bb.readShort();
            if(type != (short) 0xa)
                throw new OFParseError("Wrong type: Expected=0xa(0xa), got="+type);
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
            long value = U32.f(bb.readInt());

            OFBsnTlvBroadcastQueryTimeoutVer14 bsnTlvBroadcastQueryTimeoutVer14 = new OFBsnTlvBroadcastQueryTimeoutVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvBroadcastQueryTimeoutVer14);
            return bsnTlvBroadcastQueryTimeoutVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvBroadcastQueryTimeoutVer14Funnel FUNNEL = new OFBsnTlvBroadcastQueryTimeoutVer14Funnel();
    static class OFBsnTlvBroadcastQueryTimeoutVer14Funnel implements Funnel<OFBsnTlvBroadcastQueryTimeoutVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvBroadcastQueryTimeoutVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0xa
            sink.putShort((short) 0xa);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putLong(message.value);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvBroadcastQueryTimeoutVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvBroadcastQueryTimeoutVer14 message) {
            // fixed value property type = 0xa
            bb.writeShort((short) 0xa);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeInt(U32.t(message.value));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvBroadcastQueryTimeoutVer14(");
        b.append("value=").append(value);
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
        OFBsnTlvBroadcastQueryTimeoutVer14 other = (OFBsnTlvBroadcastQueryTimeoutVer14) obj;

        if( value != other.value)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (value ^ (value >>> 32));
        return result;
    }

}