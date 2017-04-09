package com.ltln.modules.openflow.core.util;

import java.util.List;


import com.google.common.hash.PrimitiveSink;
import com.ltln.modules.openflow.core.types.PrimitiveSinkable;

public class FunnelUtils {
    public static void putList(List<? extends PrimitiveSinkable> sinkables, PrimitiveSink sink) {
        for(PrimitiveSinkable p: sinkables)
            p.putTo(sink);
    }
}
