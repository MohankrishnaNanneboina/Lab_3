package com.info.facade;

import com.info.service.Cake;
import com.info.service.ChocolateCake;
import com.info.service.IceCreamCake;

public class CakeFacade {
	
	public static String deliverCake(CakeType Caketypes) {
		
		switch (Caketypes) {
		case CHOCOLATE:
			Cake chocolateCake = new ChocolateCake();
			chocolateCake.prepareCake("3kg");
			return chocolateCake.deliverCake();
			
		case ICECREAM:
			Cake iceCreamCake = new IceCreamCake();
			iceCreamCake.prepareCake("5kg");
			return iceCreamCake.deliverCake();
		
		}
		return null;
		
	}

}
