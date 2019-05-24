package com.qa.infiniteTerrain;

public class Player extends Compass{
	
public Player(int xValue, int yValue) {
		super(xValue, yValue);	
	}
	private String playerName;

	
	//player name
	public String getName() {
	return playerName;
	}	
	public void setName(String playerName) {
		 this.playerName = playerName;
		}
	



}
