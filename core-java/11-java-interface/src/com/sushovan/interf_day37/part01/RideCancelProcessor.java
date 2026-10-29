package com.sushovan.interf_day37.part01;

/**
 * Processes ride cancellations for customers.
 *
 * <p>
 * Like {@link RideServiceProcessor}, this class delegates the real work to the
 * {@link RideService} stored in the {@link Customer} and only reacts to the
 * result.
 * </p>
 *
 * @author Sushovan Jana
 * @version 1.9
 * @since 2026
 * @see Customer
 * @see RideService#cancelRide()
 */
public class RideCancelProcessor {

	/**
	 * Cancels the ride of the given customer and prints the outcome.
	 *
	 * <p>
	 * <b>Note:</b> with the current logic, a {@code false} value returned by
	 * {@link RideService#cancelRide()} is treated as a successful cancellation
	 * and prints the "Booking cancelled" message to {@code System.out}. A
	 * {@code true} value prints "Something went wrong" to {@code System.err}.
	 * </p>
	 *
	 * @param customer the customer whose ride is to be cancelled
	 * @see RideService#cancelRide()
	 */
	public void rideCancelProcessor(Customer customer) {
		boolean cancelRide = customer.getRideType().cancelRide();
		if(!cancelRide) {
			System.out.println(" Booking cancelled for " + customer.getBookingId());
		} else {
			System.err.println(" Something went wrong");
		}
	}
}