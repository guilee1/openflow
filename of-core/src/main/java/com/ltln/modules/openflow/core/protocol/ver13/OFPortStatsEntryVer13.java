// Copyright (c) 2008 The Board of Trustees of The Leland Stanford Junior University
// Copyright (c) 2011, 2012 Open Networking Foundation
// Copyright (c) 2012, 2013 Big Switch Networks, Inc.
// This library was generated by the LoxiGen Compiler.
// See the file LICENSE.txt which should have been included in the source distribution

// Automatically generated by LOXI from template of_class.java
// Do not modify

package com.ltln.modules.openflow.core.protocol.ver13;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import java.util.Set;
import io.netty.buffer.ByteBuf;
import com.google.common.hash.PrimitiveSink;
import com.google.common.hash.Funnel;
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

class OFPortStatsEntryVer13 implements OFPortStatsEntry {
    private static final Logger logger = LoggerFactory.getLogger(OFPortStatsEntryVer13.class);
    // version: 1.3
    final static byte WIRE_VERSION = 4;
    final static int LENGTH = 112;

        private final static OFPort DEFAULT_PORT_NO = OFPort.ANY;
        private final static U64 DEFAULT_RX_PACKETS = U64.ZERO;
        private final static U64 DEFAULT_TX_PACKETS = U64.ZERO;
        private final static U64 DEFAULT_RX_BYTES = U64.ZERO;
        private final static U64 DEFAULT_TX_BYTES = U64.ZERO;
        private final static U64 DEFAULT_RX_DROPPED = U64.ZERO;
        private final static U64 DEFAULT_TX_DROPPED = U64.ZERO;
        private final static U64 DEFAULT_RX_ERRORS = U64.ZERO;
        private final static U64 DEFAULT_TX_ERRORS = U64.ZERO;
        private final static U64 DEFAULT_RX_FRAME_ERR = U64.ZERO;
        private final static U64 DEFAULT_RX_OVER_ERR = U64.ZERO;
        private final static U64 DEFAULT_RX_CRC_ERR = U64.ZERO;
        private final static U64 DEFAULT_COLLISIONS = U64.ZERO;
        private final static long DEFAULT_DURATION_SEC = 0x0L;
        private final static long DEFAULT_DURATION_NSEC = 0x0L;

    // OF message fields
    private final OFPort portNo;
    private final U64 rxPackets;
    private final U64 txPackets;
    private final U64 rxBytes;
    private final U64 txBytes;
    private final U64 rxDropped;
    private final U64 txDropped;
    private final U64 rxErrors;
    private final U64 txErrors;
    private final U64 rxFrameErr;
    private final U64 rxOverErr;
    private final U64 rxCrcErr;
    private final U64 collisions;
    private final long durationSec;
    private final long durationNsec;
//
    // Immutable default instance
    final static OFPortStatsEntryVer13 DEFAULT = new OFPortStatsEntryVer13(
        DEFAULT_PORT_NO, DEFAULT_RX_PACKETS, DEFAULT_TX_PACKETS, DEFAULT_RX_BYTES, DEFAULT_TX_BYTES, DEFAULT_RX_DROPPED, DEFAULT_TX_DROPPED, DEFAULT_RX_ERRORS, DEFAULT_TX_ERRORS, DEFAULT_RX_FRAME_ERR, DEFAULT_RX_OVER_ERR, DEFAULT_RX_CRC_ERR, DEFAULT_COLLISIONS, DEFAULT_DURATION_SEC, DEFAULT_DURATION_NSEC
    );

