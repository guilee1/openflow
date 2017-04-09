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

class OFOxmArpThaVer12 implements OFOxmArpTha {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmArpThaVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 10;

        private final static MacAddress DEFAULT_VALUE = MacAddress.NONE;

    // OF message fields
    private final MacAddress value;
//
    // Immutable default instance
    final static OFOxmArpThaVer12 DEFAULT = new OFOxmArpThaVer12(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmArpThaVer12(MacAddress value) {
        if(value == null) {
            throw new NullPointerException("OFOxmArpThaVer12: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80003206L;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public MatchField<MacAddress> getMatchField() {
        return MatchField.ARP_THA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<MacAddress> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public MacAddress getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFOxmArpTha.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmArpTha.Builder {
        final OFOxmArpThaVer12 parentMessage;

        // OF message fields
        private boolean valueSet;
        private MacAddress value;

        BuilderWithParent(OFOxmArpThaVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80003206L;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFOxmArpTha.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<MacAddress> getMatchField() {
        return MatchField.ARP_THA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<MacAddress> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public MacAddress getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFOxmArpTha build() {
                MacAddress value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmArpThaVer12(
                    value
                );
        }

    }

    static class Builder implements OFOxmArpTha.Builder {
        // OF message fields
        private boolean valueSet;
        private MacAddress value;

    @Override
    public long getTypeLen() {
        return 0x80003206L;
    }

    @Override
    public MacAddress getValue() {
        return value;
    }

    @Override
    public OFOxmArpTha.Builder setValue(MacAddress value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<MacAddress> getMatchField() {
        return MatchField.ARP_THA;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<MacAddress> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.2");
    }

    @Override
    public MacAddress getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.2");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFOxmArpTha build() {
            MacAddress value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmArpThaVer12(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmArpTha> {
        @Override
        public OFOxmArpTha readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80003206L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80003206)
                throw new OFParseError("Wrong typeLen: Expected=0x80003206L(0x80003206L), got="+typeLen);
            MacAddress value = MacAddress.read6Bytes(bb);

            OFOxmArpThaVer12 oxmArpThaVer12 = new OFOxmArpThaVer12(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmArpThaVer12);
            return oxmArpThaVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmArpThaVer12Funnel FUNNEL = new OFOxmArpThaVer12Funnel();
    static class OFOxmArpThaVer12Funnel implements Funnel<OFOxmArpThaVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmArpThaVer12 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80003206L
            sink.putInt((int) 0x80003206);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmArpThaVer12> {
        @Override
        public void write(ByteBuf bb, OFOxmArpThaVer12 message) {
            // fixed value property typeLen = 0x80003206L
            bb.writeInt((int) 0x80003206);
            message.value.write6Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmArpThaVer12(");
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
        OFOxmArpThaVer12 other = (OFOxmArpThaVer12) obj;

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