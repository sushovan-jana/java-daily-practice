package com.kodewala.day14.constructors;

public class NotificationService {
	
	public void sendNotification(String _type) {
		
		System.out.println("NotificationService.sendNotification()");

		if (_type.equalsIgnoreCase("sms")) {
			sendSMS();
		} else if (_type.equalsIgnoreCase("email")) {
			sendEmail();
		} else {
			sendWhatsapp();
		}
	}

	private void sendSMS() {
		System.out.println("NotificationService.sendSMS() START");

		// biz logic

		System.out.println("NotificationService.sendSMS() END");
	}

	private void sendEmail() {
		System.out.println("NotificationService.sendEmail()  START");

		// biz logic

		System.out.println("NotificationService.sendEmail() END");
	}

	private void sendWhatsapp() {
		System.out.println("NotificationService.sendWhatsapp() START");

		// biz logic

		System.out.println("NotificationService.sendWhatsapp() END");
	}

}
