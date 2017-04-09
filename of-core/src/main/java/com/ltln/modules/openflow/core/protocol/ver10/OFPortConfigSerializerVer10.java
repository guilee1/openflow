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


public class OFPortConfigSerializerVer10 {

    public final static int PORT_DOWN_VAL = 0x1;
    public final static int NO_STP_VAL = 0x2;
    public final static int NO_RECV_VAL = 0x4;
    public final static int NO_RECV_STP_VAL = 0x8;
    public final static int NO_FLOOD_VAL = 0x10;
    public final static int NO_FWD_VAL = 0x20;
    public final static int NO_PACKET_IN_VAL = 0x40;
    public final static int BSN_MIRROR_DEST_VAL = (int) 0x80000000;

    public static Set<OFPortConfig> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readInt());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFPortConfig> set) {
        bb.writeInt(toWireValue(set));
    }

    public static void putTo(Set<OFPortConfig> set, PrimitiveSink sink) {
        sink.putInt(toWireValue(set));
    }


    public static Set<OFPortConfig> ofWireValue(int val) {
        EnumSet<OFPortConfig> set = EnumSet.noneOf(OFPortConfig.class);

        if((val & PORT_DOWN_VAL) != 0)
            set.add(OFPortConfig.PORT_DOWN);
        if((val & NO_STP_VAL) != 0)
            set.add(OFPortConfig.NO_STP);
        if((val & NO_RECV_VAL) != 0)
            set.add(OFPortConfig.NO_RECV);
        if((val & NO_RECV_STP_VAL) != 0)
            set.add(OFPortConfig.NO_RECV_STP);
        if((val & NO_FLOOD_VAL) != 0)
            set.add(OFPortConfig.NO_FLOOD);
        if((val & NO_FWD_VAL) != 0)
            set.add(OFPortConfig.NO_FWD);
        if((val & NO_PACKET_IN_VAL) != 0)
            set.add(OFPortConfig.NO_PACKET_IN);
        if((val & BSN_MIRROR_DEST_VAL) != 0)
            set.add(OFPortConfig.BSN_MIRROR_DEST);
        return Collections.unmodifiableSet(set);
    }

    public static int toWireValue(Set<OFPortConfig> set) {
        int wireValue = 0;

        for(OFPortConfig e: set) {
            switch(e) {
                case PORT_DOWN:
                    wireValue |= PORT_DOWN_VAL;
                    break;
                case NO_STP:
                    wireValue |= NO_STP_VAL;
                    break;
                case NO_RECV:
                    wireValue |= NO_RECV_VAL;
                    break;
                case NO_RECV_STP:
                    wireValue |= NO_RECV_STP_VAL;
                    break;
                case NO_FLOOD:
                    wireValue |= NO_FLOOD_VAL;
                    break;
                case NO_FWD:
                    wireValue |= NO_FWD_VAL;
                    break;
                case NO_PACKET_IN:
                    wireValue |= NO_PACKET_IN_VAL;
                    break;
                case BSN_MIRROR_DEST:
                    wireValue |= BSN_MIRROR_DEST_VAL;
                    break;
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFPortConfig in version 1.0: " + e);
            }
        }
        return wireValue;
    }

}