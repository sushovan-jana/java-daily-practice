package com.sushovan.accessmodifiers.employee;

public class Employee
{
	public String companyName = "XYZ-PVT-LTD";
	String name = "Sushovan Jana"; // default
	protected int accBalance = 4321234;
	private int atmPin = 721354;
	
	public void name()
	{
		System.out.println(" Employee name is : " + name);
	}
	
	void accBalance()
	{
		System.out.println(" Employee Acc balance is : " + accBalance);
	}
	
	protected void atmPin()
	{
		System.out.println(" Employee atm pin is : " + atmPin);
	}
	
	private void companyName()
	{
		System.out.println(" Employee companyt name is : " + companyName);
	}
}