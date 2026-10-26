package com.kodewala.oops.revision.encapsulation.day34;

public class Driver01 {
	public static void main(String[] args) {
		Account account = new Account();
		account.accountBalance = 208800; 
		/**
		 * As the accountBalance variable is public, another class can change it directly
		 * The Account class is not well encapsulated
		 */
		System.out.println(account.accountBalance);
		
		ModifiedAccount account2 = new ModifiedAccount();
//		account2.accountBalance = 30000; // this is not valid as the field is private
		account2.credit(); // We've to reach to the private field using setter method

	}
}
