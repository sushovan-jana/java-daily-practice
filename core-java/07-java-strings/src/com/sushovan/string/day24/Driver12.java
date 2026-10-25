package com.sushovan.string.day24;

public class Driver12 {
	public static void main(String[] args) {

		// Case 1: the text already exists in the SCP
		String s1 = new String("Sushovan");
		// The literal "Sushovan" goes into the SCP,
		// and new String() makes a separate copy in the heap.
		// s1 points to the heap object.

		String s2 = s1.intern();
		// intern() looks for "Sushovan" in the SCP and finds it,
		// so it returns the SCP's reference.
		// s1 points to the heap, s2 points to the SCP.

		System.out.println(s1 == s2); // false

		// Case 2: the text is NOT in the SCP yet
		String s3 = "Java";
		// Literal, so the object is created in the SCP.
		// s3 points to it.

		String s4 = s3.concat(" Developer");
		// concat() runs at runtime, so "Java Developer"
		// is created as a new object in the heap.
		// s4 points to that heap object.

		String s5 = s4.intern();
		// intern() looks for "Java Developer" in the SCP and doesn't find it.
		// Java 7+ does not create a copy. It just notes down
		// the reference of the existing heap object in the SCP
		// and returns it. So s4 and s5 point to the same object.

		System.out.println(s4 == s5); // true

		// Note on Java versions:
		// Java 6 and earlier: if the text was not in the SCP, intern()
		// created a new copy there and returned that copy's reference.
		// Java 7 onwards: the SCP lives inside the heap, so intern() just
		// stores the reference of the existing heap object.
	}
}