package com.sushovan.static_block.day26;
// STATIC CONTROL FLOW WITHIN A CLASS....
/**
 * 1. indentification of static memebers from top to bottom
 * 2. execution of static variable assignment and static blocks from top to bottom
 * 		-> If variable is in RIWO state then we can't perform direct read but can perform indirect read
 * 		-> If we try to perform direct read we'll get compile time error : IllegalForward Reference
 * 3. execution of main() method
 */
public class Driver01 {
	// direct read operation is not possible before initialization
	// but we can perform indirect read operation
	static {
		m1(); // indirect read operation
//		System.out.println(num1); // num1 is in RIWO state, we can't access that one directly
	}
	
	static int num1 = 10;
	static int num2 = 20;
	
	static {
		System.out.println( " " + num1);
		m1();
//		System.exit(0); // shut down jvm, only 10 will be printed
	}
	
	public static void m1() {
		System.out.println(num1);
	}
/**
 * 	At first static block will be executed but without main() method it's not possible
 * 
 */
	public static void main(String[] args) {
		System.out.println(" Driver01.main() started");

	}

}


