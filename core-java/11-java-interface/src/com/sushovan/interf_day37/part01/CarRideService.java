package com.sushovan.interf_day37.part01;

/**
 * {@link RideService} implementation for <b>car rides</b>.
 *
 * <p>
 * This class does not override {@link RideService#calculateDiscount()}, so car
 * rides use the <b>default discount of 5%</b> from the interface.
 * </p>
 *
 * @author Sushovan Jana
 * @version 1.9
 * @since 2026
 * @see RideService
 * @see BikeRideService
 * @see PremiumRideService
 */
public class CarRideService implements RideService {

	/**
	 * Books a car ride for the given customer and prints the booking id,
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
	 * Cancels the car ride.
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

}