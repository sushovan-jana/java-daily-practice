package com.sushovan.exception.practice;

public class Driver4 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("Driver4.main()...START");
		String name = null;
		try {
			System.out.println(" name length : " + name.length());
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(" Exception caught ");
			System.out.println(" Using printStackTrace() ");
			e.printStackTrace();
			System.out.println("----------------------");
			System.out.println(" Using toString() ==> " + e.toString());
			System.out.println("----------------------");
			System.out.println(" Using getMessage() ==> " + e.getMessage());

		}
		
		System.out.println("Driver4.main()...END");
	}
}
