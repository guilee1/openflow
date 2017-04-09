// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver14;

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

public class OFControllerMaxLenSerializerVer14 {

    public final static short MAX_VAL = (short) 0xffe5;
    public final static short NO_BUFFER_VAL = (short) 0xffff;

    public static OFControllerMaxLen readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFControllerMaxLen e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFControllerMaxLen e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFControllerMaxLen ofWireValue(short val) {
        switch(val) {
            case MAX_VAL:
                return OFControllerMaxLen.MAX;
            case NO_BUFFER_VAL:
                return OFControllerMaxLen.NO_BUFFER;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFControllerMaxLen in version 1.4: " + val);
        }
    }


    public static short toWireValue(OFControllerMaxLen e) {
        switch(e) {
            case MAX:
                return MAX_VAL;
            case NO_BUFFER:
                return NO_BUFFER_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFControllerMaxLen in version 1.4: " + e);
        }
    }

}
