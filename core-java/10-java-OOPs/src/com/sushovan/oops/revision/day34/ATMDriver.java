package com.sushovan.oops.revision.day34;

public class ATMDriver {
	public static void main(String[] args) {
		ATM atm = new ATM();
//		atm.balance we can't access to private fields
//		atm.deposite(200, "4321"); checking pin and amount is valid or not
		atm.withdrawAmount(-90, "2341");
	}
}
