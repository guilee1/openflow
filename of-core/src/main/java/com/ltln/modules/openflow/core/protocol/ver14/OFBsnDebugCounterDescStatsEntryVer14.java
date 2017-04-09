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

class OFBsnDebugCounterDescStatsEntryVer14 implements OFBsnDebugCounterDescStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnDebugCounterDescStatsEntryVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int LENGTH = 328;

        private final static U64 DEFAULT_COUNTER_ID = U64.ZERO;
        private final static String DEFAULT_NAME = "";
        private final static String DEFAULT_DESCRIPTION = "";

    // OF message fields
    private final U64 counterId;
    private final String name;
    private final String description;
//
    // Immutable default instance
    final static OFBsnDebugCounterDescStatsEntryVer14 DEFAULT = new OFBsnDebugCounterDescStatsEntryVer14(
        DEFAULT_COUNTER_ID, DEFAULT_NAME, DEFAULT_DESCRIPTION
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnDebugCounterDescStatsEntryVer14(U64 counterId, String name, String description) {
        if(counterId == null) {
            throw new NullPointerException("OFBsnDebugCounterDescStatsEntryVer14: property counterId cannot be null");
        }
        if(name == null) {
            throw new NullPointerException("OFBsnDebugCounterDescStatsEntryVer14: property name cannot be null");
        }
        if(description == null) {
            throw new NullPointerException("OFBsnDebugCounterDescStatsEntryVer14: property description cannot be null");
        }
        this.counterId = counterId;
        this.name = name;
        this.description = description;
    }

    // Accessors for OF message fields
    @Override
    public U64 getCounterId() {
        return counterId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnDebugCounterDescStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnDebugCounterDescStatsEntry.Builder {
        final OFBsnDebugCounterDescStatsEntryVer14 parentMessage;

        // OF message fields
        private boolean counterIdSet;
        private U64 counterId;
        private boolean nameSet;
        private String name;
        private boolean descriptionSet;
        private String description;

        BuilderWithParent(OFBsnDebugCounterDescStatsEntryVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public U64 getCounterId() {
        return counterId;
    }

    @Override
    public OFBsnDebugCounterDescStatsEntry.Builder setCounterId(U64 counterId) {
        this.counterId = counterId;
        this.counterIdSet = true;
        return this;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public OFBsnDebugCounterDescStatsEntry.Builder setName(String name) {
        this.name = name;
        this.nameSet = true;
        return this;
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public OFBsnDebugCounterDescStatsEntry.Builder setDescription(String description) {
        this.description = description;
        this.descriptionSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnDebugCounterDescStatsEntry build() {
                U64 counterId = this.counterIdSet ? this.counterId : parentMessage.counterId;
                if(counterId == null)
                    throw new NullPointerException("Property counterId must not be null");
                String name = this.nameSet ? this.name : parentMessage.name;
                if(name == null)
                    throw new NullPointerException("Property name must not be null");
                String description = this.descriptionSet ? this.description : parentMessage.description;
                if(description == null)
                    throw new NullPointerException("Property description must not be null");

                //
                return new OFBsnDebugCounterDescStatsEntryVer14(
                    counterId,
                    name,
                    description
                );
        }

    }

    static class Builder implements OFBsnDebugCounterDescStatsEntry.Builder {
        // OF message fields
        private boolean counterIdSet;
        private U64 counterId;
        private boolean nameSet;
        private String name;
        private boolean descriptionSet;
        private String description;

    @Override
    public U64 getCounterId() {
        return counterId;
    }

    @Override
    public OFBsnDebugCounterDescStatsEntry.Builder setCounterId(U64 counterId) {
        this.counterId = counterId;
        this.counterIdSet = true;
        return this;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public OFBsnDebugCounterDescStatsEntry.Builder setName(String name) {
        this.name = name;
        this.nameSet = true;
        return this;
    }
    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public OFBsnDebugCounterDescStatsEntry.Builder setDescription(String description) {
        this.description = description;
        this.descriptionSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBsnDebugCounterDescStatsEntry build() {
            U64 counterId = this.counterIdSet ? this.counterId : DEFAULT_COUNTER_ID;
            if(counterId == null)
                throw new NullPointerException("Property counterId must not be null");
            String name = this.nameSet ? this.name : DEFAULT_NAME;
            if(name == null)
                throw new NullPointerException("Property name must not be null");
            String description = this.descriptionSet ? this.description : DEFAULT_DESCRIPTION;
            if(description == null)
                throw new NullPointerException("Property description must not be null");


            return new OFBsnDebugCounterDescStatsEntryVer14(
                    counterId,
                    name,
                    description
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnDebugCounterDescStatsEntry> {
        @Override
        public OFBsnDebugCounterDescStatsEntry readFrom(ByteBuf bb) throws OFParseError {
            U64 counterId = U64.ofRaw(bb.readLong());
            String name = ChannelUtils.readFixedLengthString(bb, 64);
            String description = ChannelUtils.readFixedLengthString(bb, 256);

            OFBsnDebugCounterDescStatsEntryVer14 bsnDebugCounterDescStatsEntryVer14 = new OFBsnDebugCounterDescStatsEntryVer14(
                    counterId,
                      name,
                      description
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnDebugCounterDescStatsEntryVer14);
            return bsnDebugCounterDescStatsEntryVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnDebugCounterDescStatsEntryVer14Funnel FUNNEL = new OFBsnDebugCounterDescStatsEntryVer14Funnel();
    static class OFBsnDebugCounterDescStatsEntryVer14Funnel implements Funnel<OFBsnDebugCounterDescStatsEntryVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnDebugCounterDescStatsEntryVer14 message, PrimitiveSink sink) {
            message.counterId.putTo(sink);
            sink.putUnencodedChars(message.name);
            sink.putUnencodedChars(message.description);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnDebugCounterDescStatsEntryVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnDebugCounterDescStatsEntryVer14 message) {
            bb.writeLong(message.counterId.getValue());
            ChannelUtils.writeFixedLengthString(bb, message.name, 64);
            ChannelUtils.writeFixedLengthString(bb, message.description, 256);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnDebugCounterDescStatsEntryVer14(");
        b.append("counterId=").append(counterId);
        b.append(", ");
        b.append("name=").append(name);
        b.append(", ");
        b.append("description=").append(description);
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
        OFBsnDebugCounterDescStatsEntryVer14 other = (OFBsnDebugCounterDescStatsEntryVer14) obj;

        if (counterId == null) {
            if (other.counterId != null)
                return false;
        } else if (!counterId.equals(other.counterId))
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        } else if (!description.equals(other.description))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((counterId == null) ? 0 : counterId.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((description == null) ? 0 : description.hashCode());
        return result;
    }

}
