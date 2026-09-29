package com.kodewala.day13.practice;

public class Point {
	int x;
	int y;
	
	Point() {
		
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	Point(Point p) {
		this.x = p.x;
		this.y = p.y;
	}
	public static void main(String[] args) {
//		Point p1 = new Point();
		Point p2 = new Point(4, 5);
//		Point p3 = new Point(6, 7);
//		we're sending p2 that is of Point type in the constructor
		Point p4 = new Point(p2);
		System.out.println(" Object p4 having value of x : " + p4.x + " and y as " + p4.y);
		
	}

}
