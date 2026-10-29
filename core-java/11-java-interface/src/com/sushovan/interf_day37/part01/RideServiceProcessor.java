package com.sushovan.interf_day37.part01;

/**
 * Processes ride bookings for customers.
 *
 * <p>
 * This class decides whether a ride can be booked. It <b>does not</b> know the
 * concrete ride type; it delegates to the {@link RideService} stored in the
 * {@link Customer}, which is an example of <b>runtime polymorphism</b>.
 * </p>
 *
 * @author Sushovan Jana
 * @version 1.9
 * @since 2026
 * @see Customer
 * @see RideService
 */
public class RideServiceProcessor {

	/**
	 * Processes the ride booking of the given customer.
	 *
	 * <p>
	 * <b>Rules:</b>
	 * </p>
	 * <ul>
	 * <li>If the payment is done ({@link Customer#isPaymentStatus()} is
	 * {@code true}), the ride is booked by calling
	 * {@link RideService#bookRide(Customer)}.</li>
	 * <li>If the payment is due, the ride is not booked and an error message
	 * containing the booking id and customer name is printed to
	 * {@code System.err}.</li>
	 * </ul>
	 *
	 * @param customer the customer whose booking is to be processed
	 * @see RideService#bookRide(Customer)
	 */
	public void processRide(Customer customer) {
		if (customer.isPaymentStatus()) {
			customer.getRideType().bookRide(customer);
		} else {
			System.err.println(
					" DUE PAYMENT FOR : " + customer.getBookingId() + " || NAME : " + customer.getCutomerName());
		}
	}
}