// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template const_serializer.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver10;

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

public class OFErrorTypeSerializerVer10 {

    public final static short HELLO_FAILED_VAL = (short) 0x0;
    public final static short BAD_REQUEST_VAL = (short) 0x1;
    public final static short BAD_ACTION_VAL = (short) 0x2;
    public final static short FLOW_MOD_FAILED_VAL = (short) 0x3;
    public final static short PORT_MOD_FAILED_VAL = (short) 0x4;
    public final static short QUEUE_OP_FAILED_VAL = (short) 0x5;

    public static OFErrorType readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFErrorType e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFErrorType e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFErrorType ofWireValue(short val) {
        switch(val) {
            case HELLO_FAILED_VAL:
                return OFErrorType.HELLO_FAILED;
            case BAD_REQUEST_VAL:
                return OFErrorType.BAD_REQUEST;
            case BAD_ACTION_VAL:
                return OFErrorType.BAD_ACTION;
            case FLOW_MOD_FAILED_VAL:
                return OFErrorType.FLOW_MOD_FAILED;
            case PORT_MOD_FAILED_VAL:
                return OFErrorType.PORT_MOD_FAILED;
            case QUEUE_OP_FAILED_VAL:
                return OFErrorType.QUEUE_OP_FAILED;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFErrorType in version 1.0: " + val);
        }
    }


    public static short toWireValue(OFErrorType e) {
        switch(e) {
            case HELLO_FAILED:
                return HELLO_FAILED_VAL;
            case BAD_REQUEST:
                return BAD_REQUEST_VAL;
            case BAD_ACTION:
                return BAD_ACTION_VAL;
            case FLOW_MOD_FAILED:
                return FLOW_MOD_FAILED_VAL;
            case PORT_MOD_FAILED:
                return PORT_MOD_FAILED_VAL;
            case QUEUE_OP_FAILED:
                return QUEUE_OP_FAILED_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFErrorType in version 1.0: " + e);
        }
    }

}
