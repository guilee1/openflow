// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver11;

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

public class OFGroupModCommandSerializerVer11 {

    public final static short ADD_VAL = (short) 0x0;
    public final static short MODIFY_VAL = (short) 0x1;
    public final static short DELETE_VAL = (short) 0x2;

    public static OFGroupModCommand readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFGroupModCommand e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFGroupModCommand e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFGroupModCommand ofWireValue(short val) {
        switch(val) {
            case ADD_VAL:
                return OFGroupModCommand.ADD;
            case MODIFY_VAL:
                return OFGroupModCommand.MODIFY;
            case DELETE_VAL:
                return OFGroupModCommand.DELETE;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFGroupModCommand in version 1.1: " + val);
        }
    }


    public static short toWireValue(OFGroupModCommand e) {
        switch(e) {
            case ADD:
                return ADD_VAL;
            case MODIFY:
                return MODIFY_VAL;
            case DELETE:
                return DELETE_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFGroupModCommand in version 1.1: " + e);
        }
    }

}
