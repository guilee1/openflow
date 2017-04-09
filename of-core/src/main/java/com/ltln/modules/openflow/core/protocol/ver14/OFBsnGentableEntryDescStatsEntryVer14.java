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
import java.util.List;
import com.google.common.collect.ImmutableList;
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

class OFBsnGentableEntryDescStatsEntryVer14 implements OFBsnGentableEntryDescStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnGentableEntryDescStatsEntryVer14.class);
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 20;

        private final static U128 DEFAULT_CHECKSUM = U128.ZERO;
        private final static List<OFBsnTlv> DEFAULT_KEY = ImmutableList.<OFBsnTlv>of();
        private final static List<OFBsnTlv> DEFAULT_VALUE = ImmutableList.<OFBsnTlv>of();

    // OF message fields
    private final U128 checksum;
    private final List<OFBsnTlv> key;
    private final List<OFBsnTlv> value;
//
    // Immutable default instance
    final static OFBsnGentableEntryDescStatsEntryVer14 DEFAULT = new OFBsnGentableEntryDescStatsEntryVer14(
        DEFAULT_CHECKSUM, DEFAULT_KEY, DEFAULT_VALUE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnGentableEntryDescStatsEntryVer14(U128 checksum, List<OFBsnTlv> key, List<OFBsnTlv> value) {
        if(checksum == null) {
            throw new NullPointerException("OFBsnGentableEntryDescStatsEntryVer14: property checksum cannot be null");
        }
        if(key == null) {
            throw new NullPointerException("OFBsnGentableEntryDescStatsEntryVer14: property key cannot be null");
        }
        if(value == null) {
            throw new NullPointerException("OFBsnGentableEntryDescStatsEntryVer14: property value cannot be null");
        }
        this.checksum = checksum;
        this.key = key;
        this.value = value;
    }

    // Accessors for OF message fields
    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public List<OFBsnTlv> getKey() {
        return key;
    }

    @Override
    public List<OFBsnTlv> getValue() {
        return value;
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



    public OFBsnGentableEntryDescStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnGentableEntryDescStatsEntry.Builder {
        final OFBsnGentableEntryDescStatsEntryVer14 parentMessage;

        // OF message fields
        private boolean checksumSet;
        private U128 checksum;
        private boolean keySet;
        private List<OFBsnTlv> key;
        private boolean valueSet;
        private List<OFBsnTlv> value;

        BuilderWithParent(OFBsnGentableEntryDescStatsEntryVer14 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFBsnGentableEntryDescStatsEntry.Builder setChecksum(U128 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public List<OFBsnTlv> getKey() {
        return key;
    }

    @Override
    public OFBsnGentableEntryDescStatsEntry.Builder setKey(List<OFBsnTlv> key) {
        this.key = key;
        this.keySet = true;
        return this;
    }
    @Override
    public List<OFBsnTlv> getValue() {
        return value;
    }

    @Override
    public OFBsnGentableEntryDescStatsEntry.Builder setValue(List<OFBsnTlv> value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }



        @Override
        public OFBsnGentableEntryDescStatsEntry build() {
                U128 checksum = this.checksumSet ? this.checksum : parentMessage.checksum;
                if(checksum == null)
                    throw new NullPointerException("Property checksum must not be null");
                List<OFBsnTlv> key = this.keySet ? this.key : parentMessage.key;
                if(key == null)
                    throw new NullPointerException("Property key must not be null");
                List<OFBsnTlv> value = this.valueSet ? this.value : parentMessage.value;
                if(value == null)
                    throw new NullPointerException("Property value must not be null");

                //
                return new OFBsnGentableEntryDescStatsEntryVer14(
                    checksum,
                    key,
                    value
                );
        }

    }

    static class Builder implements OFBsnGentableEntryDescStatsEntry.Builder {
        // OF message fields
        private boolean checksumSet;
        private U128 checksum;
        private boolean keySet;
        private List<OFBsnTlv> key;
        private boolean valueSet;
        private List<OFBsnTlv> value;

    @Override
    public U128 getChecksum() {
        return checksum;
    }

    @Override
    public OFBsnGentableEntryDescStatsEntry.Builder setChecksum(U128 checksum) {
        this.checksum = checksum;
        this.checksumSet = true;
        return this;
    }
    @Override
    public List<OFBsnTlv> getKey() {
        return key;
    }

    @Override
    public OFBsnGentableEntryDescStatsEntry.Builder setKey(List<OFBsnTlv> key) {
        this.key = key;
        this.keySet = true;
        return this;
    }
    @Override
    public List<OFBsnTlv> getValue() {
        return value;
    }

    @Override
    public OFBsnGentableEntryDescStatsEntry.Builder setValue(List<OFBsnTlv> value) {
        this.value = value;
        this.valueSet = true;
        return this;
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_14;
    }

//
        @Override
        public OFBsnGentableEntryDescStatsEntry build() {
            U128 checksum = this.checksumSet ? this.checksum : DEFAULT_CHECKSUM;
            if(checksum == null)
                throw new NullPointerException("Property checksum must not be null");
            List<OFBsnTlv> key = this.keySet ? this.key : DEFAULT_KEY;
            if(key == null)
                throw new NullPointerException("Property key must not be null");
            List<OFBsnTlv> value = this.valueSet ? this.value : DEFAULT_VALUE;
            if(value == null)
                throw new NullPointerException("Property value must not be null");


            return new OFBsnGentableEntryDescStatsEntryVer14(
                    checksum,
                    key,
                    value
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnGentableEntryDescStatsEntry> {
        @Override
        public OFBsnGentableEntryDescStatsEntry readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            int keyLength = U16.f(bb.readShort());
            U128 checksum = U128.read16Bytes(bb);
            List<OFBsnTlv> key = ChannelUtils.readList(bb, keyLength, OFBsnTlvVer14.READER);
            List<OFBsnTlv> value = ChannelUtils.readList(bb, length - (bb.readerIndex() - start), OFBsnTlvVer14.READER);

            OFBsnGentableEntryDescStatsEntryVer14 bsnGentableEntryDescStatsEntryVer14 = new OFBsnGentableEntryDescStatsEntryVer14(
                    checksum,
                      key,
                      value
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnGentableEntryDescStatsEntryVer14);
            return bsnGentableEntryDescStatsEntryVer14;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnGentableEntryDescStatsEntryVer14Funnel FUNNEL = new OFBsnGentableEntryDescStatsEntryVer14Funnel();
    static class OFBsnGentableEntryDescStatsEntryVer14Funnel implements Funnel<OFBsnGentableEntryDescStatsEntryVer14> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnGentableEntryDescStatsEntryVer14 message, PrimitiveSink sink) {
            // FIXME: skip funnel of length
            // FIXME: skip funnel of keyLength
            message.checksum.putTo(sink);
            FunnelUtils.putList(message.key, sink);
            FunnelUtils.putList(message.value, sink);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnGentableEntryDescStatsEntryVer14> {
        @Override
        public void write(ByteBuf bb, OFBsnGentableEntryDescStatsEntryVer14 message) {
            int startIndex = bb.writerIndex();
            // length is length of variable message, will be updated at the end
            int lengthIndex = bb.writerIndex();
            bb.writeShort(U16.t(0));

            // keyLength is length indicator for key, will be
            // udpated when key has been written
            int keyLengthIndex = bb.writerIndex();
            bb.writeShort(0);
            message.checksum.write16Bytes(bb);
            int keyStartIndex = bb.writerIndex();
            ChannelUtils.writeList(bb, message.key);
            // update field length member keyLength
            int keyLength = bb.writerIndex() - keyStartIndex;
            bb.setShort(keyLengthIndex, keyLength);
            ChannelUtils.writeList(bb, message.value);

            // update length field
            int length = bb.writerIndex() - startIndex;
            bb.setShort(lengthIndex, length);

        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnGentableEntryDescStatsEntryVer14(");
        b.append("checksum=").append(checksum);
        b.append(", ");
        b.append("key=").append(key);
        b.append(", ");
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
        OFBsnGentableEntryDescStatsEntryVer14 other = (OFBsnGentableEntryDescStatsEntryVer14) obj;

        if (checksum == null) {
            if (other.checksum != null)
                return false;
        } else if (!checksum.equals(other.checksum))
            return false;
        if (key == null) {
            if (other.key != null)
                return false;
        } else if (!key.equals(other.key))
            return false;
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

        result = prime * result + ((checksum == null) ? 0 : checksum.hashCode());
        result = prime * result + ((key == null) ? 0 : key.hashCode());
        result = prime * result + ((value == null) ? 0 : value.hashCode());
        return result;
    }

}
