package com.sushovan.string.day24;
/**
 * Understanding String immutability
 */
public class Driver9 {
	public static void main(String[] args) {
		String a = "Java";
		String b = a;
		
		a.concat(" Developer");
		System.out.println(a); // O/P: "Java" 
		System.out.println(b); // O/P: "Java"
	}
}
