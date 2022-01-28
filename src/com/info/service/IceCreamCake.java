package com.info.service;

public class IceCreamCake implements Cake{

	public String preparedCake;
	
	@Override
	public void prepareCake(String quantity) {
		// TODO Auto-generated method stub
		preparedCake =" Ice cream prepared with the quantity of "+quantity;
	}

	@Override
	public String deliverCake() {
		// TODO Auto-generated method stub
		return preparedCake;
	}

}
