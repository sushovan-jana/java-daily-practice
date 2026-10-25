package com.sushovan.oops.inheritance.day28;

public class AnimalDriver {
	public static void main(String[] args) {
		Animal animal = new Dog("Bruno", 3, "Brown", "Labrador Retriever", false);
//		using parent ref. we can call overriding methods but can't call 
//		child specific methods
		
		
		animal.displayInfo();
		animal.makeSound();
		
//		this is child specific method we can't call using parent ref.
//		animal.wagTail();
		
//		we can call the method that is present inside parent class using parent ref.
		animal.eat();
		
//		variable resolution depends on ref. type not in run time object type
//		hence, parent class value will be printed here, as we're using ref. 
//		of Animal( parent )
		System.out.println(" Sensitive code " + animal.somethingSensitive);
	}
}
 







