// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver12;

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

class OFOxmBsnInPorts512MaskedVer12 implements OFOxmBsnInPorts512Masked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnInPorts512MaskedVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 132;

        private final static OFBitMask512 DEFAULT_VALUE = OFBitMask512.NONE;
        private final static OFBitMask512 DEFAULT_VALUE_MASK = OFBitMask512.NONE;

    // OF message fields
    private final OFBitMask512 value;
    private final OFBitMask512 mask;
//
    // Immutable default instance
    final static OFOxmBsnInPorts512MaskedVer12 DEFAULT = new OFOxmBsnInPorts512MaskedVer12(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnInPorts512MaskedVer12(OFBitMask512 value, OFBitMask512 mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnInPorts512MaskedVer12: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmBsnInPorts512MaskedVer12: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x32780L;
    }

    @Override
    public OFBitMask512 getValue() {
        return value;
    }

    @Override
    public OFBitMask512 getMask() {
        return mask;
    }

    @Override
    public MatchField<OFBitMask512> getMatchField() {
        return MatchField.BSN_IN_PORTS_512;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<OFBitMask512> getCanonical() {
        if (OFBitMask512.NO_MASK.equals(mask)) {
            return new OFOxmBsnInPorts512Ver12(value);
        } else if(OFBitMask512.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmBsnInPorts512Masked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnInPorts512Masked.Builder {
        final OFOxmBsnInPorts512MaskedVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBitMask512 value;
        private boolean maskSet;
        private OFBitMask512 mask;

        BuilderWithParent(OFOxmBsnInPorts512MaskedVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x32780L;
    }

    @Override
    public OFBitMask512 getValue() {
        return value;
    }

    @Override
    public OFOxmBsnInPorts512Masked.Builder setValue(OFBitMask512 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFBitMask512 getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnInPorts512Masked.Builder setMask(OFBitMask512 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFBitMask512> getMatchField() {
        return MatchField.BSN_IN_PORTS_512;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFBitMask512> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmBsnInPorts512Masked build() {
                OFBitMask512 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                OFBitMask512 mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmBsnInPorts512MaskedVer12(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmBsnInPorts512Masked.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBitMask512 value;
        private boolean maskSet;
        private OFBitMask512 mask;

    @Override
    public long getTypeLen() {
        return 0x32780L;
    }

    @Override
    public OFBitMask512 getValue() {
        return value;
    }

    @Override
    public OFOxmBsnInPorts512Masked.Builder setValue(OFBitMask512 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFBitMask512 getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnInPorts512Masked.Builder setMask(OFBitMask512 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<OFBitMask512> getMatchField() {
        return MatchField.BSN_IN_PORTS_512;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<OFBitMask512> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmBsnInPorts512Masked build() {
            OFBitMask512 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            OFBitMask512 mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmBsnInPorts512MaskedVer12(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnInPorts512Masked> {
        @Override
        public OFOxmBsnInPorts512Masked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x32780L
            int typeLen = bb.readInt();
            if(typeLen != 0x32780)
                throw new OFParseError("Wrong typeLen: Expected=0x32780L(0x32780L), got="+typeLen);
            OFBitMask512 value = OFBitMask512.read64Bytes(bb);
            OFBitMask512 mask = OFBitMask512.read64Bytes(bb);

            OFOxmBsnInPorts512MaskedVer12 oxmBsnInPorts512MaskedVer12 = new OFOxmBsnInPorts512MaskedVer12(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnInPorts512MaskedVer12);
            return oxmBsnInPorts512MaskedVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnInPorts512MaskedVer12Funnel FUNNEL = new OFOxmBsnInPorts512MaskedVer12Funnel();
    static class OFOxmBsnInPorts512MaskedVer12Funnel implements Funnel<OFOxmBsnInPorts512MaskedVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnInPorts512MaskedVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x32780L
            sink.putInt(0x32780);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnInPorts512MaskedVer12> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnInPorts512MaskedVer12 message) {
            // fixed value property typeLen = 0x32780L
            bb.writeInt(0x32780);
            message.value.write64Bytes(bb);
            message.mask.write64Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnInPorts512MaskedVer12(");
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
        OFOxmBsnInPorts512MaskedVer12 other = (OFOxmBsnInPorts512MaskedVer12) obj;

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