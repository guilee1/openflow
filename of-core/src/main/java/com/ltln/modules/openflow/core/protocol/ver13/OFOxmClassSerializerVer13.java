// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver13;

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

public class OFOxmClassSerializerVer13 {

    public final static short NXM_0_VAL = (short) 0x0;
    public final static short NXM_1_VAL = (short) 0x1;
    public final static short OPENFLOW_BASIC_VAL = (short) 0x8000;
    public final static short EXPERIMENTER_VAL = (short) 0xffff;

    public static OFOxmClass readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFOxmClass e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFOxmClass e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFOxmClass ofWireValue(short val) {
        switch(val) {
            case NXM_0_VAL:
                return OFOxmClass.NXM_0;
            case NXM_1_VAL:
                return OFOxmClass.NXM_1;
            case OPENFLOW_BASIC_VAL:
                return OFOxmClass.OPENFLOW_BASIC;
            case EXPERIMENTER_VAL:
                return OFOxmClass.EXPERIMENTER;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFOxmClass in version 1.3: " + val);
        }
    }


    public static short toWireValue(OFOxmClass e) {
        switch(e) {
            case NXM_0:
                return NXM_0_VAL;
            case NXM_1:
                return NXM_1_VAL;
            case OPENFLOW_BASIC:
                return OPENFLOW_BASIC_VAL;
            case EXPERIMENTER:
                return EXPERIMENTER_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFOxmClass in version 1.3: " + e);
        }
    }

}
