// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver14;

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


public class OFBundleFlagsSerializerVer14 {

    public final static short ATOMIC_VAL = (short) 0x1;
    public final static short ORDERED_VAL = (short) 0x2;

    public static Set<OFBundleFlags> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFBundleFlags> set) {
        bb.writeShort(toWireValue(set));
    }

    public static void putTo(Set<OFBundleFlags> set, PrimitiveSink sink) {
        sink.putShort(toWireValue(set));
    }


    public static Set<OFBundleFlags> ofWireValue(short val) {
        EnumSet<OFBundleFlags> set = EnumSet.noneOf(OFBundleFlags.class);

        if((val & ATOMIC_VAL) != 0)
            set.add(OFBundleFlags.ATOMIC);
        if((val & ORDERED_VAL) != 0)
            set.add(OFBundleFlags.ORDERED);
        return Collections.unmodifiableSet(set);
    }

    public static short toWireValue(Set<OFBundleFlags> set) {
        short wireValue = 0;

        for(OFBundleFlags e: set) {
            switch(e) {
                case ATOMIC:
                    wireValue |= ATOMIC_VAL;
                    break;
                case ORDERED:
                    wireValue |= ORDERED_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFBundleFlags in version 1.4: " + e);
            }
        }
        return wireValue;
    }

}
