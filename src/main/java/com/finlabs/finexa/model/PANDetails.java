package com.finlabs.finexa.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PANDetails")
@NamedQuery(name = "PANDetails.findAll", query = "SELECT p FROM PANDetails p")
public class PANDetails implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(nullable = false,length = 10)
	private String firstApplicantPan;
	
	@Column(length = 10)
	private String secondApplicantPan;
	
	@Column(length = 10)
	private String guardianPan;
	
	@Column(length = 20)
	private String createdBy;
	
	@Column(columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp createdOn;
	
	@Column(length = 20)
	private String lastUpdateddBy;

	@Column(columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp lastUpdatedOn;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstApplicantPan() {
		return firstApplicantPan;
	}

	public void setFirstApplicantPan(String firstApplicantPan) {
		this.firstApplicantPan = firstApplicantPan;
	}

	public String getSecondApplicantPan() {
		return secondApplicantPan;
	}

	public void setSecondApplicantPan(String secondApplicantPan) {
		this.secondApplicantPan = secondApplicantPan;
	}

	public String getGuardianPan() {
		return guardianPan;
	}

	public void setGuardianPan(String guardianPan) {
		this.guardianPan = guardianPan;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}


	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastUpdateddBy() {
		return lastUpdateddBy;
	}

	public void setLastUpdateddBy(String lastUpdateddBy) {
		this.lastUpdateddBy = lastUpdateddBy;
	}

	public Timestamp getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	
	
}
