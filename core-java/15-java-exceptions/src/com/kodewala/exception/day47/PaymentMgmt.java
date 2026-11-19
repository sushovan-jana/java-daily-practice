package com.kodewala.exception.day47;

public class PaymentMgmt {
	public void doPayment(String account, int amount) throws FundTransferException {
		try {
			checkBalance(account, amount);
		} catch (InsufficientBalanceException e) {
			e.printStackTrace();
//			System.out.println(e.getMessage());
			throw new FundTransferException(" You do not have enough balance OR " + 
			" in case you have just opened the account recently, "
			+ "please wait 24 hrs before doing fund transfer...");
		}
		
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
