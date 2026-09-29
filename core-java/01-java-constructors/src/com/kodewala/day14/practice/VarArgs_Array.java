package com.kodewala.day14.practice;

public class VarArgs_Array {
	public static void main(String[] args) {
		int[] arr1 = new int[] {1, 2, 3, 4, 5};
		int[] arr2 = new int[] {6, 7, 6};
//		passing a group of 1D array...
		arrayElement(arr1, arr2);
	}
	
//	this method will take a group of array --> it means it will become a 2D array
	public static void arrayElement(int[]... arr) {
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}
}
