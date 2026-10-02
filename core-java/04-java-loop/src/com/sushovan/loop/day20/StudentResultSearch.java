package com.sushovan.loop.day20;

import java.util.Scanner;

public class StudentResultSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] students = { "Rahul", "Priya", "Amit", "Sneha", "Arjun",
				"Neha", "Rohit", "Ananya", "Vikram", "Kavya" };

		int[] marks = { 78, 42, 91, 35, 67, 88, 29, 74, 56, 95 };

		boolean tryAgain = true;

		while (tryAgain) {

			System.out.println("Enter student first name - ");
			String name = sc.next();

			boolean found = false;

			for (int i = 0; i < students.length; i++) {

				if (name.equalsIgnoreCase(students[i])) {

					System.out.println("Student Name: " + students[i]);
					System.out.println("Marks: " + marks[i]);

					if (marks[i] >= 40) {
						System.out.println("Result: Pass");
					} else {
						System.out.println("Result: Fail");
					}

					found = true;

					break;
				}
			}

			if (!found) {
				System.err.println("Not found");
			}

			System.out.println("Want to find more - true/false");
			tryAgain = sc.nextBoolean();

			if (!tryAgain) {
				System.out.println("Thank you for choosing our app");
				sc.close();
				return;
			}
		}

		System.out.println("Thank you for choosing our app");
		sc.close();
	}
}

