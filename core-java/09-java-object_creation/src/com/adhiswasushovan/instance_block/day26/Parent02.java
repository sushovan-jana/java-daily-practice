package com.adhiswasushovan.instance_block.day26;
/**
 * Understanding the instance control flow WRt parent to child
 */
public class Parent02 {
	
	String userName;
	String userId;
	int age;
	
	{
		System.out.println(" Parent instance block 1" + userName);
	}
	
	public Parent02() {
		System.out.println(" no arg constructor executed");
	}
	
	{
		System.out.println(" Parent instance block 2");
	}
	
	public Parent02(String userName, String userId, int age) {
		System.out.println("Parent constructor");
		this.userName = userName;
		this.userId = userId;
		this.age = age;
	}
	
	{
		System.out.println(" Parent instance block 3" + userName);
	}
}
