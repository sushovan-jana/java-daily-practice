package com.sushovan.interf_day37.part01;

/**
 * Contract for every type of ride offered by the system, such as bike, car or
 * premium rides.
 *
 * <p>
 * Each ride type provides its own implementation of {@link #bookRide(Customer)}
 * and {@link #cancelRide()}. The discount is provided through the
 * <b>default method</b> {@link #calculateDiscount()}, so implementing classes
 * only override it when they need a discount other than the standard one.
 * </p>
 *
 * <p>
 * Client code such as {@link RideServiceProcessor} depends only on this
 * interface, so new ride types can be added without changing the processors
 * (<b>programming to an interface</b>).
 * </p>
 *
 * @author Sushovan Jana
 * @version 1.9
 * @since 2026
 * @see BikeRideService
 * @see CarRideService
 * @see PremiumRideService
 */
public interface RideService {

	/**
	 * Books a ride for the given customer.
	 *
	 * @param customer the customer for whom the ride is to be booked
	 * @return {@code true} if the ride is booked successfully, otherwise {@code false}
	 */
	boolean bookRide(Customer customer);

	/**
	 * Cancels the ride.
	 *
	 * @return the result of the cancellation attempt as decided by the
	 *         implementing class
	 */
	boolean cancelRide();

	/**
	 * Returns the discount percentage applicable to this ride type.
	 *
	 * <p>
	 * The default discount is <b>5%</b>. Implementing classes may override this
	 * method to offer a different discount.
	 * </p>
	 *
	 * @return the discount as a percentage, for example {@code 5} means 5%
	 */
	default int calculateDiscount() {
		return 5;
	}
}