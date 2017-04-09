package com.ltln.modules.openflow.core.protocol;

import io.netty.buffer.ByteBuf;

public interface Writeable {
    void writeTo(ByteBuf bb);
}
