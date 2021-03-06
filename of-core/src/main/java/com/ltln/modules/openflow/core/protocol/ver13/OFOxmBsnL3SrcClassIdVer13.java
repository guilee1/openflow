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

class OFOxmBsnL3SrcClassIdVer13 implements OFOxmBsnL3SrcClassId {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnL3SrcClassIdVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 8;

        private final static ClassId DEFAULT_VALUE = ClassId.NONE;

    // OF message fields
    private final ClassId value;
//
    // Immutable default instance
    final static OFOxmBsnL3SrcClassIdVer13 DEFAULT = new OFOxmBsnL3SrcClassIdVer13(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnL3SrcClassIdVer13(ClassId value) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnL3SrcClassIdVer13: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x30a04L;
    }

    @Override
    public ClassId getValue() {
        return value;
    }

    @Override
    public MatchField<ClassId> getMatchField() {
        return MatchField.BSN_L3_SRC_CLASS_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<ClassId> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public ClassId getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFOxmBsnL3SrcClassId.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnL3SrcClassId.Builder {
        final OFOxmBsnL3SrcClassIdVer13 parentMessage;

        // OF message fields
        private boolean valueSet;
        private ClassId value;

        BuilderWithParent(OFOxmBsnL3SrcClassIdVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x30a04L;
    }

    @Override
    public ClassId getValue() {
        return value;
    }

    @Override
    public OFOxmBsnL3SrcClassId.Builder setValue(ClassId value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<ClassId> getMatchField() {
        return MatchField.BSN_L3_SRC_CLASS_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<ClassId> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public ClassId getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFOxmBsnL3SrcClassId build() {
                ClassId value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmBsnL3SrcClassIdVer13(
                    value
                );
        }

    }

    static class Builder implements OFOxmBsnL3SrcClassId.Builder {
        // OF message fields
        private boolean valueSet;
        private ClassId value;

    @Override
    public long getTypeLen() {
        return 0x30a04L;
    }

    @Override
    public ClassId getValue() {
        return value;
    }

    @Override
    public OFOxmBsnL3SrcClassId.Builder setValue(ClassId value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<ClassId> getMatchField() {
        return MatchField.BSN_L3_SRC_CLASS_ID;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<ClassId> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.3");
    }

    @Override
    public ClassId getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFOxmBsnL3SrcClassId build() {
            ClassId value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmBsnL3SrcClassIdVer13(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnL3SrcClassId> {
        @Override
        public OFOxmBsnL3SrcClassId readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x30a04L
            int typeLen = bb.readInt();
            if(typeLen != 0x30a04)
                throw new OFParseError("Wrong typeLen: Expected=0x30a04L(0x30a04L), got="+typeLen);
            ClassId value = ClassId.read4Bytes(bb);

            OFOxmBsnL3SrcClassIdVer13 oxmBsnL3SrcClassIdVer13 = new OFOxmBsnL3SrcClassIdVer13(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnL3SrcClassIdVer13);
            return oxmBsnL3SrcClassIdVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnL3SrcClassIdVer13Funnel FUNNEL = new OFOxmBsnL3SrcClassIdVer13Funnel();
    static class OFOxmBsnL3SrcClassIdVer13Funnel implements Funnel<OFOxmBsnL3SrcClassIdVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnL3SrcClassIdVer13 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x30a04L
            sink.putInt(0x30a04);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnL3SrcClassIdVer13> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnL3SrcClassIdVer13 message) {
            // fixed value property typeLen = 0x30a04L
            bb.writeInt(0x30a04);
            message.value.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnL3SrcClassIdVer13(");
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
        OFOxmBsnL3SrcClassIdVer13 other = (OFOxmBsnL3SrcClassIdVer13) obj;

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
