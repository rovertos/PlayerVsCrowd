package pvc.json;

import java.io.Serializable;
import java.util.List;

public class BoardJSON implements Serializable {

	private static final long serialVersionUID = 1L;

	private List<SpaceJSON> spaces;
	
	private List<TransformerTypeJSON> ttypes;

	public List<SpaceJSON> getSpaces() {
		return spaces;
	}

	public void setSpaces(List<SpaceJSON> spaces) {
		this.spaces = spaces;
	}

	public List<TransformerTypeJSON> getTtypes() {
		return ttypes;
	}

	public void setTtypes(List<TransformerTypeJSON> ttypes) {
		this.ttypes = ttypes;
	}
	
}
