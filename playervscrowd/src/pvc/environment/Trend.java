package pvc.environment;

abstract public class Trend implements Comparable<Trend> {

	public final String moverTypeId;
	
	public Trend(String moverTypeId){
		
		this.moverTypeId = moverTypeId;
		
	}	
	
	abstract public Location getNewLocation();
	
	abstract public int getGain();
	
	public int compareTo(Trend otherTrend) {
		
		return this.getGain() - otherTrend.getGain();
		
	}
	
}
