package com.sushovan.oops.revision.day34;

// Parent class
public class Account {
	double balance;
	
	public Account(double balance) {
		this.balance = balance;
	}
	
	/**
	 * Method to show the balance
	 */
	public void showBalance() {
		System.out.println("Account balance " + balance);

	}
}
