package com.sushovan.oops.inheritance.day29;

public class DeliveryDriver {

	public static void main(String[] args) {
		
		StandardDelivery delivery = new StandardDelivery();

		System.out.println(delivery.calculateDeliveryCharge(200));
		System.out.println(delivery.trackDelivery("China"));
		
		ExpressDelivery delivery2 = new ExpressDelivery();
		System.out.println(delivery2.calculateDeliveryCharge(5000));
		System.out.println(delivery2.trackDelivery("Goa"));
	}

}
