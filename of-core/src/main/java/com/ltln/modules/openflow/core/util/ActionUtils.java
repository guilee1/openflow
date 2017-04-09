package com.ltln.modules.openflow.core.util;

import java.util.List;


import com.google.common.collect.ImmutableList;
import com.ltln.modules.openflow.core.protocol.OFFlowMod;
import com.ltln.modules.openflow.core.protocol.OFFlowStatsEntry;
import com.ltln.modules.openflow.core.protocol.OFInstructionType;
import com.ltln.modules.openflow.core.protocol.OFVersion;
import com.ltln.modules.openflow.core.protocol.action.OFAction;
import com.ltln.modules.openflow.core.protocol.instruction.OFInstruction;
import com.ltln.modules.openflow.core.protocol.instruction.OFInstructionApplyActions;

public class ActionUtils {
    private ActionUtils() {}

    public static List<OFAction> getActions(OFFlowStatsEntry e) {
        if(e.getVersion() == OFVersion.OF_10) {
            return e.getActions();
        } else {
            for(OFInstruction i: e.getInstructions()) {
                if(i.getType() == OFInstructionType.APPLY_ACTIONS) {
                    return ((OFInstructionApplyActions) i).getActions();
                }
            }
            return ImmutableList.of();
        }
    }

    public static List<OFAction> getActions(OFFlowMod e) {
        if(e.getVersion() == OFVersion.OF_10) {
            return e.getActions();
        } else {
            for(OFInstruction i: e.getInstructions()) {
                if(i.getType() == OFInstructionType.APPLY_ACTIONS) {
                    return ((OFInstructionApplyActions) i).getActions();
                }
            }
            return ImmutableList.of();
        }
    }
}
