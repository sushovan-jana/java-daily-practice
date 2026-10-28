package com.sushovan.interf_day36.part01;

/**
 * EmailNotification class has to give implementation for both methods
 */
public class EmailNotification implements NotificationService {

	@Override
	public void sendNotification(String receipent, String message) {
		System.out.println("EmailNotification.sendNotification()");
		System.out.println(" Receipent - " + receipent + " || Message - " + message);
	}

	@Override
	public boolean isDelivered() {
		return true;
	}
	
}
