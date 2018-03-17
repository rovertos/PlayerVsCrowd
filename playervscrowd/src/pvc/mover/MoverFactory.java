package pvc.mover;

public abstract class MoverFactory {

	private final String prefix;
	
	private int counter = 0;
	
	public MoverFactory(String prefix){
		
		this.prefix = prefix;
		
	}
	
	abstract public Mover getMover(MoverType mType);
	
}
