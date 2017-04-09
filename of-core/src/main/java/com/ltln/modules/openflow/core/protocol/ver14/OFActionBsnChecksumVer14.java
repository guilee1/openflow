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

class OFActionBsnChecksumVer14 implements OFActionBsnChecksum {
    private static final Logger logger = LoggerFactory.getLogger(OFActionBsnChecksumVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 28;

        private final static U128 DEFAULT_CHECKSUM = U128.ZERO;

    // OF message fields
    private final U128 checksum;
//
    // Immutable default instance
    final static OFActionBsnChecksumVer14 DEFAULT = new OFActionBsnChecksumVer14(
        DEFAULT_CHECKSUM
    );

    // package private constructor - used by readers, builders, and factory
    OFActionBsnChecksumVer14(U128 checksum) {
        if(checksum == null) {
            throw new NullPointerException("OFActionBsnChecksumVer14: property checksum cannot be null");
        }
        this.checksum = checksum;
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
        return 0x4L;
    }

    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFActionBsnChecksum.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionBsnChecksum.Builder {
        final OFActionBsnChecksumVer14 parentMessage;

        // OF message fields
        private boolean checksumSet;
        private U128 checksum;

        BuilderWithParent(OFActionBsnChecksumVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

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
        return 0x4L;
    }

    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFActionBsnChecksum.Builder setChecksum(U128 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFActionBsnChecksum build() {
                U128 checksum = this.checksumSet ? this.checksum : parentMessage.checksum;
                if(checksum == null)
                    throw new NullPointerException("Property checksum must not be null");

                //
                return new OFActionBsnChecksumVer14(
                    checksum
                );
        }

    }

    static class Builder implements OFActionBsnChecksum.Builder {
        // OF message fields
        private boolean checksumSet;
        private U128 checksum;

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
        return 0x4L;
    }

    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFActionBsnChecksum.Builder setChecksum(U128 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFActionBsnChecksum build() {
            U128 checksum = this.checksumSet ? this.checksum : DEFAULT_CHECKSUM;
            if(checksum == null)
                throw new NullPointerException("Property checksum must not be null");


            return new OFActionBsnChecksumVer14(
                    checksum
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionBsnChecksum> {
        @Override
        public OFActionBsnChecksum readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFActionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 28)
                throw new OFParseError("Wrong length: Expected=28(28), got="+length);
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
            // fixed value property subtype == 0x4L
            int subtype = bb.readInt();
            if(subtype != 0x4)
                throw new OFParseError("Wrong subtype: Expected=0x4L(0x4L), got="+subtype);
            U128 checksum = U128.read16Bytes(bb);

            OFActionBsnChecksumVer14 actionBsnChecksumVer14 = new OFActionBsnChecksumVer14(
                    checksum
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionBsnChecksumVer14);
            return actionBsnChecksumVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionBsnChecksumVer14Funnel FUNNEL = new OFActionBsnChecksumVer14Funnel();
    static class OFActionBsnChecksumVer14Funnel implements Funnel<OFActionBsnChecksumVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionBsnChecksumVer14 message, PrimitiveSink sink) {
            // fixed value property type = 65535
            sink.putShort((short) 0xffff);
            // fixed value property length = 28
            sink.putShort((short) 0x1c);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x4L
            sink.putInt(0x4);
            message.checksum.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionBsnChecksumVer14> {
        @Override
        public void write(ByteBuf bb, OFActionBsnChecksumVer14 message) {
            // fixed value property type = 65535
            bb.writeShort((short) 0xffff);
            // fixed value property length = 28
            bb.writeShort((short) 0x1c);
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x4L
            bb.writeInt(0x4);
            message.checksum.write16Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionBsnChecksumVer14(");
        b.append("checksum=").append(checksum);
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
        OFActionBsnChecksumVer14 other = (OFActionBsnChecksumVer14) obj;

        if (checksum == null) {
            if (other.checksum != null)
                return false;
        } else if (!checksum.equals(other.checksum))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((checksum == null) ? 0 : checksum.hashCode());
        return result;
    }

}
