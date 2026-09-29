package com.kodewala.day13.practice;

public class Dog extends Animal {
//	if parent class having parameterized constructor 
//	then we have to call that constructor explicitly 
//	otherwise compile time error we'll get
	public Dog() {
		super(" DOG");
		System.out.println(" Dog class constructor exectuted...");
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Dog d1 = new Dog();
//		System.out.println();
	}
}
