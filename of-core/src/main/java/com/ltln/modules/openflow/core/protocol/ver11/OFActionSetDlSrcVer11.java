// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver11;

import java.util.Set;
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

class OFActionSetDlSrcVer11 implements OFActionSetDlSrc {
    private static final Logger logger = LoggerFactory.getLogger(OFActionSetDlSrcVer11.class);
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int LENGTH = 16;

        private final static MacAddress DEFAULT_DL_ADDR = MacAddress.NONE;

    // OF message fields
    private final MacAddress dlAddr;
//
    // Immutable default instance
    final static OFActionSetDlSrcVer11 DEFAULT = new OFActionSetDlSrcVer11(
        DEFAULT_DL_ADDR
    );

    // package private constructor - used by readers, builders, and factory
    OFActionSetDlSrcVer11(MacAddress dlAddr) {
        if(dlAddr == null) {
            throw new NullPointerException("OFActionSetDlSrcVer11: property dlAddr cannot be null");
        }
        this.dlAddr = dlAddr;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.SET_DL_SRC;
    }

    @Override
    public MacAddress getDlAddr() {
        return dlAddr;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



    public OFActionSetDlSrc.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionSetDlSrc.Builder {
        final OFActionSetDlSrcVer11 parentMessage;

        // OF message fields
        private boolean dlAddrSet;
        private MacAddress dlAddr;

        BuilderWithParent(OFActionSetDlSrcVer11 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.SET_DL_SRC;
    }

    @Override
    public MacAddress getDlAddr() {
        return dlAddr;
    }

    @Override
    public OFActionSetDlSrc.Builder setDlAddr(MacAddress dlAddr) {
        this.dlAddr = dlAddr;
        this.dlAddrSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }



        @Override
        public OFActionSetDlSrc build() {
                MacAddress dlAddr = this.dlAddrSet ? this.dlAddr : parentMessage.dlAddr;
                if(dlAddr == null)
                    throw new NullPointerException("Property dlAddr must not be null");

                //
                return new OFActionSetDlSrcVer11(
                    dlAddr
                );
        }

    }

    static class Builder implements OFActionSetDlSrc.Builder {
        // OF message fields
        private boolean dlAddrSet;
        private MacAddress dlAddr;

    @Override
    public OFActionType getType() {
        return OFActionType.SET_DL_SRC;
    }

    @Override
    public MacAddress getDlAddr() {
        return dlAddr;
    }

    @Override
    public OFActionSetDlSrc.Builder setDlAddr(MacAddress dlAddr) {
        this.dlAddr = dlAddr;
        this.dlAddrSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_11;
    }

//
        @Override
        public OFActionSetDlSrc build() {
            MacAddress dlAddr = this.dlAddrSet ? this.dlAddr : DEFAULT_DL_ADDR;
            if(dlAddr == null)
                throw new NullPointerException("Property dlAddr must not be null");


            return new OFActionSetDlSrcVer11(
                    dlAddr
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionSetDlSrc> {
        @Override
        public OFActionSetDlSrc readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 3
            short type = bb.readShort();
            if(type != (short) 0x3)
                throw new OFParseError("Wrong type: Expected=OFActionType.SET_DL_SRC(3), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 16)
                throw new OFParseError("Wrong length: Expected=16(16), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            MacAddress dlAddr = MacAddress.read6Bytes(bb);
            // pad: 6 bytes
            bb.skipBytes(6);

            OFActionSetDlSrcVer11 actionSetDlSrcVer11 = new OFActionSetDlSrcVer11(
                    dlAddr
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionSetDlSrcVer11);
            return actionSetDlSrcVer11;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionSetDlSrcVer11Funnel FUNNEL = new OFActionSetDlSrcVer11Funnel();
    static class OFActionSetDlSrcVer11Funnel implements Funnel<OFActionSetDlSrcVer11> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionSetDlSrcVer11 message, PrimitiveSink sink) {
            // fixed value property type = 3
            sink.putShort((short) 0x3);
            // fixed value property length = 16
            sink.putShort((short) 0x10);
            message.dlAddr.putTo(sink);
            // skip pad (6 bytes)
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionSetDlSrcVer11> {
        @Override
        public void write(ByteBuf bb, OFActionSetDlSrcVer11 message) {
            // fixed value property type = 3
            bb.writeShort((short) 0x3);
            // fixed value property length = 16
            bb.writeShort((short) 0x10);
            message.dlAddr.write6Bytes(bb);
            // pad: 6 bytes
            bb.writeZero(6);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionSetDlSrcVer11(");
        b.append("dlAddr=").append(dlAddr);
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
        OFActionSetDlSrcVer11 other = (OFActionSetDlSrcVer11) obj;

        if (dlAddr == null) {
            if (other.dlAddr != null)
                return false;
        } else if (!dlAddr.equals(other.dlAddr))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((dlAddr == null) ? 0 : dlAddr.hashCode());
        return result;
    }

}
