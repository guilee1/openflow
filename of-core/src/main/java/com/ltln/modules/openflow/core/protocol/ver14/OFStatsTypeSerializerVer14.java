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

public class OFStatsTypeSerializerVer14 {

    public final static short DESC_VAL = (short) 0x0;
    public final static short FLOW_VAL = (short) 0x1;
    public final static short AGGREGATE_VAL = (short) 0x2;
    public final static short TABLE_VAL = (short) 0x3;
    public final static short PORT_VAL = (short) 0x4;
    public final static short QUEUE_VAL = (short) 0x5;
    public final static short GROUP_VAL = (short) 0x6;
    public final static short GROUP_DESC_VAL = (short) 0x7;
    public final static short GROUP_FEATURES_VAL = (short) 0x8;
    public final static short METER_VAL = (short) 0x9;
    public final static short METER_CONFIG_VAL = (short) 0xa;
    public final static short METER_FEATURES_VAL = (short) 0xb;
    public final static short TABLE_FEATURES_VAL = (short) 0xc;
    public final static short PORT_DESC_VAL = (short) 0xd;
    public final static short TABLE_DESC_VAL = (short) 0xe;
    public final static short QUEUE_DESC_VAL = (short) 0xf;
    public final static short FLOW_MONITOR_VAL = (short) 0x10;
    public final static short EXPERIMENTER_VAL = (short) 0xffff;

    public static OFStatsType readFrom(ByteBuf bb) throws OFParseError {
        try {
            return ofWireValue(bb.readShort());
        } catch (IllegalArgumentException e) {
            throw new OFParseError(e);
        }
    }

    public static void writeTo(ByteBuf bb, OFStatsType e) {
        bb.writeShort(toWireValue(e));
    }

    public static void putTo(OFStatsType e, PrimitiveSink sink) {
        sink.putShort(toWireValue(e));
    }

    public static OFStatsType ofWireValue(short val) {
        switch(val) {
            case DESC_VAL:
                return OFStatsType.DESC;
            case FLOW_VAL:
                return OFStatsType.FLOW;
            case AGGREGATE_VAL:
                return OFStatsType.AGGREGATE;
            case TABLE_VAL:
                return OFStatsType.TABLE;
            case PORT_VAL:
                return OFStatsType.PORT;
            case QUEUE_VAL:
                return OFStatsType.QUEUE;
            case GROUP_VAL:
                return OFStatsType.GROUP;
            case GROUP_DESC_VAL:
                return OFStatsType.GROUP_DESC;
            case GROUP_FEATURES_VAL:
                return OFStatsType.GROUP_FEATURES;
            case METER_VAL:
                return OFStatsType.METER;
            case METER_CONFIG_VAL:
                return OFStatsType.METER_CONFIG;
            case METER_FEATURES_VAL:
                return OFStatsType.METER_FEATURES;
            case TABLE_FEATURES_VAL:
                return OFStatsType.TABLE_FEATURES;
            case PORT_DESC_VAL:
                return OFStatsType.PORT_DESC;
            case TABLE_DESC_VAL:
                return OFStatsType.TABLE_DESC;
            case QUEUE_DESC_VAL:
                return OFStatsType.QUEUE_DESC;
            case FLOW_MONITOR_VAL:
                return OFStatsType.FLOW_MONITOR;
            case EXPERIMENTER_VAL:
                return OFStatsType.EXPERIMENTER;
            default:
                throw new IllegalArgumentException("Illegal wire value for type OFStatsType in version 1.4: " + val);
        }
    }


    public static short toWireValue(OFStatsType e) {
        switch(e) {
            case DESC:
                return DESC_VAL;
            case FLOW:
                return FLOW_VAL;
            case AGGREGATE:
                return AGGREGATE_VAL;
            case TABLE:
                return TABLE_VAL;
            case PORT:
                return PORT_VAL;
            case QUEUE:
                return QUEUE_VAL;
            case GROUP:
                return GROUP_VAL;
            case GROUP_DESC:
                return GROUP_DESC_VAL;
            case GROUP_FEATURES:
                return GROUP_FEATURES_VAL;
            case METER:
                return METER_VAL;
            case METER_CONFIG:
                return METER_CONFIG_VAL;
            case METER_FEATURES:
                return METER_FEATURES_VAL;
            case TABLE_FEATURES:
                return TABLE_FEATURES_VAL;
            case PORT_DESC:
                return PORT_DESC_VAL;
            case TABLE_DESC:
                return TABLE_DESC_VAL;
            case QUEUE_DESC:
                return QUEUE_DESC_VAL;
            case FLOW_MONITOR:
                return FLOW_MONITOR_VAL;
            case EXPERIMENTER:
                return EXPERIMENTER_VAL;
            default:
                throw new IllegalArgumentException("Illegal enum value for type OFStatsType in version 1.4: " + e);
        }
    }

}