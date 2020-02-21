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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the riskProfileResponseBasedScore database table.
 * 
 */
@Entity
@Table(name = "riskProfileResponseBasedScore")
@NamedQuery(name = "RiskProfileResponseBasedScore.findAll", query = "SELECT r FROM RiskProfileResponseBasedScore r")
public class RiskProfileResponseBasedScore implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private Byte createdBy;

	private Timestamp createdOn;

	private Byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private int responseID;

	@Lob
	private String responseText;

	private int score;

	// bi-directional many-to-one association to AdvisorMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "advisorID")
	private AdvisorMaster advisorMaster;

	// bi-directional many-to-one association to RiskProfileQuestionnaire
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "questionID")
	private RiskProfileQuestionnaire riskProfileQuestionnaire;

	public RiskProfileResponseBasedScore() {
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

	public int getResponseID() {
		return this.responseID;
	}

	public void setResponseID(int responseID) {
		this.responseID = responseID;
	}

	public String getResponseText() {
		return this.responseText;
	}

	public void setResponseText(String responseText) {
		this.responseText = responseText;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public AdvisorMaster getAdvisorMaster() {
		return this.advisorMaster;
	}

	public void setAdvisorMaster(AdvisorMaster advisorMaster) {
		this.advisorMaster = advisorMaster;
	}

	public RiskProfileQuestionnaire getRiskProfileQuestionnaire() {
		return this.riskProfileQuestionnaire;
	}

	public void setRiskProfileQuestionnaire(RiskProfileQuestionnaire riskProfileQuestionnaire) {
		this.riskProfileQuestionnaire = riskProfileQuestionnaire;
	}

}