package com.sushovan.oops.inheritance.day28;

public class Dog extends Animal {
	String breed;
	boolean isTrained;
	int somethingSensitive = 333;
	
	public Dog(String name, int age, String color, String breed, boolean isTrained) {
		super(name, age, color);
		this.breed = breed;
		this.isTrained = isTrained;
	}
	
	@Override
	public void makeSound() {
		System.out.println(breed + " dog barks....");
	}
	
	public void wagTail() {
		System.out.println(breed + " wags tail...");
	}
	
	@Override
	public void displayInfo() {
//		using Parent class method --> code reusing
		super.displayInfo();
		System.out.println(" Breed : " + breed);
		System.out.println(" Is trained : " + isTrained);
	}
}




