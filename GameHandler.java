import java.util.*;

//game should only return to main method once the player either dies or beats the game
public class GameHandler {
	boolean dragonAlive = true;
	boolean playerAlive = true;
	boolean beatGame = false;
	
							//imports all of the variables that the run class has collected to be used in handling the game
							//DungeonRoom, 				EmptyRoom, 				SwordRoom, 				LM3Room, 				LM34Room, 				ShieldRoom, 				KeyRoom, 				PrepRoom, 				DragonRoom, 			roomGen, 				p1
	public GameHandler(RoomGenerator DungeonRoom, RoomGenerator EmptyRoom, RoomGenerator SwordRoom, RoomGenerator LM3Room, RoomGenerator LM34Room, RoomGenerator ShieldRoom, RoomGenerator KeyRoom, RoomGenerator PrepRoom, RoomGenerator DragonRoom, RoomGenerator roomGen, Player p1) {
		//System.out.println("GameHandler piped");
		roomGen.ClearSc(100);
		RoomGenerator curRoom = DungeonRoom; 
		
		MainMenu(p1, curRoom, roomGen);
	}
	
	
	
	public boolean BeatGame() {
		boolean value = false;
		
		if(beatGame) {
			value = true;
		}else if(!beatGame) {
			value = false;
		}
		return value;
	}
	
	public void GameOver() {
		if(dragonAlive && !playerAlive) {
			//player died and dragon lives on 
			beatGame = false;
		} else if (!dragonAlive && playerAlive) {
			//player killed dragon and survived
			beatGame = true;
		} else if (!dragonAlive && !playerAlive) {
			//somehow won but died anyway, let's honor our fallen hero
			beatGame = true;
		}
		HonorTheHero();
	}
	
	public void HonorTheHero() {
		//put some kind of epic obituary about the player
		//and the player's achievments
		
		if(!BeatGame()) {
			//player died and dragon lives on 
			System.out.println("Player died and the dragon lives on");
		} else if (BeatGame()) {
			//player killed dragon and survived
			System.out.println("Player killed dragon and survived");
		} 
	}
	
	public void MainMenu(Player p1, RoomGenerator curRoom, RoomGenerator roomGen) {
		curRoom.DrawRoom();
		System.out.println();
		System.out.println("Please choose a direction to move");
		System.out.println("     |                                 |");
		System.out.println("     | 1 = Move | 2 = Heal | 3 = Leave |");
		System.out.println("Press ENTER To Confirm Selection");
		int intendedSelection = p1.user.nextInt();
		if(intendedSelection == 1) {
			roomGen.ClearSc(100);
			MovementMenu(p1, curRoom, roomGen);
		} else if(intendedSelection == 2) { //heal
			p1.playerHP = 100;
			roomGen.ClearSc(100);
			System.out.println("Player at full health!");
			MainMenu(p1, curRoom, roomGen);
		} else if(intendedSelection == 3) {
			roomGen.ClearSc(100);
			p1.playerDeathASCII();
		} else if(intendedSelection == 3 || intendedSelection == 2 || intendedSelection == 1) {
			roomGen.ClearSc(100);
			System.out.println("Invalid input");
			MainMenu(p1, curRoom, roomGen);
		}
	}
	
	public void MovementMenu(Player p1, RoomGenerator curRoom, RoomGenerator roomGen) {
		String intendedDirection = "g";
		
		while(!intendedDirection.equals("q")) {
			System.out.println();
			System.out.println("Please choose a direction to move");
			System.out.println(" W   |          | W = Up   |           |");
			System.out.println("ASD  | A = Left | S = Down | D = Right |");
			System.out.println("Press ENTER To Confirm Selection");
			intendedDirection = p1.user.nextLine();
			
			if(!intendedDirection.equals("q")) {
				Movement(p1, intendedDirection, curRoom, roomGen);
			}
		}
		roomGen.ClearSc(100);
		MainMenu(p1, curRoom, roomGen);
	}
	
	public boolean isOnTopEdge(int curPosX, int curPosY, Player p1) {
		boolean yon = false;
		
		//Edge Coordinates
		if(p1.curPosX == 0 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 3) {
			yon = true;
		}
		
		//Not Edge Coordinates
		else if(p1.curPosX == 1 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 3) {
			yon = true;
		}
		
		System.out.println(yon);
		return yon;
	}
	
	
	public boolean isOnBottomEdge(int curPosX, int curPosY, Player p1) {
		boolean yon = false;
		
		//Edge Coordinates
		if(p1.curPosX == 0 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 2) {
			yon = true;
		}
		
		//Not Edge Coordinates
		if(p1.curPosX == 0 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 3) {
			yon = true;
		}
		System.out.println(yon);
		return yon;
	}
	
	public boolean isOnLeftEdge(int curPosX, int curPosY, Player p1) {
		boolean yon = false;
		
		//Edge Coordinates
		if(p1.curPosX == 0 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 2) {
			yon = true;
		}
		
		//Not Edge Coordinates
		if(p1.curPosX == 0 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 3) {
			yon = true;
		}
		System.out.println(yon);
		return yon;
	}
	
