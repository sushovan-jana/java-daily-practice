package com.kodewala.day16.constructors;

public class ProductDriver {

	public static void main(String[] args) {
		ElectronicProduct electronicProduct = new ElectronicProduct("Asus zenbook",
				176000, "prod43xs12", 2);
		
		System.out.println(" Product Name : " + electronicProduct.productName);
		System.out.println(" Product Price : " + electronicProduct.price);
		System.out.println(" Product Id : " + electronicProduct.productId);
		System.out.println(" Product Warranty : " + electronicProduct.warranty);
	}

}
