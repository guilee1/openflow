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

class OFOxmBsnIngressPortGroupIdMaskedVer13 implements OFOxmBsnIngressPortGroupIdMasked {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnIngressPortGroupIdMaskedVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 12;

        private final static ClassId DEFAULT_VALUE = ClassId.NONE;
        private final static ClassId DEFAULT_VALUE_MASK = ClassId.NONE;

    // OF message fields
    private final ClassId value;
    private final ClassId mask;
//
    // Immutable default instance
    final static OFOxmBsnIngressPortGroupIdMaskedVer13 DEFAULT = new OFOxmBsnIngressPortGroupIdMaskedVer13(
        DEFAULT_VALUE, DEFAULT_VALUE_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnIngressPortGroupIdMaskedVer13(ClassId value, ClassId mask) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnIngressPortGroupIdMaskedVer13: property value cannot be null");
        }
        if(mask == null) {
            throw new NullPointerException("OFOxmBsnIngressPortGroupIdMaskedVer13: property mask cannot be null");
        }
        this.value = value;
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x32908L;
    }

    @Override
    public ClassId getValue() {
        return value;
    }

    @Override
    public ClassId getMask() {
        return mask;
    }

    @Override
    public MatchField<ClassId> getMatchField() {
        return MatchField.BSN_INGRESS_PORT_GROUP_ID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    public OFOxm<ClassId> getCanonical() {
        if (ClassId.NO_MASK.equals(mask)) {
            return new OFOxmBsnIngressPortGroupIdVer13(value);
        } else if(ClassId.FULL_MASK.equals(mask)) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmBsnIngressPortGroupIdMasked.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnIngressPortGroupIdMasked.Builder {
        final OFOxmBsnIngressPortGroupIdMaskedVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private ClassId value;
        private boolean maskSet;
        private ClassId mask;

        BuilderWithParent(OFOxmBsnIngressPortGroupIdMaskedVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x32908L;
    }

    @Override
    public ClassId getValue() {
        return value;
    }

    @Override
    public OFOxmBsnIngressPortGroupIdMasked.Builder setValue(ClassId value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public ClassId getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnIngressPortGroupIdMasked.Builder setMask(ClassId mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<ClassId> getMatchField() {
        return MatchField.BSN_INGRESS_PORT_GROUP_ID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<ClassId> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmBsnIngressPortGroupIdMasked build() {
                ClassId value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");
                ClassId mask = this.maskSet ? this.mask : parentMessage.mask;
                if(mask == null)
                    throw new NullPointerException("Property mask must not be null");

                //
                return new OFOxmBsnIngressPortGroupIdMaskedVer13(
                    value,
                    mask
                );
        }

    }

    static class Builder implements OFOxmBsnIngressPortGroupIdMasked.Builder {
        // OF message fields
        private boolean valueSet;
        private ClassId value;
        private boolean maskSet;
        private ClassId mask;

    @Override
    public long getTypeLen() {
        return 0x32908L;
    }

    @Override
    public ClassId getValue() {
        return value;
    }

    @Override
    public OFOxmBsnIngressPortGroupIdMasked.Builder setValue(ClassId value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public ClassId getMask() {
        return mask;
    }

    @Override
    public OFOxmBsnIngressPortGroupIdMasked.Builder setMask(ClassId mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public MatchField<ClassId> getMatchField() {
        return MatchField.BSN_INGRESS_PORT_GROUP_ID;
    }

    @Override
    public boolean isMasked() {
        return true;
    }

    @Override
    public OFOxm<ClassId> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmBsnIngressPortGroupIdMasked build() {
            ClassId value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");
            ClassId mask = this.maskSet ? this.mask : DEFAULT_VALUE_MASK;
            if(mask == null)
                throw new NullPointerException("Property mask must not be null");


            return new OFOxmBsnIngressPortGroupIdMaskedVer13(
                    value,
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnIngressPortGroupIdMasked> {
        @Override
        public OFOxmBsnIngressPortGroupIdMasked readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x32908L
            int typeLen = bb.readInt();
            if(typeLen != 0x32908)
                throw new OFParseError("Wrong typeLen: Expected=0x32908L(0x32908L), got="+typeLen);
            ClassId value = ClassId.read4Bytes(bb);
            ClassId mask = ClassId.read4Bytes(bb);

            OFOxmBsnIngressPortGroupIdMaskedVer13 oxmBsnIngressPortGroupIdMaskedVer13 = new OFOxmBsnIngressPortGroupIdMaskedVer13(
                    value,
                      mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnIngressPortGroupIdMaskedVer13);
            return oxmBsnIngressPortGroupIdMaskedVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnIngressPortGroupIdMaskedVer13Funnel FUNNEL = new OFOxmBsnIngressPortGroupIdMaskedVer13Funnel();
    static class OFOxmBsnIngressPortGroupIdMaskedVer13Funnel implements Funnel<OFOxmBsnIngressPortGroupIdMaskedVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnIngressPortGroupIdMaskedVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x32908L
            sink.putInt(0x32908);
            message.value.putTo(sink);
            message.mask.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnIngressPortGroupIdMaskedVer13> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnIngressPortGroupIdMaskedVer13 message) {
            // fixed value property typeLen = 0x32908L
            bb.writeInt(0x32908);
            message.value.write4Bytes(bb);
            message.mask.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnIngressPortGroupIdMaskedVer13(");
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
        OFOxmBsnIngressPortGroupIdMaskedVer13 other = (OFOxmBsnIngressPortGroupIdMaskedVer13) obj;

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
