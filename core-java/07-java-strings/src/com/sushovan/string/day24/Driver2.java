package com.sushovan.string.day24;

public class Driver2 {

	public static void main(String[] args) {
		String s1 = new String("Spring");
//		s2 pointing to "Spring" object that is present in SCP
		String s2 = s1.intern();
		String s3 = "Spring"; // Pointing to SCP where s2 is pointing
		
		System.out.println(s1 == s2); // false
		System.out.println(s2 == s3); // true

	}

}
