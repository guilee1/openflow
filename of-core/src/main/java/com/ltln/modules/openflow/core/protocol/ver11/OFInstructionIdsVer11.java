// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver11;


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


public class OFInstructionIdsVer11 implements OFInstructionIds {
    public final static OFInstructionIdsVer11 INSTANCE = new OFInstructionIdsVer11();




    public OFInstructionIdApplyActions applyActions() {
        throw new UnsupportedOperationException("OFInstructionIdApplyActions not supported in version 1.1");
    }

    public OFInstructionIdBsnArpOffload bsnArpOffload() {
        throw new UnsupportedOperationException("OFInstructionIdBsnArpOffload not supported in version 1.1");
    }

    public OFInstructionIdBsnAutoNegotiation bsnAutoNegotiation() {
        throw new UnsupportedOperationException("OFInstructionIdBsnAutoNegotiation not supported in version 1.1");
    }

    public OFInstructionIdBsnDeny bsnDeny() {
        throw new UnsupportedOperationException("OFInstructionIdBsnDeny not supported in version 1.1");
    }

    public OFInstructionIdBsnDhcpOffload bsnDhcpOffload() {
        throw new UnsupportedOperationException("OFInstructionIdBsnDhcpOffload not supported in version 1.1");
    }

    public OFInstructionIdBsnDisableL3 bsnDisableL3() {
        throw new UnsupportedOperationException("OFInstructionIdBsnDisableL3 not supported in version 1.1");
    }

    public OFInstructionIdBsnDisableSplitHorizonCheck bsnDisableSplitHorizonCheck() {
        throw new UnsupportedOperationException("OFInstructionIdBsnDisableSplitHorizonCheck not supported in version 1.1");
    }

    public OFInstructionIdBsnDisableSrcMacCheck bsnDisableSrcMacCheck() {
        throw new UnsupportedOperationException("OFInstructionIdBsnDisableSrcMacCheck not supported in version 1.1");
    }

    public OFInstructionIdBsnDisableVlanCounters bsnDisableVlanCounters() {
        throw new UnsupportedOperationException("OFInstructionIdBsnDisableVlanCounters not supported in version 1.1");
    }

    public OFInstructionIdBsnInternalPriority bsnInternalPriority() {
        throw new UnsupportedOperationException("OFInstructionIdBsnInternalPriority not supported in version 1.1");
    }

    public OFInstructionIdBsnPacketOfDeath bsnPacketOfDeath() {
        throw new UnsupportedOperationException("OFInstructionIdBsnPacketOfDeath not supported in version 1.1");
    }

    public OFInstructionIdBsnPermit bsnPermit() {
        throw new UnsupportedOperationException("OFInstructionIdBsnPermit not supported in version 1.1");
    }

    public OFInstructionIdBsnPrioritizePdus bsnPrioritizePdus() {
        throw new UnsupportedOperationException("OFInstructionIdBsnPrioritizePdus not supported in version 1.1");
    }

    public OFInstructionIdBsnRequireVlanXlate bsnRequireVlanXlate() {
        throw new UnsupportedOperationException("OFInstructionIdBsnRequireVlanXlate not supported in version 1.1");
    }

    public OFInstructionIdBsnSpanDestination bsnSpanDestination() {
        throw new UnsupportedOperationException("OFInstructionIdBsnSpanDestination not supported in version 1.1");
    }

    public OFInstructionIdClearActions clearActions() {
        throw new UnsupportedOperationException("OFInstructionIdClearActions not supported in version 1.1");
    }

    public OFInstructionIdGotoTable gotoTable() {
        throw new UnsupportedOperationException("OFInstructionIdGotoTable not supported in version 1.1");
    }

    public OFInstructionIdMeter meter() {
        throw new UnsupportedOperationException("OFInstructionIdMeter not supported in version 1.1");
    }

    public OFInstructionIdWriteActions writeActions() {
        throw new UnsupportedOperationException("OFInstructionIdWriteActions not supported in version 1.1");
    }

    public OFInstructionIdWriteMetadata writeMetadata() {
        throw new UnsupportedOperationException("OFInstructionIdWriteMetadata not supported in version 1.1");
    }

    public OFMessageReader<OFInstructionId> getReader() {
        throw new UnsupportedOperationException("Reader<OFInstructionId> not supported in version 1.1");
    }


    public OFVersion getVersion() {
            return OFVersion.OF_11;
    }
}
