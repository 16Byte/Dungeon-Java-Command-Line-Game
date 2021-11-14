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

    public static void main(String[] args){
		int boardSizeX = 4;
		int boardSizeY = 4;
		int minLesserMonsterRange = 0;
		int maxLesserMonsterRange = 2;
		
		int startLocX = 0;
		int startLocY = 0;
		
		//Initialize Game
		//Create RoomGenerator
		RoomGenerator roomGen = new RoomGenerator();
		
		//Create Player
		Player p1 = new Player();
		
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
		
		//Generate All Rooms
		
		//game running after this point
		DungeonRoom.DrawRoom();
		//Initialize Player and start the game
		p1.InitializePlayer(startLocX, startLocY);
		
		
		
    }
	
	public void GenerateMap() {
		
	}
    
}