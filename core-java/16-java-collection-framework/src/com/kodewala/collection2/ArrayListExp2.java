package com.kodewala.collection2;

import java.util.ArrayList;

public class ArrayListExp2 {
	public static void main(String[] args) {
//		default capacity 10
		ArrayList<String> list = new ArrayList<>();
		
		System.out.println(" default size : " + list.size());
		list.add("Bangalore");
		list.add("Jaipur");
		list.add("Rajasthan");
		list.add("Mysore");
		list.add("Delihi");
		
		list.add("Bihar");
		list.add("Kolkata");
		list.add("Rampur");
		list.add("Jp Nagar");
		list.add("Hridaypur"); // 10th element (Capacity is still 10)
		System.out.println("Added 10 elements, now size : " + list.size());

		list.add("RavanNagar"); // 11th element (Capacity jumps to 15 right here!)
		list.add("Patna");      // 12th element (Capacity stays 15)


	}
}
