package com.sushovan.loop.day20;

import java.util.Scanner;

// Takes N integers from the user, then counts how many are
// positive/negative and how many of the positive ones are even/odd.
public class ValidIntegerCounter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter how many numbers you want to enter : ");

		// keep asking until the user types something that is actually an int
		while(!sc.hasNextInt()) {
			System.err.println("TRY AGAIN!...you entered invalid format");
		}
		int count = sc.nextInt();

		// a negative count makes no sense for an array size, so quit early
		if(count < 0) {
			System.err.println(" INVALID INPUT");
			sc.close();
			return;
		}

		System.out.println("  ELIGIBLE TO GIVE INTEGER INPUT OF COUNT " + count);
		int[] inputArray = new int[count];

		// read all the numbers into the array
		for(int i = 0; i < inputArray.length; i++) {

			inputArray[i] = sc.nextInt();
		}

		// counters for the final report
		int positiveCount = 0;
		int negetiveCount = 0;
		int evenCount = 0;
		int oddCount = 0;

		// go through each number and update the counters
		for(int i = 0; i < inputArray.length; i++) {

			int userEnteredNumber = inputArray[i];
			if(userEnteredNumber > 0) {
				positiveCount++;

				// even/odd is only checked for positive numbers
				boolean res = checkEven(userEnteredNumber);
				if(res) {
					evenCount++;
				} else {
					oddCount++;
				}
			} else {
				// anything that isn't positive lands here (0 is counted too)
				negetiveCount++;
			}
		}

		// print the results
		System.out.println(" Total positive numbers : " + positiveCount);
		System.out.println(" Total negative numbers : " + negetiveCount);

		System.out.println(" Total odd numbers : " + oddCount);
		System.out.println(" Total even numbers : " + evenCount);

		sc.close();
	}

	// returns true if the number is divisible by 2, false otherwise
	public static boolean checkEven(int userEnteredNumber) {
		if(userEnteredNumber % 2 == 0) {
			return true;
		} else return false;
	}

}

