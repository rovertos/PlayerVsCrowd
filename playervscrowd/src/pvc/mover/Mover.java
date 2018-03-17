package pvc.mover;

import pvc.environment.GameSpace;

public abstract class Mover {

	public final String typeId;
	
	public Mover(String typeId){
		
		this.typeId = typeId;
		
	}
	
	abstract public GameSpace getPosition();
	
}
