package com.kodewala.forloop.day18;
/**
 * This class is responsible to find cities that name is staring with 'S'
 */
public class CityNameFilter {

	public static void main(String[] args) {
		String[] cities = new String[5];
		cities[0] = "Bangalore";
		cities[1] = "Delhi";
		cities[2] = "Srinagar"; // <-
		cities[3] = "Shimla"; // <-
		cities[4] = "Kolkata";
		
		System.out.println("Cities name starts with 'S' : ");
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].startsWith("S")) {
				System.out.println(cities[i]);
			}
		}
		System.out.println("Retrieving using for-each loop : ");
//		we can for-each loop here
		for(String str : cities) {
			if(str.startsWith("S")) {
				System.out.println(str);
			}
		}
	}

}
