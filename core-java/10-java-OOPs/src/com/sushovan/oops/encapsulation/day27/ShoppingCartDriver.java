package com.sushovan.oops.encapsulation.day27;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartDriver {

	public static void main(String[] args) {
		List<String> products = new ArrayList<String>();
		products.add("IPhone");
		products.add("Laptop");
		products.add("EarBuds");
		products.add("Mouse");
		 
		List<Integer> quantity = new ArrayList<Integer>();
		quantity.add(23);
		quantity.add(2);
		quantity.add(1);
		quantity.add(3);
		
		ShoppingCart cart = new ShoppingCart(products, quantity);
		cart.addProductQuantity("Nokia", 5);
		
		boolean removalResult = cart.removeProduct("Earbuds");
		if 
			(removalResult) System.out.println("Product removed");
		else 
			System.out.println("product can't be removed");
		
		
		List<String> getProducts =  cart.getProductDetails();
		List<Integer> getQuantity = cart.getQuantityDetails();
		
		for (int i = 0; i < getProducts.size(); i++) {
			System.out.println(getProducts.get(i) + " " + getQuantity.get(i));
		}
		
	}

}
