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

public interface OFFlowRemoved extends OFObject, OFMessage {
    OFVersion getVersion();
    OFType getType();
    long getXid();
    U64 getCookie();
    int getPriority();
    short getReason();
    TableId getTableId() throws UnsupportedOperationException;
    long getDurationSec();
    long getDurationNsec();
    int getIdleTimeout();
    int getHardTimeout() throws UnsupportedOperationException;
    U64 getPacketCount();
    U64 getByteCount();
    Match getMatch();


    void writeTo(ByteBuf channelBuffer);

    Builder createBuilder();
    public interface Builder extends OFMessage.Builder {
        OFFlowRemoved build();
        OFVersion getVersion();
        OFType getType();
        long getXid();
        Builder setXid(long xid);
        U64 getCookie();
        Builder setCookie(U64 cookie);
        int getPriority();
        Builder setPriority(int priority);
        short getReason();
        Builder setReason(short reason);
        TableId getTableId() throws UnsupportedOperationException;
        Builder setTableId(TableId tableId) throws UnsupportedOperationException;
        long getDurationSec();
        Builder setDurationSec(long durationSec);
        long getDurationNsec();
        Builder setDurationNsec(long durationNsec);
        int getIdleTimeout();
        Builder setIdleTimeout(int idleTimeout);
        int getHardTimeout() throws UnsupportedOperationException;
        Builder setHardTimeout(int hardTimeout) throws UnsupportedOperationException;
        U64 getPacketCount();
        Builder setPacketCount(U64 packetCount);
        U64 getByteCount();
        Builder setByteCount(U64 byteCount);
        Match getMatch();
        Builder setMatch(Match match);
    }
}
