package pvc.mover;

import pvc.environment.GameSpace;
import pvc.transformer.Transformer;

public abstract class Mover {

	public final String id;
	
	public final String typeId;
	
	public Mover(String id, String typeId){
		
		this.id = id;
		
		this.typeId = typeId;
		
	}
	
	abstract public GameSpace getPosition();	
	
	public String getTypeId() {
		return typeId;
	}

	@Override	
	public boolean equals(Object otherTransformer){
		
		if (otherTransformer instanceof Transformer)
			
			return this.id.equals(((Transformer) otherTransformer).getId());
		
		else
			
			return false;
		
	}	
	
}
