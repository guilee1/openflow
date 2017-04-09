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

class OFAsyncConfigPropRoleStatusMasterVer14 implements OFAsyncConfigPropRoleStatusMaster {
    private static final Logger logger = LoggerFactory.getLogger(OFAsyncConfigPropRoleStatusMasterVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 8;

        private final static long DEFAULT_MASK = 0x0L;

    // OF message fields
    private final long mask;
//
    // Immutable default instance
    final static OFAsyncConfigPropRoleStatusMasterVer14 DEFAULT = new OFAsyncConfigPropRoleStatusMasterVer14(
        DEFAULT_MASK
    );

    // package private constructor - used by readers, builders, and factory
    OFAsyncConfigPropRoleStatusMasterVer14(long mask) {
        this.mask = mask;
    }

    // Accessors for OF message fields
    @Override
    public int getType() {
        return 0x7;
    }

    @Override
    public long getMask() {
        return mask;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFAsyncConfigPropRoleStatusMaster.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFAsyncConfigPropRoleStatusMaster.Builder {
        final OFAsyncConfigPropRoleStatusMasterVer14 parentMessage;

        // OF message fields
        private boolean maskSet;
        private long mask;

        BuilderWithParent(OFAsyncConfigPropRoleStatusMasterVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public int getType() {
        return 0x7;
    }

    @Override
    public long getMask() {
        return mask;
    }

    @Override
    public OFAsyncConfigPropRoleStatusMaster.Builder setMask(long mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFAsyncConfigPropRoleStatusMaster build() {
                long mask = this.maskSet ? this.mask : parentMessage.mask;

                //
                return new OFAsyncConfigPropRoleStatusMasterVer14(
                    mask
                );
        }

    }

    static class Builder implements OFAsyncConfigPropRoleStatusMaster.Builder {
        // OF message fields
        private boolean maskSet;
        private long mask;

    @Override
    public int getType() {
        return 0x7;
    }

    @Override
    public long getMask() {
        return mask;
    }

    @Override
    public OFAsyncConfigPropRoleStatusMaster.Builder setMask(long mask) {
        this.mask = mask;
        this.maskSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFAsyncConfigPropRoleStatusMaster build() {
            long mask = this.maskSet ? this.mask : DEFAULT_MASK;


            return new OFAsyncConfigPropRoleStatusMasterVer14(
                    mask
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFAsyncConfigPropRoleStatusMaster> {
        @Override
        public OFAsyncConfigPropRoleStatusMaster readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 0x7
            short type = bb.readShort();
            if(type != (short) 0x7)
                throw new OFParseError("Wrong type: Expected=0x7(0x7), got="+type);
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
            long mask = U32.f(bb.readInt());

            OFAsyncConfigPropRoleStatusMasterVer14 asyncConfigPropRoleStatusMasterVer14 = new OFAsyncConfigPropRoleStatusMasterVer14(
                    mask
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", asyncConfigPropRoleStatusMasterVer14);
            return asyncConfigPropRoleStatusMasterVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFAsyncConfigPropRoleStatusMasterVer14Funnel FUNNEL = new OFAsyncConfigPropRoleStatusMasterVer14Funnel();
    static class OFAsyncConfigPropRoleStatusMasterVer14Funnel implements Funnel<OFAsyncConfigPropRoleStatusMasterVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFAsyncConfigPropRoleStatusMasterVer14 message, PrimitiveSink sink) {
            // fixed value property type = 0x7
            sink.putShort((short) 0x7);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            sink.putLong(message.mask);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFAsyncConfigPropRoleStatusMasterVer14> {
        @Override
        public void write(ByteBuf bb, OFAsyncConfigPropRoleStatusMasterVer14 message) {
            // fixed value property type = 0x7
            bb.writeShort((short) 0x7);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            bb.writeInt(U32.t(message.mask));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFAsyncConfigPropRoleStatusMasterVer14(");
        b.append("mask=").append(mask);
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
        OFAsyncConfigPropRoleStatusMasterVer14 other = (OFAsyncConfigPropRoleStatusMasterVer14) obj;

        if( mask != other.mask)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (mask ^ (mask >>> 32));
        return result;
    }

}
