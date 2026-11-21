package com.kodewala.exception.day45;

public class Driver1 {
	public static void main(String[] args) {
		Account account = new Account();
		String accNo = null;
		String[] address = {"BTM Bangalore", "JP Nagar Bangalore"};
		account.doActivateAcc(accNo, address);
	}
}

class Account {
	void doActivateAcc(String accNo, String address[]) {
		System.out.println("Account.doActivateAcc()  START");
		validateAccDetails(accNo, address);
		System.out.println("Account.doActivateAcc()   END");
	}
	
	boolean validateAccDetails(String accNo, String address[]) {
		System.out.println("Account.validateAccDetails()   START");
		boolean isValid;
		try {
			String homeAddress = address[19];
			System.out.println(" Home add : " + homeAddress);

			isValid = accNo.startsWith("SBI");
		} catch (NullPointerException e) {
			isValid = false;
			System.out.println(" value is null");
			e.printStackTrace();
			 
		} catch (ArrayIndexOutOfBoundsException e) {
			isValid = false;
			System.out.println(" You are trying to get an values from invalid index");
			e.printStackTrace();

		} catch (Exception e) {
			/**
			 * catch block will catch any of the exception object
			 */
			isValid = false;
			System.out.println(" Unknown exception");
			e.printStackTrace();

		}
		return isValid;
	}
}