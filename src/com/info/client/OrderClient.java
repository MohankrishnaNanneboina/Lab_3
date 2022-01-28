package com.info.client;

import com.info.cmd.CakeOven;
import com.info.cmd.CakeOvenCmdOff;
import com.info.cmd.CakeOvenCmdOn;
import com.info.cmd.RemoteControl;
import com.info.facade.CakeFacade;
import com.info.facade.CakeType;

public class OrderClient {
	
	public static void main(String[] args) {
				
		//Facade pattern to order cake 
		System.out.println(CakeFacade.deliverCake(CakeType.CHOCOLATE));
		System.out.println(CakeFacade.deliverCake(CakeType.ICECREAM)); 
		
		//Command pattern  to on/off the oven 
		RemoteControl control = new RemoteControl();
		CakeOven cakeOven = new CakeOven();
		control.setCommand(new CakeOvenCmdOff(cakeOven));
		control.pressButton();
		
		control.setCommand(new CakeOvenCmdOn(cakeOven));
		control.pressButton();
	}

}
