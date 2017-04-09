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

public class OFTableSerializerVer12 {

    public final static byte MAX_VAL = (byte) 0xfe;
    public final static byte ALL_VAL = (byte) 0xff;

    public static OFTable readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFTable e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFTable e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFTable ofWireValue(byte val) {
        switch(val) {
            case MAX_VAL:
                return OFTable.MAX;
            case ALL_VAL:
                return OFTable.ALL;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFTable in version 1.2: " + val);
        }
    }


    public static byte toWireValue(OFTable e) {
        switch(e) {
            case MAX:
                return MAX_VAL;
            case ALL:
                return ALL_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFTable in version 1.2: " + e);
        }
    }

}
