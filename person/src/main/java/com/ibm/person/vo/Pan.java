package com.ibm.person.vo;

public class Pan {
	int id; 
	String panNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public Pan(int id, String panNumber) {
		super();
		this.id = id;
		this.panNumber = panNumber;
	}
	public Pan() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
