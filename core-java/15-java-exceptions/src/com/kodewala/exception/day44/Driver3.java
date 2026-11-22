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
		int amount = 100;
		try {
//			Risky line --> Code whcih may throw an exception
			@SuppressWarnings("unused")
			int result = amount / 0; // ArithmeticException
			System.out.println(name.length()); // in this line exception occured
			
//			return;
//			System.out.println("After name.length()"); // this line will be ignored

		} catch (NullPointerException e) // This can catch exception's object and its child objects
		{
			System.out.println(" name is null");
			e.printStackTrace();
			return;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}
		finally {
			System.out.println("I am finally");

		}


//		System.out.println("Driver3.doSomething()...END");

	}
}
