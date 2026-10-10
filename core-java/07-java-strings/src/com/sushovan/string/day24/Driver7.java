package com.sushovan.string.day24;

public class Driver7 {

	public static void main(String[] args) {
		String s = null;
		
		System.out.println("Value " + s);
		
		String s1 = "Java";
		System.out.println("Sushovan".concat(" Jana"));
		System.out.println(s1.concat(null)); // NullPointerException

	}

}
