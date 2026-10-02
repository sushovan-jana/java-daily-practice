package com.kodewala.whileloop.day19;

import java.util.Scanner;

/**
 * This class is responsible for number guessing
 */
public class Driver2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int luckyNumber = 55;
		int userEnteredNumber = 0;
		
		while(luckyNumber != userEnteredNumber) {
			System.out.println(" Please enter number...");
			userEnteredNumber = scanner.nextInt();
			
//			condition checking if user's guess is equal to lucky number
			if(userEnteredNumber == luckyNumber) {
				System.out.println(" YOU WON!!!");
			} else {
				System.err.println(" Try again...");
			}
		}
		
		scanner.close();

	}

}
