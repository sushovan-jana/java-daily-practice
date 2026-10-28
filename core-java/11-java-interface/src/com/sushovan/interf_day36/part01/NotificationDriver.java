package com.sushovan.interf_day36.part01;

public class NotificationDriver {
	public static void main(String[] args) {
		NotificationProcessor notificationProcessor = new NotificationProcessor();
		notificationProcessor.processNotification(new EmailNotification(), "janasushovan76@gmail.com", "hello");
		notificationProcessor.processNotification(new WhatsAppNotification(), "9845762154", "hi darling");
	}
}
