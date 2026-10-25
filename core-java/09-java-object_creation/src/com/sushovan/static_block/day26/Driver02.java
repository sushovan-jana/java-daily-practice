package com.sushovan.static_block.day26;
/**
 * When static control flow comes to parent child relationship then the sequence is : 
 * 	indentification of static members from Parent to child (top to bottom)
 * 	execution of static variable assignments and static blocks from parent to child (top to bottom)
 * 	execution of child class main() method
 */
// Whenever we're loading child class , Parent class will be loaded 
public class Driver02 extends Parent02 {
	static int x = 33;
	static {
		System.out.println(" child static block 1");
		System.out.println(x);
	}
	
	static {
		System.out.println(" child static block 2");
	}
	
	public static void main(String[] args) {
		
	}
}
