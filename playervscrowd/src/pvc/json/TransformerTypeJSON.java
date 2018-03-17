package pvc.json;

import java.io.Serializable;
import java.util.List;

public class TransformerTypeJSON implements Serializable {

	private static final long serialVersionUID = 1L;

	private String type;
	
	private List<TransformerJSON> transformers;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<TransformerJSON> getTransformers() {
		return transformers;
	}

	public void setTransformers(List<TransformerJSON> transformers) {
		this.transformers = transformers;
	}	
	
}
