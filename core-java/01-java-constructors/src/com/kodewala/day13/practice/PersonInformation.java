package com.kodewala.day13.practice;

public class PersonInformation {

	String name;
	byte age;
	String phoneNumber;

	public PersonInformation() {
//		this(0, null); // even though we're passing 0 and it will fit in byte but still
//		java sees it as int by default
//		solution
//		if we're not passing any value then this values will be assigned to the object..
		this("UNKNOWN", (byte)0, "UNKNOWN");
	}

	public PersonInformation(String name, byte age, String phoneNumer) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumer;
	}
}
