package com.sushovan.oops.encapsulation.day27;

import java.util.Arrays;

public class ExamDriver {
	public static void main(String[] args) {
		int[] marks = {78, 79, 45, 88, 90};
		Exam exam = new Exam(marks);
		
		int[] getMarks = exam.getMarks();
		System.out.println(Arrays.toString(getMarks));
		getMarks[0] = 999;
		System.out.println(Arrays.toString(getMarks));
		System.out.println(marks[0]);
	}
}
