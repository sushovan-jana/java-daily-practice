package com.kodewala.interf_day37.part01;

public class BusBooking implements IBooking {

	@Override
	public Booking booking() {
		Booking booking = new Booking();
		return booking;
	}

	@Override
	public void cancelBooking() {
		System.out.println("BusBooking.cancelBooking()");
	}

	@Override
	public String checkStatus() {
		return "CONFIRMED";
	}

	@Override
	public SearchResult search() {
		// TODO Auto-generated method stub
		return null;
	}

}
