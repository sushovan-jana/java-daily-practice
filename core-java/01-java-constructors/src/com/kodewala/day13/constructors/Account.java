package com.kodewala.day13.constructors;

public class Account {
	String name;
	int amount;
	
/**	
 * If we don't provide any constructor then compiler will give default constructor
 * that's no - args constructor.
 * But, if we're providing at least one constructor then compiler will not provide 
 * any constructor.
*/	
	public Account() {
		System.out.println(" no args constrcutor called");
	}
	
	Account(String name, int amount) {
		System.out.println(" String - int args constructor called");
		this.name = name;
		this.amount = amount;
	}
	
	Account(int amount, String name) {
		System.out.println(" int - String args constructor called");
		this.name = name;
		this.amount = amount;
	}
}
