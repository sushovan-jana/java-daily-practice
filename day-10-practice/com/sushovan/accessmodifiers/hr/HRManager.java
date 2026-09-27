package com.sushovan.accessmodifiers.hr;
import com.sushovan.accessmodifiers.employee;

// Employee is not public; it has default (package-private) access, 
// so it can be accessed only from the same package. 
// If the package name is wrong while running the program, 
// compilation may succeed, but the JVM cannot find the class at runtime. 
// Error: Could not find or load main class ... 
// If the import statement is wrong, the compiler cannot find the required class, 
// so compilation fails with an error such as: cannot find symbol.
class HRManager
{
	public static void main(String args[])
	{
		Employee emp = new Employee();
		
		System.out.println(emp.companyName);
//		System.out.println(emp.name); // we can't access as name is default
//		System.out.println(emp.accBalance); // accBalance is protected....
//		System.out.println(emp.atmPin); // we can't access as atPin is private....
		
		emp.name();
//		emp.accBalance(); // default so can't access
//		emp.atmPin(); // we can access via method that is not private 
		// and the private variable is actually accessable inside class only
		
//		emp.companyName(); // companyName() method is private we can't access directly ... 
	}
}  