package com.kodewala.day13.practice;


public class AreaCalculator {

	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle();
		System.out.println(Rectangle.count + " no. rectangel length : " + rec1.length);
		System.out.println(" width : " + rec1.width);
		System.out.println(" are is : " + rec1.area);
		
		Rectangle rec2 = new Rectangle(3, 5);
		System.out.println(Rectangle.count + " no. rectangle length : " + rec2.length);
		System.out.println(" width : " + rec2.width);
		System.out.println(" are is : " + rec2.area);

	}
}
