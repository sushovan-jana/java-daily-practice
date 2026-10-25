package com.sushovan.oops.inheritance.day28;

public class UPIPayment extends Payment {
	String upiId;
	String appName;
	
	public UPIPayment(String paymentId, int amount, String upiId, String appName) {
		super(paymentId, amount);
		this.upiId = upiId;
		this.appName = appName;
	}
	
	@Override
	public void processPayment() {
		if (amount > 10000) {
			System.err.println("Can't process this amount through APP, choose card");
			return;
		} else {
			System.out.println("Amount of Rs. " + amount + " is under processing");
			System.out.println("Amount has been processed");
		}
	}
	
}
