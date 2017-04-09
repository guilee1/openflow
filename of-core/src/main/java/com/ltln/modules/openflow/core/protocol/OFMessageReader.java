package com.ltln.modules.openflow.core.protocol;

import io.netty.buffer.ByteBuf;

import com.ltln.modules.openflow.core.exceptions.OFParseError;

public interface OFMessageReader<T> {
    T readFrom(ByteBuf bb) throws OFParseError;
}
