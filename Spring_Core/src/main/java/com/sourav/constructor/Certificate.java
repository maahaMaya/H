package com.sourav.constructor;

public class Certificate {
	private int id;
	private String cName;
	
	
	public Certificate(int id, String cName) {
		this.id = id;
		this.cName = cName;
	}


	@Override
	public String toString() {
		return "Certificate [id=" + id + ", cName=" + cName + "]";
	}
	
}
