package pvc.json;

import java.io.Serializable;
import java.util.List;

public class SpaceJSON implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String label;
	
	private List<CrowdJSON> crowds;
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public List<CrowdJSON> getCrowds() {
		return crowds;
	}

	public void setCrowds(List<CrowdJSON> crowds) {
		this.crowds = crowds;
	}

}
