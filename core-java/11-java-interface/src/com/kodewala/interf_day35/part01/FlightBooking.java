package com.kodewala.interf_day35.part01;

/**
 * Flight booking implementation of the {@link IDiscount} contract.
 *
 * <p>This class agrees to the contract defined by {@code IDiscount} and
 * therefore must provide concrete implementations of all of its abstract
 * methods.</p>
 *
 * @author Sushovan Jana
 * @see com.kodewala.interf_day35.part01.IDiscount
 */
public class FlightBooking implements IDiscount {

	/**
	 * Calculates the final fare after applying a percentage discount.
	 *
	 * @param amount the original fare
	 * @param rate   the discount rate, expressed as a percentage (e.g. 10 for 10%)
	 * @return the final fare after the discount has been deducted
	 */
	@Override
	public int calculateDiscount(int amount, int rate) {
		// Deduct the discount (amount * rate / 100) from the original fare
		int finalFare = amount - (amount * rate) / 100;
		return finalFare;
	}

	/**
	 * Placeholder implementation for calculating tax on a discounted booking.
	 * Currently prints the method name only; the tax logic is yet to be implemented.
	 *
	 * @param tax the tax value to be applied
	 */
	@Override
	public void calculateDiscountTax(int tax) {
		System.out.println("FlightBooking.calculateDiscountTax()");
	}

	/**
	 * Additional behavior specific to {@code FlightBooking} that is not part of
	 * the {@link IDiscount} contract.
	 */
	public void doSomething() {
		System.out.println("FlightBooking.doSomething()");
	}
}