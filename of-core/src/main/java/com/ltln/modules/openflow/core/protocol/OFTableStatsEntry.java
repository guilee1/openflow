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
import io.netty.buffer.ByteBuf;

public interface OFTableStatsEntry extends OFObject {
    TableId getTableId();
    String getName() throws UnsupportedOperationException;
    OFMatchBmap getMatch() throws UnsupportedOperationException;
    int getWildcards() throws UnsupportedOperationException;
    long getWriteActions() throws UnsupportedOperationException;
    long getApplyActions() throws UnsupportedOperationException;
    U64 getWriteSetfields() throws UnsupportedOperationException;
    U64 getApplySetfields() throws UnsupportedOperationException;
    U64 getMetadataMatch() throws UnsupportedOperationException;
    U64 getMetadataWrite() throws UnsupportedOperationException;
    long getInstructions() throws UnsupportedOperationException;
    long getConfig() throws UnsupportedOperationException;
    long getMaxEntries() throws UnsupportedOperationException;
    long getActiveCount();
    U64 getLookupCount();
    U64 getMatchedCount();
    OFVersion getVersion();


    void writeTo(ByteBuf channelBuffer);

    Builder createBuilder();
    public interface Builder  {
        OFTableStatsEntry build();
        TableId getTableId();
        Builder setTableId(TableId tableId);
        String getName() throws UnsupportedOperationException;
        Builder setName(String name) throws UnsupportedOperationException;
        OFMatchBmap getMatch() throws UnsupportedOperationException;
        Builder setMatch(OFMatchBmap match) throws UnsupportedOperationException;
        int getWildcards() throws UnsupportedOperationException;
        Builder setWildcards(int wildcards) throws UnsupportedOperationException;
        long getWriteActions() throws UnsupportedOperationException;
        Builder setWriteActions(long writeActions) throws UnsupportedOperationException;
        long getApplyActions() throws UnsupportedOperationException;
        Builder setApplyActions(long applyActions) throws UnsupportedOperationException;
        U64 getWriteSetfields() throws UnsupportedOperationException;
        Builder setWriteSetfields(U64 writeSetfields) throws UnsupportedOperationException;
        U64 getApplySetfields() throws UnsupportedOperationException;
        Builder setApplySetfields(U64 applySetfields) throws UnsupportedOperationException;
        U64 getMetadataMatch() throws UnsupportedOperationException;
        Builder setMetadataMatch(U64 metadataMatch) throws UnsupportedOperationException;
        U64 getMetadataWrite() throws UnsupportedOperationException;
        Builder setMetadataWrite(U64 metadataWrite) throws UnsupportedOperationException;
        long getInstructions() throws UnsupportedOperationException;
        Builder setInstructions(long instructions) throws UnsupportedOperationException;
        long getConfig() throws UnsupportedOperationException;
        Builder setConfig(long config) throws UnsupportedOperationException;
        long getMaxEntries() throws UnsupportedOperationException;
        Builder setMaxEntries(long maxEntries) throws UnsupportedOperationException;
        long getActiveCount();
        Builder setActiveCount(long activeCount);
        U64 getLookupCount();
        Builder setLookupCount(U64 lookupCount);
        U64 getMatchedCount();
        Builder setMatchedCount(U64 matchedCount);
        OFVersion getVersion();
    }
}
