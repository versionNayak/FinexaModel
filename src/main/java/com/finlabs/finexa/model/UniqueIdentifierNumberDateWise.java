package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "uniqueIdentifierNumberDateWise")
@NamedQuery(name = "UniqueIdentifierNumberDateWise.findAll", query = "SELECT p FROM UniqueIdentifierNumberDateWise p")
public class UniqueIdentifierNumberDateWise implements Serializable{
	
	@Id
	@Column(name="date")
	private String date;
	
	@Column(nullable = false,length = 11)
	private Integer urn;

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getUrn() {
		return urn;
	}

	public void setUrn(Integer urn) {
		this.urn = urn;
	}
}
