package com.ltln.modules.openflow.core.types;

import com.google.common.hash.PrimitiveSink;

public interface PrimitiveSinkable {
    public void putTo(PrimitiveSink sink);
}
