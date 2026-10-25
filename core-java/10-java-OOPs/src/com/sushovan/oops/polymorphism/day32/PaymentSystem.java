package com.sushovan.oops.polymorphism.day32;
class Payment {
//	method to be overriden
	void processPayment(double amount) {
		System.out.println("Processing generic payment of INR: " + amount);
	}
}

//child class of Payment
class UPIPayment extends Payment {
	@Override
	void processPayment(double amount) {
		System.out.println("Processing UPI payment of INR: " + amount);
	}
}

//child class of Payment
class CCPay extends Payment {
	@Override
	void processPayment(double amount) {
		System.out.println("Processing credit card payment of INR: " + amount);
	}
}
// Main class demonstrating RUNTIME POLYMORPHISM
public class PaymentSystem {
	public static void main(String[] args) {
		Payment payment; // parent class reference pointing to different child class objects
		payment = new UPIPayment(); // processing UPI payment
		payment.processPayment(783.90); // at compile time compiler checks, processPayment() present in Payment class or not
										// at run time JVM gives the priority to UPIPayment class overriding method
		payment = new CCPay();
		payment.processPayment(5600.32);
	}
}
