package com.ltln.modules.openflow.core.protocol.ver14;

import io.netty.buffer.ByteBuf;

import com.ltln.modules.openflow.core.exceptions.OFParseError;
import com.ltln.modules.openflow.core.protocol.OFMatchBmap;
import com.ltln.modules.openflow.core.protocol.match.Match;

/**
 * Collection of helper functions for reading and writing into ByteBufs
 *
 * @author capveg
 */

public class ChannelUtilsVer14 {
    public static Match readOFMatch(final ByteBuf bb) throws OFParseError {
        return OFMatchV3Ver14.READER.readFrom(bb);
    }

    public static OFMatchBmap readOFMatchBmap(ByteBuf bb) {
        throw new UnsupportedOperationException("not implemented");
    }

    public static void writeOFMatchBmap(ByteBuf bb, OFMatchBmap match) {
        throw new UnsupportedOperationException("not implemented");
    }
}
