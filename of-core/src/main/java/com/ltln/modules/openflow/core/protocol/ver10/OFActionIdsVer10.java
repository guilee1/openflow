// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_factory_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver10;


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


public class OFActionIdsVer10 implements OFActionIds {
    public final static OFActionIdsVer10 INSTANCE = new OFActionIdsVer10();




    public OFActionIdBsnChecksum bsnChecksum() {
        throw new UnsupportedOperationException("OFActionIdBsnChecksum not supported in version 1.0");
    }

    public OFActionIdBsnGentable bsnGentable() {
        throw new UnsupportedOperationException("OFActionIdBsnGentable not supported in version 1.0");
    }

    public OFActionIdBsnMirror bsnMirror() {
        throw new UnsupportedOperationException("OFActionIdBsnMirror not supported in version 1.0");
    }

    public OFActionIdBsnSetTunnelDst bsnSetTunnelDst() {
        throw new UnsupportedOperationException("OFActionIdBsnSetTunnelDst not supported in version 1.0");
    }

    public OFActionIdCopyTtlIn copyTtlIn() {
        throw new UnsupportedOperationException("OFActionIdCopyTtlIn not supported in version 1.0");
    }

    public OFActionIdCopyTtlOut copyTtlOut() {
        throw new UnsupportedOperationException("OFActionIdCopyTtlOut not supported in version 1.0");
    }

    public OFActionIdDecMplsTtl decMplsTtl() {
        throw new UnsupportedOperationException("OFActionIdDecMplsTtl not supported in version 1.0");
    }

    public OFActionIdDecNwTtl decNwTtl() {
        throw new UnsupportedOperationException("OFActionIdDecNwTtl not supported in version 1.0");
    }

    public OFActionIdGroup group() {
        throw new UnsupportedOperationException("OFActionIdGroup not supported in version 1.0");
    }

    public OFActionIdNiciraDecTtl niciraDecTtl() {
        throw new UnsupportedOperationException("OFActionIdNiciraDecTtl not supported in version 1.0");
    }

    public OFActionIdOutput output() {
        throw new UnsupportedOperationException("OFActionIdOutput not supported in version 1.0");
    }

    public OFActionIdPopMpls popMpls() {
        throw new UnsupportedOperationException("OFActionIdPopMpls not supported in version 1.0");
    }

    public OFActionIdPopPbb popPbb() {
        throw new UnsupportedOperationException("OFActionIdPopPbb not supported in version 1.0");
    }

    public OFActionIdPopVlan popVlan() {
        throw new UnsupportedOperationException("OFActionIdPopVlan not supported in version 1.0");
    }

    public OFActionIdPushMpls pushMpls() {
        throw new UnsupportedOperationException("OFActionIdPushMpls not supported in version 1.0");
    }

    public OFActionIdPushPbb pushPbb() {
        throw new UnsupportedOperationException("OFActionIdPushPbb not supported in version 1.0");
    }

    public OFActionIdPushVlan pushVlan() {
        throw new UnsupportedOperationException("OFActionIdPushVlan not supported in version 1.0");
    }

    public OFActionIdSetField setField() {
        throw new UnsupportedOperationException("OFActionIdSetField not supported in version 1.0");
    }

    public OFActionIdSetMplsTtl setMplsTtl() {
        throw new UnsupportedOperationException("OFActionIdSetMplsTtl not supported in version 1.0");
    }

    public OFActionIdSetNwTtl setNwTtl() {
        throw new UnsupportedOperationException("OFActionIdSetNwTtl not supported in version 1.0");
    }

    public OFActionIdSetQueue setQueue() {
        throw new UnsupportedOperationException("OFActionIdSetQueue not supported in version 1.0");
    }

    public OFMessageReader<OFActionId> getReader() {
        throw new UnsupportedOperationException("Reader<OFActionId> not supported in version 1.0");
    }


    public OFVersion getVersion() {
            return OFVersion.OF_10;
    }
}
