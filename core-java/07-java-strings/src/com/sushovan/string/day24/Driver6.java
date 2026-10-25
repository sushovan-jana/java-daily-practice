package com.sushovan.string.day24;

public class Driver6 {

	public static void main(String[] args) {
		String a = combine("Ja", "va"); // created inside HEAP
		String b = "Java"; // in SCP
		
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true

	}
	
	public static String combine(String s1, String s2) {
		return s1 + s2;
	}

}
