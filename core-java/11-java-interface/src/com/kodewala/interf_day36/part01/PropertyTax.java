package com.kodewala.interf_day36.part01;

public class PropertyTax implements IPropertyTaxDiscount {

	@Override
	public int calculateDiscount(int amount, int rate) {
		return 0;
	}

	@Override
	public void calculateDiscountTax(int tax) {
		System.out.println("PropertyTax.calculateDiscountTax()");
	}

	@Override
	public void calcualtePropDisc() {
		System.out.println("PropertyTax.calcualtePropDisc()");
	}

}
