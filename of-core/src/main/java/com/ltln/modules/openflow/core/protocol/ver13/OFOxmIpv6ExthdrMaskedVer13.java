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

class OFOxmIpv6ExthdrMaskedVer13 implements OFOxmIpv6ExthdrMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmIpv6ExthdrMaskedVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 8;

        private final static U16 DEFAULT_VALUE = U16.ZERO;
        private final static U16 DEFAULT_VALUE_MASK = U16.ZERO;

    // OF message fields
    private final U16 value;
    private final U16 mask;
//
    // Immutable default instance
    final static OFOxmIpv6ExthdrMaskedVer13 DEFAULT = new OFOxmIpv6ExthdrMaskedVer13(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmIpv6ExthdrMaskedVer13(U16 value, U16 mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmIpv6ExthdrMaskedVer13: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmIpv6ExthdrMaskedVer13: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80004f04L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public U16 getMask() {
        return mask;
    }

    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.IPV6_EXTHDR;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<U16> getCanonical() {
        if (U16.NO_MASK.equals(mask)) {
            return new OFOxmIpv6ExthdrVer13(value);
        } else if(U16.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmIpv6ExthdrMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmIpv6ExthdrMasked.Builder {
        final OFOxmIpv6ExthdrMaskedVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U16 value;
        private boolean maskSet;
        private U16 mask;

        BuilderWithParent(OFOxmIpv6ExthdrMaskedVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80004f04L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6ExthdrMasked.Builder setValue(U16 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U16 getMask() {
        return mask;
    }

    @Override
    public OFOxmIpv6ExthdrMasked.Builder setMask(U16 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.IPV6_EXTHDR;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U16> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmIpv6ExthdrMasked build() {
                U16 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                U16 mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmIpv6ExthdrMaskedVer13(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmIpv6ExthdrMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private U16 value;
        private boolean maskSet;
        private U16 mask;

    @Override
    public long getTypeLen() {
        return 0x80004f04L;
    }

    @Override
    public U16 getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6ExthdrMasked.Builder setValue(U16 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U16 getMask() {
        return mask;
    }

    @Override
    public OFOxmIpv6ExthdrMasked.Builder setMask(U16 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U16> getMatchField() {
        return MatchField.IPV6_EXTHDR;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U16> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmIpv6ExthdrMasked build() {
            U16 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            U16 mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmIpv6ExthdrMaskedVer13(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmIpv6ExthdrMasked> {
        @Override
        public OFOxmIpv6ExthdrMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80004f04L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80004f04)
                throw new OFParseError("Wrong typeLen: Expected=0x80004f04L(0x80004f04L), got="+typeLen);
            U16 value = U16.of(bb.readShort());
            U16 mask = U16.of(bb.readShort());

            OFOxmIpv6ExthdrMaskedVer13 oxmIpv6ExthdrMaskedVer13 = new OFOxmIpv6ExthdrMaskedVer13(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmIpv6ExthdrMaskedVer13);
            return oxmIpv6ExthdrMaskedVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmIpv6ExthdrMaskedVer13Funnel FUNNEL = new OFOxmIpv6ExthdrMaskedVer13Funnel();
    static class OFOxmIpv6ExthdrMaskedVer13Funnel implements Funnel<OFOxmIpv6ExthdrMaskedVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmIpv6ExthdrMaskedVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80004f04L
            sink.putInt((int) 0x80004f04);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmIpv6ExthdrMaskedVer13> {
        @Override
        public void write(ByteBuf bb, OFOxmIpv6ExthdrMaskedVer13 message) {
            // fixed value property typeLen = 0x80004f04L
            bb.writeInt((int) 0x80004f04);
            bb.writeShort(message.value.getRaw());
            bb.writeShort(message.mask.getRaw());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmIpv6ExthdrMaskedVer13(");
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
        OFOxmIpv6ExthdrMaskedVer13 other = (OFOxmIpv6ExthdrMaskedVer13) obj;

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