    // package private constructor - used by readers, builders, and factory
    OFPortStatsEntryVer13(OFPort portNo, U64 rxPackets, U64 txPackets, U64 rxBytes, U64 txBytes, U64 rxDropped, U64 txDropped, U64 rxErrors, U64 txErrors, U64 rxFrameErr, U64 rxOverErr, U64 rxCrcErr, U64 collisions, long durationSec, long durationNsec) {
        if(portNo == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property portNo cannot be null");
        }
        if(rxPackets == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property rxPackets cannot be null");
        }
        if(txPackets == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property txPackets cannot be null");
        }
        if(rxBytes == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property rxBytes cannot be null");
        }
        if(txBytes == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property txBytes cannot be null");
        }
        if(rxDropped == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property rxDropped cannot be null");
        }
        if(txDropped == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property txDropped cannot be null");
        }
        if(rxErrors == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property rxErrors cannot be null");
        }
        if(txErrors == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property txErrors cannot be null");
        }
        if(rxFrameErr == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property rxFrameErr cannot be null");
        }
        if(rxOverErr == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property rxOverErr cannot be null");
        }
        if(rxCrcErr == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property rxCrcErr cannot be null");
        }
        if(collisions == null) {
            throw new NullPointerException("OFPortStatsEntryVer13: property collisions cannot be null");
        }
        this.portNo = portNo;
        this.rxPackets = rxPackets;
        this.txPackets = txPackets;
        this.rxBytes = rxBytes;
        this.txBytes = txBytes;
        this.rxDropped = rxDropped;
        this.txDropped = txDropped;
        this.rxErrors = rxErrors;
        this.txErrors = txErrors;
        this.rxFrameErr = rxFrameErr;
        this.rxOverErr = rxOverErr;
        this.rxCrcErr = rxCrcErr;
        this.collisions = collisions;
        this.durationSec = durationSec;
        this.durationNsec = durationNsec;
    }

    // Accessors for OF message fields
    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public U64 getRxPackets() {
        return rxPackets;
    }

    @Override
    public U64 getTxPackets() {
        return txPackets;
    }

    @Override
    public U64 getRxBytes() {
        return rxBytes;
    }

    @Override
    public U64 getTxBytes() {
        return txBytes;
    }

    @Override
    public U64 getRxDropped() {
        return rxDropped;
    }

    @Override
    public U64 getTxDropped() {
        return txDropped;
    }

    @Override
    public U64 getRxErrors() {
        return rxErrors;
    }

    @Override
    public U64 getTxErrors() {
        return txErrors;
    }

    @Override
    public U64 getRxFrameErr() {
        return rxFrameErr;
    }

    @Override
    public U64 getRxOverErr() {
        return rxOverErr;
    }

    @Override
    public U64 getRxCrcErr() {
        return rxCrcErr;
    }

    @Override
    public U64 getCollisions() {
        return collisions;
    }

    @Override
    public long getDurationSec() {
        return durationSec;
    }

    @Override
    public long getDurationNsec() {
        return durationNsec;
    }

