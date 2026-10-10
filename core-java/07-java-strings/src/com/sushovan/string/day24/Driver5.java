package com.sushovan.string.day24;

public class Driver5 {
	public static void main(String[] args) {
//		final means we can't reassign
		final String a = new String("Java");
		String b = a + "Developer"; // in Heap
		String c = "JavaDeveloper"; // in SCP
		
		System.out.println(b == c); // false
		
	}
}
