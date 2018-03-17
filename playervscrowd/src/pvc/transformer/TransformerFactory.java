package pvc.transformer;

public abstract class TransformerFactory {

	private final String prefix;
	
	private int counter = 0;
	
	public TransformerFactory(String prefix){
		
		this.prefix = prefix;
		
	}
	
	abstract public Transformer getTransformer(TransformerType tType);
	
}
