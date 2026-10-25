package com.sushovan.oops.inheritance.day29;

public class Child extends Parent {
//	covarient return type applicable from 1.5v onwards
	@Override
	public String doSomething() {
		return "I'm covarient return type";
	}
}
