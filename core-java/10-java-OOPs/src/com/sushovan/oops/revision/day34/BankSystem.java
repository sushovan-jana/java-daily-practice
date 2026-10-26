package com.sushovan.oops.revision.day34;

public class BankSystem {
	public static void main(String[] args) {
		SavingAccount account = new SavingAccount(50000.0, 5);
		account.showBalance(); // inherited method from Account class
		account.calculateInterest(); // method from saving account class
	}
}
