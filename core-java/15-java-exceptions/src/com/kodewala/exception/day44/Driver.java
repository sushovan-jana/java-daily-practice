package com.kodewala.exception.day44;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Driver.main()...START");
		String name = "Sushovan"; // This may be null...
		/**
		 * if name = null;
		 * and on name we're trying to perform any operation then we'll
		 * get NullPointerException
		 * we can handle that
		 */
//		name.length() --> Performing operation on name
		System.out.println(name.length()); // 8 ---> name.whatEver()....

		System.out.println("Driver.main()...END");
	}
}
