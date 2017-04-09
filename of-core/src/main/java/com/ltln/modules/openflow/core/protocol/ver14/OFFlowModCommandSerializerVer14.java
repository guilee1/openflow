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

public class OFFlowModCommandSerializerVer14 {

    public final static byte ADD_VAL = (byte) 0x0;
    public final static byte MODIFY_VAL = (byte) 0x1;
    public final static byte MODIFY_STRICT_VAL = (byte) 0x2;
    public final static byte DELETE_VAL = (byte) 0x3;
    public final static byte DELETE_STRICT_VAL = (byte) 0x4;

    public static OFFlowModCommand readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFFlowModCommand e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFFlowModCommand e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFFlowModCommand ofWireValue(byte val) {
        switch(val) {
            case ADD_VAL:
                return OFFlowModCommand.ADD;
            case MODIFY_VAL:
                return OFFlowModCommand.MODIFY;
            case MODIFY_STRICT_VAL:
                return OFFlowModCommand.MODIFY_STRICT;
            case DELETE_VAL:
                return OFFlowModCommand.DELETE;
            case DELETE_STRICT_VAL:
                return OFFlowModCommand.DELETE_STRICT;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFFlowModCommand in version 1.4: " + val);
        }
    }


    public static byte toWireValue(OFFlowModCommand e) {
        switch(e) {
            case ADD:
                return ADD_VAL;
            case MODIFY:
                return MODIFY_VAL;
            case MODIFY_STRICT:
                return MODIFY_STRICT_VAL;
            case DELETE:
                return DELETE_VAL;
            case DELETE_STRICT:
                return DELETE_STRICT_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFFlowModCommand in version 1.4: " + e);
        }
    }

}
