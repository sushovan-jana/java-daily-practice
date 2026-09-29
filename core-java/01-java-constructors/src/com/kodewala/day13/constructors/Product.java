package com.kodewala.day13.constructors;

public class Product {
	String productName;
	int productPrice;
	String description;
	int quantity;

	public Product() {
		System.out.println(
				" User did not provide any information about this product so "
				+ "about the product information is ");
	}

	public Product(String name, String description) {
		System.out.println(" User provided name and description for product ");
		this.productName = name;
		this.description = description;
	}

	public Product(String name, int productPrice, String description, int quantity) {
		System.out.println(" User provided all the information about product ");
		this.productName = name;
		this.productPrice = productPrice;
		this.description = description;
		this.quantity = quantity;
	}
}



