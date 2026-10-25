package com.sushovan.oops.inheritance.day29;

public class ExpressDelivery extends Delivery {
	
	@Override
	public int calculateDeliveryCharge(int amount) {
		int tax = 3400;
		return tax + amount;
	}
	
	@Override
	public String trackDelivery(String deliveryAddress) {
		return "Delivery available all over the India";
	}

}
