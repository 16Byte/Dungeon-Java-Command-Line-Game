import java.util.*;

public class RoomGenerator {

	public static void main(String[] args) {
		
	}
	
	public RoomGenerator() {
		System.out.println("RoomGenerator has been piped to run");
	}
	
	public RoomGenerator(String typeOfRoom, int boardSizeX, int boardSizeY) {
		GenerateRoom(typeOfRoom, boardSizeX, boardSizeY);
	}
	
	public int[][] gameBoard;
	
	public void GenerateRoom(String typeOfRoom, int boardSizeX, int boardSizeY) {
		gameBoard = new int[boardSizeX][boardSizeY];
		
		Map<String, Room> rooms = new HashMap<>();

		rooms.put(typeOfRoom, new Room(typeOfRoom, boardSizeX, boardSizeY));

		/*
		if(typeOfRoom.equals("start")) { //start -- safe
			rooms.put(typeOfRoom, new Room(typeOfRoom));
			
		} 
		else if(typeOfRoom.equals("empty")) { //empty -- safe
			
			
		} 
		else if(typeOfRoom.equals("sword")) { //sword -- safe
			
			
		} 
		else if(typeOfRoom.equals("lm3")) { //lesser monsters only level 3
			
			
		}
		else if(typeOfRoom.equals("lm34")) { //lesser monsters levels 3-4
			
			
		} 
		else if(typeOfRoom.equals("shield")) { //shield room with lesser monsters levels 3-4
			
			
		} 
		else if(typeOfRoom.equals("key")) { //key room with lesser monsters level 4 only
			
			
		}
		else if(typeOfRoom.equals("prep")) { //prep room for dragon fight -- safe
			
			
		} 
		else if(typeOfRoom.equals("dragon")) { //dragon room with lesser monsters levels 4-5
			
			
		}
		*/
		for(int x = 0; x < gameBoard.length; x++) {
			for(int y = 0; y < gameBoard.length; y++) {
				gameBoard[x][y] = 0;
			}//end y loop
		}//end x loop
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
	
	public void MovePlayer(int newX, int newY, String typeOfRoom) {
		
	}
	
	
}