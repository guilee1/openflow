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

public class OFFlowRemovedReasonSerializerVer10 {

    public final static byte IDLE_TIMEOUT_VAL = (byte) 0x0;
    public final static byte HARD_TIMEOUT_VAL = (byte) 0x1;
    public final static byte DELETE_VAL = (byte) 0x2;

    public static OFFlowRemovedReason readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFFlowRemovedReason e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFFlowRemovedReason e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFFlowRemovedReason ofWireValue(byte val) {
        switch(val) {
            case IDLE_TIMEOUT_VAL:
                return OFFlowRemovedReason.IDLE_TIMEOUT;
            case HARD_TIMEOUT_VAL:
                return OFFlowRemovedReason.HARD_TIMEOUT;
            case DELETE_VAL:
                return OFFlowRemovedReason.DELETE;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFFlowRemovedReason in version 1.0: " + val);
        }
    }


    public static byte toWireValue(OFFlowRemovedReason e) {
        switch(e) {
            case IDLE_TIMEOUT:
                return IDLE_TIMEOUT_VAL;
            case HARD_TIMEOUT:
                return HARD_TIMEOUT_VAL;
            case DELETE:
                return DELETE_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFFlowRemovedReason in version 1.0: " + e);
        }
    }

}
