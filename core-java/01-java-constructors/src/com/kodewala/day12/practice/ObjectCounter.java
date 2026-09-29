package com.kodewala.day12.practice;

public class ObjectCounter {
	static int count = 0;
//	during creation of object if we want to perform any task we should do it in instance block...
//  here, we can use the constructors but code will be repeated... count variable we have to use in every constructor	
	{
		System.out.println("Instance blocked executed...");
		count++;
	}

	ObjectCounter() {
		System.out.println("No-Arg constructor executed...");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		ObjectCounter obj1 = new ObjectCounter();
		ObjectCounter obj2 = new ObjectCounter();
		ObjectCounter obj3 = new ObjectCounter();
		
		System.out.println("Total object created : " + count);
		
	}
}
