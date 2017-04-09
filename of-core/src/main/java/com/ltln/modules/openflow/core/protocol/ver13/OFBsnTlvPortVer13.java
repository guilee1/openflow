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

class OFBsnTlvPortVer13 implements OFBsnTlvPort {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvPortVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 8;

        private final static OFPort DEFAULT_VALUE = OFPort.ANY;

    // OF message fields
    private final OFPort value;
//
    // Immutable default instance
    final static OFBsnTlvPortVer13 DEFAULT = new OFBsnTlvPortVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvPortVer13(OFPort value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvPortVer13: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public OFPort getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFBsnTlvPort.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvPort.Builder {
        final OFBsnTlvPortVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFPort value;

        BuilderWithParent(OFBsnTlvPortVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public OFPort getValue() {
        return value;
    }

    @Override
    public OFBsnTlvPort.Builder setValue(OFPort value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFBsnTlvPort build() {
                OFPort value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvPortVer13(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvPort.Builder {
        // OF message fields
        private boolean valueSet;
        private OFPort value;

    @Override
    public int getType() {
        return 0x0;
    }

    @Override
    public OFPort getValue() {
        return value;
    }

    @Override
    public OFBsnTlvPort.Builder setValue(OFPort value) {
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
        public OFBsnTlvPort build() {
            OFPort value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvPortVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvPort> {
        @Override
        public OFBsnTlvPort readFrom(ByteBuf bb) throws OFParseError {
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
            OFPort value = OFPort.read4Bytes(bb);

            OFBsnTlvPortVer13 bsnTlvPortVer13 = new OFBsnTlvPortVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvPortVer13);
            return bsnTlvPortVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvPortVer13Funnel FUNNEL = new OFBsnTlvPortVer13Funnel();
    static class OFBsnTlvPortVer13Funnel implements Funnel<OFBsnTlvPortVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvPortVer13 message, PrimitiveSink sink) {
            // fixed value property type = 0x0
            sink.putShort((short) 0x0);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvPortVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvPortVer13 message) {
            // fixed value property type = 0x0
            bb.writeShort((short) 0x0);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            message.value.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvPortVer13(");
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
        OFBsnTlvPortVer13 other = (OFBsnTlvPortVer13) obj;

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
