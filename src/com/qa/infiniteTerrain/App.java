package com.qa.infiniteTerrain;

public class App {
 public static void main(String[] args) {
	//input class
	Input input = new Input();
	//while loop continue
	boolean cont = true;
	
	//Game messages class
	GameMessages gm = new GameMessages();
	String gameMessage = gm.getIntroMessage();
	String vialMessage = gm.getVialMessage();
	String endMessage = gm.getEndGameMessage();
	System.out.println(gameMessage);
	
	//Player class
	Player p1 = new Player(5, 5);
	p1.setName("Shazad");
	
	//objective
	Player treasure = new Player(6,5);
	
	while(cont) {
		
		int xValP =p1.getXVal();
		int yValP =p1.getYVal();
		
		
		
		int xValT =treasure.getXVal();
		int yValT =treasure.getYVal();
		
		//dial val - calculation
		//a
		int xDist = xValT - xValP; 
		//b
		int yDist = yValT - yValP; 
		double dialVal = Math.sqrt((xDist*xDist) + (yDist*yDist));
		
		//System.out.println("The dial reads '" + dialVal + "m'");
		System.out.println(vialMessage);
		String value = input.input().toLowerCase();
	
		if(value.equals("north")) {
			p1.north();
			
			System.out.println("The dial reads '" + dialVal + "m'");
			cont = true;
		}
		if(value.equals("east")) {
			p1.east();
			
			System.out.println("The dial reads '" + dialVal + "m'");
		}
		if(value.equals("south")) {
			p1.south();
			System.out.println("The dial reads '" + dialVal + "m'");
		}
		if(value.equals("west")) {
			p1.west();
			System.out.println("The dial reads '" + dialVal + "m'");
			
		}
		if(dialVal == 0) {
			System.out.println(endMessage);
			cont = false;
		}
		
	}
 }
}
