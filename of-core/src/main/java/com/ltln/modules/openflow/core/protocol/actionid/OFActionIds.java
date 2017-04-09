// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_interface.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.actionid;


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

public interface OFActionIds {
    // Subfactories

    OFActionIdBsnChecksum bsnChecksum();
    OFActionIdBsnGentable bsnGentable();
    OFActionIdBsnMirror bsnMirror();
    OFActionIdBsnSetTunnelDst bsnSetTunnelDst();
    OFActionIdCopyTtlIn copyTtlIn();
    OFActionIdCopyTtlOut copyTtlOut();
    OFActionIdDecMplsTtl decMplsTtl();
    OFActionIdDecNwTtl decNwTtl();
    OFActionIdGroup group();
    OFActionIdNiciraDecTtl niciraDecTtl();
    OFActionIdOutput output();
    OFActionIdPopMpls popMpls();
    OFActionIdPopPbb popPbb();
    OFActionIdPopVlan popVlan();
    OFActionIdPushMpls pushMpls();
    OFActionIdPushPbb pushPbb();
    OFActionIdPushVlan pushVlan();
    OFActionIdSetField setField();
    OFActionIdSetMplsTtl setMplsTtl();
    OFActionIdSetNwTtl setNwTtl();
    OFActionIdSetQueue setQueue();

    OFMessageReader<OFActionId> getReader();
    OFVersion getVersion();
}
