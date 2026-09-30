package com.sushovan.forloop.day18;

public class AmazonProductDiscount {

	public static void main(String[] args) {
//		creating objects
		AmazonProduct p1 = new AmazonProduct("Smartphone", 15000, "Electronics");
		AmazonProduct p2 = new AmazonProduct("Earphones", 2000, "Electronics");
		AmazonProduct p3 = new AmazonProduct("Laptop", 45000, "Electronics");
		AmazonProduct p4 = new AmazonProduct("Running Shoes", 6000, "Footwear");
		AmazonProduct p5 = new AmazonProduct("Coffee Mug", 500, "Kitchen");
		AmazonProduct p6 = new AmazonProduct("Smart TV", 35000, "Electronics");
		AmazonProduct p7 = new AmazonProduct("Office Chair", 7000, "Furniture");

//		storing objects in an array of type AmazonProduct
		AmazonProduct[] products = new AmazonProduct[] { p1, p2, p3, p4, p5, p6, p7 };
		
		System.out.println(" Retrieving the products whose prize is above 5k and ");
//		retrieve the products whose prize is above 5k and category is Electronics
		
		for (int i = 0; i < products.length; i++) {
			
			if (products[i].amount > 5000 && products[i].category.equals("Electronics")) {
				
				System.out.println(" -> " + products[i].productName + " - " + products[i].amount);
				
//				give those products 10% discount
//				 it will return double so type casting to int type
				products[i].amount = (int) (products[i].amount - (products[i].amount * 0.1));
				
				System.out.println(" After discount " + products[i].productName + "'s prize is " + products[i].amount);
			}
		}

	}

}
