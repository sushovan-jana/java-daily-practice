package com.sushovan.oops.polymorphism.day32;

class Notification {
//	the method to be overriden, this is overriden method
	void send() {
		System.out.println("Notification send in generic way");
	}
}

class EmailNotification extends Notification {
	@Override // this is overriding method
	void send() {
		System.out.println("Notification will be sent through Email");
	}
	
	void doSomething() {
		System.out.println("EmailNotification class specific method");
	}
}

class SMSNotification extends Notification {
	@Override
	void send() {
		System.out.println("Notification will be sent through SMS");
	}
	
	public int hashCode() {
		return 874567;
	}
}

public class NotificationSystem {
	public static void main(String[] args) {
		Notification notification; // parent class  reference to point different child objects
		notification = new EmailNotification(); // parent reference holding child reference
		notification.send();
//		notification.doSomething(); It will give error because at first compiler will check whether the method present in Notification, Object class or not
//		if not present then it will give error
		System.out.println(notification.hashCode()); // at first it will check in Notification class that hashCode() present or not
//		if not found then it goes to Object class
		
		notification = new SMSNotification();
		notification.send();
		System.out.println(notification.hashCode()); 
	}
}
 
