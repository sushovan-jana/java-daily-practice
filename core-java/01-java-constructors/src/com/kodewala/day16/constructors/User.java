package com.kodewala.day16.constructors;

/**
 * This is User for Hotstar
 */
public class User {

	String name;
	String type;
	String country;

/**
  * While user not providing any details he/she will be a guest user and default
  * values will be given
 */
	public User() {
		this("user1412x74", "guest_user", "IN");
		System.out.println(
				"no-arg constructor has been called, " + "default values will be given to parameterized constructor");
	}

	User(String _name, String _type, String _country) {
		this.name = _name;
		this.type = _type;
		this.country = _country;
		System.out.println("Default values has been set");
	}
}
