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

public class OFSwitchConfigFailedCodeSerializerVer12 {

    public final static short BAD_FLAGS_VAL = (short) 0x0;
    public final static short BAD_LEN_VAL = (short) 0x1;
    public final static short EPERM_VAL = (short) 0x2;

    public static OFSwitchConfigFailedCode readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFSwitchConfigFailedCode e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFSwitchConfigFailedCode e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFSwitchConfigFailedCode ofWireValue(short val) {
        switch(val) {
            case BAD_FLAGS_VAL:
                return OFSwitchConfigFailedCode.BAD_FLAGS;
            case BAD_LEN_VAL:
                return OFSwitchConfigFailedCode.BAD_LEN;
            case EPERM_VAL:
                return OFSwitchConfigFailedCode.EPERM;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFSwitchConfigFailedCode in version 1.2: " + val);
        }
    }


    public static short toWireValue(OFSwitchConfigFailedCode e) {
        switch(e) {
            case BAD_FLAGS:
                return BAD_FLAGS_VAL;
            case BAD_LEN:
                return BAD_LEN_VAL;
            case EPERM:
                return EPERM_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFSwitchConfigFailedCode in version 1.2: " + e);
        }
    }

}
