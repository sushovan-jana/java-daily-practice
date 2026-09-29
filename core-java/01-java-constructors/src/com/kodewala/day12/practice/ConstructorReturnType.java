package com.kodewala.day12.practice;

public class ConstructorReturnType {

//	It is a constructor but if we use return even 'void' compiler will treat it as a normal method
//	not recommended to use 
//	public void ConstructorReturnType() {
//		System.out.println("No, more constructor its a method...");
//	}
	
	public ConstructorReturnType() {
		System.out.println("Constructor executed...");
	}

	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		ConstructorReturnType crt = new ConstructorReturnType();
//		crt.ConstructorReturnType();// treating that like a normal method...
	}

}
