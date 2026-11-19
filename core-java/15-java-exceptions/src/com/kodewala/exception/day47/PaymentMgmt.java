package com.kodewala.exception.day47;

public class PaymentMgmt {
	public void doPayment(String account, int amount) {
		checkBalance(account, amount);
	}
	
	private boolean checkBalance(String account, int amount) throws InsufficientBalanceException {
		boolean checkBalanceStatus = false;
		int balance = 1000; // from database
		if (amount > balance) {
//			balance is not enough
			throw new InsufficientBalanceException(account + " does not have enough balance and current balance is " + balance);
		} else {
//			allowed to transfer fund
			checkBalanceStatus = true;
		}
		return checkBalanceStatus;
	}
}
