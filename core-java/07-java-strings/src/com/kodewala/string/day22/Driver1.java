package com.kodewala.string.day22;
/**
 * This class is responsibe to see how objects are crated in SCP
 */
public class Driver1 {

	public static void main(String[] args) {
		
//		create String objects using String literals
		String firstName = "Kodewala";
		String lastName = "Kodewala";
		
/**
 * Object created in SCP --> firstName's address imagining 'xyz123'
 * While creating another object using String literal it will check in SCP		
 * Does the object already exist, if exist then use the existing
 * lastName's content is exactly same as firstName content, so both will point to same object,
 * present inside SCP (special area inside HEAP)
 */
		
//		address comparison : firstName and lastName is the name of reference, or it holds the reference
		System.out.println(firstName == lastName); // true
		System.out.println(firstName.hashCode()); // 255282244
		System.out.println(lastName.hashCode()); // 255282244
	}

}
