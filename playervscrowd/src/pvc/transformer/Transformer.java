package pvc.transformer;

import pvc.environment.GameArea;

public abstract class Transformer {

	public final String id;
	
	public final String typeId;
	
	public final GameArea area;
	
	public Transformer(String id, String typeId, GameArea area){
		
		this.id = id;
		
		this.typeId = typeId;
		
		this.area = area;
		
	}
	
	abstract public void transform();
	
	abstract public String getForm();	
	
	public String getId() {
		return id;
	}

	@Override	
	public boolean equals(Object otherTransformer){
		
		if (otherTransformer instanceof Transformer)
			
			return this.id.equals(((Transformer) otherTransformer).getId());
		
		else
			
			return false;
		
	}	
	
}
