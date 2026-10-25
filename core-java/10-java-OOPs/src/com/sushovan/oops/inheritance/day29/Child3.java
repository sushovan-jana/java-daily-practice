package com.sushovan.oops.inheritance.day29;

public class Child3 extends Parent3 {
//	we can't not override final method
//	public final void finalMethod() {
//		System.out.println("Child3.finalMethod()");
//	}
	
//	but, we can override a non final method and can make it final method
	@Override
	public final void nonFinalMethod() {
		System.out.println("Child3.nonFinalMethod()");
	}
}
