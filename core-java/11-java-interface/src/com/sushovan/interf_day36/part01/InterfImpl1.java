package com.sushovan.interf_day36.part01;

/**
 * If two or more interfaces contains a method with same signature and same return type
 * then in the implementation class, we've to provide implementation for only one method
 * 
 * If two interfaces contains a method with same signature with different return types
 * then it is impossible to implement both interfaces simultaneously
 * 
 * If two interfaces contains a method with same signature but with different argument types
 * then in implementation class for both methods we've to give implementation. These methods will
 * be overloaded method
 */
public class InterfImpl1 implements Interf1, Interf2, Interf3 {

	@Override
	public void doSomething() {
		System.out.println("InterfImpl1.doSomething()");
	}

}
