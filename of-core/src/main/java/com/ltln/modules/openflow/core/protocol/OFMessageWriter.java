package com.ltln.modules.openflow.core.protocol;

import io.netty.buffer.ByteBuf;

import com.ltln.modules.openflow.core.exceptions.OFParseError;

public interface OFMessageWriter<T> {
    public void write(ByteBuf bb, T message) throws OFParseError;
}
