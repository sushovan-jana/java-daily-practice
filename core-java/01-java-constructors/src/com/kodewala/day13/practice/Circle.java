package com.kodewala.day13.practice;

public class Circle {
	
	double radius;
	double area;
	
	private Circle(double radius) {
		this.radius = radius;
		createCircle(radius);
	}
	
	private Circle(double radius, double area) {
		this.radius = radius;
		this.area = area;
	}
	
	static Circle createCircle(double radius) {
		return new Circle(radius, radius * radius);
	}
}
