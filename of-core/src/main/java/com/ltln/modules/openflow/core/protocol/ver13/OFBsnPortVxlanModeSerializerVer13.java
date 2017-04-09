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

public class OFBsnPortVxlanModeSerializerVer13 {

    public final static byte BSN_PORT_VXLAN_RECIRCULATION_ENABLE_VAL = (byte) 0x0;
    public final static byte BSN_PORT_VXLAN_TERMINATION_ENABLE_VAL = (byte) 0x1;

    public static OFBsnPortVxlanMode readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readByte());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFBsnPortVxlanMode e) {
        bb.writeByte(toWireValue(e));
    }

    public static void putTo(OFBsnPortVxlanMode e, PrimitiveSink sink) {
        sink.putByte(toWireValue(e));
    }

    public static OFBsnPortVxlanMode ofWireValue(byte val) {
        switch(val) {
            case BSN_PORT_VXLAN_RECIRCULATION_ENABLE_VAL:
                return OFBsnPortVxlanMode.BSN_PORT_VXLAN_RECIRCULATION_ENABLE;
            case BSN_PORT_VXLAN_TERMINATION_ENABLE_VAL:
                return OFBsnPortVxlanMode.BSN_PORT_VXLAN_TERMINATION_ENABLE;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFBsnPortVxlanMode in version 1.3: " + val);
        }
    }


    public static byte toWireValue(OFBsnPortVxlanMode e) {
        switch(e) {
            case BSN_PORT_VXLAN_RECIRCULATION_ENABLE:
                return BSN_PORT_VXLAN_RECIRCULATION_ENABLE_VAL;
            case BSN_PORT_VXLAN_TERMINATION_ENABLE:
                return BSN_PORT_VXLAN_TERMINATION_ENABLE_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFBsnPortVxlanMode in version 1.3: " + e);
        }
    }

}
