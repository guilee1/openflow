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

public class OFQueuePropertiesSerializerVer13 {

    public final static short MIN_RATE_VAL = (short) 0x1;
    public final static short MAX_RATE_VAL = (short) 0x2;
    public final static short EXPERIMENTER_VAL = (short) 0xffff;

    public static OFQueueProperties readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFQueueProperties e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFQueueProperties e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFQueueProperties ofWireValue(short val) {
        switch(val) {
            case MIN_RATE_VAL:
                return OFQueueProperties.MIN_RATE;
            case MAX_RATE_VAL:
                return OFQueueProperties.MAX_RATE;
            case EXPERIMENTER_VAL:
                return OFQueueProperties.EXPERIMENTER;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFQueueProperties in version 1.3: " + val);
        }
    }


    public static short toWireValue(OFQueueProperties e) {
        switch(e) {
            case MIN_RATE:
                return MIN_RATE_VAL;
            case MAX_RATE:
                return MAX_RATE_VAL;
            case EXPERIMENTER:
                return EXPERIMENTER_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFQueueProperties in version 1.3: " + e);
        }
    }

}