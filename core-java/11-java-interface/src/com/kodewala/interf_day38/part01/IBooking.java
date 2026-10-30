package com.kodewala.interf_day38.part01;

import com.kodewala.interf_day37.part01.Booking;

/**
 * MMT - 2012
 */
public interface IBooking {
	public abstract Booking book();
	public abstract void cancelBooking();
	public abstract Booking checkStatus();
	
	/* optional -- 2020 
	 * Some of the implementation classes want this functionality
	 * */
	public default void autoUpgreade() {
//		500 lines (checking status, connecting with database(25 lines), upgrading)
		connectToDB(); // within interface using the private method
		System.out.println("IBooking.autoUpgrade()...");
	}
	
	public default void sendNotification() {
//		200 lines (connecting with database(25 lines), get user details and send notification)
		connectToDB(); // withing interface using the private method
		System.out.println("IBooking.sendNotification()...");
	}
	
//	private method that is accessible within the interface only, responsible for connecting with MMT-DB
	private void connectToDB() {
//		300 lines for connecting with DB
		System.out.println("IBooking.connectToDB()");
	}
	
	public static void printTicket(String path, String contents) {
		
	}
	
}
