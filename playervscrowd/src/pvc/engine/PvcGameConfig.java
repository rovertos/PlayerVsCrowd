package pvc.engine;

import java.util.List;

import pvc.mover.MoverType;
import pvc.player.PlayerType;
import pvc.transformer.TransformerType;

public class PvcGameConfig {

	private List<MoverType> moverTypes;
	
	private List<TransformerType> transformerTypes;
	
	private List<PlayerType> playerTypes;

	public List<MoverType> getMoverTypes() {
		
		return moverTypes;
		
	}

	public void setMoverTypes(List<MoverType> moverTypes) {
		
		this.moverTypes = moverTypes;
		
	}

	public List<TransformerType> getTransformerTypes() {
		
		return transformerTypes;
		
	}

	public void setTransformerTypes(List<TransformerType> transformerTypes) {
		
		this.transformerTypes = transformerTypes;
		
	}

	public List<PlayerType> getPlayerTypes() {
		
		return playerTypes;
		
	}

	public void setPlayerTypes(List<PlayerType> playerTypes) {
		
		this.playerTypes = playerTypes;
		
	}	
	
}
