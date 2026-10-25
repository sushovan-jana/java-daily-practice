package com.adhiswasushovan.instance_block.day26;

/**
 * understanding instance control flow WRT single class : 
 * 1. identify instance members.
 * 2. assign vlaue to instance variables and execute instance block from top to bottom
 * 3. execute constructor
 */
public class Driver01 {
	
	{
//		new Driver01().m1(); // it will create stack overflow error
		// whenever a new object is created then instance block will be executed
//		System.out.println(name + " " + roll); // we can't direct read, as variables are in RIWO state
	}
	
	{
		System.out.println(" instance block 0");
	}
	
	String name;
	int roll;
	
//	instance block
	{
		System.out.println(" instance block 1");
		System.out.println( " " + name + " " + roll);
	}
	
	public Driver01() {
		System.out.println(" no arg constructor");
	}
	
	{
		System.out.println(" instance block 2");
	}
	
	public void m1() {
		System.out.println(name + " " + roll);
	}
	
	public Driver01(String name, int roll) {
		super();
		System.out.println(" Perameterized constructor");
		this.name = name;
		this.roll = roll;
	}
	
	{
		System.out.println(" instance block 3");
	}

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Driver01 driver01 = new Driver01("Sushovan", 101);

	}

}
