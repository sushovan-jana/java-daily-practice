package com.sushovan.oops.encapsulation.day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShoppingCart {
	List<String> product;
	List<Integer> quantities;

	public ShoppingCart(List<String> product, List<Integer> quantities) {
		this.product = new ArrayList<String>(product);
		this.quantities = new ArrayList<Integer>(quantities);
	}
	
	public void addProductQuantity(String productName, int quantity) {
		product.add(productName);
		quantities.add(quantity);
	}
	
	public boolean removeProduct(String productName) {
		int temp = 0;
		for (int i = 0; i < product.size(); i++) {
			temp++;
			if (product.contains(productName) && quantities.get(temp) - 1 > 0) {
				product.remove(productName);
				return true;
			}
		}
		
		return false;
	}
	
	public List<String> getProductDetails() {
		return Collections.unmodifiableList(product);
	}
	
	public List<Integer> getQuantityDetails() {
		return Collections.unmodifiableList(quantities);
	}
}
