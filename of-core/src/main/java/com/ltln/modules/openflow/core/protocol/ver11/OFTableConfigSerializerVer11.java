// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver11;

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


public class OFTableConfigSerializerVer11 {

    public final static int TABLE_MISS_CONTROLLER_VAL = 0x0;
    public final static int TABLE_MISS_CONTINUE_VAL = 0x1;
    public final static int TABLE_MISS_DROP_VAL = 0x2;
    public final static int TABLE_MISS_MASK_VAL = 0x3;

    public static Set<OFTableConfig> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readInt());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFTableConfig> set) {
        bb.writeInt(toWireValue(set));
    }

    public static void putTo(Set<OFTableConfig> set, PrimitiveSink sink) {
        sink.putInt(toWireValue(set));
    }


    public static Set<OFTableConfig> ofWireValue(int val) {
        EnumSet<OFTableConfig> set = EnumSet.noneOf(OFTableConfig.class);

        if((val & TABLE_MISS_MASK_VAL) == TABLE_MISS_CONTROLLER_VAL)
            set.add(OFTableConfig.TABLE_MISS_CONTROLLER);
        else if((val & TABLE_MISS_MASK_VAL) == TABLE_MISS_CONTINUE_VAL)
            set.add(OFTableConfig.TABLE_MISS_CONTINUE);
        else if((val & TABLE_MISS_MASK_VAL) == TABLE_MISS_DROP_VAL)
            set.add(OFTableConfig.TABLE_MISS_DROP);
        return Collections.unmodifiableSet(set);
    }

    public static int toWireValue(Set<OFTableConfig> set) {
        int wireValue = 0;

        for(OFTableConfig e: set) {
            switch(e) {
                case TABLE_MISS_CONTROLLER:
                    wireValue |= TABLE_MISS_CONTROLLER_VAL;
                    break;
                case TABLE_MISS_CONTINUE:
                    wireValue |= TABLE_MISS_CONTINUE_VAL;
                    break;
                case TABLE_MISS_DROP:
                    wireValue |= TABLE_MISS_DROP_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFTableConfig in version 1.1: " + e);
            }
        }
        return wireValue;
    }

}