    @Override
    public List<OFPortStatsProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }

    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



    public OFPortStatsEntry.Builder createBuilder() {
        return new BuilderWithParent(this);
    }

    static class BuilderWithParent implements OFPortStatsEntry.Builder {
        final OFPortStatsEntryVer13 parentMessage;

        // OF message fields
        private boolean portNoSet;
        private OFPort portNo;
        private boolean rxPacketsSet;
        private U64 rxPackets;
        private boolean txPacketsSet;
        private U64 txPackets;
        private boolean rxBytesSet;
        private U64 rxBytes;
        private boolean txBytesSet;
        private U64 txBytes;
        private boolean rxDroppedSet;
        private U64 rxDropped;
        private boolean txDroppedSet;
        private U64 txDropped;
        private boolean rxErrorsSet;
        private U64 rxErrors;
        private boolean txErrorsSet;
        private U64 txErrors;
        private boolean rxFrameErrSet;
        private U64 rxFrameErr;
        private boolean rxOverErrSet;
        private U64 rxOverErr;
        private boolean rxCrcErrSet;
        private U64 rxCrcErr;
        private boolean collisionsSet;
        private U64 collisions;
        private boolean durationSecSet;
        private long durationSec;
        private boolean durationNsecSet;
        private long durationNsec;

        BuilderWithParent(OFPortStatsEntryVer13 parentMessage) {
            this.parentMessage = parentMessage;
        }

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPortStatsEntry.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public U64 getRxPackets() {
        return rxPackets;
    }

    @Override
    public OFPortStatsEntry.Builder setRxPackets(U64 rxPackets) {
        this.rxPackets = rxPackets;
        this.rxPacketsSet = true;
        return this;
    }
    @Override
    public U64 getTxPackets() {
        return txPackets;
    }

    @Override
    public OFPortStatsEntry.Builder setTxPackets(U64 txPackets) {
        this.txPackets = txPackets;
        this.txPacketsSet = true;
        return this;
    }
    @Override
    public U64 getRxBytes() {
        return rxBytes;
    }

    @Override
    public OFPortStatsEntry.Builder setRxBytes(U64 rxBytes) {
        this.rxBytes = rxBytes;
        this.rxBytesSet = true;
        return this;
    }
    @Override
    public U64 getTxBytes() {
        return txBytes;
    }

    @Override
    public OFPortStatsEntry.Builder setTxBytes(U64 txBytes) {
        this.txBytes = txBytes;
        this.txBytesSet = true;
        return this;
    }
    @Override
    public U64 getRxDropped() {
        return rxDropped;
    }

    @Override
    public OFPortStatsEntry.Builder setRxDropped(U64 rxDropped) {
        this.rxDropped = rxDropped;
        this.rxDroppedSet = true;
        return this;
    }
    @Override
    public U64 getTxDropped() {
        return txDropped;
    }

    @Override
    public OFPortStatsEntry.Builder setTxDropped(U64 txDropped) {
        this.txDropped = txDropped;
        this.txDroppedSet = true;
        return this;
    }
    @Override
    public U64 getRxErrors() {
        return rxErrors;
    }

    @Override
    public OFPortStatsEntry.Builder setRxErrors(U64 rxErrors) {
        this.rxErrors = rxErrors;
        this.rxErrorsSet = true;
        return this;
    }
    @Override
    public U64 getTxErrors() {
        return txErrors;
    }

    @Override
    public OFPortStatsEntry.Builder setTxErrors(U64 txErrors) {
        this.txErrors = txErrors;
        this.txErrorsSet = true;
        return this;
    }
    @Override
    public U64 getRxFrameErr() {
        return rxFrameErr;
    }

    @Override
    public OFPortStatsEntry.Builder setRxFrameErr(U64 rxFrameErr) {
        this.rxFrameErr = rxFrameErr;
        this.rxFrameErrSet = true;
        return this;
    }
    @Override
    public U64 getRxOverErr() {
        return rxOverErr;
    }

    @Override
    public OFPortStatsEntry.Builder setRxOverErr(U64 rxOverErr) {
        this.rxOverErr = rxOverErr;
        this.rxOverErrSet = true;
        return this;
    }
    @Override
    public U64 getRxCrcErr() {
        return rxCrcErr;
    }

    @Override
    public OFPortStatsEntry.Builder setRxCrcErr(U64 rxCrcErr) {
        this.rxCrcErr = rxCrcErr;
        this.rxCrcErrSet = true;
        return this;
    }
    @Override
    public U64 getCollisions() {
        return collisions;
    }

    @Override
    public OFPortStatsEntry.Builder setCollisions(U64 collisions) {
        this.collisions = collisions;
        this.collisionsSet = true;
        return this;
    }
    @Override
    public long getDurationSec() {
        return durationSec;
    }

    @Override
    public OFPortStatsEntry.Builder setDurationSec(long durationSec) {
        this.durationSec = durationSec;
        this.durationSecSet = true;
        return this;
    }
    @Override
    public long getDurationNsec() {
        return durationNsec;
    }

    @Override
    public OFPortStatsEntry.Builder setDurationNsec(long durationNsec) {
        this.durationNsec = durationNsec;
        this.durationNsecSet = true;
        return this;
    }
    @Override
    public List<OFPortStatsProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }

    @Override
    public OFPortStatsEntry.Builder setProperties(List<OFPortStatsProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }



        @Override
        public OFPortStatsEntry build() {
                OFPort portNo = this.portNoSet ? this.portNo : parentMessage.portNo;
                if(portNo == null)
                    throw new NullPointerException("Property portNo must not be null");
                U64 rxPackets = this.rxPacketsSet ? this.rxPackets : parentMessage.rxPackets;
                if(rxPackets == null)
                    throw new NullPointerException("Property rxPackets must not be null");
                U64 txPackets = this.txPacketsSet ? this.txPackets : parentMessage.txPackets;
                if(txPackets == null)
                    throw new NullPointerException("Property txPackets must not be null");
                U64 rxBytes = this.rxBytesSet ? this.rxBytes : parentMessage.rxBytes;
                if(rxBytes == null)
                    throw new NullPointerException("Property rxBytes must not be null");
                U64 txBytes = this.txBytesSet ? this.txBytes : parentMessage.txBytes;
                if(txBytes == null)
                    throw new NullPointerException("Property txBytes must not be null");
                U64 rxDropped = this.rxDroppedSet ? this.rxDropped : parentMessage.rxDropped;
                if(rxDropped == null)
                    throw new NullPointerException("Property rxDropped must not be null");
                U64 txDropped = this.txDroppedSet ? this.txDropped : parentMessage.txDropped;
                if(txDropped == null)
                    throw new NullPointerException("Property txDropped must not be null");
                U64 rxErrors = this.rxErrorsSet ? this.rxErrors : parentMessage.rxErrors;
                if(rxErrors == null)
                    throw new NullPointerException("Property rxErrors must not be null");
                U64 txErrors = this.txErrorsSet ? this.txErrors : parentMessage.txErrors;
                if(txErrors == null)
                    throw new NullPointerException("Property txErrors must not be null");
                U64 rxFrameErr = this.rxFrameErrSet ? this.rxFrameErr : parentMessage.rxFrameErr;
                if(rxFrameErr == null)
                    throw new NullPointerException("Property rxFrameErr must not be null");
                U64 rxOverErr = this.rxOverErrSet ? this.rxOverErr : parentMessage.rxOverErr;
                if(rxOverErr == null)
                    throw new NullPointerException("Property rxOverErr must not be null");
                U64 rxCrcErr = this.rxCrcErrSet ? this.rxCrcErr : parentMessage.rxCrcErr;
                if(rxCrcErr == null)
                    throw new NullPointerException("Property rxCrcErr must not be null");
                U64 collisions = this.collisionsSet ? this.collisions : parentMessage.collisions;
                if(collisions == null)
                    throw new NullPointerException("Property collisions must not be null");
                long durationSec = this.durationSecSet ? this.durationSec : parentMessage.durationSec;
                long durationNsec = this.durationNsecSet ? this.durationNsec : parentMessage.durationNsec;

                //
                return new OFPortStatsEntryVer13(
                    portNo,
                    rxPackets,
                    txPackets,
                    rxBytes,
                    txBytes,
                    rxDropped,
                    txDropped,
                    rxErrors,
                    txErrors,
                    rxFrameErr,
                    rxOverErr,
                    rxCrcErr,
                    collisions,
                    durationSec,
                    durationNsec
                );
        }

    }

    static class Builder implements OFPortStatsEntry.Builder {
        // OF message fields
        private boolean portNoSet;
        private OFPort portNo;
        private boolean rxPacketsSet;
        private U64 rxPackets;
        private boolean txPacketsSet;
        private U64 txPackets;
        private boolean rxBytesSet;
        private U64 rxBytes;
        private boolean txBytesSet;
        private U64 txBytes;
        private boolean rxDroppedSet;
        private U64 rxDropped;
        private boolean txDroppedSet;
        private U64 txDropped;
        private boolean rxErrorsSet;
        private U64 rxErrors;
        private boolean txErrorsSet;
        private U64 txErrors;
        private boolean rxFrameErrSet;
        private U64 rxFrameErr;
        private boolean rxOverErrSet;
        private U64 rxOverErr;
        private boolean rxCrcErrSet;
        private U64 rxCrcErr;
        private boolean collisionsSet;
        private U64 collisions;
        private boolean durationSecSet;
        private long durationSec;
        private boolean durationNsecSet;
        private long durationNsec;

    @Override
    public OFPort getPortNo() {
        return portNo;
    }

    @Override
    public OFPortStatsEntry.Builder setPortNo(OFPort portNo) {
        this.portNo = portNo;
        this.portNoSet = true;
        return this;
    }
    @Override
    public U64 getRxPackets() {
        return rxPackets;
    }

    @Override
    public OFPortStatsEntry.Builder setRxPackets(U64 rxPackets) {
        this.rxPackets = rxPackets;
        this.rxPacketsSet = true;
        return this;
    }
    @Override
    public U64 getTxPackets() {
        return txPackets;
    }

    @Override
    public OFPortStatsEntry.Builder setTxPackets(U64 txPackets) {
        this.txPackets = txPackets;
        this.txPacketsSet = true;
        return this;
    }
    @Override
    public U64 getRxBytes() {
        return rxBytes;
    }

    @Override
    public OFPortStatsEntry.Builder setRxBytes(U64 rxBytes) {
        this.rxBytes = rxBytes;
        this.rxBytesSet = true;
        return this;
    }
    @Override
    public U64 getTxBytes() {
        return txBytes;
    }

    @Override
    public OFPortStatsEntry.Builder setTxBytes(U64 txBytes) {
        this.txBytes = txBytes;
        this.txBytesSet = true;
        return this;
    }
    @Override
    public U64 getRxDropped() {
        return rxDropped;
    }

    @Override
    public OFPortStatsEntry.Builder setRxDropped(U64 rxDropped) {
        this.rxDropped = rxDropped;
        this.rxDroppedSet = true;
        return this;
    }
    @Override
    public U64 getTxDropped() {
        return txDropped;
    }

    @Override
    public OFPortStatsEntry.Builder setTxDropped(U64 txDropped) {
        this.txDropped = txDropped;
        this.txDroppedSet = true;
        return this;
    }
    @Override
    public U64 getRxErrors() {
        return rxErrors;
    }

    @Override
    public OFPortStatsEntry.Builder setRxErrors(U64 rxErrors) {
        this.rxErrors = rxErrors;
        this.rxErrorsSet = true;
        return this;
    }
    @Override
    public U64 getTxErrors() {
        return txErrors;
    }

    @Override
    public OFPortStatsEntry.Builder setTxErrors(U64 txErrors) {
        this.txErrors = txErrors;
        this.txErrorsSet = true;
        return this;
    }
    @Override
    public U64 getRxFrameErr() {
        return rxFrameErr;
    }

    @Override
    public OFPortStatsEntry.Builder setRxFrameErr(U64 rxFrameErr) {
        this.rxFrameErr = rxFrameErr;
        this.rxFrameErrSet = true;
        return this;
    }
    @Override
    public U64 getRxOverErr() {
        return rxOverErr;
    }

    @Override
    public OFPortStatsEntry.Builder setRxOverErr(U64 rxOverErr) {
        this.rxOverErr = rxOverErr;
        this.rxOverErrSet = true;
        return this;
    }
    @Override
    public U64 getRxCrcErr() {
        return rxCrcErr;
    }

    @Override
    public OFPortStatsEntry.Builder setRxCrcErr(U64 rxCrcErr) {
        this.rxCrcErr = rxCrcErr;
        this.rxCrcErrSet = true;
        return this;
    }
    @Override
    public U64 getCollisions() {
        return collisions;
    }

    @Override
    public OFPortStatsEntry.Builder setCollisions(U64 collisions) {
        this.collisions = collisions;
        this.collisionsSet = true;
        return this;
    }
    @Override
    public long getDurationSec() {
        return durationSec;
    }

    @Override
    public OFPortStatsEntry.Builder setDurationSec(long durationSec) {
        this.durationSec = durationSec;
        this.durationSecSet = true;
        return this;
    }
    @Override
    public long getDurationNsec() {
        return durationNsec;
    }

    @Override
    public OFPortStatsEntry.Builder setDurationNsec(long durationNsec) {
        this.durationNsec = durationNsec;
        this.durationNsecSet = true;
        return this;
    }
    @Override
    public List<OFPortStatsProp> getProperties()throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }

    @Override
    public OFPortStatsEntry.Builder setProperties(List<OFPortStatsProp> properties) throws UnsupportedOperationException {
            throw new UnsupportedOperationException("Property properties not supported in version 1.3");
    }
    @Override
    public OFVersion getVersion() {
        return OFVersion.OF_13;
    }

