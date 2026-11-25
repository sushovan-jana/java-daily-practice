package com.kodewala.collection2;

import java.util.ArrayList;

public class ArrayListExp1 {
	public static void main(String[] args) {
		ArrayList<String> listOfString = new ArrayList<>();
		int totalElements = Integer.parseInt(args[0]);
		System.out.println(" Total elements are : " + (listOfString.size()));
	
		for (int i = 0; i < totalElements; i++) {
			listOfString.add("Element " + i);
		}
		
		System.out.println(" After adding size : " + listOfString.size());
		
		listOfString.add(" test ");
		System.out.println(listOfString.size());


	}
}
