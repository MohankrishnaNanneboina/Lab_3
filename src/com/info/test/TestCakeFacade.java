package com.info.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.info.facade.CakeFacade;
import com.info.facade.CakeType;

public class TestCakeFacade {
	
	CakeFacade cakeFacade = new CakeFacade();
	CakeType cakeType;
	
	@Test
	public void testOrderCakeWithValidCakeType() {
	 	
		assertNotNull(cakeFacade.deliverCake(CakeType.CHOCOLATE));
	}

	@Test
	public void testOrderCakeWithInValidCakeType() {
	 	try {
	 		assertNull(cakeFacade.deliverCake(null));
	 	}
		catch (NullPointerException e) {
			// TODO: handle exception
		}
	}
	

}
