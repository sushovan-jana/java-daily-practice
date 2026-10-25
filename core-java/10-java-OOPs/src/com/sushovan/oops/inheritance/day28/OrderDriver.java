package com.sushovan.oops.inheritance.day28;

public class OrderDriver {

	public static void main(String[] args) {
		PrepaidOrder prepaidOrder = new PrepaidOrder("ORD101", 2000, "NEW", "Rahul", "2026-10-15", "TXN101", "SUCCESS",
				200);

		@SuppressWarnings("unused")
		CashOnDeliveryOrder codOrder = new CashOnDeliveryOrder("ORD102", 1500, "NEW", "Amit", "2026-10-15", "Kolkata",
				50, false);

		@SuppressWarnings("unused")
		SubscriptionOrder subscriptionOrder = new SubscriptionOrder("ORD103", 3000, "NEW", "Priya", "2026-10-15", 501,
				12, "2027-10-15", true);
		
		
		System.out.println("----> Prepaid Order <------");
		prepaidOrder.displayorderDetails();
		System.out.println(" Final Amount -> " + prepaidOrder.calculateFinalAmount());
		prepaidOrder.validatePayment();
	    prepaidOrder.processOrder();
	    prepaidOrder.cancelOrder();
	}

}
