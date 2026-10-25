package com.sushovan.oops.inheritance.day28;

public class PaymentDriver {

	public static void main(String[] args) {
		UPIPayment upiPayment = new UPIPayment(
	            "PAY101", 5000, "adhiswar@upi", "Google Pay");

	    CardPayment cardPayment = new CardPayment(
	            "PAY102", 25000, "1234567890123456", "adhiswar");

	    System.out.println("UPI PAYMENT");
	    upiPayment.displayPaymentDetails();
	    upiPayment.processPayment();

	    System.out.println("CARD PAYMENT");
	    cardPayment.displayPaymentDetails();
	    cardPayment.processPayment();
	}

}
