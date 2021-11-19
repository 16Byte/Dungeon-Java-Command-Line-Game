import java.util.*;

//This class is meant to add a player and include all movement and interaction methods

//THIS METHOD SHOULD INCLUDE EVERYTHING THE PLAYER IS CAPABLE OF AS WELL AS FUNCTIONALITY AND THEN BE EXECUTABLE TO AFFECT THE PLAYER INSTANTIATION THROUGH THE RUN PROGRAM
//EACH PLAYER THAT IS INSTANTIATED (REAL WORLD SCENERIO NOT IN MIND) SHOULD BE CONTROLLED ALL AT THE SAME TIME AND HAVE THEIR OWN EFFECTS APPLIED TO THEM.
//MULTIPLAYER IN 2.0
public class Player {
	
	Scanner user = new Scanner(System.in);
	RoomGenerator roomGen = new RoomGenerator();
	
	String name = "Steve";//default name
	String gend = "other";//default gend
	
	int maxPlayerHP = 10;
	int minPlayerHP = 0;
	int playerHP = 10;
	
	int shieldDamageBuff = 2;
	
	public void Player() {
		//initialization
		
		
	}
	
	public void InitializePlayer(int startLocX, int startLocY) {
		
		//PreMovement(startLocX, startLocY);
	}
	
	public String setPlayerName() {
		name = user.nextLine();
		return name;
	}
	
	public String getPlayerName() {
		String playerName = name;
		return name;
	}
	
	public String setPlayerGend() {
		//an attempt to bring a pokemon-style gameplay "Now tell me. Are you a boy? Or are you a girl?" -Professor Oak, September 28, 1998
		gend = user.nextLine();
		return gend;
	}
	
	public String getPlayerGend() {
		return gend;
	}
	
	public void PreMovement(int curPosX, int curPosY) {
		System.out.println();
		System.out.println("Please choose a direction to move");
		System.out.println(" W   |          | W = Up   |           |");
		System.out.println("ASD  | A = Left | S = Down | D = Right |");
		System.out.println("Press ENTER To Confirm Selection");
		String intendedDirection = user.nextLine();
		
		Movement(curPosX, curPosY, intendedDirection);
		
	}
	
	public void Movement(int curPosX, int curPosY, String intendedDirection) {
		
		int newX;
		int newY;
		
		if(intendedDirection.equals("w") || intendedDirection.equals("W") ) { //up
			//TODO: Create a block that moves the position of the player when triggered then updates the board
			System.out.println(curPosX + " " + curPosY + " " + intendedDirection);
		} 
		else if(intendedDirection.equals("a") || intendedDirection.equals("A")) { //left
			//TODO: Create a block that moves the position of the player when triggered then updates the board
			System.out.println(curPosX + " " + curPosY + " " + intendedDirection);
		} 
		else if(intendedDirection.equals("s") || intendedDirection.equals("S")) { //down
			//TODO: Create a block that moves the position of the player when triggered then updates the board
			System.out.println(curPosX + " " + curPosY + " " + intendedDirection);
		} 
		else if(intendedDirection.equals("d") || intendedDirection.equals("D")) { //right
			
			//TODO: Create a block that moves the position of the player when triggered then updates the board
			System.out.println(curPosX + " " + curPosY + " " + intendedDirection);
		}
		
		
	}
	
	public void PreEncounter(String objectType, String typeModifier) {
		System.out.println();
		System.out.println("Looks like you've encountered a " + objectType + "!");
		System.out.println("What are you going to do?");
		
		if(objectType == "item") {
			InteractWithItem();
		} else if(objectType == "lesserMonster") {
			FightLesserMonster();
		} else if(objectType == "dragon") {
			FightDragon();
		}
		
		System.out.println();
		System.out.println(" W   |          | W = Keep |      |");
		System.out.println("ASD  | A =      | S = Drop | D =  |");
		String intendedDirection = user.nextLine();
	}
	
	public void InteractWithItem() {
		
	}
	
	public void FightLesserMonster() {
		
	}
	
	public void FightDragon() {
		
	}
	
	public void playerWinASCII() {
		System.out.println();
		System.out.println("          _______                     _________ _        _ ");
		System.out.println("|\\     /|(  ___  )|\\     /|  |\\     /|\\__   __/( (    /|( )");
		System.out.println("( \\   / )| (   ) || )   ( |  | )   ( |   ) (   |  \\  ( || |");
		System.out.println(" \\ (_) / | |   | || |   | |  | | _ | |   | |   |   \\ | || |");
		System.out.println("  \\   /  | |   | || |   | |  | |( )| |   | |   | (\\ \\) || |");
		System.out.println("   ) (   | |   | || |   | |  | || || |   | |   | | \\   |(_)");
		System.out.println("   | |   | (___) || (___) |  | () () |___) (___| )  \\  | _ ");
		System.out.println("   \\_/   (_______)(_______)  (_______)\\_______/|/    )_)(_)");
		System.out.println("                                                           ");
		System.out.println();
	}
	
	public void playerDeathASCII() {
		System.out.println();
		System.out.println("          _______             ______  _________ _______  ______   _ ");
		System.out.println("|\\     /|(  ___  )|\\     /|  (  __  \\ \\__   __/(  ____ \\(  __  \\ ( )");
		System.out.println("( \\   / )| (   ) || )   ( |  | (  \\  )   ) (   | (    \\/| (  \\  )| |");
		System.out.println(" \\ (_) / | |   | || |   | |  | |   ) |   | |   | (__    | |   ) || |");
		System.out.println("  \\   /  | |   | || |   | |  | |   | |   | |   |  __)   | |   | || |");
		System.out.println("   ) (   | |   | || |   | |  | |   ) |   | |   | (      | |   ) |(_)");
		System.out.println("   | |   | (___) || (___) |  | (__/  )___) (___| (____/\\| (__/  ) _ ");
		System.out.println("   \\_/   (_______)(_______)  (______/ \\_______/(_______/(______/ (_)");
		System.out.println("                                                                    ");
		System.out.println();
	}
	
}