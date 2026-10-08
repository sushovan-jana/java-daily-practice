package com.kodewala.string.day23;

public class Driver1 {

	public static void main(String[] args) {
//		this object is created inside SCP
		String s1 = "Sushovan";

//		this object is created inside heap as well as in SCP
		String s2 = new String("Jana");

//		this object is created inside heap, in SCP already present (object will not be created)
		String s3 = new String("Sushovan");

//		already present in SCP
		String s4 = "Jana";

		String s5 = new String("JanA");

//		String clas equals() method is meant for content comparison, Java is case sensitive
		System.out.println(" s4 & s2 equals() : " + (s4.equals(s2)));

		System.out.println(" s5 & s4 equals() : " + (s5.equals(s4)));

		System.out.println(" s1 & s3 == operator : " + (s1 == s3));

	}

}
