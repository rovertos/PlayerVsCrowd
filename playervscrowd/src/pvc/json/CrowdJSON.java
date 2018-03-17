package pvc.json;

import java.io.Serializable;

public class CrowdJSON implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String type;
	
	private int total;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}	

}
