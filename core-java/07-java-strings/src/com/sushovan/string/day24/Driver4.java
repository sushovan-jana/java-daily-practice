package com.sushovan.string.day24;

public class Driver4 {

	public static void main(String[] args) {
		String a = "Java" + "Developer"; // compile time constant folding
		String b = "JavaDeveloper";
		
		System.out.println(a == b); // true
	}

}
