package com.sushovan.loop.day20;

// Import Scanner class to take input from the user through the console.
import java.util.Scanner;

public class SmartNumberGuessingGame {

	public static void main(String[] args) {

		// Create Scanner object to read input from the keyboard/console.
		Scanner scanner = new Scanner(System.in);

		// Store the secret number that the user has to guess.
		byte secretNumber = 73;

		// Store the maximum number of attempts allowed.
		byte maxAttempt = 7;

		// Store the current attempt number. The first attempt starts from 1.
		byte currentAttemp = 1;

		// Tell the user to enter a number between 0 and 100.
		System.out.println(" Please enter number, between 0 to 100 ");

		// Continue the game while the current attempt is within the maximum attempts.
		while (currentAttemp <= maxAttempt) {

			// Ask the user to enter a number.
			System.out.println(" Enter - ");

			// Check whether the next input provided by the user can be read as a byte.
			while (!scanner.hasNextByte()) {

				// Display an error message when the input is not a valid byte.
				System.err.println("Invalid input");

				// Tell the user that the program needs to be launched again.
				System.out.println(" Please relaunch the program...");

				// Close the Scanner object before terminating the program.
				scanner.close();

				// Return from main() and terminate the program.
				return;
			}

			// Read the valid byte value entered by the user.
			byte userNumber = scanner.nextByte();

			// Check whether the user's number is equal to the secret number.
			if (userNumber == secretNumber) {

				// Tell the user that they guessed the secret number correctly.
				System.out.println(" Congratulations, you won the game!");

				// Close the Scanner because the program is ending.
				scanner.close();

				// Exit the main() method because the game has been won.
				return;

				// Check whether the user's number is smaller than the secret number.
			} else if (userNumber < secretNumber) {

				// Move to the next attempt.
				currentAttemp++;

				// Tell the user that their number was too low.
				System.out.println(" Low");

				// Check whether the user's number is greater than the secret number.
			} else if (userNumber > secretNumber) {

				// Move to the next attempt.
				currentAttemp++;

				// Tell the user that their number was too high.
				System.out.println(" High");
			}
		}

		// This message is displayed when all allowed attempts have been used.
		System.err.println(" Max attemp over , sorry, you lost...");

		// Close the Scanner object after the game ends.
		scanner.close();
	}
}
