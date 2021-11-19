import java.util.*;
/*

	The objective of the game is to defeat a dragon that has been lurking villagers
	from the nearby town. To succeed, the character will first equip itself with a sword and a shield
	
	Both items got list in time.

	The mission of the game is to find and acquire both sacred tools to stop the nightmare of the fearsome monster.
	
	each cell could represent:
		an empty room
		a room with a lesser monster guarding either the shield or the sword
		a room guarded by the terrible dragon

*/

public class run {
	
	public static int seconds = 1000;

    public static void main(String[] args){
		int boardSizeX = 4;
		int boardSizeY = 4;
		int minLesserMonsterRange = 0;
		int maxLesserMonsterRange = 2;
		
		boolean hasKey = false;
		boolean hasSword = false;
		boolean hasShield = false;
		
		int startLocX = 0;
		int startLocY = 0;
		
		//Initialize Game
			//Create RoomGenerator
		RoomGenerator roomGen = new RoomGenerator();
		
		//Create All Rooms
		RoomGenerator DungeonRoom = new RoomGenerator("start", boardSizeX, boardSizeY);
		RoomGenerator EmptyRoom = new RoomGenerator("empty", boardSizeX, boardSizeY);
		RoomGenerator SwordRoom = new RoomGenerator("sword", boardSizeX, boardSizeY);
		RoomGenerator LM3Room = new RoomGenerator("lm3", boardSizeX, boardSizeY);
		RoomGenerator LM34Room = new RoomGenerator("lm34", boardSizeX, boardSizeY);
		RoomGenerator ShieldRoom = new RoomGenerator("shield", boardSizeX, boardSizeY);
		RoomGenerator KeyRoom = new RoomGenerator("key", boardSizeX, boardSizeY);
		RoomGenerator PrepRoom = new RoomGenerator("prep", boardSizeX, boardSizeY);
		RoomGenerator DragonRoom = new RoomGenerator("dragon", boardSizeX, boardSizeY);
		
			//Create Player
		Scanner user = new Scanner(System.in);
		Player p1 = new Player();
		
			//intro
		IntroScene(roomGen, p1);
		
			//Create GameHandler
		GameHandler gh = new GameHandler();
		
		/*
			game running using GameHandler class at this point
			game will run in GameHandler until the player either
			dies or beats the dragon
		*/
		
		
		
		
		
		
		
		
		

		//end game
		//Credits(DungeonRoom, EmptyRoom, SwordRoom, LM3Room, LM34Room, ShieldRoom, KeyRoom, PrepRoom, DragonRoom, roomGen, p1);
    }
	

	public static void Credits(	RoomGenerator DungeonRoom, RoomGenerator EmptyRoom, RoomGenerator SwordRoom, RoomGenerator LM3Room, RoomGenerator LM34Room, 
								RoomGenerator ShieldRoom, RoomGenerator KeyRoom, RoomGenerator PrepRoom, RoomGenerator DragonRoom, RoomGenerator roomGen, Player p1	) {
		int clsSpacing = 50;
		roomGen.ClearSc(clsSpacing);
		DungeonRoom.DrawRoom();
		System.out.println("Starting Room");
		EmptyRoom.DrawRoom();
		System.out.println("Second Room");
		SwordRoom.DrawRoom();
		System.out.println("Sword Room");
		LM3Room.DrawRoom();
		System.out.println("Monster Room");
		LM34Room.DrawRoom();
		System.out.println("Monster Room");
		ShieldRoom.DrawRoom();
		System.out.println("Shield Room");
		KeyRoom.DrawRoom();
		System.out.println("Key Room");
		PrepRoom.DrawRoom();
		System.out.println("Prep Room");
		DragonRoom.DrawRoom();
		System.out.println("Dragon Room");
		
		System.out.println();
		System.out.println();
		p1.playerDeathASCII();
		p1.playerWinASCII();
		System.out.println();
		System.out.println();
		System.out.println("Made By: Diego Jimenez for CS 1301.");
		System.out.println("version: 1.0");
		System.out.println();
		System.out.println("Thanks for playing!");
		System.out.println("");
	}
	
