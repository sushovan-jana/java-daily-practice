package com.sushovan.oops.revision.day34;

public class PaymentDemo {
	public static void main(String[] args) {
		/*
		 * PremiumCCPayment ccPayment = new PremiumCCPayment();
		 * ccPayment.processPayment();
		 */
		
		CreditCardPayment cardPayment = new PremiumCCPayment();
		cardPayment.processPayment();
	}
}
