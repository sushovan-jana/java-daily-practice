package com.kodewala.oops.revision.polymorphism.day35;

/**
 * @author sushvoan
 */
public class DeliveryDriver {
	public static void main(String[] args) {
		/**
		 * Compile time -> doDelivery() method present in Delivery class or not. 
		 * If not present then check in Super class, continue this process until Super class
		 * after those things if method not present then compiler rise error.
		 * 
		 * Runtime -> based on the object the method is being called. At first priority is given
		 * to child class
		 */
		Delivery delivery1 = new Delivery();
		delivery1.doDelivery(); 
		
		Delivery delivery2 = new ExpressBee();
		delivery2.doDelivery();
		
		Delivery delivery3 = new Ekart();
		delivery3.doDelivery();
		
		/**
		 * At runtime ClassCastException will occured
		 */
		/*
		 * Delivery delivery = new Delivery(); ExpressBee expressBee = (ExpressBee)
		 * delivery; expressBee.doDelivery();
		 */
		
		Delivery delivery4 = new Ekart();
		Ekart ekart = (Ekart) delivery4;
		ekart.doDelivery();
	}
}
