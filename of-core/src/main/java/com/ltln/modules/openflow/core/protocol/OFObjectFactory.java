package com.ltln.modules.openflow.core.protocol;

import io.netty.buffer.ByteBuf;

public interface OFObjectFactory<T extends OFObject> {
    T read(ByteBuf buffer);
}
