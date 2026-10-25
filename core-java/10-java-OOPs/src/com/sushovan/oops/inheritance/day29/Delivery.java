package com.sushovan.oops.inheritance.day29;

public class Delivery {
	
	public int calculateDeliveryCharge(int amount) {
		return amount;
	}
	
	public String trackDelivery(String deliveryAddress) {
		if (deliveryAddress.equalsIgnoreCase("Kolkata") || deliveryAddress.equalsIgnoreCase("Bangalore")) {
			return "Will be delivered";
		}
		
		return "Delivery not available in this address";
	}
	
}
