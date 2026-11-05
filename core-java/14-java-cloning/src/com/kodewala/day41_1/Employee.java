package com.kodewala.day41_1;

public class Employee implements Cloneable { // level 1
	private String name; // copy
	private String empCode; // copy
	private Address address; // HAS-A (Object inside object) -> copy only the reference not actual object

	public Employee(String name, String empCode, Address address) {
		super();
		this.name = name;
		this.empCode = empCode;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpCode() {
		return empCode;
	}

	public void setEmpCode(String empCode) {
		this.empCode = empCode;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Employee clonedEmp = (Employee) super.clone();
		clonedEmp.address = (Address) address.clone();
		return clonedEmp;
	}

}
