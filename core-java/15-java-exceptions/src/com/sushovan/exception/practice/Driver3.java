package com.sushovan.exception.practice;

public class Driver3 {
	public static void main(String[] args) {
//		withHandling();
		withoutHandling();
	}
	
	public static void withoutHandling() {
		System.out.println("Driver3.withoutHandling()...START");
		System.out.println(10 / 0);
		System.out.println("Driver3.withoutHandling()...END");
	}
	
	public static void withHandling() {
		System.out.println("Driver3.withHandling()...START");
		try {
			System.out.println(" Inside try line 1");
			System.out.println(10 / 0);
			System.out.println(" Exception occured");
			System.out.println(" 100 lines");

		} catch (ArithmeticException e) {
			System.out.println(" Arithmetic exception caught");
			System.out.println(" Description of exception : " + (e.getMessage()));
		}
		System.out.println("Driver3.withHandling()...END");
	}
}
