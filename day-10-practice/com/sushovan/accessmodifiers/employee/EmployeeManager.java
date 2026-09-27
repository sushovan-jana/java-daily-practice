package com.sushovan.accessmodifiers.employee;

class EmployeeManager
{
	public static void main(String args[])
	{
		Employee emp = new Employee();
		
		System.out.println(emp.companyName);
		System.out.println(emp.name);
		System.out.println(emp.accBalance);
//		System.out.println(emp.atmPin); // we can't access as atPin is private....
		
		emp.name();
		emp.accBalance();
		emp.atmPin(); // we can access via method that is not private 
		// and the private variable is actually accessable inside class only
		
//		emp.companyName(); // companyName() method is private we can't access directly ...
		
		
	}
}