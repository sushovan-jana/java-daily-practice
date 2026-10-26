package com.sushovan.oops.revision.day34;

public class ATM {
	/**
	 * private data (balance and pin)
	 * this fields can't be directly accessed from outside of this class
	 */
	private double balance = 20000;
	private String pin = "2341";
	
	public void withdrawAmount(double amount, String pin) {
		System.out.println("Current balance " + balance);

		if(amount <= balance && amount > 0 && this.pin.equals(pin)) {
			balance -= amount;
			System.out.println("Amount withdrawn " + amount);
		} else {
			System.err.println("Error : invalid PIN or insufficient funds.");
		}
	}
	
	public void deposite(double amount, String pin) {
		if(amount > 0 && this.pin.equals(pin)) {
			balance += amount;
			System.out.println("Deposited " + amount + " New balance " + this.balance);
		} else {
			System.err.println("Invalid input check PIN or amount");
		}
	}
}
