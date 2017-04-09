// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver13;

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

class OFBsnGetSwitchPipelineReplyVer13 implements OFBsnGetSwitchPipelineReply {
    private static final Logger logger = LoggerFactory.getLogger(OFBsnGetSwitchPipelineReplyVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 272;

        private final static long DEFAULT_XID = 0x0L;
        private final static String DEFAULT_PIPELINE = "";

    // OF message fields
    private final long xid;
    private final String pipeline;
//
    // Immutable default instance
    final static OFBsnGetSwitchPipelineReplyVer13 DEFAULT = new OFBsnGetSwitchPipelineReplyVer13(
        DEFAULT_XID, DEFAULT_PIPELINE
    );

    // package private constructor - used by readers, builders, and factory
    OFBsnGetSwitchPipelineReplyVer13(long xid, String pipeline) {
        if(pipeline == null) {
            throw new NullPointerException("OFBsnGetSwitchPipelineReplyVer13: property pipeline cannot be null");
        }
        this.xid = xid;
        this.pipeline = pipeline;
    }

    // Accessors for OF message fields
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x34L;
    }

    @Override
    public String getPipeline() {
        return pipeline;
    }



    public OFBsnGetSwitchPipelineReply.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFBsnGetSwitchPipelineReply.Builder {
        final OFBsnGetSwitchPipelineReplyVer13 parentMessage;

        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean pipelineSet;
        private String pipeline;

        BuilderWithParent(OFBsnGetSwitchPipelineReplyVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnGetSwitchPipelineReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x34L;
    }

    @Override
    public String getPipeline() {
        return pipeline;
    }

    @Override
    public OFBsnGetSwitchPipelineReply.Builder setPipeline(String pipeline) {
        this.pipeline = pipeline;
        this.pipelineSet = true;
        return this;
    }


        @Override
        public OFBsnGetSwitchPipelineReply build() {
                long xid = this.xidSet ? this.xid : parentMessage.xid;
                String pipeline = this.pipelineSet ? this.pipeline : parentMessage.pipeline;
                if(pipeline == null)
                    throw new NullPointerException("Property pipeline must not be null");

                //
                return new OFBsnGetSwitchPipelineReplyVer13(
                    xid,
                    pipeline
                );
        }

    }

    static class Builder implements OFBsnGetSwitchPipelineReply.Builder {
        // OF message fields
        private boolean xidSet;
        private long xid;
        private boolean pipelineSet;
        private String pipeline;

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

    @Override
    public OFType getType() {
        return OFType.EXPERIMENTER;
    }

    @Override
    public long getXid() {
        return xid;
    }

    @Override
    public OFBsnGetSwitchPipelineReply.Builder setXid(long xid) {
        this.xid = xid;
        this.xidSet = true;
        return this;
    }
    @Override
    public long getExperimenter() {
        return 0x5c16c7L;
    }

    @Override
    public long getSubtype() {
        return 0x34L;
    }

    @Override
    public String getPipeline() {
        return pipeline;
    }

    @Override
    public OFBsnGetSwitchPipelineReply.Builder setPipeline(String pipeline) {
        this.pipeline = pipeline;
        this.pipelineSet = true;
        return this;
    }
//
        @Override
        public OFBsnGetSwitchPipelineReply build() {
            long xid = this.xidSet ? this.xid : DEFAULT_XID;
            String pipeline = this.pipelineSet ? this.pipeline : DEFAULT_PIPELINE;
            if(pipeline == null)
                throw new NullPointerException("Property pipeline must not be null");


            return new OFBsnGetSwitchPipelineReplyVer13(
                    xid,
                    pipeline
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFBsnGetSwitchPipelineReply> {
        @Override
        public OFBsnGetSwitchPipelineReply readFrom(ByteBuf bb) throws OFParseError {
            int start = bb.readerIndex();
            // fixed value property version == 4
            byte version = bb.readByte();
            if(version != (byte) 0x4)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_13(4), got="+version);
            // fixed value property type == 4
            byte type = bb.readByte();
            if(type != (byte) 0x4)
                throw new OFParseError("Wrong type: Expected=OFType.EXPERIMENTER(4), got="+type);
            int length = U16.f(bb.readShort());
            if(length != 272)
                throw new OFParseError("Wrong length: Expected=272(272), got="+length);
            if(bb.readableBytes() + (bb.readerIndex() - start) < length) {
                // Buffer does not have all data yet
                bb.readerIndex(start);
                return null;
            }
            if(logger.isTraceEnabled())
                logger.trace("readFrom - length={}", length);
            long xid = U32.f(bb.readInt());
            // fixed value property experimenter == 0x5c16c7L
            int experimenter = bb.readInt();
            if(experimenter != 0x5c16c7)
                throw new OFParseError("Wrong experimenter: Expected=0x5c16c7L(0x5c16c7L), got="+experimenter);
            // fixed value property subtype == 0x34L
            int subtype = bb.readInt();
            if(subtype != 0x34)
                throw new OFParseError("Wrong subtype: Expected=0x34L(0x34L), got="+subtype);
            String pipeline = ChannelUtils.readFixedLengthString(bb, 256);

            OFBsnGetSwitchPipelineReplyVer13 bsnGetSwitchPipelineReplyVer13 = new OFBsnGetSwitchPipelineReplyVer13(
                    xid,
                      pipeline
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", bsnGetSwitchPipelineReplyVer13);
            return bsnGetSwitchPipelineReplyVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFBsnGetSwitchPipelineReplyVer13Funnel FUNNEL = new OFBsnGetSwitchPipelineReplyVer13Funnel();
    static class OFBsnGetSwitchPipelineReplyVer13Funnel implements Funnel<OFBsnGetSwitchPipelineReplyVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFBsnGetSwitchPipelineReplyVer13 message, PrimitiveSink sink) {
            // fixed value property version = 4
            sink.putByte((byte) 0x4);
            // fixed value property type = 4
            sink.putByte((byte) 0x4);
            // fixed value property length = 272
            sink.putShort((short) 0x110);
            sink.putLong(message.xid);
            // fixed value property experimenter = 0x5c16c7L
            sink.putInt(0x5c16c7);
            // fixed value property subtype = 0x34L
            sink.putInt(0x34);
            sink.putUnencodedChars(message.pipeline);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFBsnGetSwitchPipelineReplyVer13> {
        @Override
        public void write(ByteBuf bb, OFBsnGetSwitchPipelineReplyVer13 message) {
            // fixed value property version = 4
            bb.writeByte((byte) 0x4);
            // fixed value property type = 4
            bb.writeByte((byte) 0x4);
            // fixed value property length = 272
            bb.writeShort((short) 0x110);
            bb.writeInt(U32.t(message.xid));
            // fixed value property experimenter = 0x5c16c7L
            bb.writeInt(0x5c16c7);
            // fixed value property subtype = 0x34L
            bb.writeInt(0x34);
            ChannelUtils.writeFixedLengthString(bb, message.pipeline, 256);


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFBsnGetSwitchPipelineReplyVer13(");
        b.append("xid=").append(xid);
        b.append(", ");
        b.append("pipeline=").append(pipeline);
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
        OFBsnGetSwitchPipelineReplyVer13 other = (OFBsnGetSwitchPipelineReplyVer13) obj;

        if( xid != other.xid)
            return false;
        if (pipeline == null) {
            if (other.pipeline != null)
                return false;
        } else if (!pipeline.equals(other.pipeline))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime *  (int) (xid ^ (xid >>> 32));
        result = prime * result + ((pipeline == null) ? 0 : pipeline.hashCode());
        return result;
    }

}