//
        @Override
        public OFPortStatsEntry build() {
            OFPort portNo = this.portNoSet ? this.portNo : DEFAULT_PORT_NO;
            if(portNo == null)
                throw new NullPointerException("Property portNo must not be null");
            U64 rxPackets = this.rxPacketsSet ? this.rxPackets : DEFAULT_RX_PACKETS;
            if(rxPackets == null)
                throw new NullPointerException("Property rxPackets must not be null");
            U64 txPackets = this.txPacketsSet ? this.txPackets : DEFAULT_TX_PACKETS;
            if(txPackets == null)
                throw new NullPointerException("Property txPackets must not be null");
            U64 rxBytes = this.rxBytesSet ? this.rxBytes : DEFAULT_RX_BYTES;
            if(rxBytes == null)
                throw new NullPointerException("Property rxBytes must not be null");
            U64 txBytes = this.txBytesSet ? this.txBytes : DEFAULT_TX_BYTES;
            if(txBytes == null)
                throw new NullPointerException("Property txBytes must not be null");
            U64 rxDropped = this.rxDroppedSet ? this.rxDropped : DEFAULT_RX_DROPPED;
            if(rxDropped == null)
                throw new NullPointerException("Property rxDropped must not be null");
            U64 txDropped = this.txDroppedSet ? this.txDropped : DEFAULT_TX_DROPPED;
            if(txDropped == null)
                throw new NullPointerException("Property txDropped must not be null");
            U64 rxErrors = this.rxErrorsSet ? this.rxErrors : DEFAULT_RX_ERRORS;
            if(rxErrors == null)
                throw new NullPointerException("Property rxErrors must not be null");
            U64 txErrors = this.txErrorsSet ? this.txErrors : DEFAULT_TX_ERRORS;
            if(txErrors == null)
                throw new NullPointerException("Property txErrors must not be null");
            U64 rxFrameErr = this.rxFrameErrSet ? this.rxFrameErr : DEFAULT_RX_FRAME_ERR;
            if(rxFrameErr == null)
                throw new NullPointerException("Property rxFrameErr must not be null");
            U64 rxOverErr = this.rxOverErrSet ? this.rxOverErr : DEFAULT_RX_OVER_ERR;
            if(rxOverErr == null)
                throw new NullPointerException("Property rxOverErr must not be null");
            U64 rxCrcErr = this.rxCrcErrSet ? this.rxCrcErr : DEFAULT_RX_CRC_ERR;
            if(rxCrcErr == null)
                throw new NullPointerException("Property rxCrcErr must not be null");
            U64 collisions = this.collisionsSet ? this.collisions : DEFAULT_COLLISIONS;
            if(collisions == null)
                throw new NullPointerException("Property collisions must not be null");
            long durationSec = this.durationSecSet ? this.durationSec : DEFAULT_DURATION_SEC;
            long durationNsec = this.durationNsecSet ? this.durationNsec : DEFAULT_DURATION_NSEC;


            return new OFPortStatsEntryVer13(
                    portNo,
                    rxPackets,
                    txPackets,
                    rxBytes,
                    txBytes,
                    rxDropped,
                    txDropped,
                    rxErrors,
                    txErrors,
                    rxFrameErr,
                    rxOverErr,
                    rxCrcErr,
                    collisions,
                    durationSec,
                    durationNsec
                );
        }

    }


    final static Reader READER = new Reader();
    static class Reader implements OFMessageReader<OFPortStatsEntry> {
        @Override
        public OFPortStatsEntry readFrom(ByteBuf bb) throws OFParseError {
            OFPort portNo = OFPort.read4Bytes(bb);
            // pad: 4 bytes
            bb.skipBytes(4);
            U64 rxPackets = U64.ofRaw(bb.readLong());
            U64 txPackets = U64.ofRaw(bb.readLong());
            U64 rxBytes = U64.ofRaw(bb.readLong());
            U64 txBytes = U64.ofRaw(bb.readLong());
            U64 rxDropped = U64.ofRaw(bb.readLong());
            U64 txDropped = U64.ofRaw(bb.readLong());
            U64 rxErrors = U64.ofRaw(bb.readLong());
            U64 txErrors = U64.ofRaw(bb.readLong());
            U64 rxFrameErr = U64.ofRaw(bb.readLong());
            U64 rxOverErr = U64.ofRaw(bb.readLong());
            U64 rxCrcErr = U64.ofRaw(bb.readLong());
            U64 collisions = U64.ofRaw(bb.readLong());
            long durationSec = U32.f(bb.readInt());
            long durationNsec = U32.f(bb.readInt());

            OFPortStatsEntryVer13 portStatsEntryVer13 = new OFPortStatsEntryVer13(
                    portNo,
                      rxPackets,
                      txPackets,
                      rxBytes,
                      txBytes,
                      rxDropped,
                      txDropped,
                      rxErrors,
                      txErrors,
                      rxFrameErr,
                      rxOverErr,
                      rxCrcErr,
                      collisions,
                      durationSec,
                      durationNsec
                    );
            if(logger.isTraceEnabled())
                logger.trace("readFrom - read={}", portStatsEntryVer13);
            return portStatsEntryVer13;
        }
    }

    public void putTo(PrimitiveSink sink) {
        FUNNEL.funnel(this, sink);
    }

    final static OFPortStatsEntryVer13Funnel FUNNEL = new OFPortStatsEntryVer13Funnel();
    static class OFPortStatsEntryVer13Funnel implements Funnel<OFPortStatsEntryVer13> {
        private static final long serialVersionUID = 1L;
        @Override
        public void funnel(OFPortStatsEntryVer13 message, PrimitiveSink sink) {
            message.portNo.putTo(sink);
            // skip pad (4 bytes)
            message.rxPackets.putTo(sink);
            message.txPackets.putTo(sink);
            message.rxBytes.putTo(sink);
            message.txBytes.putTo(sink);
            message.rxDropped.putTo(sink);
            message.txDropped.putTo(sink);
            message.rxErrors.putTo(sink);
            message.txErrors.putTo(sink);
            message.rxFrameErr.putTo(sink);
            message.rxOverErr.putTo(sink);
            message.rxCrcErr.putTo(sink);
            message.collisions.putTo(sink);
            sink.putLong(message.durationSec);
            sink.putLong(message.durationNsec);
        }
    }


    public void writeTo(ByteBuf bb) {
        WRITER.write(bb, this);
    }

    final static Writer WRITER = new Writer();
    static class Writer implements OFMessageWriter<OFPortStatsEntryVer13> {
        @Override
        public void write(ByteBuf bb, OFPortStatsEntryVer13 message) {
            message.portNo.write4Bytes(bb);
            // pad: 4 bytes
            bb.writeZero(4);
            bb.writeLong(message.rxPackets.getValue());
            bb.writeLong(message.txPackets.getValue());
            bb.writeLong(message.rxBytes.getValue());
            bb.writeLong(message.txBytes.getValue());
            bb.writeLong(message.rxDropped.getValue());
            bb.writeLong(message.txDropped.getValue());
            bb.writeLong(message.rxErrors.getValue());
            bb.writeLong(message.txErrors.getValue());
            bb.writeLong(message.rxFrameErr.getValue());
            bb.writeLong(message.rxOverErr.getValue());
            bb.writeLong(message.rxCrcErr.getValue());
            bb.writeLong(message.collisions.getValue());
            bb.writeInt(U32.t(message.durationSec));
            bb.writeInt(U32.t(message.durationNsec));


        }
    }

    @Override
    public String toString() {
        StringBuilder b = new StringBuilder("OFPortStatsEntryVer13(");
        b.append("portNo=").append(portNo);
        b.append(", ");
        b.append("rxPackets=").append(rxPackets);
        b.append(", ");
        b.append("txPackets=").append(txPackets);
        b.append(", ");
        b.append("rxBytes=").append(rxBytes);
        b.append(", ");
        b.append("txBytes=").append(txBytes);
        b.append(", ");
        b.append("rxDropped=").append(rxDropped);
        b.append(", ");
        b.append("txDropped=").append(txDropped);
        b.append(", ");
        b.append("rxErrors=").append(rxErrors);
        b.append(", ");
        b.append("txErrors=").append(txErrors);
        b.append(", ");
        b.append("rxFrameErr=").append(rxFrameErr);
        b.append(", ");
        b.append("rxOverErr=").append(rxOverErr);
        b.append(", ");
        b.append("rxCrcErr=").append(rxCrcErr);
        b.append(", ");
        b.append("collisions=").append(collisions);
        b.append(", ");
        b.append("durationSec=").append(durationSec);
        b.append(", ");
        b.append("durationNsec=").append(durationNsec);
        b.append(")");
        return b.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        OFPortStatsEntryVer13 other = (OFPortStatsEntryVer13) obj;

        if (portNo == null) {
            if (other.portNo != null)
                return false;
        } else if (!portNo.equals(other.portNo))
            return false;
        if (rxPackets == null) {
            if (other.rxPackets != null)
                return false;
        } else if (!rxPackets.equals(other.rxPackets))
            return false;
        if (txPackets == null) {
            if (other.txPackets != null)
                return false;
        } else if (!txPackets.equals(other.txPackets))
            return false;
        if (rxBytes == null) {
            if (other.rxBytes != null)
                return false;
        } else if (!rxBytes.equals(other.rxBytes))
            return false;
        if (txBytes == null) {
            if (other.txBytes != null)
                return false;
        } else if (!txBytes.equals(other.txBytes))
            return false;
        if (rxDropped == null) {
            if (other.rxDropped != null)
                return false;
        } else if (!rxDropped.equals(other.rxDropped))
            return false;
        if (txDropped == null) {
            if (other.txDropped != null)
                return false;
        } else if (!txDropped.equals(other.txDropped))
            return false;
        if (rxErrors == null) {
            if (other.rxErrors != null)
                return false;
        } else if (!rxErrors.equals(other.rxErrors))
            return false;
        if (txErrors == null) {
            if (other.txErrors != null)
                return false;
        } else if (!txErrors.equals(other.txErrors))
            return false;
        if (rxFrameErr == null) {
            if (other.rxFrameErr != null)
                return false;
        } else if (!rxFrameErr.equals(other.rxFrameErr))
            return false;
        if (rxOverErr == null) {
            if (other.rxOverErr != null)
                return false;
        } else if (!rxOverErr.equals(other.rxOverErr))
            return false;
        if (rxCrcErr == null) {
            if (other.rxCrcErr != null)
                return false;
        } else if (!rxCrcErr.equals(other.rxCrcErr))
            return false;
        if (collisions == null) {
            if (other.collisions != null)
                return false;
        } else if (!collisions.equals(other.collisions))
            return false;
        if( durationSec != other.durationSec)
            return false;
        if( durationNsec != other.durationNsec)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((portNo == null) ? 0 : portNo.hashCode());
        result = prime * result + ((rxPackets == null) ? 0 : rxPackets.hashCode());
        result = prime * result + ((txPackets == null) ? 0 : txPackets.hashCode());
        result = prime * result + ((rxBytes == null) ? 0 : rxBytes.hashCode());
        result = prime * result + ((txBytes == null) ? 0 : txBytes.hashCode());
        result = prime * result + ((rxDropped == null) ? 0 : rxDropped.hashCode());
        result = prime * result + ((txDropped == null) ? 0 : txDropped.hashCode());
        result = prime * result + ((rxErrors == null) ? 0 : rxErrors.hashCode());
        result = prime * result + ((txErrors == null) ? 0 : txErrors.hashCode());
        result = prime * result + ((rxFrameErr == null) ? 0 : rxFrameErr.hashCode());
        result = prime * result + ((rxOverErr == null) ? 0 : rxOverErr.hashCode());
        result = prime * result + ((rxCrcErr == null) ? 0 : rxCrcErr.hashCode());
        result = prime * result + ((collisions == null) ? 0 : collisions.hashCode());
        result = prime *  (int) (durationSec ^ (durationSec >>> 32));
        result = prime *  (int) (durationNsec ^ (durationNsec >>> 32));
        return result;
    }

}
