package com.sushovan.static_block.day26;

public class Parent02 {
	static {
		System.out.println(" Parent static block 1 executed");
		System.out.println(" indirect read performing");
//		System.out.println(x + " " + string); // direct read not possible as x is in RIWO state
		m1(); // indirect read operation
		System.out.println(" indirect read completed");
	}
	
	static int x = 10;
	static String string = "Sushovan";
	 
	public static void m1() {
		System.out.println(x);
		System.out.println(string);
	}
	
	static {
		System.out.println(x); // variables are not in RIWO state, values has been assigned
		System.out.println(string);
		System.out.println(" Parent static block 2 executed");
	}
}
