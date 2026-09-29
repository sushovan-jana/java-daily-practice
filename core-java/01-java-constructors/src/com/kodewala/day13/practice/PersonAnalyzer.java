package com.kodewala.day13.practice;

public class PersonAnalyzer {

	public static void main(String[] args) {
		PersonInformation pInfo1 = new PersonInformation();
		System.out.println(" User is : " + pInfo1.name 
				+ " age is " + pInfo1.age + " contact is " + pInfo1.phoneNumber);
		
		PersonInformation pInfo2 = new PersonInformation("Sushovan Jana", (byte)17, "852410652");
		System.out.println(" User is : " + pInfo2.name 
				+ " age is " + pInfo2.age + " contact is " + pInfo2.phoneNumber);
	}

}
