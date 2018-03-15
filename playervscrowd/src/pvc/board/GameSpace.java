package pvc.board;

import java.util.HashMap;
import java.util.List;

public class GameSpace {

	private final HashMap<String, Crowd> crowdMap;
	
	public GameSpace(List<String> mTypes){
		
		crowdMap = new HashMap<String, Crowd>();
		
		for (String moverType: mTypes){
			
			crowdMap.put(moverType, new Crowd());
			
		}
		
	}
	
	public int getCrowd(String mTypeId){
		
		return crowdMap.get(mTypeId).total;
		
	}
	
	public void addToCrowd(String mTypeId, int total){
		
		crowdMap.get(mTypeId).total += total;
		
	}
	
	public void removeFromCrowd(String mTypeId, int total){
		
		crowdMap.get(mTypeId).total -= total;
		
	}	
	
	private class Crowd {
		
		private int total;
		
		private Crowd(){
			
			this.total = 0;
			
		}
		
	}
	
}
