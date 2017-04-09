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

class OFOxmPbbUcaMaskedVer14 implements OFOxmPbbUcaMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmPbbUcaMaskedVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 6;

        private final static OFBooleanValue DEFAULT_VALUE = OFBooleanValue.FALSE;
        private final static OFBooleanValue DEFAULT_VALUE_MASK = OFBooleanValue.FALSE;

    // OF message fields
    private final OFBooleanValue value;
    private final OFBooleanValue mask;
//
    // Immutable default instance
    final static OFOxmPbbUcaMaskedVer14 DEFAULT = new OFOxmPbbUcaMaskedVer14(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmPbbUcaMaskedVer14(OFBooleanValue value, OFBooleanValue mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmPbbUcaMaskedVer14: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmPbbUcaMaskedVer14: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80005302L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFBooleanValue getMask() {
        return mask;
    }

    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.PBB_UCA;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<OFBooleanValue> getCanonical() {
        if (OFBooleanValue.NO_MASK.equals(mask)) {
            return new OFOxmPbbUcaVer14(value);
        } else if(OFBooleanValue.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmPbbUcaMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmPbbUcaMasked.Builder {
        final OFOxmPbbUcaMaskedVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;
        private boolean maskSet;
        private OFBooleanValue mask;

        BuilderWithParent(OFOxmPbbUcaMaskedVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80005302L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmPbbUcaMasked.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFBooleanValue getMask() {
        return mask;
    }

    @Override
    public OFOxmPbbUcaMasked.Builder setMask(OFBooleanValue mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.PBB_UCA;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmPbbUcaMasked build() {
                OFBooleanValue value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                OFBooleanValue mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmPbbUcaMaskedVer14(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmPbbUcaMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;
        private boolean maskSet;
        private OFBooleanValue mask;

    @Override
    public long getTypeLen() {
        return 0x80005302L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmPbbUcaMasked.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFBooleanValue getMask() {
        return mask;
    }

    @Override
    public OFOxmPbbUcaMasked.Builder setMask(OFBooleanValue mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.PBB_UCA;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmPbbUcaMasked build() {
            OFBooleanValue value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            OFBooleanValue mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmPbbUcaMaskedVer14(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmPbbUcaMasked> {
        @Override
        public OFOxmPbbUcaMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80005302L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80005302)
                throw new OFParseError("Wrong typeLen: Expected=0x80005302L(0x80005302L), got="+typeLen);
            OFBooleanValue value = OFBooleanValue.of(bb.readByte() != 0);
            OFBooleanValue mask = OFBooleanValue.of(bb.readByte() != 0);

            OFOxmPbbUcaMaskedVer14 oxmPbbUcaMaskedVer14 = new OFOxmPbbUcaMaskedVer14(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmPbbUcaMaskedVer14);
            return oxmPbbUcaMaskedVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmPbbUcaMaskedVer14Funnel FUNNEL = new OFOxmPbbUcaMaskedVer14Funnel();
    static class OFOxmPbbUcaMaskedVer14Funnel implements Funnel<OFOxmPbbUcaMaskedVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmPbbUcaMaskedVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80005302L
            sink.putInt((int) 0x80005302);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmPbbUcaMaskedVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmPbbUcaMaskedVer14 message) {
            // fixed value property typeLen = 0x80005302L
            bb.writeInt((int) 0x80005302);
            bb.writeByte(message.value.getInt());
            bb.writeByte(message.mask.getInt());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmPbbUcaMaskedVer14(");
        b.append("value=").append(value);
        b.append(", ");
        b.append("mask=").append(mask);
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
        OFOxmPbbUcaMaskedVer14 other = (OFOxmPbbUcaMaskedVer14) obj;

        if (value == null) {
            if (other.value != null)
                return false;
        } else if (!value.equals(other.value))
            return false;
        if (mask == null) {
            if (other.mask != null)
                return false;
        } else if (!mask.equals(other.mask))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((value == null) ? 0 : value.hashCode());
        result = prime * result + ((mask == null) ? 0 : mask.hashCode());
        return result;
    }

}
