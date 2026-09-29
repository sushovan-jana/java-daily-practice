package com.kodewala.day15.practice;

interface interf2 {
// 	int x; // we'll get compile time error : = symbol expected
	int y = 10;
}

class ServiceProvider2 implements interf2 {
	public static void main(String[] args) {
// 		y = 888; // Compile time error: as the y is by default final
		int y = 555; // it will work as its a local variable now, can be accessed within the method only
		System.out.println(y); // 555
		System.out.println(interf2.y); // 10
		
		
	}
}