package com.sushovan.oops.inheritance.day29;

public class Child3Driver {
	public static void main(String[] args) {
		Child3 child3 = new Child3();
		child3.finalMethod();
		
		child3.nonFinalMethod();
		
		Parent3 parent3 = new Child3();
		parent3.finalMethod();
		parent3.nonFinalMethod();
	}
}
