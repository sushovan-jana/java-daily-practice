package com.kodewala.day14.constructors;

public class Driver {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Invoice inv1 = new Invoice(40000, "Samsung book 4", 
				"BTM Layout - 2nd Stage, Bangalore", "C4412", "User1");
		
		Invoice inv2 = new Invoice(65000, "HP Laptop", 
				"BTM Layout - 1st stage, Bangalore", "C7123", "User2");
		
		System.out.println(" First invoice : " + inv1.amount 
				+ "--" + inv1.customerId + "--" + inv1.gst);
		
		System.out.println(" Second invoice : " + inv2.amount 
				+ "--" + inv2.customerId + "--" + inv2.gst);
		
//		if we change Invoice.gst through any object reference/ or directly then 
//		it will be reflected in other objects also
		inv1.gst = 41;
		
		System.out.println(" Second invoice GST " + Invoice.gst);
		
		Invoice.gst = 21;
		System.out.println(" First invoice GST " + inv1.gst + " and second is " + inv2.gst);
	}
}