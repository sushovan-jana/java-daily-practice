package com.kodewala.day13.practice;

public class CircleCreator {
	public static void main(String[] args) {
		Circle c1 = Circle.createCircle(5);
		System.out.println(c1.radius + "   ---> " + c1.area);
		
//		we'll get compile time error, as the constructor is not visible to this class
//		Circle c2 = new Circle();
	}
}
