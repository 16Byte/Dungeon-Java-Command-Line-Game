import java.util.*;

public class Room {
	public static void main(String[] args) {
		
	}
	
	public Room() {
		System.out.println("Room.java has been piped to RoomGenerator in Run.java");
	}
	
	public Room(String typeOfRoom, int boardSizeX, int boardSizeY, int[][] gameBoard) {
		//System.out.println("You've made it to creating a room, good job this room is, \"" + typeOfRoom + "\". It's size is X: " + boardSizeX + " and Y: " + boardSizeY);
	
		//method starts here
		if(typeOfRoom.equals("start")) { //start -- safe
			
			for(int x = 0; x < gameBoard.length; x++) {
				for(int y = 0; y < gameBoard.length; y++) {
					gameBoard[x][y] = 0;
				}//end y loop
			}//end x loop
		} 
		else if(typeOfRoom.equals("empty")) { //empty -- safe
			
			for(int x = 0; x < gameBoard.length; x++) {
				for(int y = 0; y < gameBoard.length; y++) {
					gameBoard[x][y] = 1;
				}//end y loop
			}//end x loop
		} 
		else if(typeOfRoom.equals("sword")) { //sword -- safe
			
			for(int x = 0; x < gameBoard.length; x++) {
				for(int y = 0; y < gameBoard.length; y++) {
					gameBoard[x][y] = 2;
				}//end y loop
			}//end x loop
		} 
		else if(typeOfRoom.equals("lm3")) { //lesser monsters only level 3
			
			for(int x = 0; x < gameBoard.length; x++) {
				for(int y = 0; y < gameBoard.length; y++) {
					gameBoard[x][y] = 3;
				}//end y loop
			}//end x loop
		}
		else if(typeOfRoom.equals("lm34")) { //lesser monsters levels 3-4
			
			for(int x = 0; x < gameBoard.length; x++) {
				for(int y = 0; y < gameBoard.length; y++) {
					gameBoard[x][y] = 4;
				}//end y loop
			}//end x loop
		} 
		else if(typeOfRoom.equals("shield")) { //shield room with lesser monsters levels 3-4
			
			for(int x = 0; x < gameBoard.length; x++) {
				for(int y = 0; y < gameBoard.length; y++) {
					gameBoard[x][y] = 5;
				}//end y loop
			}//end x loop
		} 
		else if(typeOfRoom.equals("key")) { //key room with lesser monsters level 4 only
			
			for(int x = 0; x < gameBoard.length; x++) {
				for(int y = 0; y < gameBoard.length; y++) {
					gameBoard[x][y] = 6;
				}//end y loop
			}//end x loop
		}
		else if(typeOfRoom.equals("prep")) { //prep room for dragon fight -- safe
			
			for(int x = 0; x < gameBoard.length; x++) {
				for(int y = 0; y < gameBoard.length; y++) {
					gameBoard[x][y] = 7;
				}//end y loop
			}//end x loop
		} 
		else if(typeOfRoom.equals("dragon")) { //dragon room with lesser monsters levels 4-5
			
			for(int x = 0; x < gameBoard.length; x++) {
				for(int y = 0; y < gameBoard.length; y++) {
					gameBoard[x][y] = 8;
				}//end y loop
			}//end x loop
		}
		
	}
}