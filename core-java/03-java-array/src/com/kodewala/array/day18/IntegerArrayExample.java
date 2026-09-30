package com.kodewala.array.day18;

/**
 * This class is responsible for storing int type of values
 */
public class IntegerArrayExample {

	public static void main(String[] args) {
		/**
		 * Array is fixed size
		 * Once we crate an array we can't change the size
		 * Easy to use
		 * Indexed based Data structure
		 * We can retrieve data using index 
		 * Time complexity is 0(1)
		 * Index starts from 0
		 * length is an attribute, using this with dot operator we can get size of array
		 */
		int[] arr1 = new int[5]; // this will store 5 int type value
		System.out.println(arr1[0]); // default value is 0
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		arr1[3] = 40;
		arr1[4] = 50;
//		arr1[5] = 555; // this line will give runtime exception : ArrayIndexOutOfBoundException
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
//		System.out.println(arr1[5]);

	}

}