	public boolean isOnRightEdge(int curPosX, int curPosY, Player p1) {
		boolean yon = false;
		
		//Edge Coordinates
		if(p1.curPosX == 0 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 2) {
			yon = true;
		}
		
		//Not Edge Coordinates
		if(p1.curPosX == 0 && p1.curPosY == 0) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 0 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 1 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 2 && p1.curPosY == 3) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 1) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 2) {
			yon = true;
		} else if(p1.curPosX == 3 && p1.curPosY == 3) {
			yon = true;
		}
		System.out.println(yon);
		return yon;
	}
	
	public void fightScenario() {
		
	}
	
	public String returnNextObstruction(Player p1, String intendedDirection, RoomGenerator curRoom, RoomGenerator roomGen) {
		String value = null;
		
		//item
		if(curRoom.gameBoard[p1.curPosX][p1.curPosY] == 8) {
			value = "item";
		} else if(curRoom.gameBoard[p1.curPosX][p1.curPosY] == 2) {
			value = "sword";
		} else if(curRoom.gameBoard[p1.curPosX][p1.curPosY] == 3) {
			value = "shield";
		} else if(curRoom.gameBoard[p1.curPosX][p1.curPosY] == 4) {
			value = "monsterLV4";
		} else if(curRoom.gameBoard[p1.curPosX][p1.curPosY] == 5) {
			value = "monsterLV5";
		} else if(curRoom.gameBoard[p1.curPosX][p1.curPosY] == 6) {
			value = "monsterLV6";
		} else if(curRoom.gameBoard[p1.curPosX][p1.curPosY] == 7) {
			value = "door";
		} else if(curRoom.gameBoard[p1.curPosX][p1.curPosY] == 9) {
			value = "dragon";
		}
		return value;
	}
	
	public void Movement(Player p1, String intendedDirection, RoomGenerator curRoom, RoomGenerator roomGen) {
		
		int interactingObject;
		
		
		
		if(intendedDirection.equals("w") || intendedDirection.equals("W") ) { //up
		//write an if statment that updates the isOnEdge boolean if we end up on the edge as well as make sure that we're not on the edge when we're starting out
			//if(isOnTopEdge(p1.curPosX, p1.curPosY, p1)) {
			//	System.out.println("You hit a wall!");
			//	MovementMenu(p1, curRoom, roomGen);
			//} 
			roomGen.ClearSc(100);
			System.out.println(p1.curPosX + " " + p1.curPosY + " " + intendedDirection);
			//defragment the player in it's current position
			curRoom.gameBoard[p1.curPosX][p1.curPosY] = 0;
			//refragment the player one space lower
			curRoom.gameBoard[p1.curPosX-1][p1.curPosY] = 1;
			//set new position in player class
			p1.curPosX = p1.curPosX-1;
			p1.curPosY = p1.curPosY;
			curRoom.DrawRoom();
			
		} 
		else if(intendedDirection.equals("a") || intendedDirection.equals("A")) { //left
			roomGen.ClearSc(100);
			System.out.println(p1.curPosX + " " + p1.curPosY + " " + intendedDirection);
			//defragment the player in it's current position
			curRoom.gameBoard[p1.curPosX][p1.curPosY] = 0;
			//refragment the player one space lower
			curRoom.gameBoard[p1.curPosX][p1.curPosY-1] = 1;
			//set new position in player class
			p1.curPosX = p1.curPosX;
			p1.curPosY = p1.curPosY-1;
			curRoom.DrawRoom();
			
		} 
		else if(intendedDirection.equals("s") || intendedDirection.equals("S")) { //down
			roomGen.ClearSc(100);
			System.out.println(p1.curPosX + " " + p1.curPosY + " " + intendedDirection);
			//defragment the player in it's current position
			curRoom.gameBoard[p1.curPosX][p1.curPosY] = 0;
			//refragment the player one space lower
			curRoom.gameBoard[p1.curPosX+1][p1.curPosY] = 1;
			//set new position in player class
			p1.curPosX = p1.curPosX+1;
			p1.curPosY = p1.curPosY;
			curRoom.DrawRoom();
			
		} 
		else if(intendedDirection.equals("d") || intendedDirection.equals("D")) { //right
			roomGen.ClearSc(100);
			System.out.println(p1.curPosX + " " + p1.curPosY + " " + intendedDirection);
			//defragment the player in it's current position
			curRoom.gameBoard[p1.curPosX][p1.curPosY] = 0;
			//refragment the player one space lower
			curRoom.gameBoard[p1.curPosX][p1.curPosY+1] = 1;
			//set new position in player class
			p1.curPosX = p1.curPosX;
			p1.curPosY = p1.curPosY+1;
			curRoom.DrawRoom();
			
		}
	}

	
}