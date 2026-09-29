package com.kodewala.day15.practice;

class ServiceProvider4 implements Right, Middle {
	public static void main(String[] args) {
		
	}
//	when two interfaces contain same method with same signature then we've to give implementation for one method only...
// But if one method having different type or number of parameter then we've to give implementation for both
// hense, those methods will be overloaded method.. in this case m1() is overloaded method
	public void m1() {
		System.out.println("HELLo");
	}
	
	public void m1(int i) {
		System.out.println("Parameterized method");
	}
} 