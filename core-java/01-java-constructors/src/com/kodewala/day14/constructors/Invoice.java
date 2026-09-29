package com.kodewala.day14.constructors;
//	if any class does not have any parent then Object is parent by default - of that class...
public class Invoice extends Object {
//	common to every object
	static int gst = 18;

//	instance variables
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;

//	constructor
	public Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName) {
		this.amount = _amount;
		this.itemName = _itemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;
	}
}