	public static void IntroScene(RoomGenerator roomGen, Player p1) {
		System.out.println("                           Welcome To:                         ");
		System.out.println();
		System.out.println(" ______            _        _______  _______  _______  _       ");
		System.out.println("(  __  \\ |\\     /|( (    /|(  ____ \\(  ____ \\(  ___  )( (    /|");
		System.out.println("| (  \\  )| )   ( ||  \\  ( || (    \\/| (    \\/| (   ) ||  \\  ( |");
		System.out.println("| |   ) || |   | ||   \\ | || |      | (__    | |   | ||   \\ | |");
		System.out.println("| |   | || |   | || (\\ \\) || | ____ |  __)   | |   | || (\\ \\) |");
		System.out.println("| |   ) || |   | || | \\   || | \\_  )| (      | |   | || | \\   |");
		System.out.println("| (__/  )| (___) || )  \\  || (___) || (____/\\| (___) || )  \\  |");
		System.out.println("(______/ (_______)|/    )_)(_______)(_______/(_______)|/    )_)");
		System.out.println("                                                               ");
		System.out.println("                           A Game By:                          ");
		System.out.println("                         Diego Jimenez                          ");
		delay(5);
		roomGen.ClearSc(100);
		
		System.out.println();
		System.out.println("You hear the voice of an old man calling out to you.");
		delay(1);
		
		System.out.println();
		System.out.println("...");
		delay(2);
		
		System.out.println();
		System.out.println("Old Man: ...h..hey you!");
		delay(1);
		
		System.out.println();
		System.out.println("Old Man: Tell me young traveler, what is your name?");
		delay(1);
		
		p1.setPlayerName();
		delay(1);
		System.out.println();
		System.out.println("Old Man: Hello, " + p1.getPlayerName() + ".");
		delay(1);
		System.out.println("Old Man: ...");
		delay(2);
		System.out.println("Old Man: ...well, it seems as though my memory is fading.");
		delay(2);
		System.out.println("Old Man: My eye sight also seems to have failed me in this old age.");
		delay(3);
		System.out.println();
		System.out.println("Old Man: Forgive me, are you a boy, a girl, or maybe consider yourself something else?");
		p1.setPlayerGend();
		delay(1);
		System.out.println("Old Man: A " + p1.getPlayerGend() + "! Interesting, we'll see how you hold up against...");
		delay(2);
		System.out.println();
		System.out.println("Old Man: THE DRAGON!");
		delay(3);
		System.out.println();
		System.out.println("Old Man: oops... did I scare you?");
		System.out.println();		
		delay(2);
		System.out.println();
		System.out.println("Old Man: Anyways, off with you! Don't forget to find the sword and the shield.");
		System.out.println("Old Man: They'll help you out in the long run, unless you're insane.");
		delay(6);
		printGameGuide();
		delay(10);
		System.out.println("Game Starting in...");
		delay(1);
		System.out.println("3");
		delay(1);
		System.out.println("2");
		delay(1);
		System.out.println("1");
		delay(1);
		System.out.println("Good Luck!");
		delay(1);
	}
	
	public static void printGameGuide() {
		System.out.println("Game Guide:");
		System.out.println("	Controls:");
		System.out.println("	W = move up");
		System.out.println("	A = move left");
		System.out.println("	S = move down");
		System.out.println("	D = move right");
		System.out.println("	I = interact with object");
		System.out.println();
		System.out.println("	Interface Guide:");
		System.out.println("	0 = air");
		System.out.println("	1 = player");
		System.out.println("	2 = sword");
		System.out.println("	3 = shield");
		System.out.println("	4-6 = Monsters of varying levels 4 = easiest, 6 = hardest");
		System.out.println("	7 = door");
		System.out.println("	9 = Dragon");
		System.out.println("Do not worry about having to memorize this, there will be a menu");
		System.out.println("option to bring back up the game guide whenever you need a refresher!");
		System.out.println();
	}
	
	public static void delay(int delaySeconds) {
		try
      {
        // Delay for X seonds
        Thread.sleep(delaySeconds * 1000);   
      }
      catch(InterruptedException ex)
      {
          ex.printStackTrace();
      }
	}
    
}