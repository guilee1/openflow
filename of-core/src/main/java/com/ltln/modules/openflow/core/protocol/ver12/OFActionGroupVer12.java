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

class OFActionGroupVer12 implements OFActionGroup {
    private static final Logger logger = LoggerFactory.getLogger(OFActionGroupVer12.class);
    // version: 1.2
    final static byte WIRE_VERSION = 3;
    final static int LENGTH = 8;

        private final static OFGroup DEFAULT_GROUP_ID = OFGroup.ALL;

    // OF message fields
    private final OFGroup group;
//
    // Immutable default instance
    final static OFActionGroupVer12 DEFAULT = new OFActionGroupVer12(
        DEFAULT_GROUP_ID
    );

    // package private constructor - used by readers, builders, and factory
    OFActionGroupVer12(OFGroup group) {
        if(group == null) {
            throw new NullPointerException("OFActionGroupVer12: property group cannot be null");
        }
        this.group = group;
    }

    // Accessors for OF message fields
    @Override
    public OFActionType getType() {
        return OFActionType.GROUP;
    }

    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



    public OFActionGroup.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFActionGroup.Builder {
        final OFActionGroupVer12 parentMessage;

        // OF message fields
        private boolean groupSet;
        private OFGroup group;

        BuilderWithParent(OFActionGroupVer12 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFActionType getType() {
        return OFActionType.GROUP;
    }

    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public OFActionGroup.Builder setGroup(OFGroup group) {
        this.group = group;
        this.groupSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }



        @Override
        public OFActionGroup build() {
                OFGroup group = this.groupSet ? this.group : parentMessage.group;
                if(group == null)
                    throw new NullPointerException("Property group must not be null");

                //
                return new OFActionGroupVer12(
                    group
                );
        }

    }

    static class Builder implements OFActionGroup.Builder {
        // OF message fields
        private boolean groupSet;
        private OFGroup group;

    @Override
    public OFActionType getType() {
        return OFActionType.GROUP;
    }

    @Override
    public OFGroup getGroup() {
        return group;
    }

    @Override
    public OFActionGroup.Builder setGroup(OFGroup group) {
        this.group = group;
        this.groupSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_12;
    }

//
        @Override
        public OFActionGroup build() {
            OFGroup group = this.groupSet ? this.group : DEFAULT_GROUP_ID;
            if(group == null)
                throw new NullPointerException("Property group must not be null");


            return new OFActionGroupVer12(
                    group
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFActionGroup> {
        @Override
        public OFActionGroup readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property type == 22
            short type = bb.readShort();
            if(type != (short) 0x16)
                throw new OFParseError("Wrong type: Expected=OFActionType.GROUP(22), got="+type);
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
            OFGroup group = OFGroup.read4Bytes(bb);

            OFActionGroupVer12 actionGroupVer12 = new OFActionGroupVer12(
                    group
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", actionGroupVer12);
            return actionGroupVer12;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFActionGroupVer12Funnel FUNNEL = new OFActionGroupVer12Funnel();
    static class OFActionGroupVer12Funnel implements Funnel<OFActionGroupVer12> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFActionGroupVer12 message, PrimitiveSink sink) {
            // fixed value property type = 22
            sink.putShort((short) 0x16);
            // fixed value property length = 8
            sink.putShort((short) 0x8);
            message.group.putTo(sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFActionGroupVer12> {
        @Override
        public void write(ByteBuf bb, OFActionGroupVer12 message) {
            // fixed value property type = 22
            bb.writeShort((short) 0x16);
            // fixed value property length = 8
            bb.writeShort((short) 0x8);
            message.group.write4Bytes(bb);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFActionGroupVer12(");
        b.append("group=").append(group);
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
        OFActionGroupVer12 other = (OFActionGroupVer12) obj;

        if (group == null) {
            if (other.group != null)
                return false;
        } else if (!group.equals(other.group))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((group == null) ? 0 : group.hashCode());
        return result;
    }

}
