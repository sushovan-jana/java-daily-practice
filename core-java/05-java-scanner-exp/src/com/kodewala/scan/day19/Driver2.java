package com.kodewala.scan.day19;
import java.util.Scanner;
/**
 * This class is responsible for input validation
 */
public class Driver2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int price = 0;
		
		System.out.println(" Please, enter the price...");
//		before reading the integer, you are going to make sure that user supply and int
		if(scanner.hasNextInt()) {
			price = scanner.nextInt();
		} else {
			System.out.println(" Please enter amount in right format...");
		}
		System.out.println(" Price is : " + price);
		scanner.close();
	}

}
