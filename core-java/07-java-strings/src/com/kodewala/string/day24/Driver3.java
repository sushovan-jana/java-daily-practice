package com.kodewala.string.day24;

public class Driver3 {

	public static void main(String[] args) {
//		How many objects will be created ? -> only one
		String s1 = "This " + " is from " + " Kodewala Academy, Bangalore";
//		if we're using '+' operator, it will be optimized by compiler and one object will be created
//		after compilation : String s1 = "This is from Kodewala Academy, Bangalore"
		System.out.println(s1);
		
		String s2 = "Kodewala"; // in SCP
		String s3 = "Academy"; // in SCP
		String s4 = s2 + s3; // in heap
		System.out.println(s4); // O/P : KodewalaAcademy
	}

}
