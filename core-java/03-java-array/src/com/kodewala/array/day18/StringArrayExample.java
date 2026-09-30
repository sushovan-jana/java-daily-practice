package com.kodewala.array.day18;

public class StringArrayExample {

	public static void main(String[] args) {
		String[] cityNames = new String[5];// this will store 5 String value
		System.out.println(" Default vlaue of String type array is : " + cityNames[0]); // null, as String is an object
		cityNames[0] = "Delhi";
		cityNames[1] = "Kolkata";
		cityNames[2] = "Bangalore";
		cityNames[3] = "Simla";
		cityNames[4] = "Srinagar";
		
		System.out.println(cityNames[0]);
		System.out.println(cityNames[1]);
		System.out.println(cityNames[2]);
		System.out.println(cityNames[3]);
		System.out.println(cityNames[4]);
	}

}
