package com.kodewala.interf_day39.part02;

public class Account implements Cloneable // giving permissions so that object of this class can be cloned
{
	private String nameString;
	private String address;
	private String accNo;
	
	public Account(String nameString, String address, String accNo) {
		super();
		this.nameString = nameString;
		this.address = address;
		this.accNo = accNo;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
