package pvc.player;

public abstract class PlayerFactory {

	private final String prefix;
	
	private int counter = 0;
	
	public PlayerFactory(String prefix){
		
		this.prefix = prefix;
		
	}
	
	abstract public Player getPlayer(PlayerType pType);
	
}
