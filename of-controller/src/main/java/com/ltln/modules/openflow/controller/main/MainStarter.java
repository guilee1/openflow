package com.ltln.modules.openflow.controller.main;

import com.ltln.modules.openflow.controller.inf.IOFSwitch;
import com.ltln.modules.openflow.controller.manager.OFSwitchManager;
import com.ltln.modules.openflow.core.types.DatapathId;

public class MainStarter {

	public static void main(String[] args) throws Exception{
		OFSwitchManager manager = new OFSwitchManager();
		manager.init();
		manager.startUp();
		
		//---write table flow by openflow api
//		IOFSwitch switcher = manager.getSwitch(null);
//		OFMessage msg = switcher.getOFFactory().buildTableMod().build();
//		switcher.write(msg);
		while(true){
			Thread.sleep(10*1000);
			for(DatapathId id : manager.getAllSwitchMap().keySet()){
				System.out.println(id.toString());
				IOFSwitch switcher = manager.getAllSwitchMap().get(id);
				System.out.println(switcher.getStatus());
			}
		}
	}

}
