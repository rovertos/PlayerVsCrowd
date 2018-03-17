package pvc.environment;

import java.util.List;

public class GameArea {

	private final List<GameSpace> spaces;
	
	public GameArea(List<GameSpace> spaces){
		
		this.spaces = spaces;
		
	}
	
	public Crowd getCrowd(String moverTypeId){
		
		Crowd crowd = null;
		
		for (GameSpace gSpace: spaces){
			
			if (crowd == null)
				
				crowd = gSpace.getCrowd(moverTypeId);
			
			else
				
				crowd.addCrowd(gSpace.getCrowd(moverTypeId));
			
		}
		
		return crowd;
		
	}
		
}
