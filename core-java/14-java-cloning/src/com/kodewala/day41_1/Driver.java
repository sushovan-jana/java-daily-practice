package com.kodewala.day41_1;

public class Driver {
	public static void main(String[] args) throws CloneNotSupportedException {
		Address address1 = new Address("16th Main Road", "27th Cross", "Bangalore");
//		Employee has an address...
		Employee emp1 = new Employee("Sushovan Jana", "EMPCD777", address1);
		// 1. Perform the shallow clone
		Employee clonedEmp1 = (Employee) emp1.clone(); 

		// 2. Change the name (Strings are immutable, so this only affects clonedEmp1)
		clonedEmp1.setName("UNKNOWN USER"); 

		// 3. DO NOT use 'new Address()'. Modify the existing address fields instead!
		clonedEmp1.getAddress().setLine1("5th Main Road");
		clonedEmp1.getAddress().setLine2("7th Cross");
		clonedEmp1.getAddress().setCity("Mysore"); // This will now change emp1's city too!

		System.out.println("Cloned Emp1 details :: ");
		System.out.println(clonedEmp1.getName() + " || " + clonedEmp1.getAddress().getCity());

		System.out.println(" Original Emp1 details :: ");
		System.out.println(emp1.getName() + " || " + emp1.getAddress().getCity());

	}
}
