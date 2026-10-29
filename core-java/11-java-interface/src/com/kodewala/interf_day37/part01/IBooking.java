package com.kodewala.interf_day37.part01;

public interface IBooking {
	/**
	 * Interface tells to child/sub classes that what to do
	 */
	public abstract Booking booking();
	public abstract void cancelBooking();
	public abstract String checkStatus();
	SearchResult search();
	
	/**
	 * Optional method/defender method
	 * 
	 * <p><b>Note </b>in java 8 default method was introduced
	 * to protect the sub classes. Here default is keyword not the access
	 * modifier. Access modifier is alsways public. We've to give implementation
	 * to default methods
	 * </p>
	 */
	default void autoUpgrade() {
		System.out.println("default method in IBooking.autoUpgrade()");
	}
}
