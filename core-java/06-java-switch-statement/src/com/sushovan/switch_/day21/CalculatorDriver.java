package com.sushovan.switch_.day21;

public class CalculatorDriver {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		PassengerDetails details1 = new PassengerDetails(23, 1980, "Sushovan Jana");
		PassengerDetails details2 = new PassengerDetails(21, 235, "Ramesh Yadav");
		PassengerDetails details3 = new PassengerDetails(34, 4521, "Priya Sharma");
		PassengerDetails details4 = new PassengerDetails(28, 3087, "Arjun Mehta");
		PassengerDetails details5 = new PassengerDetails(45, 7316, "Kavita Nair");
		PassengerDetails details6 = new PassengerDetails(19, 842, "Rohan Verma");
		PassengerDetails details7 = new PassengerDetails(52, 6190, "Anita Deshmukh");
		
		RailwayFareCalculator calculator = new RailwayFareCalculator(details1);
		calculator.calculateFare();
		
	}

}
