package com.kodewala.exception.day44;

public class Driver2 {
	public static void main(String[] args) {
		/**
		 * If we don't pass any arguments from  command line 
		 * and we try to perform operation using array indexes
		 * then we'll get ArrayIndexOutOfBoundException
		 */
		String name = args[0];
		byte age = (byte) Integer.parseInt(args[1]);
		System.out.println(" NAME : " + name + " || AGE : " + age);
	}
}
