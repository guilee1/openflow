// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver14;


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

abstract class OFActionIdVer14 {
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 4;


    public final static OFActionIdVer14.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFActionId> {
        @Override
        public OFActionId readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            bb.readerIndex(start);
            switch(type) {
               case (short) 0xffff:
                   // discriminator value OFActionType.EXPERIMENTER=65535 for class OFActionIdExperimenterVer14
                   return OFActionIdExperimenterVer14.READER.readFrom(bb);
               case (short) 0xc:
                   // discriminator value OFActionType.COPY_TTL_IN=12 for class OFActionIdCopyTtlInVer14
                   return OFActionIdCopyTtlInVer14.READER.readFrom(bb);
               case (short) 0xb:
                   // discriminator value OFActionType.COPY_TTL_OUT=11 for class OFActionIdCopyTtlOutVer14
                   return OFActionIdCopyTtlOutVer14.READER.readFrom(bb);
               case (short) 0x10:
                   // discriminator value OFActionType.DEC_MPLS_TTL=16 for class OFActionIdDecMplsTtlVer14
                   return OFActionIdDecMplsTtlVer14.READER.readFrom(bb);
               case (short) 0x18:
                   // discriminator value OFActionType.DEC_NW_TTL=24 for class OFActionIdDecNwTtlVer14
                   return OFActionIdDecNwTtlVer14.READER.readFrom(bb);
               case (short) 0x16:
                   // discriminator value OFActionType.GROUP=22 for class OFActionIdGroupVer14
                   return OFActionIdGroupVer14.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value OFActionType.OUTPUT=0 for class OFActionIdOutputVer14
                   return OFActionIdOutputVer14.READER.readFrom(bb);
               case (short) 0x14:
                   // discriminator value OFActionType.POP_MPLS=20 for class OFActionIdPopMplsVer14
                   return OFActionIdPopMplsVer14.READER.readFrom(bb);
               case (short) 0x1b:
                   // discriminator value OFActionType.POP_PBB=27 for class OFActionIdPopPbbVer14
                   return OFActionIdPopPbbVer14.READER.readFrom(bb);
               case (short) 0x12:
                   // discriminator value OFActionType.POP_VLAN=18 for class OFActionIdPopVlanVer14
                   return OFActionIdPopVlanVer14.READER.readFrom(bb);
               case (short) 0x13:
                   // discriminator value OFActionType.PUSH_MPLS=19 for class OFActionIdPushMplsVer14
                   return OFActionIdPushMplsVer14.READER.readFrom(bb);
               case (short) 0x1a:
                   // discriminator value OFActionType.PUSH_PBB=26 for class OFActionIdPushPbbVer14
                   return OFActionIdPushPbbVer14.READER.readFrom(bb);
               case (short) 0x11:
                   // discriminator value OFActionType.PUSH_VLAN=17 for class OFActionIdPushVlanVer14
                   return OFActionIdPushVlanVer14.READER.readFrom(bb);
               case (short) 0x19:
                   // discriminator value OFActionType.SET_FIELD=25 for class OFActionIdSetFieldVer14
                   return OFActionIdSetFieldVer14.READER.readFrom(bb);
               case (short) 0xf:
                   // discriminator value OFActionType.SET_MPLS_TTL=15 for class OFActionIdSetMplsTtlVer14
                   return OFActionIdSetMplsTtlVer14.READER.readFrom(bb);
               case (short) 0x17:
                   // discriminator value OFActionType.SET_NW_TTL=23 for class OFActionIdSetNwTtlVer14
                   return OFActionIdSetNwTtlVer14.READER.readFrom(bb);
               case (short) 0x15:
                   // discriminator value OFActionType.SET_QUEUE=21 for class OFActionIdSetQueueVer14
                   return OFActionIdSetQueueVer14.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFActionIdVer14: " + type);
            }
        }
    }
}
