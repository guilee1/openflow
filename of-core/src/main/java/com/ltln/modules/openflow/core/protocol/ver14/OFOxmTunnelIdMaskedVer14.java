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

class OFOxmTunnelIdMaskedVer14 implements OFOxmTunnelIdMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmTunnelIdMaskedVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 20;

        private final static U64 DEFAULT_VALUE = U64.ZERO;
        private final static U64 DEFAULT_VALUE_MASK = U64.ZERO;

    // OF message fields
    private final U64 value;
    private final U64 mask;
//
    // Immutable default instance
    final static OFOxmTunnelIdMaskedVer14 DEFAULT = new OFOxmTunnelIdMaskedVer14(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmTunnelIdMaskedVer14(U64 value, U64 mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmTunnelIdMaskedVer14: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmTunnelIdMaskedVer14: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80004d10L;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public U64 getMask() {
        return mask;
    }

    @Override
    public MatchField<U64> getMatchField() {
        return MatchField.TUNNEL_ID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<U64> getCanonical() {
        if (U64.NO_MASK.equals(mask)) {
            return new OFOxmTunnelIdVer14(value);
        } else if(U64.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmTunnelIdMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmTunnelIdMasked.Builder {
        final OFOxmTunnelIdMaskedVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private U64 value;
        private boolean maskSet;
        private U64 mask;

        BuilderWithParent(OFOxmTunnelIdMaskedVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80004d10L;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFOxmTunnelIdMasked.Builder setValue(U64 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U64 getMask() {
        return mask;
    }

    @Override
    public OFOxmTunnelIdMasked.Builder setMask(U64 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U64> getMatchField() {
        return MatchField.TUNNEL_ID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U64> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmTunnelIdMasked build() {
                U64 value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                U64 mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmTunnelIdMaskedVer14(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmTunnelIdMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private U64 value;
        private boolean maskSet;
        private U64 mask;

    @Override
    public long getTypeLen() {
        return 0x80004d10L;
    }

    @Override
    public U64 getValue() {
        return value;
    }

    @Override
    public OFOxmTunnelIdMasked.Builder setValue(U64 value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public U64 getMask() {
        return mask;
    }

    @Override
    public OFOxmTunnelIdMasked.Builder setMask(U64 mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<U64> getMatchField() {
        return MatchField.TUNNEL_ID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<U64> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmTunnelIdMasked build() {
            U64 value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            U64 mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmTunnelIdMaskedVer14(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmTunnelIdMasked> {
        @Override
        public OFOxmTunnelIdMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80004d10L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80004d10)
                throw new OFParseError("Wrong typeLen: Expected=0x80004d10L(0x80004d10L), got="+typeLen);
            U64 value = U64.ofRaw(bb.readLong());
            U64 mask = U64.ofRaw(bb.readLong());

            OFOxmTunnelIdMaskedVer14 oxmTunnelIdMaskedVer14 = new OFOxmTunnelIdMaskedVer14(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmTunnelIdMaskedVer14);
            return oxmTunnelIdMaskedVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmTunnelIdMaskedVer14Funnel FUNNEL = new OFOxmTunnelIdMaskedVer14Funnel();
    static class OFOxmTunnelIdMaskedVer14Funnel implements Funnel<OFOxmTunnelIdMaskedVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmTunnelIdMaskedVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80004d10L
            sink.putInt((int) 0x80004d10);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmTunnelIdMaskedVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmTunnelIdMaskedVer14 message) {
            // fixed value property typeLen = 0x80004d10L
            bb.writeInt((int) 0x80004d10);
            bb.writeLong(message.value.getValue());
            bb.writeLong(message.mask.getValue());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmTunnelIdMaskedVer14(");
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
        OFOxmTunnelIdMaskedVer14 other = (OFOxmTunnelIdMaskedVer14) obj;

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
