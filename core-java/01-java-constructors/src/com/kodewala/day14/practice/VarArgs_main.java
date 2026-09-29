package com.kodewala.day14.practice;

public class VarArgs_main {
	public static void main(String... args) {
		System.out.println(" Your entered values for command line arguments are : ");
		for (String string : args) {
			System.out.println(string);
		}
	}
}
