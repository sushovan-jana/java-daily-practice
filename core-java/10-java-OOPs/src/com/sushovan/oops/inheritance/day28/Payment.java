package com.sushovan.oops.inheritance.day28;

public class Payment {
	String paymentId;
	int amount;
	
	public Payment(String paymentId, int amount) {
		super();
		this.paymentId = paymentId;
		this.amount = amount;
	}

	public void processPayment() {
		System.out.println("Payment under processing");
	}
	
	public void displayPaymentDetails() {
		System.out.println(" Payment ID - " + paymentId);
		System.out.println(" Amount - " + amount);
	}
}
