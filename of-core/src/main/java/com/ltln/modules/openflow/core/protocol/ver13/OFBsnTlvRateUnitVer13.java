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

class OFBsnTlvRateUnitVer13 implements OFBsnTlvRateUnit {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvRateUnitVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 5;


    // OF message fields
    private final OFBsnRateUnit value;
//

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvRateUnitVer13(OFBsnRateUnit value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvRateUnitVer13: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x59;
    }

    @Override
    public OFBsnRateUnit getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnTlvRateUnit.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvRateUnit.Builder {
        final OFBsnTlvRateUnitVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBsnRateUnit value;

        BuilderWithParent(OFBsnTlvRateUnitVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x59;
    }

    @Override
    public OFBsnRateUnit getValue() {
        return value;
    }

    @Override
    public OFBsnTlvRateUnit.Builder setValue(OFBsnRateUnit value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnTlvRateUnit build() {
                OFBsnRateUnit value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvRateUnitVer13(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvRateUnit.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBsnRateUnit value;

    @Override
    public int getType() {
        return 0x59;
    }

    @Override
    public OFBsnRateUnit getValue() {
        return value;
    }

    @Override
    public OFBsnTlvRateUnit.Builder setValue(OFBsnRateUnit value) {
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
        public OFBsnTlvRateUnit build() {
            if(!this.valueSet)
                throw new IllegalStateException("Property value doesn't have default value -- must be set");
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvRateUnitVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvRateUnit> {
        @Override
        public OFBsnTlvRateUnit readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x59
            short type = bb.readShort();
            if(type != (short) 0x59)
                throw new OFParseError("Wrong type: Expected=0x59(0x59), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 5)
                throw new OFParseError("Wrong length: Expected=5(5), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            OFBsnRateUnit value = OFBsnRateUnitSerializerVer13.readFrom(bb);

            OFBsnTlvRateUnitVer13 bsnTlvRateUnitVer13 = new OFBsnTlvRateUnitVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvRateUnitVer13);
            return bsnTlvRateUnitVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvRateUnitVer13Funnel FUNNEL = new OFBsnTlvRateUnitVer13Funnel();
    static class OFBsnTlvRateUnitVer13Funnel implements Funnel<OFBsnTlvRateUnitVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvRateUnitVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x59
            sink.putShort((short) 0x59);
            // fixed value property length = 5
            sink.putShort((short) 0x5);
            OFBsnRateUnitSerializerVer13.putTo(message.value, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvRateUnitVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvRateUnitVer13 message) {
            // fixed value property type = 0x59
            bb.writeShort((short) 0x59);
            // fixed value property length = 5
            bb.writeShort((short) 0x5);
            OFBsnRateUnitSerializerVer13.writeTo(bb, message.value);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvRateUnitVer13(");
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
        OFBsnTlvRateUnitVer13 other = (OFBsnTlvRateUnitVer13) obj;

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
