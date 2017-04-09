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


public class OFGroupCapabilitiesSerializerVer13 {

    public final static int SELECT_WEIGHT_VAL = 0x1;
    public final static int SELECT_LIVENESS_VAL = 0x2;
    public final static int CHAINING_VAL = 0x4;
    public final static int CHAINING_CHECKS_VAL = 0x8;

    public static Set<OFGroupCapabilities> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readInt());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFGroupCapabilities> set) {
        bb.writeInt(toWireValue(set));
    }

    public static void putTo(Set<OFGroupCapabilities> set, PrimitiveSink sink) {
        sink.putInt(toWireValue(set));
    }


    public static Set<OFGroupCapabilities> ofWireValue(int val) {
        EnumSet<OFGroupCapabilities> set = EnumSet.noneOf(OFGroupCapabilities.class);

        if((val & SELECT_WEIGHT_VAL) != 0)
            set.add(OFGroupCapabilities.SELECT_WEIGHT);
        if((val & SELECT_LIVENESS_VAL) != 0)
            set.add(OFGroupCapabilities.SELECT_LIVENESS);
        if((val & CHAINING_VAL) != 0)
            set.add(OFGroupCapabilities.CHAINING);
        if((val & CHAINING_CHECKS_VAL) != 0)
            set.add(OFGroupCapabilities.CHAINING_CHECKS);
        return Collections.unmodifiableSet(set);
    }

    public static int toWireValue(Set<OFGroupCapabilities> set) {
        int wireValue = 0;

        for(OFGroupCapabilities e: set) {
            switch(e) {
                case SELECT_WEIGHT:
                    wireValue |= SELECT_WEIGHT_VAL;
                    break;
                case SELECT_LIVENESS:
                    wireValue |= SELECT_LIVENESS_VAL;
                    break;
                case CHAINING:
                    wireValue |= CHAINING_VAL;
                    break;
                case CHAINING_CHECKS:
                    wireValue |= CHAINING_CHECKS_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFGroupCapabilities in version 1.3: " + e);
            }
        }
        return wireValue;
    }

}