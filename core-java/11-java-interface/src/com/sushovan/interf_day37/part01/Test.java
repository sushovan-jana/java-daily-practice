package com.sushovan.interf_day37.part01;

/**
 * If two interface containing method with same sign but with different return types
 * then that implementation class can't implement two interfaces simultaneously. We'll
 * get compile time error.
 * 
 * If two interfaces containing same default method (method signature + return type) if we're implementing
 * two interfaces simultaneously in our class then we must have to give implementation for that
 * default method, otherwise we'll get compile time error. After providing implementation for that default
 * method we can call particular Interface's method using : interfaceName.super.methodName();
 */
public class Test implements Interf1, Interf2 {
	public static void main(String[] args) {
//		Test test = new Test();
//		test.doSomething();
	}

	@Override
	public void doSomething() {
		Interf1.super.doSomething();
		Interf2.super.doSomething();
	}

}
