package com.sushovan.string.day24;

public class Driver1 {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = new String("Java");
		String s3 = "Java";
		
		System.out.println(s1 == s2); // false
		System.out.println(s1 == s3); // true
		System.out.println(s1.equals(s2)); // true

	}

}
