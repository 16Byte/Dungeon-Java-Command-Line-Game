import java.util.*;

//game should only return to main method once the player either dies or beats the game
public class GameHandler {
	boolean dragonAlive = true;
	boolean playerAlive = true;
	
							//imports all of the variables that the run class has collected to be used in handling the game
	public void GameHandler(RoomGenerator DungeonRoom, RoomGenerator EmptyRoom, RoomGenerator SwordRoom, RoomGenerator LM3Room, RoomGenerator LM34Room, RoomGenerator ShieldRoom, RoomGenerator KeyRoom, RoomGenerator PrepRoom, RoomGenerator DragonRoom, RoomGenerator roomGen, Player p1) {
		System.out.println("GameHandler piped");
		GameOver();
	}
	
	public boolean BeatGame(boolean beatGame) {
		return beatGame;
	}
	
	public void GameOver() {
		if(dragonAlive && !playerAlive) {
			//player died and dragon lives on 
			BeatGame(false);
		} else if (!dragonAlive && playerAlive) {
			//player killed dragon and survived
			BeatGame(true);
		} else if (!dragonAlive && !playerAlive) {
			//somehow won but died anyway, let's honor our fallen hero
			BeatGame(true);
		}
	}
	
	public void HonorTheHero() {
		//put some kind of epic obituary about the player
		//and the player's achievments
	}

	
}