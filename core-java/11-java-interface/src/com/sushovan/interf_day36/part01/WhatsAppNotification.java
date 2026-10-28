package com.sushovan.interf_day36.part01;

/**
 * WhatsAppNotification class has to give implementation for both methods
 */
public class WhatsAppNotification implements NotificationService {

	@Override
	public void sendNotification(String receipent, String message) {
		System.out.println("WhatsAppNotification.sendNotification()");
		System.out.println(" Receipent - " + receipent + " Message - " + message);
	}

	@Override
	public boolean isDelivered() {
		return false;
	}
	
}
