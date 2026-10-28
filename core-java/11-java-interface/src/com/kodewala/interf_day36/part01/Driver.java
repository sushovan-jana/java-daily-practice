package com.kodewala.interf_day36.part01;

/**
 * Demonstrates programming to an interface by using {@link IDiscount} to work
 * with its implementation classes.
 *
 * @author Sushovan Jana
 * @see com.kodewala.interf_day36.part01.IDiscount
 * @see com.kodewala.interf_day36.part01.FlightBooking
 * @see com.kodewala.interf_day36.part01.BusBooking
 */
public class Driver {

	/**
	 * Application entry point. Creates a {@link FlightBooking}, invokes the
	 * interface methods through an {@code IDiscount} reference, and then casts
	 * to the concrete type to call a method that is not part of the interface.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
//		We can't create object of interface
//		IDiscount discount = new IDiscount();
		// An interface reference can hold an object of any implementing class
		IDiscount discount1 = new FlightBooking();

		// Apply a 10% discount to a fare of 7800 and print the final fare
		int ticketFareInFlight = discount1.calculateDiscount(7800, 10);
		System.out.println(ticketFareInFlight);

		discount1.calculateDiscountTax(2500);

		// doSomething() is not declared in IDiscount, so it cannot be called
		// through the interface reference. Cast to the concrete type first.
		((FlightBooking) discount1).doSomething();
	}
}


