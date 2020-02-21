package com.finlabs.finexa.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the riskProfileMaster database table.
 * 
 */
@Entity
@Table(name = "riskProfileMaster")
@NamedQuery(name = "RiskProfileMaster.findAll", query = "SELECT r FROM RiskProfileMaster r")
public class RiskProfileMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private Byte createdBy;

	private Timestamp createdOn;

	private Byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private String name;

	private int riskprofileID;

	// bi-directional many-to-one association to AdvisorMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "advisorID")
	private AdvisorMaster advisorMaster;

	public RiskProfileMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Byte getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Byte createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public Byte getLastUpdateddBy() {
		return this.lastUpdateddBy;
	}

	public void setLastUpdateddBy(Byte lastUpdateddBy) {
		this.lastUpdateddBy = lastUpdateddBy;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRiskprofileID() {
		return this.riskprofileID;
	}

	public void setRiskprofileID(int riskprofileID) {
		this.riskprofileID = riskprofileID;
	}

	public AdvisorMaster getAdvisorMaster() {
		return this.advisorMaster;
	}

	public void setAdvisorMaster(AdvisorMaster advisorMaster) {
		this.advisorMaster = advisorMaster;
	}

}