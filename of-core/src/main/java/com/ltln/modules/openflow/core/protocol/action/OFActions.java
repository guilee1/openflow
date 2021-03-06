// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_interface.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.action;


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

import java.util.Set;
import java.util.List;

public interface OFActions {
    // Subfactories

    OFActionBsnChecksum.Builder buildBsnChecksum();
    OFActionBsnChecksum bsnChecksum(U128 checksum);
    OFActionBsnMirror.Builder buildBsnMirror();
    OFActionBsnSetTunnelDst.Builder buildBsnSetTunnelDst();
    OFActionBsnSetTunnelDst bsnSetTunnelDst(long dst);
    OFActionEnqueue.Builder buildEnqueue() throws UnsupportedOperationException;
    OFActionEnqueue enqueue(OFPort port, long queueId);
    OFActionNiciraDecTtl niciraDecTtl();
    OFActionOutput.Builder buildOutput();
    OFActionOutput output(OFPort port, int maxLen);
    OFActionSetDlDst.Builder buildSetDlDst() throws UnsupportedOperationException;
    OFActionSetDlDst setDlDst(MacAddress dlAddr);
    OFActionSetDlSrc.Builder buildSetDlSrc() throws UnsupportedOperationException;
    OFActionSetDlSrc setDlSrc(MacAddress dlAddr);
    OFActionSetNwDst.Builder buildSetNwDst() throws UnsupportedOperationException;
    OFActionSetNwDst setNwDst(IPv4Address nwAddr);
    OFActionSetNwSrc.Builder buildSetNwSrc() throws UnsupportedOperationException;
    OFActionSetNwSrc setNwSrc(IPv4Address nwAddr);
    OFActionSetNwTos.Builder buildSetNwTos() throws UnsupportedOperationException;
    OFActionSetNwTos setNwTos(short nwTos);
    OFActionSetTpDst.Builder buildSetTpDst() throws UnsupportedOperationException;
    OFActionSetTpDst setTpDst(TransportPort tpPort);
    OFActionSetTpSrc.Builder buildSetTpSrc() throws UnsupportedOperationException;
    OFActionSetTpSrc setTpSrc(TransportPort tpPort);
    OFActionSetVlanPcp.Builder buildSetVlanPcp() throws UnsupportedOperationException;
    OFActionSetVlanPcp setVlanPcp(VlanPcp vlanPcp);
    OFActionSetVlanVid.Builder buildSetVlanVid() throws UnsupportedOperationException;
    OFActionSetVlanVid setVlanVid(VlanVid vlanVid);
    OFActionStripVlan stripVlan();
    OFActionCopyTtlIn copyTtlIn();
    OFActionCopyTtlOut copyTtlOut();
    OFActionDecMplsTtl decMplsTtl();
    OFActionDecNwTtl decNwTtl();
    OFActionGroup.Builder buildGroup() throws UnsupportedOperationException;
    OFActionGroup group(OFGroup group);
    OFActionPopMpls.Builder buildPopMpls() throws UnsupportedOperationException;
    OFActionPopMpls popMpls(EthType ethertype);
    OFActionPopVlan popVlan();
    OFActionPushMpls.Builder buildPushMpls() throws UnsupportedOperationException;
    OFActionPushMpls pushMpls(EthType ethertype);
    OFActionPushVlan.Builder buildPushVlan() throws UnsupportedOperationException;
    OFActionPushVlan pushVlan(EthType ethertype);
    OFActionSetMplsLabel.Builder buildSetMplsLabel() throws UnsupportedOperationException;
    OFActionSetMplsLabel setMplsLabel(long mplsLabel);
    OFActionSetMplsTc.Builder buildSetMplsTc() throws UnsupportedOperationException;
    OFActionSetMplsTc setMplsTc(short mplsTc);
    OFActionSetMplsTtl.Builder buildSetMplsTtl() throws UnsupportedOperationException;
    OFActionSetMplsTtl setMplsTtl(short mplsTtl);
    OFActionSetNwEcn.Builder buildSetNwEcn() throws UnsupportedOperationException;
    OFActionSetNwEcn setNwEcn(IpEcn nwEcn);
    OFActionSetNwTtl.Builder buildSetNwTtl() throws UnsupportedOperationException;
    OFActionSetNwTtl setNwTtl(short nwTtl);
    OFActionSetQueue.Builder buildSetQueue() throws UnsupportedOperationException;
    OFActionSetQueue setQueue(long queueId);
    OFActionSetField.Builder buildSetField() throws UnsupportedOperationException;
    OFActionSetField setField(OFOxm<?> field);
    OFActionBsnGentable.Builder buildBsnGentable() throws UnsupportedOperationException;
    OFActionBsnGentable bsnGentable(long tableId, List<OFBsnTlv> key);
    OFActionPopPbb popPbb();
    OFActionPushPbb.Builder buildPushPbb() throws UnsupportedOperationException;
    OFActionPushPbb pushPbb(EthType ethertype);

    OFMessageReader<OFAction> getReader();
    OFVersion getVersion();
}
