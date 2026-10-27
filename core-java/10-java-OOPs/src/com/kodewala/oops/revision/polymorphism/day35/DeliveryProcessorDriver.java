package com.kodewala.oops.revision.polymorphism.day35;

/**
 * @author sushovan
 * 
 * @see com.kodewala.oops.revision.polymorphism.day35.Delivery
 * @see com.kodewala.oops.revision.polymorphism.day35.ExpressBee
 * @see com.kodewala.oops.revision.polymorphism.day35.Ekart
 * @see com.kodewala.oops.revision.polymorphism.day35.ShipRocket
 * @see com.kodewala.oops.revision.polymorphism.day35.DeliveryProcessor
 */
public class DeliveryProcessorDriver {
	public static void main(String[] args) {
		DeliveryProcessor deliveryProcessor = new DeliveryProcessor();
		/**
		 * calling the method of DeliveryProcessor and passing the object
		 * processDelivery() method will accept the objects using Parent reference
		 * 
		 * we are using -> Open for extension - closed for modification concept
		 * in fututre if new delivery partner comes then without changing existing code
		 * we can extend our service
		 */
		deliveryProcessor.processDelivery(new Ekart());
		/**
		 * Extended service new delivery partner came named ShipRocket
		 * From this class we can pass ShipRocket object
		 */
		deliveryProcessor.processDelivery(new ShipRocket());
	}
}
