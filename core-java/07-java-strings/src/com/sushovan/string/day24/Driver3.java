package com.sushovan.string.day24;

public class Driver3 {

	public static void main(String[] args) {
		String a = new String("Core") + "Java";
//		'Core' is literal it goes inside SCP
//		new String("Core"); -> this goes in HEAP
//		+ operator joins Core and Java, its not compile time constant it's a new object
//		it goes inside HEAP (CoreJava) , a is pointing to HEAP
		String b = a.intern();
		String c = "CoreJava";
		
		System.out.println(a == b); // true
		System.out.println(b == c); // true

	}

}
