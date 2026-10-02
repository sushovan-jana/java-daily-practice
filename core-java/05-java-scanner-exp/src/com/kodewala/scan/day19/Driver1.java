package com.kodewala.scan.day19;

import java.util.Scanner;

public class Driver1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // creates connection with console
		
		System.out.println(" Please, enter the name...");
		String name = scanner.nextLine(); // reading String input
		
		System.out.println(" Please, enter product price...");
		int price = scanner.nextInt(); // reading int ---> this will leave a new line char \n
		scanner.nextLine(); // to consume the extra char that upper line leave
		
		System.out.println(" Please, enter the address...");
		String address = scanner.nextLine();
		
//		printing the output
		System.out.println(" User is : " + name);
		System.out.println(" Product prize is : " + price);
		System.out.println(" Delivery address is : " + address);
		
		scanner.close(); // when we're opening a connection we've to close the connection
	}

}
