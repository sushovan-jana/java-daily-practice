package com.sushovan.string.day24;

public class Driver8 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.hashCode() == s2.hashCode()); // true
		System.out.println(s1 == s2); // false
	}

}
