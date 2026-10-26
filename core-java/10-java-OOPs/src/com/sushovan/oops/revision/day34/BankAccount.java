package com.sushovan.oops.revision.day34;

public class BankAccount {
	private double balance; // Private data memeber
	
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void depositeMoney(double amount) {
		if(amount > 0) {
			balance += amount;
			System.out.println("Deposited " + amount);

		} else {
			System.out.println("Invalid amount");

		}
	}
	
	public void withdraw(double amount) {
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrawn " + amount);

		} else {
			System.out.println("Insufficient funds or invalid amount");

		}
	}
	
}
