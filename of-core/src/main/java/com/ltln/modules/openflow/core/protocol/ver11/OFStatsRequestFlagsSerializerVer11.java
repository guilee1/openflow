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


public class OFStatsRequestFlagsSerializerVer11 {


    public static Set<OFStatsRequestFlags> readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, Set<OFStatsRequestFlags> set) {
        bb.writeShort(toWireValue(set));
    }

    public static void putTo(Set<OFStatsRequestFlags> set, PrimitiveSink sink) {
        sink.putShort(toWireValue(set));
    }


    public static Set<OFStatsRequestFlags> ofWireValue(short val) {
        EnumSet<OFStatsRequestFlags> set = EnumSet.noneOf(OFStatsRequestFlags.class);

        return Collections.unmodifiableSet(set);
    }

    public static short toWireValue(Set<OFStatsRequestFlags> set) {
        short wireValue = 0;

        for(OFStatsRequestFlags e: set) {
            switch(e) {
                default:
                    throw new IllegalArgumentException("Illegal enum value for type OFStatsRequestFlags in version 1.1: " + e);
            }
        }
        return wireValue;
    }

}
