package com.kodewala.day13.practice;

import java.util.Arrays;

public class Team {
	
	String teamName;
	byte players;
	String[] playersName;
	
	public Team() {
		this("UNKNOWN", (byte)0, "UNKNOWN");
		System.out.println(" User did not provide values for so default values are given-> ");
	}
	
	public Team(String teamName, byte players, String... playersName) {
		this.teamName = teamName;
		this.players = players;
		this.playersName = playersName;
	}
	
	public static void main(String[] args) {
		Team t1 = new Team();
		System.out.println(" TEAM - " + t1.teamName);
		System.out.println(" TOTAL PLAYERS - " + t1.players);
		System.out.println(" AVAILABLE PLAYRES - " + Arrays.toString(t1.playersName));
		
		Team t2 = new Team("ABC", (byte)12, "Subhendu", "Narendra", "Rahul", "Yogi");
		System.out.println(" TEAM - " + t2.teamName);
		System.out.println(" TOTAL PLAYERS - " + t2.players);
		System.out.println(" AVAILABLE PLAYRES - " + Arrays.toString(t2.playersName));
	}
} 
