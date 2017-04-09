package com.ltln.modules.openflow.controller.manager;

import javax.annotation.Nonnull;

import com.google.common.base.Preconditions;
import com.ltln.modules.openflow.controller.manager.OFSwitchAppHandshakePlugin.PluginResultType;

/**
 * Class that represents the result of an app handshake plugin.
 *
 */
public class PluginResult {

    private final PluginResultType result;
    private final String reason;

    public PluginResult(@Nonnull PluginResultType result) {
        this.result = result;
        this.reason = null;
    }

    public PluginResult(@Nonnull PluginResultType result, String reason) {
        Preconditions.checkNotNull(result, "result must not be null");

        if(result != PluginResultType.QUARANTINE && reason != null)
            throw new IllegalStateException("Reason can only be set for Quarantine PluginResult");

        this.result = result;
        this.reason = reason;
    }

    public PluginResultType getResultType() {
        return this.result;
    }

    public String getReason() {
        return this.reason;
    }
}