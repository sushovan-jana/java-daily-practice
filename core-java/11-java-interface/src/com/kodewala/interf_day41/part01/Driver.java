package com.kodewala.interf_day41.part01;

public class Driver {
	public static void main(String[] args) {
		User user = new User("sushovan-jana", "USR4431");
		DataCleaner cleaner = new DataCleaner();
		cleaner.clean(user);
	}
}
