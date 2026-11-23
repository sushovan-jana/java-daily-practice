package com.kodewala.collection1;

import java.util.ArrayList;

/**
 * DAY 49: Java Collection Framework - ArrayList Example
 * 
 * Key Characteristics of List Interface (implemented by ArrayList):
 * 1. Insertion order is preserved (elements stay in the order they were added).
 * 2. Duplicate elements are allowed.
 * 3. Multiple null values are allowed.
 * 4. Internally backed by a dynamic/resizable array (default initial capacity: 10).
 */
public class Driver2 {

	public static void main(String[] args) {
		
		// Initialize an ArrayList to dynamically store String objects
		ArrayList<String> learners = new ArrayList<String>();

		// Adding elements to the ArrayList using the add() method
		learners.add("Sushovan Jana");
		learners.add(null);           // Null values are permitted
		learners.add("Rahul Sharma");
		learners.add("Amit Kumar");
		learners.add("Priyansh Das");
		learners.add(null);           // Multiple null values are allowed
		learners.add("Sneha Roy");
		learners.add("Arjun Sen");
		learners.add("Rohit Das");
		learners.add("Ananya Ghosh");
		learners.add("Sourav Mitra");
		learners.add("Neha Singh");
		learners.add(null);

		// Print the entire ArrayList; elements will display in the exact order of insertion
		System.out.println(learners);
	}
}
