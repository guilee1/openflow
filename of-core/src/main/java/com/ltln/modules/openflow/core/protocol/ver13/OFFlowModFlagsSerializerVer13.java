// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver13;

import java.util.Set;
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

import java.util.EnumSet;
import java.util.Collections;


public class OFFlowModFlagsSerializerVer13 {

    public final static short SEND_FLOW_REM_VAL = (short) 0x1;
    public final static short CHECK_OVERLAP_VAL = (short) 0x2;
    public final static short RESET_COUNTS_VAL = (short) 0x4;
    public final static short NO_PKT_COUNTS_VAL = (short) 0x8;
    public final static short NO_BYT_COUNTS_VAL = (short) 0x10;
    public final static short BSN_SEND_IDLE_VAL = (short) 0x80;

    public static Set<OFFlowModFlags> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFFlowModFlags> set) {
        bb.writeShort(toWireValue(set));
    }

    public static void putTo(Set<OFFlowModFlags> set, PrimitiveSink sink) {
        sink.putShort(toWireValue(set));
    }


    public static Set<OFFlowModFlags> ofWireValue(short val) {
        EnumSet<OFFlowModFlags> set = EnumSet.noneOf(OFFlowModFlags.class);

        if((val & SEND_FLOW_REM_VAL) != 0)
            set.add(OFFlowModFlags.SEND_FLOW_REM);
        if((val & CHECK_OVERLAP_VAL) != 0)
            set.add(OFFlowModFlags.CHECK_OVERLAP);
        if((val & RESET_COUNTS_VAL) != 0)
            set.add(OFFlowModFlags.RESET_COUNTS);
        if((val & NO_PKT_COUNTS_VAL) != 0)
            set.add(OFFlowModFlags.NO_PKT_COUNTS);
        if((val & NO_BYT_COUNTS_VAL) != 0)
            set.add(OFFlowModFlags.NO_BYT_COUNTS);
        if((val & BSN_SEND_IDLE_VAL) != 0)
            set.add(OFFlowModFlags.BSN_SEND_IDLE);
        return Collections.unmodifiableSet(set);
    }

    public static short toWireValue(Set<OFFlowModFlags> set) {
        short wireValue = 0;

        for(OFFlowModFlags e: set) {
            switch(e) {
                case SEND_FLOW_REM:
                    wireValue |= SEND_FLOW_REM_VAL;
                    break;
                case CHECK_OVERLAP:
                    wireValue |= CHECK_OVERLAP_VAL;
                    break;
                case RESET_COUNTS:
                    wireValue |= RESET_COUNTS_VAL;
                    break;
                case NO_PKT_COUNTS:
                    wireValue |= NO_PKT_COUNTS_VAL;
                    break;
                case NO_BYT_COUNTS:
                    wireValue |= NO_BYT_COUNTS_VAL;
                    break;
                case BSN_SEND_IDLE:
                    wireValue |= BSN_SEND_IDLE_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFFlowModFlags in version 1.3: " + e);
            }
        }
        return wireValue;
    }

}
