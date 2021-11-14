import java.util.*;

public class Room {
	public static void main(String[] args) {
		
	}
	
	public Room() {
		System.out.println("Room.java has been piped to RoomGenerator in Run.java");
	}
	
	public Room(String typeOfRoom, int boardSizeX, int boardSizeY) {
		System.out.println("You've made it to creating a room, good job this room is, \"" + typeOfRoom + "\". It's size is X: " + boardSizeX + " and Y: " + boardSizeY);
	}
}