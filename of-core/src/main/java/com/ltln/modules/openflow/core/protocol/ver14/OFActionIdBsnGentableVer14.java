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

class OFActionIdBsnGentableVer14 implements OFActionIdBsnGentable {
    private static final Logger logger = LoggerFactory.getLogger(OFActionIdBsnGentableVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 12;


    // OF message fields
//
    // Immutable default instance
    final static OFActionIdBsnGentableVer14 DEFAULT = new OFActionIdBsnGentableVer14(

    );

    final static OFActionIdBsnGentableVer14 INSTANCE = new OFActionIdBsnGentableVer14();
    // private empty constructor - use shared instance!
    private OFActionIdBsnGentableVer14() {
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.EXPERIMENTER;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x5L;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    // no data members - do not support builder
    public OFActionIdBsnGentable.Builder createBuilder() {
        throw new UnsupportedOperationException("OFActionIdBsnGentableVer14 has no mutable properties -- builder unneeded");
    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionIdBsnGentable> {
        @Override
        public OFActionIdBsnGentable readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFActionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 12)
                throw new OFParseError("Wrong length: Expected=12(12), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x5L
            int subtype = bb.readInt();
            if(subtype != 0x5)
                throw new OFParseError("Wrong subtype: Expected=0x5L(0x5L), got="+subtype);

            if(logger.isTraceEnabled())
                logger.trace("readFrom - returning shared instance={}", INSTANCE);
            return INSTANCE;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionIdBsnGentableVer14Funnel FUNNEL = new OFActionIdBsnGentableVer14Funnel();
    static class OFActionIdBsnGentableVer14Funnel implements Funnel<OFActionIdBsnGentableVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionIdBsnGentableVer14 message, PrimitiveSink sink) {
            // fixed value property type = 65535
            sink.putShort((short) 0xffff);
            // fixed value property length = 12
            sink.putShort((short) 0xc);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x5L
            sink.putInt(0x5);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionIdBsnGentableVer14> {
        @Override
        public void write(ByteBuf bb, OFActionIdBsnGentableVer14 message) {
            // fixed value property type = 65535
            bb.writeShort((short) 0xffff);
            // fixed value property length = 12
            bb.writeShort((short) 0xc);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x5L
            bb.writeInt(0x5);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionIdBsnGentableVer14(");
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
