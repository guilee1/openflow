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

class OFBsnTlvVlanVidVer14 implements OFBsnTlvVlanVid {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvVlanVidVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 6;

        private final static VlanVid DEFAULT_VALUE = VlanVid.ZERO;

    // OF message fields
    private final VlanVid value;
//
    // Immutable default instance
    final static OFBsnTlvVlanVidVer14 DEFAULT = new OFBsnTlvVlanVidVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnTlvVlanVidVer14(VlanVid value) {
        if(value == null) {
            throw new NullPointerException("OFBsnTlvVlanVidVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x6;
    }

    @Override
    public VlanVid getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnTlvVlanVid.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnTlvVlanVid.Builder {
        final OFBsnTlvVlanVidVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private VlanVid value;

        BuilderWithParent(OFBsnTlvVlanVidVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x6;
    }

    @Override
    public VlanVid getValue() {
        return value;
    }

    @Override
    public OFBsnTlvVlanVid.Builder setValue(VlanVid value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnTlvVlanVid build() {
                VlanVid value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnTlvVlanVidVer14(
                    value
                );
        }

    }

    static class Builder implements OFBsnTlvVlanVid.Builder {
        // OF message fields
        private boolean valueSet;
        private VlanVid value;

    @Override
    public int getType() {
        return 0x6;
    }

    @Override
    public VlanVid getValue() {
        return value;
    }

    @Override
    public OFBsnTlvVlanVid.Builder setValue(VlanVid value) {
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
        public OFBsnTlvVlanVid build() {
            VlanVid value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnTlvVlanVidVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvVlanVid> {
        @Override
        public OFBsnTlvVlanVid readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x6
            short type = bb.readShort();
            if(type != (short) 0x6)
                throw new OFParseError("Wrong type: Expected=0x6(0x6), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 6)
                throw new OFParseError("Wrong length: Expected=6(6), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            VlanVid value = VlanVid.read2Bytes(bb);

            OFBsnTlvVlanVidVer14 bsnTlvVlanVidVer14 = new OFBsnTlvVlanVidVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnTlvVlanVidVer14);
            return bsnTlvVlanVidVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvVlanVidVer14Funnel FUNNEL = new OFBsnTlvVlanVidVer14Funnel();
    static class OFBsnTlvVlanVidVer14Funnel implements Funnel<OFBsnTlvVlanVidVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvVlanVidVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x6
            sink.putShort((short) 0x6);
            // fixed value property length = 6
            sink.putShort((short) 0x6);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvVlanVidVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvVlanVidVer14 message) {
            // fixed value property type = 0x6
            bb.writeShort((short) 0x6);
            // fixed value property length = 6
            bb.writeShort((short) 0x6);
            message.value.write2Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvVlanVidVer14(");
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
        OFBsnTlvVlanVidVer14 other = (OFBsnTlvVlanVidVer14) obj;

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