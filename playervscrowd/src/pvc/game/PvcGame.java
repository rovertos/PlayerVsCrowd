package pvc.game;

import java.util.List;

import pvc.environment.GameBoard;
import pvc.player.Player;
import pvc.transformer.Transformer;

public abstract class PvcGame {

	private final PvcGameConfig config;
	
	public PvcGame(PvcGameConfig config){
		
		this.config = config;
		
		initialize();
		
	}
	
	// --------
	
	public PvcGameConfig getConfig() {		
		return config;		
	}	
	
	abstract public GameBoard getBoard();

	abstract public List<? extends Player> getPlayers(String pTypeId);
	
	abstract public List<? extends Transformer> getTransformers(String tTypeId);
	
	// --------
	
	abstract public void initialize();
	
	abstract public void transform();
	
	abstract public void resolve();	
	
}
