package com.sushovan.oops.inheritance.day29;

public class Child2Driver {

	public static void main(String[] args) {
		Child2 child2 = new Child2();
		child2.callDoSomething();
		 
		Parent2 parent2 = new Parent2();
		parent2.callDoSomething();
		
		Parent2 parent22 = new Child2();
		parent22.callDoSomething();
	}

}
