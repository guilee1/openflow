package com.ltln.modules.openflow.controller.config;

import java.util.HashMap;
import java.util.Map;

public class Constraints {

	public static Map<String, String> getConfigParams() {
		Map<String, String> config = new HashMap<>();
		config.put("maxTablesToReceiveTableMissFlowPerDpid", "{\"00:00:00:00:00:00:00:01\":\"1\",\"2\":\"1\"}");
		return config;
	}

	public static int getPort() {
		return 6653;
	}

}
