package com.info.service;

public class ChocolateCake implements Cake {
   
	public String preparedCake;
	
	@Override
	public void prepareCake(String quantity) {
		// TODO Auto-generated method stub
		preparedCake=" Chocolate cake with the quantity -"+quantity;
	}

	@Override
	public String deliverCake() {
		// TODO Auto-generated method stub
		return preparedCake;
	}

}
