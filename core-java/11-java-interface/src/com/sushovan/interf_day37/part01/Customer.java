package com.sushovan.interf_day37.part01;

public class Customer {
	private String cutomerName;
	private double distanceOfBooking;
	private String phoneNumber;
	private String bookingId;
	private boolean paymentStatus;
	private RideService rideType;

	public Customer(String cutomerName, double distanceOfBooking, String phoneNumber, String bookingId, boolean paymentStatus, RideService rideType) {
		super();
		this.cutomerName = cutomerName;
		this.distanceOfBooking = distanceOfBooking;
		this.phoneNumber = phoneNumber;
		this.bookingId = bookingId;
		this.paymentStatus = paymentStatus;
		this.rideType = rideType;
	}

	public Customer() {

	}
	
	public void setBookingId(String bookingId) {
		this.bookingId = bookingId;
	}

	public String getBookingId() {
		return bookingId;
	}
	
	public String getCutomerName() {
		return cutomerName;
	}

	public void setCutomerName(String cutomerName) {
		this.cutomerName = cutomerName;
	}

	public double getDistanceOfBooking() {
		return distanceOfBooking;
	}

	public void setDistanceOfBooking(double distanceOfBooking) {
		this.distanceOfBooking = distanceOfBooking;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(boolean paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public RideService getRideType() {
		return rideType;
	}

	public void setRideType(RideService rideType) {
		this.rideType = rideType;
	}
	
}
