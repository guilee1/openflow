// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_interface.java
// Do not modify

package com.ltln.modules.openflow.core.protocol;


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
import io.netty.buffer.ByteBuf;

public interface OFFlowDeleteStrict extends OFObject, OFFlowMod {
    OFVersion getVersion();
    OFType getType();
    long getXid();
    U64 getCookie();
    U64 getCookieMask() throws UnsupportedOperationException;
    TableId getTableId() throws UnsupportedOperationException;
    OFFlowModCommand getCommand();
    int getIdleTimeout();
    int getHardTimeout();
    int getPriority();
    OFBufferId getBufferId();
    OFPort getOutPort();
    OFGroup getOutGroup() throws UnsupportedOperationException;
    Set<OFFlowModFlags> getFlags();
    Match getMatch();
    List<OFInstruction> getInstructions() throws UnsupportedOperationException;
    List<OFAction> getActions() throws UnsupportedOperationException;
    int getImportance() throws UnsupportedOperationException;


    void writeTo(ByteBuf channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFFlowMod.Builder {
        OFFlowDeleteStrict build();
        OFVersion getVersion();
        OFType getType();
        long getXid();
        Builder setXid(long xid);
        U64 getCookie();
        Builder setCookie(U64 cookie);
        U64 getCookieMask() throws UnsupportedOperationException;
        Builder setCookieMask(U64 cookieMask) throws UnsupportedOperationException;
        TableId getTableId() throws UnsupportedOperationException;
        Builder setTableId(TableId tableId) throws UnsupportedOperationException;
        OFFlowModCommand getCommand();
        int getIdleTimeout();
        Builder setIdleTimeout(int idleTimeout);
        int getHardTimeout();
        Builder setHardTimeout(int hardTimeout);
        int getPriority();
        Builder setPriority(int priority);
        OFBufferId getBufferId();
        Builder setBufferId(OFBufferId bufferId);
        OFPort getOutPort();
        Builder setOutPort(OFPort outPort);
        OFGroup getOutGroup() throws UnsupportedOperationException;
        Builder setOutGroup(OFGroup outGroup) throws UnsupportedOperationException;
        Set<OFFlowModFlags> getFlags();
        Builder setFlags(Set<OFFlowModFlags> flags);
        Match getMatch();
        Builder setMatch(Match match);
        List<OFInstruction> getInstructions() throws UnsupportedOperationException;
        Builder setInstructions(List<OFInstruction> instructions) throws UnsupportedOperationException;
        List<OFAction> getActions() throws UnsupportedOperationException;
        Builder setActions(List<OFAction> actions) throws UnsupportedOperationException;
        int getImportance() throws UnsupportedOperationException;
        Builder setImportance(int importance) throws UnsupportedOperationException;
    }
}
