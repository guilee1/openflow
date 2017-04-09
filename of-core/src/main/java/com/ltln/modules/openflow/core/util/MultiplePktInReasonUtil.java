package com.ltln.modules.openflow.core.util;

import java.util.Set;

import com.google.common.collect.ImmutableSet;
import com.ltln.modules.openflow.core.protocol.OFBsnPktinFlag;
import com.ltln.modules.openflow.core.protocol.OFPacketIn;
import com.ltln.modules.openflow.core.protocol.OFVersion;
import com.ltln.modules.openflow.core.protocol.match.Match;
import com.ltln.modules.openflow.core.protocol.match.MatchField;
import com.ltln.modules.openflow.core.protocol.ver13.OFBsnPktinFlagSerializerVer13;
import com.ltln.modules.openflow.core.types.OFMetadata;
import com.ltln.modules.openflow.core.types.U64;



public class MultiplePktInReasonUtil {
    private MultiplePktInReasonUtil() {}

    /**
     * This function is used in BVS T5/6 to decode the multiple packet in
     * reasons in Match.MetaData field.
     * */
    public static Set<OFBsnPktinFlag> getOFBsnPktinFlags(OFPacketIn pktIn) {
        if(pktIn.getVersion().compareTo(OFVersion.OF_13) < 0) {
            throw new IllegalArgumentException("multiple pkt in reasons are "
                                               + "only supported by BVS using "
                                               + "openflow version >= 1.3");
        }

        Match match = pktIn.getMatch();
        if(match == null) {
            return ImmutableSet.<OFBsnPktinFlag>of();
        }
        OFMetadata metaData = match.get(MatchField.METADATA);
        if(metaData == null) {
            return ImmutableSet.<OFBsnPktinFlag>of();
        }
        U64 metaDataValue = metaData.getValue();
        if(metaDataValue == null) {
            return ImmutableSet.<OFBsnPktinFlag>of();
        }
        return OFBsnPktinFlagSerializerVer13.ofWireValue(metaDataValue
                                                               .getValue());
    }
}
