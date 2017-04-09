// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver11;

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

class OFActionDecNwTtlVer11 implements OFActionDecNwTtl {
    private static final Logger logger = LoggerFactory.getLogger(OFActionDecNwTtlVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 8;


    // OF message fields
//
    // Immutable default instance
    final static OFActionDecNwTtlVer11 DEFAULT = new OFActionDecNwTtlVer11(

    );

    final static OFActionDecNwTtlVer11 INSTANCE = new OFActionDecNwTtlVer11();
    // private empty constructor - use shared instance!
    private OFActionDecNwTtlVer11() {
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.DEC_NW_TTL;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    // no data members - do not support builder
    public OFActionDecNwTtl.Builder createBuilder() {
        throw new UnsupportedOperationException("OFActionDecNwTtlVer11 has no mutable properties -- builder unneeded");
    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionDecNwTtl> {
        @Override
        public OFActionDecNwTtl readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 24
            short type = bb.readShort();
            if(type != (short) 0x18)
                throw new OFParseError("Wrong type: Expected=OFActionType.DEC_NW_TTL(24), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 8)
                throw new OFParseError("Wrong length: Expected=8(8), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // pad: 4 bytes
            bb.skipBytes(4);

            if(logger.isTraceEnabled())
                logger.trace("readFrom - returning shared instance={}", INSTANCE);
            return INSTANCE;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionDecNwTtlVer11Funnel FUNNEL = new OFActionDecNwTtlVer11Funnel();
    static class OFActionDecNwTtlVer11Funnel implements Funnel<OFActionDecNwTtlVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionDecNwTtlVer11 message, PrimitiveSink sink) {
            // fixed value property type = 24
            sink.putShort((short) 0x18);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            // skip pad (4 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionDecNwTtlVer11> {
        @Override
        public void write(ByteBuf bb, OFActionDecNwTtlVer11 message) {
            // fixed value property type = 24
            bb.writeShort((short) 0x18);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            // pad: 4 bytes
            bb.writeZero(4);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionDecNwTtlVer11(");
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
