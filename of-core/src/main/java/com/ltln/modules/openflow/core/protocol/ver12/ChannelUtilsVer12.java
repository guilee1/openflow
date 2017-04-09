package com.ltln.modules.openflow.core.protocol.ver12;

import io.netty.buffer.ByteBuf;

import com.ltln.modules.openflow.core.exceptions.OFParseError;
import com.ltln.modules.openflow.core.protocol.OFBsnVportQInQ;
import com.ltln.modules.openflow.core.protocol.OFMatchBmap;
import com.ltln.modules.openflow.core.protocol.match.Match;
import com.ltln.modules.openflow.core.protocol.ver12.OFMatchV3Ver12;

/**
 * Collection of helper functions for reading and writing into Unpooled
 *
 * @author capveg
 */

public class ChannelUtilsVer12 {
    public static Match readOFMatch(final ByteBuf bb) throws OFParseError {
        return OFMatchV3Ver12.READER.readFrom(bb);
    }

    // TODO these need to be figured out / removed

    public static OFBsnVportQInQ readOFBsnVportQInQ(ByteBuf bb) {
        throw new UnsupportedOperationException("not implemented");
    }

    public static void writeOFBsnVportQInQ(ByteBuf bb,
            OFBsnVportQInQ vport) {
        throw new UnsupportedOperationException("not implemented");

    }

    public static OFMatchBmap readOFMatchBmap(ByteBuf bb) {
        throw new UnsupportedOperationException("not implemented");
    }

    public static void writeOFMatchBmap(ByteBuf bb, OFMatchBmap match) {
        throw new UnsupportedOperationException("not implemented");
    }
}
