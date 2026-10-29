package com.sushovan.interf_day37.part01;

/**
 * Entry point of the ride-booking demo.
 *
 * <p>
 * This class creates the ride services and customers, then runs the booking
 * and cancellation flows to show <b>polymorphism through interfaces</b>:
 * every customer is handled the same way, but each ride type behaves
 * differently (for example, with a different discount).
 * </p>
 *
 * @author Sushovan Jana
 * @version 1.9
 * @since 2026
 * @see RideServiceProcessor
 * @see RideCancelProcessor
 * @see Customer
 */
public class Driver {

	/**
	 * Starts the application.
	 *
	 * <p>
	 * <b>Flow:</b>
	 * </p>
	 * <ol>
	 * <li>Create one {@link RideService} object per ride type.</li>
	 * <li>Create eight {@link Customer} objects, each linked to a ride type.</li>
	 * <li>Book rides through {@link RideServiceProcessor}. Customers with a due
	 * payment are rejected.</li>
	 * <li>Cancel rides through {@link RideCancelProcessor}.</li>
	 * </ol>
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {

		RideService bikeRideService = new BikeRideService();
		RideService carRideService = new CarRideService();
		RideService premiumRideService = new PremiumRideService();

		Customer rahulSharma = new Customer("Rahul Sharma", 5.5, "9876543210", "BK1001", true, bikeRideService);
		Customer priyanshVerma = new Customer("Priyansh Verma", 12.0, "9123456780", "BK1002", false, carRideService);
		Customer amitKumar = new Customer("Amit Kumar", 3.2, "9988776655", "BK1003", true, carRideService);
		Customer snehaPatel = new Customer("Sneha Patel", 18.7, "9012345678", "BK1004", true, bikeRideService);
		Customer arjunSingh = new Customer("Arjun Singh", 7.8, "9871234560", "BK1005", true, premiumRideService);
		Customer ananyaDas = new Customer("Ananya Das", 25.4, "9330012345", "BK1006", true, bikeRideService);
		Customer vikramReddy = new Customer("Vikram Reddy", 9.1, "9845098450", "BK1007", false, premiumRideService);
		Customer meeraNair = new Customer("Meera Nair", 15.6, "9447123456", "BK1008", true, carRideService);

		RideServiceProcessor processor = new RideServiceProcessor();
		processor.processRide(rahulSharma);
		processor.processRide(priyanshVerma);
		processor.processRide(amitKumar);
		processor.processRide(meeraNair);
		processor.processRide(vikramReddy);
		processor.processRide(arjunSingh);

		RideCancelProcessor cancelProcessor = new RideCancelProcessor();
		cancelProcessor.rideCancelProcessor(priyanshVerma);
		cancelProcessor.rideCancelProcessor(snehaPatel);
		cancelProcessor.rideCancelProcessor(arjunSingh);
		cancelProcessor.rideCancelProcessor(ananyaDas);

	}
}