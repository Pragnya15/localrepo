package com.ibm.pan.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="pan")
public class Pan {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="pan_number")
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

	@Override
	public String toString() {
		return "PanEntity [id=" + id + ", panNumber=" + panNumber + "]";
	}
	
	
	
}
