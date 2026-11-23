package com.kodewala.collection1;

/**
 * Getting started with collection
 */
public class Driver1 {
	public static void main(String[] args) {
//		1. Store the price --> container(box) which holds the integer values
		int[] price = {200, 300, 6000, 100, 450, 8900, 3200, 231, 4000};
		
//		2. Process --> Find the price value above 1000
		for (int i = 0; i < price.length; i++) {
			int currentPrice = price[i];
			System.out.println(" current price is : " + currentPrice);
			
			if (currentPrice > 1000) {
				System.out.println(" more than 100 : " + currentPrice);
			}

		}
	}
}
