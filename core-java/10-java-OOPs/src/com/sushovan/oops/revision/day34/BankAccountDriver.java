package com.sushovan.oops.revision.day34;

public class BankAccountDriver {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(58000);
		account.depositeMoney(600);
		account.withdraw(2000);
		System.out.println("Final balance " + account.getBalance());
	}
}
