package com.sushovan.exception.practice;
/**
 * Exception is printed with following details : 
 * Name of the exception
 * Description
 * Location / stack-trace
 * NOTE : If at least one method terminates abnormally then the program termination is called abnormal termination
 */
public class Driver2 {
	public static void main(String[] args) {
		doSomething();
		System.out.println(10/0);

	}
	
	public static void doSomething() {
		doMore();
		System.out.println("Driver2.doSomething()");
	}
	
	public static void doMore() {
		System.out.println("Driver2.doMore()");
	}
}
