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

class OFOxmBsnL2CacheHitVer12 implements OFOxmBsnL2CacheHit {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnL2CacheHitVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 5;

        private final static OFBooleanValue DEFAULT_VALUE = OFBooleanValue.FALSE;

    // OF message fields
    private final OFBooleanValue value;
//
    // Immutable default instance
    final static OFOxmBsnL2CacheHitVer12 DEFAULT = new OFOxmBsnL2CacheHitVer12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnL2CacheHitVer12(OFBooleanValue value) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnL2CacheHitVer12: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x32401L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.BSN_L2_CACHE_HIT;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<OFBooleanValue> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public OFBooleanValue getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmBsnL2CacheHit.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnL2CacheHit.Builder {
        final OFOxmBsnL2CacheHitVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;

        BuilderWithParent(OFOxmBsnL2CacheHitVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x32401L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmBsnL2CacheHit.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.BSN_L2_CACHE_HIT;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFBooleanValue getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmBsnL2CacheHit build() {
                OFBooleanValue value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmBsnL2CacheHitVer12(
                    value
                );
        }

    }

    static class Builder implements OFOxmBsnL2CacheHit.Builder {
        // OF message fields
        private boolean valueSet;
        private OFBooleanValue value;

    @Override
    public long getTypeLen() {
        return 0x32401L;
    }

    @Override
    public OFBooleanValue getValue() {
        return value;
    }

    @Override
    public OFOxmBsnL2CacheHit.Builder setValue(OFBooleanValue value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<OFBooleanValue> getMatchField() {
        return MatchField.BSN_L2_CACHE_HIT;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<OFBooleanValue> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public OFBooleanValue getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmBsnL2CacheHit build() {
            OFBooleanValue value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmBsnL2CacheHitVer12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnL2CacheHit> {
        @Override
        public OFOxmBsnL2CacheHit readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x32401L
            int typeLen = bb.readInt();
            if(typeLen != 0x32401)
                throw new OFParseError("Wrong typeLen: Expected=0x32401L(0x32401L), got="+typeLen);
            OFBooleanValue value = OFBooleanValue.of(bb.readByte() != 0);

            OFOxmBsnL2CacheHitVer12 oxmBsnL2CacheHitVer12 = new OFOxmBsnL2CacheHitVer12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnL2CacheHitVer12);
            return oxmBsnL2CacheHitVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnL2CacheHitVer12Funnel FUNNEL = new OFOxmBsnL2CacheHitVer12Funnel();
    static class OFOxmBsnL2CacheHitVer12Funnel implements Funnel<OFOxmBsnL2CacheHitVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnL2CacheHitVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x32401L
            sink.putInt(0x32401);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnL2CacheHitVer12> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnL2CacheHitVer12 message) {
            // fixed value property typeLen = 0x32401L
            bb.writeInt(0x32401);
            bb.writeByte(message.value.getInt());


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnL2CacheHitVer12(");
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
        OFOxmBsnL2CacheHitVer12 other = (OFOxmBsnL2CacheHitVer12) obj;

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
