package com.kodewala.day13.practice;

public class Rectangle {
	double length;
	double width;
	double area;
	static int count = 0;
	{
		count++;
	}
	public Rectangle() {
		this.length = 1;
		this.width = 1;
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		this.area = this.length * this.width;
	}
}
