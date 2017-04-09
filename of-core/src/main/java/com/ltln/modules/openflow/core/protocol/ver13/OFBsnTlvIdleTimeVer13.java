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

class OFBsnTlvIdleTimeVer13 implements OFBsnTlvIdleTime {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvIdleTimeVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 12;

        private final static U64 DEFAULT_VALUE = U64.ZERO;

    // OF message fields
    private final U64 value;
//
    // Immutable default instance
    final static OFBsnTlvIdleTimeVer13 DEFAULT = new OFBsnTlvIdleTimeVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvIdleTimeVer13(U64 value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvIdleTimeVer13: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x5;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnTlvIdleTime.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvIdleTime.Builder {
        final OFBsnTlvIdleTimeVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U64 value;

        BuilderWithParent(OFBsnTlvIdleTimeVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x5;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIdleTime.Builder setValue(U64 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnTlvIdleTime build() {
                U64 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvIdleTimeVer13(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvIdleTime.Builder {
        // OF message fields
        private boolean valueSet;
        private U64 value;

    @Override
    public int getType() {
        return 0x5;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFBsnTlvIdleTime.Builder setValue(U64 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFBsnTlvIdleTime build() {
            U64 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvIdleTimeVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvIdleTime> {
        @Override
        public OFBsnTlvIdleTime readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x5
            short type = bb.readShort();
            if(type != (short) 0x5)
                throw new OFParseError("Wrong type: Expected=0x5(0x5), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 12)
                throw new OFParseError("Wrong length: Expected=12(12), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            U64 value = U64.ofRaw(bb.readLong());

            OFBsnTlvIdleTimeVer13 bsnTlvIdleTimeVer13 = new OFBsnTlvIdleTimeVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvIdleTimeVer13);
            return bsnTlvIdleTimeVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvIdleTimeVer13Funnel FUNNEL = new OFBsnTlvIdleTimeVer13Funnel();
    static class OFBsnTlvIdleTimeVer13Funnel implements Funnel<OFBsnTlvIdleTimeVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvIdleTimeVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x5
            sink.putShort((short) 0x5);
            // fixed value property length = 12
            sink.putShort((short) 0xc);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvIdleTimeVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvIdleTimeVer13 message) {
            // fixed value property type = 0x5
            bb.writeShort((short) 0x5);
            // fixed value property length = 12
            bb.writeShort((short) 0xc);
            bb.writeLong(message.value.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvIdleTimeVer13(");
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
        OFBsnTlvIdleTimeVer13 other = (OFBsnTlvIdleTimeVer13) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
