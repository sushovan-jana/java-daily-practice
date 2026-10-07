package com.kodewala.string.day22;

public class Driver2 {

	public static void main(String[] args) {
		String city1 = "BANGALORE";
		String city2 = "BANGALORE";

//		by default equals method compares the refernce but in case of 
//		String , String class override that method and the equals method 
//		meant for content comparison
		System.out.println(" equals() METHOD : " + city1.equals(city2));
//		== operator is meant for reference comparison
		System.out.println(" == OPERATOR : " + (city1 == city2));

		System.out.println("equals() METHOD FOR NON - STRING CLASS");

		User user1 = new User("Sushovan");
		User user2 = new User("Sushovan");

//		here we're comparing reference using equals() method, User class 
//		parent is Object class, and Object class equals() method is 
//		meant for refernce comparison
		System.out.println(user1.equals(user2));

	}

}
