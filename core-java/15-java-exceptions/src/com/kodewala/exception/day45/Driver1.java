package com.kodewala.exception.day45;

public class Driver1 {
	public static void main(String[] args) {
		Account account = new Account();
		String accNo = null;
		account.doActivateAcc(accNo);
	}
}

class Account {
	void doActivateAcc(String accNo) {
		System.out.println("Account.doActivateAcc()  START");
		validateAccDetails(accNo);
		System.out.println("Account.doActivateAcc()   END");
	}
	
	boolean validateAccDetails(String accNo) {
		System.out.println("Account.validateAccDetails()   START");
		boolean isValid;
		try {
			isValid = accNo.startsWith("SBI");
		} catch (Exception e) {
			/**
			 * catch block will catch any of the exception object
			 */
			isValid = false;
		}
		return isValid;
	}
}