package com.sushovan.oops.inheritance.day28;

public class Order {
	String orderId;
	int amount;
	String orderStatus;
	String customerName;
	String orderDate;
	
	public Order(String orderId, int amount, String orderStatus, String customerName, String orderDate) {
		super();
		this.orderId = orderId;
		this.amount = amount;
		this.orderStatus = orderStatus;
		this.customerName = customerName;
		this.orderDate = orderDate;
	}
	 
	public int calculateFinalAmount() {
		return amount;
	}
	
	public void processOrder() {
		System.out.println("Order is under processing");
	}
	
	public void cancelOrder() {
		System.out.println("Your order has been cancelled");
	}
	
	public void displayorderDetails() {
		System.out.println(" Order Id - " + orderId);
		System.out.println(" Amount - " + amount);
		System.out.println(" Order Status - " + orderStatus);
		System.out.println(" Customer Name - " + customerName);
		System.out.println(" Date - " + orderDate);
	}
	
	public void updateOrderStatus() {
		System.out.println("Updated your order status");
	}
}
