package pvc.board;

import java.util.List;

public class GameArea {

	private final List<GameSpace> spaces;
	
	public GameArea(List<GameSpace> spaces){
		
		this.spaces = spaces;
		
	}
	
	public int getCrowd(String mTypeId){
		
		int total = 0;
		
		for (GameSpace gSpace: spaces){
			
			total += gSpace.getCrowd(mTypeId);
			
		}
		
		return total;
		
	}
		
}
