package com.kodewala.interf_day37.part01;

public class TrainBooking implements IBooking {

	@Override
	public Booking booking() {
		Booking booking = new Booking();
		return booking;
	}

	@Override
	public void cancelBooking() {
//		some logic
		System.out.println("TrainBooking.cancelBooking()");
	}

	@Override
	public String checkStatus() {
		return "WAITING";
	}

	@Override
	public SearchResult search() {
		SearchResult result = new SearchResult();
		return result;
	}
	
	/**
	 * If any class want to give implementation the class can
	 * override the default method of the interface.
	 * 
	 * While overriding we've give access modifer as public, default keyword
	 * in classes is not allowed.
	 */
	@Override
	public void autoUpgrade() {
		System.out.println("TrainBooking.autoUpgrade()");
	}
}
