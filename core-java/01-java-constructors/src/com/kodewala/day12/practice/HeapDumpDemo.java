package com.kodewala.day12.practice;

public class HeapDumpDemo {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Sushovan Jana", "8527419638", 85);
		Student s2 = new Student(2, "Narendra Modi", "9967419638", 25);
		
		System.out.println(s1.name + " " + s1.totalMarks);
		System.out.println(s2.name + " " + s2.totalMarks);
	}
}
