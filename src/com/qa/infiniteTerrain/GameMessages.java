package com.qa.infiniteTerrain;

public class GameMessages {
	private String introMessage = "Grey foggy clouds float oppressively close to you, \r\n" + 
			"reflected in the murky grey water which reaches up your shins.\r\n" + 
			"Some black plants barely poke out of the shallow water.\r\n" + 
			"You notice a small watch-like device in your left hand.  \r\n" + 
			"It has hands like a watch, but the hands don't seem to tell time. \r\n" + 
			"";
	
	private String vialMessage = "Try \"north\",\"south\",\"east\",or \"west\"\r\n" ;
	
	private String endGameMessage = "You see a box sitting on the plain.\r\\n"
			+ "Its filled with treasure!\r\\n  You win!  The end.";
	
	public String getIntroMessage() {
		return introMessage;
	}
	
	public String getVialMessage() {
		return vialMessage;
	}
	
	public String getEndGameMessage() {
		return endGameMessage;
	}
	
}
