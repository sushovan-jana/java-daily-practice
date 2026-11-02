package com.kodewala.interf_day39.part01;

public class Driver {
	public static void main(String[] args) {
		/**
		 * Lamda symbol
		 */
		IAccount account = (name, address, balance) -> {
			System.out.println(" Account opened, details are below : ");
			return " Name : " + name + " || Address : " + address + " || Balance : " + balance;
		};
		
		String openAccountString = account.openAccount("Sushovan", "BTM LAYOUT, BANGALORE", 3100);
		System.out.println(openAccountString);

		
	}
}
