package com.kodewala.day12.practice;

public class ConstructorOverloading {

	public ConstructorOverloading() {
		this(2);
		System.out.println("no-args constructor...");
	}

	public ConstructorOverloading(int i) {
		this(4.5);
		System.out.println("int-arg constructor...");
	}

	public ConstructorOverloading(double d) {
		System.out.println("double-arg constructor...");
	}

	public static void main(String[] args) {
//		ConstructorOverloading col1 = new ConstructorOverloading();
//		ConstructorOverloading col2 = new ConstructorOverloading(78);
//		ConstructorOverloading col3 = new ConstructorOverloading(6789098l); // it will promoted to float then double...
	}

}
