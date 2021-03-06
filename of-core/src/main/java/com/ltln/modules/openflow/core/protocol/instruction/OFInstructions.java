// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_interface.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.instruction;


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

import java.util.List;

public interface OFInstructions {
    // Subfactories

    OFInstructionApplyActions.Builder buildApplyActions() throws UnsupportedOperationException;
    OFInstructionApplyActions applyActions(List<OFAction> actions);
    OFInstructionClearActions clearActions();
    OFInstructionGotoTable.Builder buildGotoTable() throws UnsupportedOperationException;
    OFInstructionGotoTable gotoTable(TableId tableId);
    OFInstructionWriteActions.Builder buildWriteActions() throws UnsupportedOperationException;
    OFInstructionWriteActions writeActions(List<OFAction> actions);
    OFInstructionWriteMetadata.Builder buildWriteMetadata() throws UnsupportedOperationException;
    OFInstructionWriteMetadata writeMetadata(U64 metadata, U64 metadataMask);
    OFInstructionBsnArpOffload bsnArpOffload();
    OFInstructionBsnAutoNegotiation bsnAutoNegotiation();
    OFInstructionBsnDeny bsnDeny();
    OFInstructionBsnDhcpOffload bsnDhcpOffload();
    OFInstructionBsnDisableL3 bsnDisableL3();
    OFInstructionBsnDisableSplitHorizonCheck bsnDisableSplitHorizonCheck();
    OFInstructionBsnDisableSrcMacCheck bsnDisableSrcMacCheck();
    OFInstructionBsnDisableVlanCounters bsnDisableVlanCounters();
    OFInstructionBsnInternalPriority.Builder buildBsnInternalPriority() throws UnsupportedOperationException;
    OFInstructionBsnInternalPriority bsnInternalPriority(long value);
    OFInstructionBsnPacketOfDeath bsnPacketOfDeath();
    OFInstructionBsnPermit bsnPermit();
    OFInstructionBsnPrioritizePdus bsnPrioritizePdus();
    OFInstructionBsnRequireVlanXlate bsnRequireVlanXlate();
    OFInstructionBsnSpanDestination bsnSpanDestination();
    OFInstructionMeter.Builder buildMeter() throws UnsupportedOperationException;
    OFInstructionMeter meter(long meterId);

    OFMessageReader<OFInstruction> getReader();
    OFVersion getVersion();
}
