package pvc.json;

import java.io.Serializable;

public class TransformerJSON implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	
	private String form;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getForm() {
		return form;
	}

	public void setForm(String form) {
		this.form = form;
	}	

}
