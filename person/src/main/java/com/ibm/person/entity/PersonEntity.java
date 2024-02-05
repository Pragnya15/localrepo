package com.ibm.person.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="person")
public class PersonEntity {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	int id;

	@Column(name="person_name")
	String personName;
	
	@Column(name="pan_id")
	int panId;
	
	@Transient
	String panNumber;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public int getPanId() {
		return panId;
	}

	public void setPanId(int panId) {
		this.panId = panId;
	}

	public String getPanNumber() {
		return panNumber;
	}

	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}


	public PersonEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PersonEntity [id=" + id + ", personName=" + personName + ", panId=" + panId + ", panNumber=" + panNumber
				+ "]";
	}
	
	
	
}
