import java.util.*;

public class RoomGenerator {
	
	public RoomGenerator() {
		//System.out.println("RoomGenerator has been piped");
	}
	
	//Room Creator
	public RoomGenerator(String typeOfRoom, int boardSizeX, int boardSizeY) {
		GenerateRoom(typeOfRoom, boardSizeX, boardSizeY);
	}
	
	public int[][] gameBoard;
	
	public void GenerateRoom(String typeOfRoom, int boardSizeX, int boardSizeY) {
		//Call Room Class and Create a New Room Based On typeOfRoom.
		gameBoard = new int[boardSizeX][boardSizeY];
		Map<String, Room> rooms = new HashMap<>();
		rooms.put(typeOfRoom, new Room(typeOfRoom, boardSizeX, boardSizeY, gameBoard));
	}
	
	public void DrawRoom() {
		
		for(int x = 0; x < gameBoard.length; x++) {
			for(int y = 0; y < gameBoard.length; y++) {
				System.out.print(" |\t| " + gameBoard[x][y]);
			}//end y loop
			System.out.print(" |");
			System.out.println();
		}//end x loop
	}
	
	public void RoomSwitch(Room curRoom, Room nextRoom) {
		
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
	
	public void ClearSc(int targetNumber) {
		for(int i = 0; i < targetNumber; i++) {
			System.out.println();
		}
	}
	
	
}