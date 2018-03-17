package pvc.json;

import pvc.engine.PvcGame;
import pvc.environment.GameSpace;

public class FactoryJSON {

	public static BoardJSON getBoard(PvcGame game){
		
		BoardJSON board = new BoardJSON();
		
		for (GameSpace space: game.getBoard().listSpaces()){
			
			SpaceJSON spaceJSON = new SpaceJSON();
			
			//...
			
		}
		
		return board;
		
	}
	
}
