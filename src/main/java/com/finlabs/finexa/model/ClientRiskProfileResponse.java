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
 * The persistent class for the clientRiskProfileResponse database table.
 * 
 */
@Entity
@Table(name = "clientRiskProfileResponse")
@NamedQuery(name = "ClientRiskProfileResponse.findAll", query = "SELECT c FROM ClientRiskProfileResponse c")
public class ClientRiskProfileResponse implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String activeFlag;

	private byte createdBy;

	private Timestamp createdOn;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private int responseID;

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to RiskProfileQuestionnaire
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "questionID")
	private RiskProfileQuestionnaire riskProfileQuestionnaire;

	public ClientRiskProfileResponse() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public byte getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(byte createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public byte getLastUpdateddBy() {
		return this.lastUpdateddBy;
	}

	public void setLastUpdateddBy(byte lastUpdateddBy) {
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

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

	public RiskProfileQuestionnaire getRiskProfileQuestionnaire() {
		return this.riskProfileQuestionnaire;
	}

	public void setRiskProfileQuestionnaire(RiskProfileQuestionnaire riskProfileQuestionnaire) {
		this.riskProfileQuestionnaire = riskProfileQuestionnaire;
	}

}