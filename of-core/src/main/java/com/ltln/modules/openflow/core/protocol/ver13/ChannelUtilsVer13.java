package com.ltln.modules.openflow.core.protocol.ver13;

import io.netty.buffer.ByteBuf;

import com.ltln.modules.openflow.core.exceptions.OFParseError;
import com.ltln.modules.openflow.core.protocol.OFMatchBmap;
import com.ltln.modules.openflow.core.protocol.match.Match;

/**
 * Collection of helper functions for reading and writing into Unpooled
 *
 * @author capveg
 */

public class ChannelUtilsVer13 {
    public static Match readOFMatch(final ByteBuf bb) throws OFParseError {
        return OFMatchV3Ver13.READER.readFrom(bb);
    }

    public static OFMatchBmap readOFMatchBmap(ByteBuf bb) {
        throw new UnsupportedOperationException("not implemented");
    }

    public static void writeOFMatchBmap(ByteBuf bb, OFMatchBmap match) {
        throw new UnsupportedOperationException("not implemented");
    }
}
