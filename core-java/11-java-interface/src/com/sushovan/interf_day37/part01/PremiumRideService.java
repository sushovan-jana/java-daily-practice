package com.sushovan.interf_day37.part01;

/**
 * {@link RideService} implementation for <b>premium rides</b>.
 *
 * <p>
 * Premium rides get the highest discount of <b>25%</b>, which overrides the
 * default 5% of the interface.
 * </p>
 *
 * @author Sushovan Jana
 * @version 1.9
 * @since 2026
 * @see RideService
 * @see BikeRideService
 * @see CarRideService
 */
public class PremiumRideService implements RideService {

	/**
	 * Books a premium ride for the given customer and prints the booking id,
	 * customer name, ride type (the simple class name) and the discount applied.
	 *
	 * @param customer the customer who is booking the ride
	 * @return {@code true} always, since the booking is treated as successful
	 */
	@Override
	public boolean bookRide(Customer customer) {
//		logic
		System.out.println(" Booking id : " + customer.getBookingId() + " || Customer name : " + customer.getCutomerName()
				+ " || Ride type : " + customer.getRideType().getClass().getSimpleName() + " || Discount : " + calculateDiscount() + "%");
		return true;
	}

	/**
	 * Cancels the premium ride.
	 *
	 * <p>
	 * The cancellation logic is yet to be implemented.
	 * </p>
	 *
	 * @return {@code false} always, until the real logic is added
	 */
	@Override
	public boolean cancelRide() {
//		some logic
		return false;
	}

	/**
	 * Returns the discount for premium rides.
	 *
	 * <p>
	 * Overrides the default method of {@link RideService}.
	 * </p>
	 *
	 * @return {@code 25}, meaning a 25% discount
	 * @see RideService#calculateDiscount()
	 */
	public int calculateDiscount() {
		return 25;
	}

}