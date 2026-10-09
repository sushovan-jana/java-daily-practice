package com.kodewala.string.day24;
/**
 * Literals vs new
 */
public class Driver2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
//		we're interested in object content
		String cityString1 = "Bangalore";
		String cityString2 = "Bangalore";
		String cityString3 = "Bangalore";
		
//		if we're interested in object's identity (how many object created)
		String cityString4 = new String("Guest");
		String cityString5 = new String("Guest");
		String cityString6 = new String("Guest");
	}

}
