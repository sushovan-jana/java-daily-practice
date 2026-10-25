package com.sushovan.oops.polymorphism.day32;

public class Person {
	void showRole() {
		System.out.println("I am a person with multiple roles.");
	}
}

class Student extends Person {
	@Override
	void showRole() {
		System.out.println("I am a student. I study and attend classes.");
	}
}

class BoyFriend extends Person {
	@Override
	void showRole() {
		System.out.println("I am a boyfriend. I spend time with my partner.");
	}
}

class PolymorphismExample {
	public static void main(String[] args) {
//		reference of type Person pointing to different subclass objects
		Person person;
		person = new Student();
		person.showRole();
		
		person = new BoyFriend();
		person.showRole();
//		at compile time compiler checks showRole() method present in Person class or not if does not exist then compile time error
//		at runtime, Java determines the actual object(Student, BoyFriend) and calls the overridden method
//		this is known as dynamic method dispatch (Early Binding)
		
	}
}