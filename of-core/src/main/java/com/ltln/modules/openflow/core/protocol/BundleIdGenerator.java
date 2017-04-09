package com.ltln.modules.openflow.core.protocol;

import com.ltln.modules.openflow.core.types.BundleId;

public interface BundleIdGenerator {
    BundleId nextBundleId();
}
