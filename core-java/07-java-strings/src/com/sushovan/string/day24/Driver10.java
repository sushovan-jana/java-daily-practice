package com.sushovan.string.day24;
/**
 * Reassignment vs. mutation
 */
public class Driver10 {
	public static void main(String[] args) {
		String a = "Java";
		String b = a;
		
		a = a + " 8"; // Now, a is pointing to new object
//		but, b still pointing to the old object
		System.out.println(a); // O/P: Java 8
		System.out.println(b); // O/P: Java
	}
}
