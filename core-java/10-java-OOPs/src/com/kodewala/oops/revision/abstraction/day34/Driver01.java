package com.kodewala.oops.revision.abstraction.day34;

public class Driver01 {
	public static void main(String[] args) {
		Account account = new Account();
		account.credit(); // exposing the required method only
	}
}
