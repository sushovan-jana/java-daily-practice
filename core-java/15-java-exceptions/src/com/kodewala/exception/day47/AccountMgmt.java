package com.kodewala.exception.day47;

public class AccountMgmt {
	
	void openAccount(String name, String address) {
		System.out.println("AccountMgmt.openAccount()... START");
		activateAccount("SBI838383");
		System.out.println("AccountMgmt.openAccount()... END");
	}
	
	private void activateAccount(String accNo) {
		System.out.println("AccountMgmt.activateAccount()... START");
		try {
			checkAccountStatus(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("AccountMgmt.activateAccount()... END");
	}
	
	/**
	 * throws -> somebody calling this method is responsible to handle exception
	 * throw -> create a new exception object and throw it to the caller
	 * @param accNo
	 * @return boolean
	 * @throws Exception
	 */
	private boolean checkAccountStatus(String accNo) throws Exception {
		try {
			accNo.startsWith("SBI");
		} catch (Exception e) {
			throw new Exception("Account number is not starting with SBI");
		}
		return false;
	}
}
