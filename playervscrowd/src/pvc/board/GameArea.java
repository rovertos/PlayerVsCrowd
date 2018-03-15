package pvc.board;

import java.util.List;

public class GameArea {

	private final List<GameSpace> spaces;
	
	public GameArea(List<GameSpace> spaces){
		
		this.spaces = spaces;
		
	}
	
	public Crowd getCrowd(){
		
		Crowd crowd = null;
		
		for (GameSpace gSpace: spaces){
			
			if (crowd == null)
				
				crowd = gSpace.getCrowd();
			
			else
				
				crowd.addCrowd(gSpace.getCrowd());
			
		}
		
		return crowd;
		
	}
		
}
