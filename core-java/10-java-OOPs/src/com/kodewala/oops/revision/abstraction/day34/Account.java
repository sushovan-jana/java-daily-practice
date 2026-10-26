package com.kodewala.oops.revision.abstraction.day34;

public class Account {
	@SuppressWarnings("unused")
	private int balance;
	/**
	 * We're exposing the required filed credit() using public access modifier
	 * But, credit() method internally what is doing we're not exposing
	 * Hence, exposing only the required functionality to other class is the concept of 
	 * Abstraction
	 */
	public void credit() {
//		checkBalance
		checkBalance(); // core implementation
//		validate pin
		validatePin("JEO86OHE"); // core implementation
		System.out.println("Account.credit()");
	}
	
	private int checkBalance() {
		System.out.println("Account.checkBalance()");
		return 2000;
	}
	
	private boolean validatePin(String pin) {
//		some logic to validate pin
		System.out.println("Account.validatePin()");
		return true;
	}
}
