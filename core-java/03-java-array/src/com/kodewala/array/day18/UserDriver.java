package com.kodewala.array.day18;

public class UserDriver {

	public static void main(String[] args) {
		User user1 = new User("Sushovan Jana", "9635897458", (byte) 23); // when we're passing any decimal value by
																			// default its int type
		User user2 = new User("Aditya Roy", "8569789325", (byte)21);
		User user3 = new User("Shyam Prasad Bhattecharya", "9876932547", (byte)45);
		User user4 = new User("Ramesh Sarkar", "7854963289", (byte)34);
		User user5 = new User("Kaushik Chatterjee", "6589356798", (byte)20);
		
//		creating an array that will hold User objects
		User[] users = new User[5];
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;
		users[4] = user5;
		
		System.out.println(" User1 details : " + users[0].name + " " + users[0].age);
		System.out.println(" User2 details : " + users[1].name + " " + users[1].age);
		System.out.println(" User3 details : " + users[2].name + " " + users[2].age);
		System.out.println(" User4 details : " + users[3].name + " " + users[3].age);
		System.out.println(" User5 details : " + users[4].name + " " + users[4].age);
	}

}
