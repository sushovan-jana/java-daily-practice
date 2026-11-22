package com.sushovan.exception.practice;
/**
 * Exception is printed with following details : 
 * Name of the exception
 * Description
 * Location / stack-trace
 */
public class Driver1 {
	public static void main(String[] args) {
		doSomething();
	}
	
	public static void doSomething() {
		doMore();
	}
	
	public static void doMore() {
		System.out.println(10/0);  // in this line exception will occur

	}
}
