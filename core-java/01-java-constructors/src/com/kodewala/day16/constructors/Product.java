package com.kodewala.day16.constructors;

/**
 * It is the parent of all Products
 */
public class Product {
//	default fields/ attributes for all products...
	String productName;
	int price;
	String productId;
	
	public Product(String productName, int price, String productId) {
		this.productName = productName;
		this.price = price;
		this.productId = productId;
	}
}
