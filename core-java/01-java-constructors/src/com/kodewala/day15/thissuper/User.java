package com.kodewala.day15.thissuper;

class SuperUser extends Object // If we do not do this also by default the class will be child of Object
{
	
}

public class User extends SuperUser
{
	String username;
	String userId;
	String mobile;
	
//	no-arg constructor
	public User() 
	{
		System.out.println(" no-arg constructor executed");
	}
	
	public User(String _username, String _userId, String _mobile) 
	{
		this(); // it will call the constructor that does not expecting any argument in same class
		this.username = _username;
		this.userId = _userId;
		this.mobile = _mobile;
	}
	
}
