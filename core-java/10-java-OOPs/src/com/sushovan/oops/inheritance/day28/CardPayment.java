package com.sushovan.oops.inheritance.day28;

public class CardPayment extends Payment {
	String cardNumber;
	String cardHolderName;
	
	public CardPayment(String paymentId, int amount, String cardNumber, String cardHolderName) {
		super(paymentId, amount);
		this.cardNumber = cardNumber;
		this.cardHolderName = cardHolderName;
	}
	
	@Override
	public void processPayment() {
		if (amount < 200000) {
			System.out.println("Thank you for using card " + amount + " has been transferred");
		} else {
			System.err.println("Can't process at a time");
		}
	}
}
