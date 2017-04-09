// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver11;

import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
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

public class OFBadInstructionCodeSerializerVer11 {

    public final static short UNKNOWN_INST_VAL = (short) 0x0;
    public final static short UNSUP_INST_VAL = (short) 0x1;
    public final static short BAD_TABLE_ID_VAL = (short) 0x2;
    public final static short UNSUP_METADATA_VAL = (short) 0x3;
    public final static short UNSUP_METADATA_MASK_VAL = (short) 0x4;
    public final static short UNSUP_EXP_INST_VAL = (short) 0x5;

    public static OFBadInstructionCode readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFBadInstructionCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFBadInstructionCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFBadInstructionCode ofWireValue(short val) {
        switch(val) {
            case UNKNOWN_INST_VAL:
                return OFBadInstructionCode.UNKNOWN_INST;
            case UNSUP_INST_VAL:
                return OFBadInstructionCode.UNSUP_INST;
            case BAD_TABLE_ID_VAL:
                return OFBadInstructionCode.BAD_TABLE_ID;
            case UNSUP_METADATA_VAL:
                return OFBadInstructionCode.UNSUP_METADATA;
            case UNSUP_METADATA_MASK_VAL:
                return OFBadInstructionCode.UNSUP_METADATA_MASK;
            case UNSUP_EXP_INST_VAL:
                return OFBadInstructionCode.UNSUP_EXP_INST;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBadInstructionCode in version 1.1: " + val);
        }
    }


    public static short toWireValue(OFBadInstructionCode e) {
        switch(e) {
            case UNKNOWN_INST:
                return UNKNOWN_INST_VAL;
            case UNSUP_INST:
                return UNSUP_INST_VAL;
            case BAD_TABLE_ID:
                return BAD_TABLE_ID_VAL;
            case UNSUP_METADATA:
                return UNSUP_METADATA_VAL;
            case UNSUP_METADATA_MASK:
                return UNSUP_METADATA_MASK_VAL;
            case UNSUP_EXP_INST:
                return UNSUP_EXP_INST_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBadInstructionCode in version 1.1: " + e);
        }
    }

}
