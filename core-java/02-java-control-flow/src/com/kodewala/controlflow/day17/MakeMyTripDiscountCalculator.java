package com.kodewala.controlflow.day17;

/**
 * This class is responsible for calculating discount, based on amount user
 * entered
 */
public class MakeMyTripDiscountCalculator {
	static int maxDiscountPrize = 1250; // per customer its maximum
	String name; // instance field

	public MakeMyTripDiscountCalculator(String name) {
		this.name = name;
	}

	public void calculateDiscount(int fare) {
		if (fare <= 5000) {
			System.err.println(" No discount for " + this.name);
		} else if (fare > 5000 && fare <= 10000) {
			int finalFare = (int) (fare - (fare * 0.1));
			System.out.println(" User : " + this.name + " got 10% discount and final fare is : " + finalFare);
		} else if (fare > 10000) {
			double finalFare = fare - (fare * (15 / 100));
			if (finalFare > maxDiscountPrize) {
				finalFare = maxDiscountPrize;
				System.out.println(
						" User : " + this.name + "'s final fare after discount is more than " + maxDiscountPrize);
				System.out.println(" We're giving discount of " + finalFare);
			} else {
				System.out.println(" User : " + this.name + "'s final fare is : " + finalFare);
			}
		} else {
			System.err.println(" Invlaid input");
		}

	}
}
