package com.kodewala.day13.constructors;

public class AccountDriver {

	public static void main(String[] args) {
		Account acc1 = new Account();
//		we're not providing any value so it will print the default value of String and int
//		provided by JVM : String --> null & int --> 0
		System.out.println(" First person account holder's name : " + acc1.name);
		System.out.println(" First person account holder's account balance : " + acc1.amount);
		
		Account acc2 = new Account("Sushovan Jana", 4000);
//		in upper line we are providing at first String and int
//		so, the constructor with String - int args will be called
		System.out.println(" Second person account holder's name : " + acc2.name);
		System.out.println(" Second person account holder's account balance : " + acc2.amount);
		
		Account acc3 = new Account(6000, "Rahul Gandhi");
//		now we're providing int as first argument and String as second argument
//		so, the int - String constructor will be called
		System.out.println(" Third person account holder's name : " + acc3.name);
		System.out.println(" Third person account holder's account balance : " + acc3.amount);
	}

}
