package com.kodewala.exception.day44;

public class Driver3 {
	public static void main(String[] args) {
		Driver3 driver3 = new Driver3();
		driver3.doSomething();
	}
	
	@SuppressWarnings("null")
	public void doSomething() {
		System.out.println("Driver3.doSomething()...START");
		String name = null;
		try {
//			Risky line --> Code whcih may throw an exception
			System.out.println(name.length()); // in this line exception occured
			System.out.println("After name.length()"); // this line will be ignored

		} catch (Exception e) // This can catch exception's object and its child objects
		{
			System.out.println(" name is null");
			e.printStackTrace();
		}
		

		System.out.println("Driver3.doSomething()...END");

	}
}
