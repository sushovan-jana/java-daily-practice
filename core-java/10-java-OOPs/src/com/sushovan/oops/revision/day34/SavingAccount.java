package com.sushovan.oops.revision.day34;

/**
 * Child class inheriting Account using 'extends' keyword
 */
public class SavingAccount extends Account {
	double interestRate;
	
	public SavingAccount(double balance, double interestRate) {
		super(balance); // calling parent class constructor to initialize child class
		this.interestRate = interestRate;
	}
	
	public void calculateInterest() {
		double interest = balance * interestRate / 100;
		System.out.println("Interest earned " + interest);

	}
}
