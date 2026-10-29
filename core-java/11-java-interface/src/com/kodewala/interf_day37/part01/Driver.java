package com.kodewala.interf_day37.part01;

public class Driver {
	public static void main(String[] args) {
		IBooking booking = new TrainBooking();
		Booking booking2 = booking.booking();
		System.out.println(booking2.getBookingId() + " " + booking2.getCustomerName());
	}
}
