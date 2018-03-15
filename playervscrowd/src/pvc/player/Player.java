package pvc.player;

import java.util.List;
import pvc.mover.MoverType;

public abstract class Player {

	public final String id;
	
	public Player(String id, List<MoverType> mTypes){
		
		this.id = id;				
		
	}
	
	
	
}
