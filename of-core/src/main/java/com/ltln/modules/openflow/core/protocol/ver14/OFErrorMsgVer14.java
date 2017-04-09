// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_virtual_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver14;


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

import io.netty.buffer.ByteBuf;

abstract class OFErrorMsgVer14 {
    // version: 1.4
    final static byte WIRE_VERSION = 5;
    final static int MINIMUM_LENGTH = 10;


    public final static OFErrorMsgVer14.Reader READER = new Reader();

    static class Reader implements OFMessageReader<OFErrorMsg> {
        @Override
        public OFErrorMsg readFrom(ByteBuf bb) throws OFParseError {
            if(bb.readableBytes() < MINIMUM_LENGTH)
                return null;
            int start = bb.readerIndex();
            // fixed value property version == 5
            byte version = bb.readByte();
            if(version != (byte) 0x5)
                throw new OFParseError("Wrong version: Expected=OFVersion.OF_14(5), got="+version);
            // fixed value property type == 1
            byte type = bb.readByte();
            if(type != (byte) 0x1)
                throw new OFParseError("Wrong type: Expected=OFType.ERROR(1), got="+type);
            int length = U16.f(bb.readShort());
            if(length < MINIMUM_LENGTH)
                throw new OFParseError("Wrong length: Expected to be >= " + MINIMUM_LENGTH + ", was: " + length);
            U32.f(bb.readInt());
            short errType = bb.readShort();
            bb.readerIndex(start);
            switch(errType) {
               case (short) 0x2:
                   // discriminator value OFErrorType.BAD_ACTION=2 for class OFBadActionErrorMsgVer14
                   return OFBadActionErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x1:
                   // discriminator value OFErrorType.BAD_REQUEST=1 for class OFBadRequestErrorMsgVer14
                   return OFBadRequestErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x5:
                   // discriminator value OFErrorType.FLOW_MOD_FAILED=5 for class OFFlowModFailedErrorMsgVer14
                   return OFFlowModFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x0:
                   // discriminator value OFErrorType.HELLO_FAILED=0 for class OFHelloFailedErrorMsgVer14
                   return OFHelloFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x7:
                   // discriminator value OFErrorType.PORT_MOD_FAILED=7 for class OFPortModFailedErrorMsgVer14
                   return OFPortModFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x9:
                   // discriminator value OFErrorType.QUEUE_OP_FAILED=9 for class OFQueueOpFailedErrorMsgVer14
                   return OFQueueOpFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x3:
                   // discriminator value OFErrorType.BAD_INSTRUCTION=3 for class OFBadInstructionErrorMsgVer14
                   return OFBadInstructionErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x4:
                   // discriminator value OFErrorType.BAD_MATCH=4 for class OFBadMatchErrorMsgVer14
                   return OFBadMatchErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x6:
                   // discriminator value OFErrorType.GROUP_MOD_FAILED=6 for class OFGroupModFailedErrorMsgVer14
                   return OFGroupModFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0xa:
                   // discriminator value OFErrorType.SWITCH_CONFIG_FAILED=10 for class OFSwitchConfigFailedErrorMsgVer14
                   return OFSwitchConfigFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x8:
                   // discriminator value OFErrorType.TABLE_MOD_FAILED=8 for class OFTableModFailedErrorMsgVer14
                   return OFTableModFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0xffff:
                   // discriminator value OFErrorType.EXPERIMENTER=65535 for class OFExperimenterErrorMsgVer14
                   return OFExperimenterErrorMsgVer14.READER.readFrom(bb);
               case (short) 0xb:
                   // discriminator value OFErrorType.ROLE_REQUEST_FAILED=11 for class OFRoleRequestFailedErrorMsgVer14
                   return OFRoleRequestFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0xc:
                   // discriminator value OFErrorType.METER_MOD_FAILED=12 for class OFMeterModFailedErrorMsgVer14
                   return OFMeterModFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0xd:
                   // discriminator value OFErrorType.TABLE_FEATURES_FAILED=13 for class OFTableFeaturesFailedErrorMsgVer14
                   return OFTableFeaturesFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0xf:
                   // discriminator value OFErrorType.ASYNC_CONFIG_FAILED=15 for class OFAsyncConfigFailedErrorMsgVer14
                   return OFAsyncConfigFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0xe:
                   // discriminator value OFErrorType.BAD_PROPERTY=14 for class OFBadPropertyErrorMsgVer14
                   return OFBadPropertyErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x11:
                   // discriminator value OFErrorType.BUNDLE_FAILED=17 for class OFBundleFailedErrorMsgVer14
                   return OFBundleFailedErrorMsgVer14.READER.readFrom(bb);
               case (short) 0x10:
                   // discriminator value OFErrorType.FLOW_MONITOR_FAILED=16 for class OFFlowMonitorFailedErrorMsgVer14
                   return OFFlowMonitorFailedErrorMsgVer14.READER.readFrom(bb);
               default:
                   throw new OFParseError("Unknown value for discriminator errType of class OFErrorMsgVer14: " + errType);
            }
        }
    }
}
