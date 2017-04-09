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

class OFOxmBsnVrfVer14 implements OFOxmBsnVrf {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmBsnVrfVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 8;

        private final static VRF DEFAULT_VALUE = VRF.ZERO;

    // OF message fields
    private final VRF value;
//
    // Immutable default instance
    final static OFOxmBsnVrfVer14 DEFAULT = new OFOxmBsnVrfVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmBsnVrfVer14(VRF value) {
        if(value == null) {
            throw new NullPointerException("OFOxmBsnVrfVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x30404L;
    }

    @Override
    public VRF getValue() {
        return value;
    }

    @Override
    public MatchField<VRF> getMatchField() {
        return MatchField.BSN_VRF;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<VRF> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public VRF getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmBsnVrf.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmBsnVrf.Builder {
        final OFOxmBsnVrfVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private VRF value;

        BuilderWithParent(OFOxmBsnVrfVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x30404L;
    }

    @Override
    public VRF getValue() {
        return value;
    }

    @Override
    public OFOxmBsnVrf.Builder setValue(VRF value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<VRF> getMatchField() {
        return MatchField.BSN_VRF;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<VRF> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public VRF getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmBsnVrf build() {
                VRF value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmBsnVrfVer14(
                    value
                );
        }

    }

    static class Builder implements OFOxmBsnVrf.Builder {
        // OF message fields
        private boolean valueSet;
        private VRF value;

    @Override
    public long getTypeLen() {
        return 0x30404L;
    }

    @Override
    public VRF getValue() {
        return value;
    }

    @Override
    public OFOxmBsnVrf.Builder setValue(VRF value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<VRF> getMatchField() {
        return MatchField.BSN_VRF;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<VRF> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public VRF getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmBsnVrf build() {
            VRF value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmBsnVrfVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmBsnVrf> {
        @Override
        public OFOxmBsnVrf readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x30404L
            int typeLen = bb.readInt();
            if(typeLen != 0x30404)
                throw new OFParseError("Wrong typeLen: Expected=0x30404L(0x30404L), got="+typeLen);
            VRF value = VRF.read4Bytes(bb);

            OFOxmBsnVrfVer14 oxmBsnVrfVer14 = new OFOxmBsnVrfVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmBsnVrfVer14);
            return oxmBsnVrfVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmBsnVrfVer14Funnel FUNNEL = new OFOxmBsnVrfVer14Funnel();
    static class OFOxmBsnVrfVer14Funnel implements Funnel<OFOxmBsnVrfVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmBsnVrfVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x30404L
            sink.putInt(0x30404);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmBsnVrfVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmBsnVrfVer14 message) {
            // fixed value property typeLen = 0x30404L
            bb.writeInt(0x30404);
            message.value.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmBsnVrfVer14(");
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
        OFOxmBsnVrfVer14 other = (OFOxmBsnVrfVer14) obj;

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
