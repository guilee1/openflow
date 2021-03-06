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

class OFBsnTlvStripVlanOnEgressVer14 implements OFBsnTlvStripVlanOnEgress {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnTlvStripVlanOnEgressVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 4;


    // OF message fields
//
    // Immutable default instance
    final static OFBsnTlvStripVlanOnEgressVer14 DEFAULT = new OFBsnTlvStripVlanOnEgressVer14(

    );

    final static OFBsnTlvStripVlanOnEgressVer14 INSTANCE = new OFBsnTlvStripVlanOnEgressVer14();
    // private empty constructor - use shared instance!
    private OFBsnTlvStripVlanOnEgressVer14() {
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x49;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    // no data members - do not support builder
    public OFBsnTlvStripVlanOnEgress.Builder createBuilder() {
        throw new UnsupportedOperationException("OFBsnTlvStripVlanOnEgressVer14 has no mutable properties -- builder unneeded");
    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnTlvStripVlanOnEgress> {
        @Override
        public OFBsnTlvStripVlanOnEgress readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x49
            short type = bb.readShort();
            if(type != (short) 0x49)
                throw new OFParseError("Wrong type: Expected=0x49(0x49), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 4)
                throw new OFParseError("Wrong length: Expected=4(4), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);

            if(logger.isTraceEnabled())
                logger.trace("readFrom - returning shared instance={}", INSTANCE);
            return INSTANCE;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnTlvStripVlanOnEgressVer14Funnel FUNNEL = new OFBsnTlvStripVlanOnEgressVer14Funnel();
    static class OFBsnTlvStripVlanOnEgressVer14Funnel implements Funnel<OFBsnTlvStripVlanOnEgressVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnTlvStripVlanOnEgressVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x49
            sink.putShort((short) 0x49);
            // fixed value property length = 4
            sink.putShort((short) 0x4);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnTlvStripVlanOnEgressVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnTlvStripVlanOnEgressVer14 message) {
            // fixed value property type = 0x49
            bb.writeShort((short) 0x49);
            // fixed value property length = 4
            bb.writeShort((short) 0x4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnTlvStripVlanOnEgressVer14(");
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

        return true;
    }

    @Override
    public int hashCode() {
        int result = 1;

        return result;
    }

}
