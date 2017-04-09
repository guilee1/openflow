// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver11;


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

import io.netty.buffer.ByteBuf;
import java.util.Set;

abstract class OFMessageVer11 {
    // version: 1.1
    final static byte WIRE_VERSION = 2;
    final static int MINIMUM_LENGTH = 8;


    public final static OFMessageVer11.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFMessage> {
        @Override
        public OFMessage readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 2
            byte version = bb.readByte();
            if(version != (byte) 0x2)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_11(2), got="+version);
            byte type = bb.readByte();
            bb.readerIndex(start);
            switch(type) {
               case (byte) 0x13:
                   // discriminator value OFType.STATS_REPLY=19 for class OFStatsReplyVer11
                   return OFStatsReplyVer11.READER.readFrom(bb);
               case (byte) 0x12:
                   // discriminator value OFType.STATS_REQUEST=18 for class OFStatsRequestVer11
                   return OFStatsRequestVer11.READER.readFrom(bb);
               case (byte) 0x1:
                   // discriminator value OFType.ERROR=1 for class OFErrorMsgVer11
                   return OFErrorMsgVer11.READER.readFrom(bb);
               case (byte) 0x15:
                   // discriminator value OFType.BARRIER_REPLY=21 for class OFBarrierReplyVer11
                   return OFBarrierReplyVer11.READER.readFrom(bb);
               case (byte) 0x14:
                   // discriminator value OFType.BARRIER_REQUEST=20 for class OFBarrierRequestVer11
                   return OFBarrierRequestVer11.READER.readFrom(bb);
               case (byte) 0x4:
                   // discriminator value OFType.EXPERIMENTER=4 for class OFExperimenterVer11
                   return OFExperimenterVer11.READER.readFrom(bb);
               case (byte) 0x3:
                   // discriminator value OFType.ECHO_REPLY=3 for class OFEchoReplyVer11
                   return OFEchoReplyVer11.READER.readFrom(bb);
               case (byte) 0x2:
                   // discriminator value OFType.ECHO_REQUEST=2 for class OFEchoRequestVer11
                   return OFEchoRequestVer11.READER.readFrom(bb);
               case (byte) 0x6:
                   // discriminator value OFType.FEATURES_REPLY=6 for class OFFeaturesReplyVer11
                   return OFFeaturesReplyVer11.READER.readFrom(bb);
               case (byte) 0x5:
                   // discriminator value OFType.FEATURES_REQUEST=5 for class OFFeaturesRequestVer11
                   return OFFeaturesRequestVer11.READER.readFrom(bb);
               case (byte) 0xe:
                   // discriminator value OFType.FLOW_MOD=14 for class OFFlowModVer11
                   return OFFlowModVer11.READER.readFrom(bb);
               case (byte) 0xb:
                   // discriminator value OFType.FLOW_REMOVED=11 for class OFFlowRemovedVer11
                   return OFFlowRemovedVer11.READER.readFrom(bb);
               case (byte) 0x8:
                   // discriminator value OFType.GET_CONFIG_REPLY=8 for class OFGetConfigReplyVer11
                   return OFGetConfigReplyVer11.READER.readFrom(bb);
               case (byte) 0x7:
                   // discriminator value OFType.GET_CONFIG_REQUEST=7 for class OFGetConfigRequestVer11
                   return OFGetConfigRequestVer11.READER.readFrom(bb);
               case (byte) 0x0:
                   // discriminator value OFType.HELLO=0 for class OFHelloVer11
                   return OFHelloVer11.READER.readFrom(bb);
               case (byte) 0xa:
                   // discriminator value OFType.PACKET_IN=10 for class OFPacketInVer11
                   return OFPacketInVer11.READER.readFrom(bb);
               case (byte) 0xd:
                   // discriminator value OFType.PACKET_OUT=13 for class OFPacketOutVer11
                   return OFPacketOutVer11.READER.readFrom(bb);
               case (byte) 0x10:
                   // discriminator value OFType.PORT_MOD=16 for class OFPortModVer11
                   return OFPortModVer11.READER.readFrom(bb);
               case (byte) 0xc:
                   // discriminator value OFType.PORT_STATUS=12 for class OFPortStatusVer11
                   return OFPortStatusVer11.READER.readFrom(bb);
               case (byte) 0x17:
                   // discriminator value OFType.QUEUE_GET_CONFIG_REPLY=23 for class OFQueueGetConfigReplyVer11
                   return OFQueueGetConfigReplyVer11.READER.readFrom(bb);
               case (byte) 0x16:
                   // discriminator value OFType.QUEUE_GET_CONFIG_REQUEST=22 for class OFQueueGetConfigRequestVer11
                   return OFQueueGetConfigRequestVer11.READER.readFrom(bb);
               case (byte) 0x9:
                   // discriminator value OFType.SET_CONFIG=9 for class OFSetConfigVer11
                   return OFSetConfigVer11.READER.readFrom(bb);
               case (byte) 0x11:
                   // discriminator value OFType.TABLE_MOD=17 for class OFTableModVer11
                   return OFTableModVer11.READER.readFrom(bb);
               case (byte) 0xf:
                   // discriminator value OFType.GROUP_MOD=15 for class OFGroupModVer11
                   return OFGroupModVer11.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFMessageVer11: " + type);
            }
        }
    }
}
