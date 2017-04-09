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

class OFOxmArpOpVer14 implements OFOxmArpOp {
    private static final Logger logger = LoggerFactory.getLogger(OFOxmArpOpVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 6;

        private final static ArpOpcode DEFAULT_VALUE = ArpOpcode.NONE;

    // OF message fields
    private final ArpOpcode value;
//
    // Immutable default instance
    final static OFOxmArpOpVer14 DEFAULT = new OFOxmArpOpVer14(
        DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFOxmArpOpVer14(ArpOpcode value) {
        if(value == null) {
            throw new NullPointerException("OFOxmArpOpVer14: property value cannot be null");
        }
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public long getTypeLen() {
        return 0x80002a02L;
    }

    @Override
    public ArpOpcode getValue() {
        return value;
    }

    @Override
    public MatchField<ArpOpcode> getMatchField() {
        return MatchField.ARP_OP;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    public OFOxm<ArpOpcode> getCanonical() {
        // exact match OXM is always canonical
        return this;
    }

    @Override
    public ArpOpcode getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFOxmArpOp.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFOxmArpOp.Builder {
        final OFOxmArpOpVer14 parentMessage;

        // OF message fields
        private boolean valueSet;
        private ArpOpcode value;

        BuilderWithParent(OFOxmArpOpVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public long getTypeLen() {
        return 0x80002a02L;
    }

    @Override
    public ArpOpcode getValue() {
        return value;
    }

    @Override
    public OFOxmArpOp.Builder setValue(ArpOpcode value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<ArpOpcode> getMatchField() {
        return MatchField.ARP_OP;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<ArpOpcode> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public ArpOpcode getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFOxmArpOp build() {
                ArpOpcode value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFOxmArpOpVer14(
                    value
                );
        }

    }

    static class Builder implements OFOxmArpOp.Builder {
        // OF message fields
        private boolean valueSet;
        private ArpOpcode value;

    @Override
    public long getTypeLen() {
        return 0x80002a02L;
    }

    @Override
    public ArpOpcode getValue() {
        return value;
    }

    @Override
    public OFOxmArpOp.Builder setValue(ArpOpcode value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public MatchField<ArpOpcode> getMatchField() {
        return MatchField.ARP_OP;
    }

    @Override
    public boolean isMasked() {
        return false;
    }

    @Override
    public OFOxm<ArpOpcode> getCanonical()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property canonical not supported in version 1.4");
    }

    @Override
    public ArpOpcode getMask()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property mask not supported in version 1.4");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFOxmArpOp build() {
            ArpOpcode value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFOxmArpOpVer14(
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFOxmArpOp> {
        @Override
        public OFOxmArpOp readFrom(ByteBuf bb) throws OFParseError {
            // fixed value property typeLen == 0x80002a02L
            int typeLen = bb.readInt();
            if(typeLen != (int) 0x80002a02)
                throw new OFParseError("Wrong typeLen: Expected=0x80002a02L(0x80002a02L), got="+typeLen);
            ArpOpcode value = ArpOpcode.read2Bytes(bb);

            OFOxmArpOpVer14 oxmArpOpVer14 = new OFOxmArpOpVer14(
                    value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", oxmArpOpVer14);
            return oxmArpOpVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFOxmArpOpVer14Funnel FUNNEL = new OFOxmArpOpVer14Funnel();
    static class OFOxmArpOpVer14Funnel implements Funnel<OFOxmArpOpVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFOxmArpOpVer14 message, PrimitiveSink sink) {
            // fixed value property typeLen = 0x80002a02L
            sink.putInt((int) 0x80002a02);
            message.value.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFOxmArpOpVer14> {
        @Override
        public void write(ByteBuf bb, OFOxmArpOpVer14 message) {
            // fixed value property typeLen = 0x80002a02L
            bb.writeInt((int) 0x80002a02);
            message.value.write2Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFOxmArpOpVer14(");
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
        OFOxmArpOpVer14 other = (OFOxmArpOpVer14) obj;

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
