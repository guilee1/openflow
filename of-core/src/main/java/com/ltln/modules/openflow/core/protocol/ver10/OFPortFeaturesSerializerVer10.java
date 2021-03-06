// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_set_serializer.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver10;

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


public class OFPortFeaturesSerializerVer10 {

    public final static int PF_10MB_HD_VAL = 0x1;
    public final static int PF_10MB_FD_VAL = 0x2;
    public final static int PF_100MB_HD_VAL = 0x4;
    public final static int PF_100MB_FD_VAL = 0x8;
    public final static int PF_1GB_HD_VAL = 0x10;
    public final static int PF_1GB_FD_VAL = 0x20;
    public final static int PF_10GB_FD_VAL = 0x40;
    public final static int PF_COPPER_VAL = 0x80;
    public final static int PF_FIBER_VAL = 0x100;
    public final static int PF_AUTONEG_VAL = 0x200;
    public final static int PF_PAUSE_VAL = 0x400;
    public final static int PF_PAUSE_ASYM_VAL = 0x800;

    public static Set<OFPortFeatures> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readInt());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFPortFeatures> set) {
        bb.writeInt(toWireValue(set));
    }

    public static void putTo(Set<OFPortFeatures> set, PrimitiveSink sink) {
        sink.putInt(toWireValue(set));
    }


    public static Set<OFPortFeatures> ofWireValue(int val) {
        EnumSet<OFPortFeatures> set = EnumSet.noneOf(OFPortFeatures.class);

        if((val & PF_10MB_HD_VAL) != 0)
            set.add(OFPortFeatures.PF_10MB_HD);
        if((val & PF_10MB_FD_VAL) != 0)
            set.add(OFPortFeatures.PF_10MB_FD);
        if((val & PF_100MB_HD_VAL) != 0)
            set.add(OFPortFeatures.PF_100MB_HD);
        if((val & PF_100MB_FD_VAL) != 0)
            set.add(OFPortFeatures.PF_100MB_FD);
        if((val & PF_1GB_HD_VAL) != 0)
            set.add(OFPortFeatures.PF_1GB_HD);
        if((val & PF_1GB_FD_VAL) != 0)
            set.add(OFPortFeatures.PF_1GB_FD);
        if((val & PF_10GB_FD_VAL) != 0)
            set.add(OFPortFeatures.PF_10GB_FD);
        if((val & PF_COPPER_VAL) != 0)
            set.add(OFPortFeatures.PF_COPPER);
        if((val & PF_FIBER_VAL) != 0)
            set.add(OFPortFeatures.PF_FIBER);
        if((val & PF_AUTONEG_VAL) != 0)
            set.add(OFPortFeatures.PF_AUTONEG);
        if((val & PF_PAUSE_VAL) != 0)
            set.add(OFPortFeatures.PF_PAUSE);
        if((val & PF_PAUSE_ASYM_VAL) != 0)
            set.add(OFPortFeatures.PF_PAUSE_ASYM);
        return Collections.unmodifiableSet(set);
    }

    public static int toWireValue(Set<OFPortFeatures> set) {
        int wireValue = 0;

        for(OFPortFeatures e: set) {
            switch(e) {
                case PF_10MB_HD:
                    wireValue |= PF_10MB_HD_VAL;
                    break;
                case PF_10MB_FD:
                    wireValue |= PF_10MB_FD_VAL;
                    break;
                case PF_100MB_HD:
                    wireValue |= PF_100MB_HD_VAL;
                    break;
                case PF_100MB_FD:
                    wireValue |= PF_100MB_FD_VAL;
                    break;
                case PF_1GB_HD:
                    wireValue |= PF_1GB_HD_VAL;
                    break;
                case PF_1GB_FD:
                    wireValue |= PF_1GB_FD_VAL;
                    break;
                case PF_10GB_FD:
                    wireValue |= PF_10GB_FD_VAL;
                    break;
                case PF_COPPER:
                    wireValue |= PF_COPPER_VAL;
                    break;
                case PF_FIBER:
                    wireValue |= PF_FIBER_VAL;
                    break;
                case PF_AUTONEG:
                    wireValue |= PF_AUTONEG_VAL;
                    break;
                case PF_PAUSE:
                    wireValue |= PF_PAUSE_VAL;
                    break;
                case PF_PAUSE_ASYM:
                    wireValue |= PF_PAUSE_ASYM_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFPortFeatures in version 1.0: " + e);
            }
        }
        return wireValue;
    }

}
