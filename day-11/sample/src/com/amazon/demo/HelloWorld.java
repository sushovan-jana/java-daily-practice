package com.amazon.demo;
public class HelloWorld {

	public static void main(String[] args) {
		String name = args[0];
		System.out.println("Hello World! I am : " + name);
		int amount = 33;
		System.out.println("Amount" + amount);
		doSomething();
		
		HelloWorld hl = new HelloWorld();
		hl.m1();
		
	}

	public static void doSomething() {
		System.out.println("HelloWorld.doSomething()");
	}
	
	public void m1() {
		System.out.println("hey hi");
	}
}