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

public interface OFBsnFlowChecksumBucketStatsReply extends OFObject, OFBsnStatsReply {
    OFVersion getVersion();
    OFType getType();
    long getXid();
    OFStatsType getStatsType();
    Set<OFStatsReplyFlags> getFlags();
    long getExperimenter();
    long getSubtype();
    List<OFBsnFlowChecksumBucketStatsEntry> getEntries();


    void writeTo(ByteBuf channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFBsnStatsReply.Builder {
        OFBsnFlowChecksumBucketStatsReply build();
        OFVersion getVersion();
        OFType getType();
        long getXid();
        Builder setXid(long xid);
        OFStatsType getStatsType();
        Set<OFStatsReplyFlags> getFlags();
        Builder setFlags(Set<OFStatsReplyFlags> flags);
        long getExperimenter();
        long getSubtype();
        List<OFBsnFlowChecksumBucketStatsEntry> getEntries();
        Builder setEntries(List<OFBsnFlowChecksumBucketStatsEntry> entries);
    }
}
