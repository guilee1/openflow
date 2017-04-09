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

class OFOxmBsnVxlanNetworkIdMaskedVer13 implements OFOxmBsnVxlanNetworkIdMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnVxlanNetworkIdMaskedVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 12;

        private final static VxlanNI DEFAULT_VALUE = VxlanNI.ZERO;
        private final static VxlanNI DEFAULT_VALUE_MASK = VxlanNI.ZERO;

    // OF message fields
    private final VxlanNI value;
    private final VxlanNI mask;
//
    // Immutable default instance
    final static OFOxmBsnVxlanNetworkIdMaskedVer13 DEFAULT = new OFOxmBsnVxlanNetworkIdMaskedVer13(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnVxlanNetworkIdMaskedVer13(VxlanNI value, VxlanNI mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnVxlanNetworkIdMaskedVer13: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmBsnVxlanNetworkIdMaskedVer13: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x32b08L;
    }

    @Override
    public VxlanNI getValue() {
        return value;
    }

    @Override
    public VxlanNI getMask() {
        return mask;
    }

    @Override
    public MatchField<VxlanNI> getMatchField() {
        return MatchField.BSN_VXLAN_NETWORK_ID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<VxlanNI> getCanonical() {
        if (VxlanNI.NO_MASK.equals(mask)) {
            return new OFOxmBsnVxlanNetworkIdVer13(value);
        } else if(VxlanNI.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmBsnVxlanNetworkIdMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnVxlanNetworkIdMasked.Builder {
        final OFOxmBsnVxlanNetworkIdMaskedVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private VxlanNI value;
        private boolean maskSet;
        private VxlanNI mask;

        BuilderWithParent(OFOxmBsnVxlanNetworkIdMaskedVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x32b08L;
    }

    @Override
    public VxlanNI getValue() {
        return value;
    }

    @Override
    public OFOxmBsnVxlanNetworkIdMasked.Builder setValue(VxlanNI value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public VxlanNI getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnVxlanNetworkIdMasked.Builder setMask(VxlanNI mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<VxlanNI> getMatchField() {
        return MatchField.BSN_VXLAN_NETWORK_ID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<VxlanNI> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmBsnVxlanNetworkIdMasked build() {
                VxlanNI value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                VxlanNI mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmBsnVxlanNetworkIdMaskedVer13(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmBsnVxlanNetworkIdMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private VxlanNI value;
        private boolean maskSet;
        private VxlanNI mask;

    @Override
    public long getTypeLen() {
        return 0x32b08L;
    }

    @Override
    public VxlanNI getValue() {
        return value;
    }

    @Override
    public OFOxmBsnVxlanNetworkIdMasked.Builder setValue(VxlanNI value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public VxlanNI getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnVxlanNetworkIdMasked.Builder setMask(VxlanNI mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<VxlanNI> getMatchField() {
        return MatchField.BSN_VXLAN_NETWORK_ID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<VxlanNI> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmBsnVxlanNetworkIdMasked build() {
            VxlanNI value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            VxlanNI mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmBsnVxlanNetworkIdMaskedVer13(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnVxlanNetworkIdMasked> {
        @Override
        public OFOxmBsnVxlanNetworkIdMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x32b08L
            int typeLen = bb.readInt();
            if(typeLen != 0x32b08)
                throw new OFParseError("Wrong typeLen: Expected=0x32b08L(0x32b08L), got="+typeLen);
            VxlanNI value = VxlanNI.read4Bytes(bb);
            VxlanNI mask = VxlanNI.read4Bytes(bb);

            OFOxmBsnVxlanNetworkIdMaskedVer13 oxmBsnVxlanNetworkIdMaskedVer13 = new OFOxmBsnVxlanNetworkIdMaskedVer13(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnVxlanNetworkIdMaskedVer13);
            return oxmBsnVxlanNetworkIdMaskedVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnVxlanNetworkIdMaskedVer13Funnel FUNNEL = new OFOxmBsnVxlanNetworkIdMaskedVer13Funnel();
    static class OFOxmBsnVxlanNetworkIdMaskedVer13Funnel implements Funnel<OFOxmBsnVxlanNetworkIdMaskedVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnVxlanNetworkIdMaskedVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x32b08L
            sink.putInt(0x32b08);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnVxlanNetworkIdMaskedVer13> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnVxlanNetworkIdMaskedVer13 message) {
            // fixed value property typeLen = 0x32b08L
            bb.writeInt(0x32b08);
            message.value.write4Bytes(bb);
            message.mask.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnVxlanNetworkIdMaskedVer13(");
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
        OFOxmBsnVxlanNetworkIdMaskedVer13 other = (OFOxmBsnVxlanNetworkIdMaskedVer13) obj;

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
