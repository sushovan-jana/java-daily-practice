package com.kodewala.string.day23;

public class Driver2 {

	public static void main(String[] args) {
		String string1 = "Sushovan"; // Object created in SCP
		
//		in case I want to change string using concat()
//		trying to change the object
		string1.concat(" Jana"); // Object created in HEAP with content "Sushovan Jana" 
		
		System.out.println(" string content : " + string1); // Sushovan
		
		String string2 = string1.concat(" Jana"); // Object created inside HEAP (Sushovan Jana)
												// ' Jana' object is created inside SCP
//		concat() method will alsways create new object().... that is stored in HEAP
		System.out.println(string2);

	}

}
