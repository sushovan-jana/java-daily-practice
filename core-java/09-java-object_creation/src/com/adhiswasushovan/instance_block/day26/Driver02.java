package com.adhiswasushovan.instance_block.day26;
/**
* Understanding the instance control flow WRt parent to child
*/
public class Driver02 extends Parent02 {
	{
		System.out.println(" child instance block 1");
	}
	
	String mobileNumber;
	String address;
	
	public Driver02() {
		super("Sushovan", "kod777", 23);
		System.out.println(" no arg child constructor");
	}
	
	{
		System.out.println(" child instance block 2");
	}
	
	public Driver02(String mobileNumber, String address) {
		System.out.println(" perameterized child constructor");
	}
	
	{
		System.out.println(" child instance block 3");
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Driver02 driver02 = new Driver02();

	}

}
