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

class OFOxmIpv6SrcMaskedVer14 implements OFOxmIpv6SrcMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmIpv6SrcMaskedVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 36;

        private final static IPv6Address DEFAULT_VALUE = IPv6Address.NONE;
        private final static IPv6Address DEFAULT_VALUE_MASK = IPv6Address.NONE;

    // OF message fields
    private final IPv6Address value;
    private final IPv6Address mask;
//
    // Immutable default instance
    final static OFOxmIpv6SrcMaskedVer14 DEFAULT = new OFOxmIpv6SrcMaskedVer14(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmIpv6SrcMaskedVer14(IPv6Address value, IPv6Address mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmIpv6SrcMaskedVer14: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmIpv6SrcMaskedVer14: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80003520L;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public IPv6Address getMask() {
        return mask;
    }

    @Override
    public MatchField<IPv6Address> getMatchField() {
        return MatchField.IPV6_SRC;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<IPv6Address> getCanonical() {
        if (IPv6Address.NO_MASK.equals(mask)) {
            return new OFOxmIpv6SrcVer14(value);
        } else if(IPv6Address.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmIpv6SrcMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmIpv6SrcMasked.Builder {
        final OFOxmIpv6SrcMaskedVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private IPv6Address value;
        private boolean maskSet;
        private IPv6Address mask;

        BuilderWithParent(OFOxmIpv6SrcMaskedVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80003520L;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6SrcMasked.Builder setValue(IPv6Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public IPv6Address getMask() {
        return mask;
    }

    @Override
    public OFOxmIpv6SrcMasked.Builder setMask(IPv6Address mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<IPv6Address> getMatchField() {
        return MatchField.IPV6_SRC;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<IPv6Address> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmIpv6SrcMasked build() {
                IPv6Address value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                IPv6Address mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmIpv6SrcMaskedVer14(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmIpv6SrcMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private IPv6Address value;
        private boolean maskSet;
        private IPv6Address mask;

    @Override
    public long getTypeLen() {
        return 0x80003520L;
    }

    @Override
    public IPv6Address getValue() {
        return value;
    }

    @Override
    public OFOxmIpv6SrcMasked.Builder setValue(IPv6Address value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public IPv6Address getMask() {
        return mask;
    }

    @Override
    public OFOxmIpv6SrcMasked.Builder setMask(IPv6Address mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<IPv6Address> getMatchField() {
        return MatchField.IPV6_SRC;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<IPv6Address> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmIpv6SrcMasked build() {
            IPv6Address value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            IPv6Address mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmIpv6SrcMaskedVer14(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmIpv6SrcMasked> {
        @Override
        public OFOxmIpv6SrcMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80003520L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80003520)
                throw new OFParseError("Wrong typeLen: Expected=0x80003520L(0x80003520L), got="+typeLen);
            IPv6Address value = IPv6Address.read16Bytes(bb);
            IPv6Address mask = IPv6Address.read16Bytes(bb);

            OFOxmIpv6SrcMaskedVer14 oxmIpv6SrcMaskedVer14 = new OFOxmIpv6SrcMaskedVer14(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmIpv6SrcMaskedVer14);
            return oxmIpv6SrcMaskedVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmIpv6SrcMaskedVer14Funnel FUNNEL = new OFOxmIpv6SrcMaskedVer14Funnel();
    static class OFOxmIpv6SrcMaskedVer14Funnel implements Funnel<OFOxmIpv6SrcMaskedVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmIpv6SrcMaskedVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80003520L
            sink.putInt((int) 0x80003520);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmIpv6SrcMaskedVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmIpv6SrcMaskedVer14 message) {
            // fixed value property typeLen = 0x80003520L
            bb.writeInt((int) 0x80003520);
            message.value.write16Bytes(bb);
            message.mask.write16Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmIpv6SrcMaskedVer14(");
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
        OFOxmIpv6SrcMaskedVer14 other = (OFOxmIpv6SrcMaskedVer14) obj;

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
