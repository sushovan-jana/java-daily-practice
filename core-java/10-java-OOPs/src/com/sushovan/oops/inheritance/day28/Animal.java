package com.sushovan.oops.inheritance.day28;

public class Animal {
	String name;
	int age;
	String color;
	int somethingSensitive = 999;
	 
	public Animal(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}

	public void eat() {
		System.out.println(name + " takes food");
	}
	
	public void sleep() {
		System.out.println(name + " sleeps");
	}

	public void makeSound() {
		System.out.println(name + " makes sound");
	}
	
	public void displayInfo() {
		System.out.println(" Name : " + name);
		System.out.println(" Age : " + age);
		System.out.println(" Color : " + color);
	}
}


