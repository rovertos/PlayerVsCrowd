package pvc.environment;

abstract public class GameSpace {

	public final Location loc;
	
	public GameSpace(Location loc){
		
		this.loc = loc;
		
	}
	
	abstract public Crowd getCrowd(String moverTypeId);
	
}
