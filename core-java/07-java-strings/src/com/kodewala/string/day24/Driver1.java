package com.kodewala.string.day24;

public class Driver1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String s1 = "Kodewala"; // SCP
		String s2 = "Academy"; // SCP
		
		String s3 = new String("academy"); // because of String literal object goes in SCP
											// for new keyword it also goes in heap
		
		System.out.println(s3.equals(s2)); // O/P : false
		
//		anything in double quotes goes in SCP
		String s4 = new String("hello"); // 1 in SCP and 1 in heap
		s4.concat(" world"); // world goes in SCP and 'hello world'in heap
		
		System.out.println(s4); // O/P : hello
	}

}
