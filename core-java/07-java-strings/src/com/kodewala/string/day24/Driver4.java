package com.kodewala.string.day24;

/**
 * Use case of intern()
 */
public class Driver4 {

	public static void main(String[] args) {
		String s1 = "Sushovan ";
		String s2 = "Jana";

		String s3 = s1 + s2; // the object will be created inside heap
		String s4 = "Sushovan Jana"; // in SCP

		System.out.println(s3 == s4); // O/P : false
		/**
		 * Using intern() giving instruction that if object is not present in SCP but
		 * present in HEAP Then copy the object from heap, store in SCP and start
		 * refering using the existing reference variable
		 */
		System.out.println(s3.intern() == s4); // O/P : true

		String s5 = "Kodewala";
		@SuppressWarnings("unused")
		String s6 = " Academy";

		String s7 = s5 + " Institute"; // in heap
		String s8 = "Kodewala Institute"; // in SCP
		System.out.println(s7 == s8); // O/P : false

//		here I'm telling to s7 that, hey s7 go with the content that you are holding....
//		if in SCP the content object is not there then create object there and start pointing to that...
		System.out.println(s7.intern() == s8); // O/P : true

		String s9 = "Janmu Kashmir";
		String s10 = "Janmu ";
		String s11 = "Kashmir";

		String s12 = s10 + s11; // in heap
		System.out.println(s9 == s12); // O/P : false --> s9 is pointing to SCP & s12 pointing to heap

//		telling to s12 that hey buddy, whatever content object you are refering copy and go to SCP if already present
//		then point to that object if not present then create there and start to point
		System.out.println(s12.intern() == s9); // O/P : true

	}

}
