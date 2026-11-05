package com.kodewala.interf_day41.part01;

public class User implements Cleanable {
	private String userName;
	private String id;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String userName, String id) {
		super();
		this.userName = userName;
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
}
