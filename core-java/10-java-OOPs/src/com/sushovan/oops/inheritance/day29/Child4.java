package com.sushovan.oops.inheritance.day29;

import java.io.IOException;

public class Child4 extends Parent4 {
/**
 * we cannot reduce visibility in child, in parent something1 () method is public,
 * but here in child we are making in <default> it's not possible...	
 */
//	@Override
//	void something1() {
//		
//	}
	
//	if child class method throws any exception then parent class method should throw either
//	same exception or its parent exception
	@Override
	public void something2() throws IOException {
		
	}
}
