package com.ltln.modules.openflow.core.protocol;

import com.ltln.modules.openflow.core.types.PrimitiveSinkable;


/**
 * Base interface of all OpenFlow objects (e.g., messages, actions, stats, etc.)
 */
public interface OFObject extends Writeable, PrimitiveSinkable {
    OFVersion getVersion();
}
