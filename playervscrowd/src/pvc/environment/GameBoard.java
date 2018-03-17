package pvc.environment;

import java.util.List;

abstract public class GameBoard {

	abstract public GameSpace getSpace(Location loc);
	
	abstract public List<? extends GameSpace> listSpaces();	
	
	abstract public List<? extends GameArea> getAreas(Location loc);
	
}
