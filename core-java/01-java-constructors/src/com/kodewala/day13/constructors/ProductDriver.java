package com.kodewala.day13.constructors;

public class ProductDriver {

	public static void main(String[] args) {
//		creating product objects
		Product prd1 = new Product();
		System.out.println(" So, the product name is : " + prd1.productName);
		System.out.println(" product price is : " + prd1.productPrice);
		System.out.println(" product description : " + prd1.description);
		System.out.println(" quantity is : " + prd1.quantity);
		
		Product prd2 = new Product("Laptop", "It's assus zenbook laptop of cost 127000 INR");
		System.out.println(" So, the product name is : " + prd2.productName);
		System.out.println(" product price is : " + prd2.productPrice);
		System.out.println(" product description : " + prd2.description);
		System.out.println(" quantity is : " + prd2.quantity);
		
		Product prd3 = new Product("IPhone", 87000, " It's IPhone 15", 2);
		System.out.println(" So, the product name is : " + prd3.productName);
		System.out.println(" product price is : " + prd3.productPrice);
		System.out.println(" product description : " + prd3.description);
		System.out.println(" quantity is : " + prd3.quantity);
	}
}

