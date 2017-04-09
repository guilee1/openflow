// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver13;


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

abstract class OFInstructionVer13 {
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int MINIMUM_LENGTH = 4;


    public final static OFInstructionVer13.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFInstruction> {
        @Override
        public OFInstruction readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            short type = bb.readShort();
            bb.readerIndex(start);
            switch(type) {
               case (short) 0x4:
                   // discriminator value OFInstructionType.APPLY_ACTIONS=4 for class OFInstructionApplyActionsVer13
                   return OFInstructionApplyActionsVer13.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value OFInstructionType.CLEAR_ACTIONS=5 for class OFInstructionClearActionsVer13
                   return OFInstructionClearActionsVer13.READER.readFrom(bb);
               case (short) 0xffff:
                   // discriminator value OFInstructionType.EXPERIMENTER=65535 for class OFInstructionExperimenterVer13
                   return OFInstructionExperimenterVer13.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value OFInstructionType.GOTO_TABLE=1 for class OFInstructionGotoTableVer13
                   return OFInstructionGotoTableVer13.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value OFInstructionType.WRITE_ACTIONS=3 for class OFInstructionWriteActionsVer13
                   return OFInstructionWriteActionsVer13.READER.readFrom(bb);
               case (short) 0x2:
                   // discriminator value OFInstructionType.WRITE_METADATA=2 for class OFInstructionWriteMetadataVer13
                   return OFInstructionWriteMetadataVer13.READER.readFrom(bb);
               case (short) 0x6:
                   // discriminator value OFInstructionType.METER=6 for class OFInstructionMeterVer13
                   return OFInstructionMeterVer13.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator type of class OFInstructionVer13: " + type);
            }
        }
    }
}
