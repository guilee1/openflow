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

abstract class OFInstructionExperimenterVer14 {
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 8;


    public final static OFInstructionExperimenterVer14.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFInstructionExperimenter> {
        @Override
        public OFInstructionExperimenter readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property type == 65535
            short type = bb.readShort();
            if(type != (short) 0xffff)
                throw new OFParseError("Wrong type: Expected=OFInstructionType.EXPERIMENTER(65535), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            int experimenter = bb.readInt();
            bb.readerIndex(start);
            switch(experimenter) {
               case 0x5c16c7:
                   // discriminator value 0x5c16c7L=0x5c16c7L for class OFInstructionBsnVer14
                   return OFInstructionBsnVer14.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator experimenter of class OFInstructionExperimenterVer14: " + experimenter);
            }
        }
    }
}
