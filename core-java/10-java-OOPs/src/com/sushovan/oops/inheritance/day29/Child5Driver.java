package com.sushovan.oops.inheritance.day29;

public class Child5Driver {
	public static void main(String[] args) {
		Child5 child5 = new Child5();
		child5.m1(10);
		child5.m1();
		
		Parent5 parent5 = new Child5();
		parent5.m1(10);
		parent5.m1();
	}
}
