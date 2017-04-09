package com.ltln.modules.openflow.controller.inf;

import com.ltln.modules.openflow.core.types.DatapathId;

public class SwitchDisconnectedException extends Exception {
    private static final long serialVersionUID = 1L;

    private final DatapathId id;

    public SwitchDisconnectedException(DatapathId id) {
        super(genMessage(id));
        this.id = id;
    }

    private static String genMessage(DatapathId id) {
        return String.format("Switch %s disconnected", id);
    }

    public DatapathId getId() {
        return id;
    }

}
