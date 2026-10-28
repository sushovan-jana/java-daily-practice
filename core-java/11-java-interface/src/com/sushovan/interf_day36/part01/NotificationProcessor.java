package com.sushovan.interf_day36.part01;

public class NotificationProcessor {
	public void processNotification(NotificationService notificationService, String receipent, String message) {
		notificationService.sendNotification(receipent, message);
		boolean delivered = notificationService.isDelivered();
		System.out.println("Message delivered for " + notificationService.getClass().getSimpleName() + " is " + delivered);
	}
}
