package com.kodewala.interf_day39.part02;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Account account = new Account("Sushovan Jana", "Btm Layout, Bangalore", "963852045");
		Account clonedAccount = (Account) account.clone();
		System.out.println(clonedAccount.getNameString() + " || " + clonedAccount.getAddress() + " || " + clonedAccount.getAccNo());
		
		if(clonedAccount instanceof Cloneable) {
			System.out.println(" Eligible for cloning...");
		} else {
			System.out.println(" Not eligible for cloning...");
		}
	}
}
