package com.sushovan.oops.encapsulation.day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {
	List<String> players;
	
	public Team(List<String> players) {
		this.players = new ArrayList<String>(players);
	}
	
	public void addMember(String name) {
		players.add(name);
	}
	
//	providing controlled way to getter method, if anyone tries to modify then it will rise an RE
	public List<String> getPlayers() {
		return Collections.unmodifiableList(players);
	} 
}
