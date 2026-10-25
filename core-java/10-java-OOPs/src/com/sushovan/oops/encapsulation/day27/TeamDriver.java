package com.sushovan.oops.encapsulation.day27;

import java.util.ArrayList;
import java.util.List;

public class TeamDriver {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("adhiswar");
		list.add("Ramesh");
		list.add("Shrishti");
		
		Team team = new Team(list);
		team.addMember("Priyanka");
		
		List<String> getPlayer = team.getPlayers();
		getPlayer.add("Sonu"); // it will rise RE : UnsupportedOperationException
		
	}
}
