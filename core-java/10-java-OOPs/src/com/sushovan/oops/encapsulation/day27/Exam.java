package com.sushovan.oops.encapsulation.day27;

import java.util.Arrays;

public class Exam {
	
	private int[] marks;
	
//	providing control via Arrays.copyOf() method
	public Exam(int[] marks) {
		this.marks = Arrays.copyOf(marks, marks.length);
	}
	
//	getter
	public int[] getMarks() {
		return marks;
	}
	
	
}
