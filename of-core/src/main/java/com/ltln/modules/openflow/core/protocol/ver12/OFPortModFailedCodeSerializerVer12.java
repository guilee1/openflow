// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver12;

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

public class OFPortModFailedCodeSerializerVer12 {

    public final static short BAD_PORT_VAL = (short) 0x0;
    public final static short BAD_HW_ADDR_VAL = (short) 0x1;
    public final static short BAD_CONFIG_VAL = (short) 0x2;
    public final static short BAD_ADVERTISE_VAL = (short) 0x3;
    public final static short EPERM_VAL = (short) 0x4;

    public static OFPortModFailedCode readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFPortModFailedCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFPortModFailedCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFPortModFailedCode ofWireValue(short val) {
        switch(val) {
            case BAD_PORT_VAL:
                return OFPortModFailedCode.BAD_PORT;
            case BAD_HW_ADDR_VAL:
                return OFPortModFailedCode.BAD_HW_ADDR;
            case BAD_CONFIG_VAL:
                return OFPortModFailedCode.BAD_CONFIG;
            case BAD_ADVERTISE_VAL:
                return OFPortModFailedCode.BAD_ADVERTISE;
            case EPERM_VAL:
                return OFPortModFailedCode.EPERM;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFPortModFailedCode in version 1.2: " + val);
        }
    }


    public static short toWireValue(OFPortModFailedCode e) {
        switch(e) {
            case BAD_PORT:
                return BAD_PORT_VAL;
            case BAD_HW_ADDR:
                return BAD_HW_ADDR_VAL;
            case BAD_CONFIG:
                return BAD_CONFIG_VAL;
            case BAD_ADVERTISE:
                return BAD_ADVERTISE_VAL;
            case EPERM:
                return EPERM_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFPortModFailedCode in version 1.2: " + e);
        }
    }

}
