package pvc.environment;

abstract public class Crowd {

	private final String moverTypeId;
	
	public Crowd(String moverTypeId){
		
		this.moverTypeId = moverTypeId;
		
	}
	
	abstract public int getTotal();
	
	abstract public Trend getTrend();
	
	abstract public void addCrowd(Crowd crowd);
	
}
