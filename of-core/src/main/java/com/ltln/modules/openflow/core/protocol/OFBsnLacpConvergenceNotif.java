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

import io.netty.buffer.ByteBuf;

public interface OFBsnLacpConvergenceNotif extends OFObject, OFBsnHeader {
    OFVersion getVersion();
    OFType getType();
    long getXid();
    long getExperimenter();
    long getSubtype();
    short getConvergenceStatus();
    OFPort getPortNo();
    int getActorSysPriority();
    MacAddress getActorSysMac();
    int getActorPortPriority();
    int getActorPortNum();
    int getActorKey();
    int getPartnerSysPriority();
    MacAddress getPartnerSysMac();
    int getPartnerPortPriority();
    int getPartnerPortNum();
    int getPartnerKey();


    void writeTo(ByteBuf channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFBsnHeader.Builder {
        OFBsnLacpConvergenceNotif build();
        OFVersion getVersion();
        OFType getType();
        long getXid();
        Builder setXid(long xid);
        long getExperimenter();
        long getSubtype();
        short getConvergenceStatus();
        Builder setConvergenceStatus(short convergenceStatus);
        OFPort getPortNo();
        Builder setPortNo(OFPort portNo);
        int getActorSysPriority();
        Builder setActorSysPriority(int actorSysPriority);
        MacAddress getActorSysMac();
        Builder setActorSysMac(MacAddress actorSysMac);
        int getActorPortPriority();
        Builder setActorPortPriority(int actorPortPriority);
        int getActorPortNum();
        Builder setActorPortNum(int actorPortNum);
        int getActorKey();
        Builder setActorKey(int actorKey);
        int getPartnerSysPriority();
        Builder setPartnerSysPriority(int partnerSysPriority);
        MacAddress getPartnerSysMac();
        Builder setPartnerSysMac(MacAddress partnerSysMac);
        int getPartnerPortPriority();
        Builder setPartnerPortPriority(int partnerPortPriority);
        int getPartnerPortNum();
        Builder setPartnerPortNum(int partnerPortNum);
        int getPartnerKey();
        Builder setPartnerKey(int partnerKey);
    }
}