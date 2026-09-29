package com.kodewala.day14.constructors;

public class Driver1 {

	public static void main(String[] args) {
		NotificationService n1 = new NotificationService();
		n1.sendNotification("SMS");
		NotificationService n2 = new NotificationService();
		n2.sendNotification("EMAIL");
	}

}
