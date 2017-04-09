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

class OFBsnTlvIdleTimeoutVer14 implements OFBsnTlvIdleTimeout {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvIdleTimeoutVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 8;

        private final static long DEFAULT_VALUE = 0x0L;

    // OF message fields
    private final long value;
//
    // Immutable default instance
    final static OFBsnTlvIdleTimeoutVer14 DEFAULT = new OFBsnTlvIdleTimeoutVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvIdleTimeoutVer14(long value) {
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x8;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvIdleTimeout.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvIdleTimeout.Builder {
        final OFBsnTlvIdleTimeoutVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private long value;

        BuilderWithParent(OFBsnTlvIdleTimeoutVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x8;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIdleTimeout.Builder setValue(long value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvIdleTimeout build() {
                long value = this.valueSet ? this.value : parentMessage.value;

                //
                return new OFBsnTlvIdleTimeoutVer14(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvIdleTimeout.Builder {
        // OF message fields
        private boolean valueSet;
        private long value;

    @Override
    public int getType() {
        return 0x8;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIdleTimeout.Builder setValue(long value) {
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
        public OFBsnTlvIdleTimeout build() {
            long value = this.valueSet ? this.value : DEFAULT_VALUE;


            return new OFBsnTlvIdleTimeoutVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvIdleTimeout> {
        @Override
        public OFBsnTlvIdleTimeout readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x8
            short type = bb.readShort();
            if(type != (short) 0x8)
                throw new OFParseError("Wrong type: Expected=0x8(0x8), got="+type);
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

            OFBsnTlvIdleTimeoutVer14 bsnTlvIdleTimeoutVer14 = new OFBsnTlvIdleTimeoutVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvIdleTimeoutVer14);
            return bsnTlvIdleTimeoutVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvIdleTimeoutVer14Funnel FUNNEL = new OFBsnTlvIdleTimeoutVer14Funnel();
    static class OFBsnTlvIdleTimeoutVer14Funnel implements Funnel<OFBsnTlvIdleTimeoutVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvIdleTimeoutVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x8
            sink.putShort((short) 0x8);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putLong(message.value);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvIdleTimeoutVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvIdleTimeoutVer14 message) {
            // fixed value property type = 0x8
            bb.writeShort((short) 0x8);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeInt(U32.t(message.value));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvIdleTimeoutVer14(");
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
        OFBsnTlvIdleTimeoutVer14 other = (OFBsnTlvIdleTimeoutVer14) obj;

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
