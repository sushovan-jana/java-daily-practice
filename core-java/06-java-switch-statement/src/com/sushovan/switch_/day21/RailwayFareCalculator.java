package com.sushovan.switch_.day21;

public class RailwayFareCalculator {

	PassengerDetails details;
	
	public RailwayFareCalculator(PassengerDetails details) {
		this.details = details;
	}
	
	public void calculateFare() {
		String passengerType;
		
		int age = details.passengerAge;
		if(age < 5) {
			passengerType = "child";
		} else if(age >= 5 && age <= 18) {
			passengerType = "teen";
		} else if(age > 18 && age <= 60) {
			passengerType = "adult";
		} else {
			passengerType = "senior";
		}
		
		switch (passengerType) {
		case "child":
			System.out.println("For childrens free ticket");
			break;
		case "teen":
			System.out.println("50% discount for teen agers");
			break;
		case "adult":
			System.out.println("no discount for adults");
			break;
		case "senior":
			System.out.println("40% discount for seniors");
			break;
		default:
			System.err.println("Something went wrong");
			break;
		}
	}

}
