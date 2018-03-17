package pvc.player;

import java.util.List;

import pvc.mover.Mover;

public abstract class Player implements Comparable<Player> {

	public final String id;
	
	public final String typeId;
	
	public Player(String id, String typeId){
		
		this.id = id;
		
		this.typeId = typeId;
	
	}
	
	abstract public List<? extends Mover> getMover(String mTypeId);
	
	abstract public int getScore();
	
	public int compareTo(Player otherPlayer) {
		
		return this.getScore() - otherPlayer.getScore();
		
	}	
	
}
