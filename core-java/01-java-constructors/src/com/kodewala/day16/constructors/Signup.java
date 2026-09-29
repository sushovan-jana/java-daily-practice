package com.kodewala.day16.constructors;

public class Signup {
	@SuppressWarnings("unused")
	void signUp() {
		/**
		 * While user will sign up with no details 
		 * then User class no-arg constructor will be called
		 */
		System.out.println("Please wait we're signing in");
		User user = new User();
		System.out.println("You've been signed in as guest user");
	}
}
