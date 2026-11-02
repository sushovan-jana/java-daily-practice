package com.kodewala.interf_day39.part01;

public class Driver {
	public static void main(String[] args) {
		/**
		 * Lamda symbol
		 */
		IAccount account = () -> {
			System.out.println(" Opening account");
		};
		
		account.openAccount();
		
	}
}
