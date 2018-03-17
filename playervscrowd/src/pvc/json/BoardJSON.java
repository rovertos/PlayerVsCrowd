package pvc.json;

import java.io.Serializable;
import java.util.List;

public class BoardJSON implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<SpaceJSON> spaces;
	
	private List<TransformerJSON> transformers;

	public List<SpaceJSON> getSpaces() {
		return spaces;
	}

	public void setSpaces(List<SpaceJSON> spaces) {
		this.spaces = spaces;
	}

	public List<TransformerJSON> getTransformers() {
		return transformers;
	}

	public void setTransformers(List<TransformerJSON> transformers) {
		this.transformers = transformers;
	}	
	
}
