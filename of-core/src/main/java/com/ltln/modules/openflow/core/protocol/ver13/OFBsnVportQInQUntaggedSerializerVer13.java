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

public class OFBsnVportQInQUntaggedSerializerVer13 {

    public final static short BSN_VPORT_Q_IN_Q_UNTAGGED_VAL = (short) 0xffff;

    public static OFBsnVportQInQUntagged readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFBsnVportQInQUntagged e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFBsnVportQInQUntagged e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFBsnVportQInQUntagged ofWireValue(short val) {
        switch(val) {
            case BSN_VPORT_Q_IN_Q_UNTAGGED_VAL:
                return OFBsnVportQInQUntagged.BSN_VPORT_Q_IN_Q_UNTAGGED;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBsnVportQInQUntagged in version 1.3: " + val);
        }
    }


    public static short toWireValue(OFBsnVportQInQUntagged e) {
        switch(e) {
            case BSN_VPORT_Q_IN_Q_UNTAGGED:
                return BSN_VPORT_Q_IN_Q_UNTAGGED_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBsnVportQInQUntagged in version 1.3: " + e);
        }
    }

}
