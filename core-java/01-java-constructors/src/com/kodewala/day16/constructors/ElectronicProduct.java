package com.kodewala.day16.constructors;

public class ElectronicProduct extends Product {
//	this is specific state of ElectronicProduct
	int warranty;
	
	public ElectronicProduct(String productName, int price, String productId, int warranty) {
//		calling the parent class constructor to give the commong field vlaues
		super(productName, price, productId);
		
//		warranty field is specific to electronic product
		this.warranty = warranty;
	}	
}
