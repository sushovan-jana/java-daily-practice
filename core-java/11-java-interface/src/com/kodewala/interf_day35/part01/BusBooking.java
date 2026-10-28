package com.kodewala.interf_day35.part01;

/**
 * Bus booking implementation of the {@link IDiscount} contract.
 *
 * <p>This class is currently a stub: it satisfies the contract defined by
 * {@code IDiscount}, but the discount and tax logic have not been implemented
 * yet.</p>
 *
 * @author Sushovan Jana
 * @see com.kodewala.interf_day35.part01.IDiscount
 */
public class BusBooking implements IDiscount {

	/**
	 * Placeholder implementation that applies no discount.
	 *
	 * @param amount the original fare
	 * @param rate   the discount rate (currently ignored)
	 * @return the original fare, unchanged
	 */
	@Override
	public int calculateDiscount(int amount, int rate) {
		// TODO: Apply the bus-specific discount logic using the given rate
		return amount;
	}

	/**
	 * Placeholder implementation for calculating tax on a discounted booking.
	 * Intentionally left empty until the tax logic is defined.
	 *
	 * @param tax the tax value to be applied (currently ignored)
	 */
	@Override
	public void calculateDiscountTax(int tax) {
		// TODO: Implement bus-specific tax calculation
	}
}