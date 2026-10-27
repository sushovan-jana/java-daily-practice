package com.kodewala.oops.revision.polymorphism.day35;

public class DeliveryProcessor {
	public void processDelivery(Delivery delivery) {
		/**
		 * Based on the object type the method will be invoked
		 * This is the concept of polymorphism
		 */
		delivery.doDelivery();
	}
}
