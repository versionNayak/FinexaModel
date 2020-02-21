package com.finlabs.finexa.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the riskProfileQuestionnaire database table.
 * 
 */
@Entity
@Table(name = "riskProfileQuestionnaire")
@NamedQuery(name = "RiskProfileQuestionnaire.findAll", query = "SELECT r FROM RiskProfileQuestionnaire r")
public class RiskProfileQuestionnaire implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private Byte createdBy;

	private Timestamp createdOn;

	private Byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	@Lob
	private String question;

	// bi-directional many-to-one association to ClientRiskProfileResponse
	@OneToMany(cascade =CascadeType.ALL, mappedBy = "riskProfileQuestionnaire")
	private List<ClientRiskProfileResponse> clientRiskProfileResponses;

	// bi-directional many-to-one association to AdvisorMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "advisorID")
	private AdvisorMaster advisorMaster;

	// bi-directional many-to-one association to RiskProfileResponseBasedScore
	@OneToMany(cascade =CascadeType.ALL, mappedBy = "riskProfileQuestionnaire")
	private List<RiskProfileResponseBasedScore> riskProfileResponseBasedScores;

	public RiskProfileQuestionnaire() {
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

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<ClientRiskProfileResponse> getClientRiskProfileResponses() {
		return this.clientRiskProfileResponses;
	}

	public void setClientRiskProfileResponses(List<ClientRiskProfileResponse> clientRiskProfileResponses) {
		this.clientRiskProfileResponses = clientRiskProfileResponses;
	}

	public ClientRiskProfileResponse addClientRiskProfileRespons(ClientRiskProfileResponse clientRiskProfileRespons) {
		getClientRiskProfileResponses().add(clientRiskProfileRespons);
		clientRiskProfileRespons.setRiskProfileQuestionnaire(this);

		return clientRiskProfileRespons;
	}

	public ClientRiskProfileResponse removeClientRiskProfileRespons(
			ClientRiskProfileResponse clientRiskProfileRespons) {
		getClientRiskProfileResponses().remove(clientRiskProfileRespons);
		clientRiskProfileRespons.setRiskProfileQuestionnaire(null);

		return clientRiskProfileRespons;
	}

	public AdvisorMaster getAdvisorMaster() {
		return this.advisorMaster;
	}

	public void setAdvisorMaster(AdvisorMaster advisorMaster) {
		this.advisorMaster = advisorMaster;
	}

	public List<RiskProfileResponseBasedScore> getRiskProfileResponseBasedScores() {
		return this.riskProfileResponseBasedScores;
	}

	public void setRiskProfileResponseBasedScores(List<RiskProfileResponseBasedScore> riskProfileResponseBasedScores) {
		this.riskProfileResponseBasedScores = riskProfileResponseBasedScores;
	}

	public RiskProfileResponseBasedScore addRiskProfileResponseBasedScore(
			RiskProfileResponseBasedScore riskProfileResponseBasedScore) {
		getRiskProfileResponseBasedScores().add(riskProfileResponseBasedScore);
		riskProfileResponseBasedScore.setRiskProfileQuestionnaire(this);

		return riskProfileResponseBasedScore;
	}

	public RiskProfileResponseBasedScore removeRiskProfileResponseBasedScore(
			RiskProfileResponseBasedScore riskProfileResponseBasedScore) {
		getRiskProfileResponseBasedScores().remove(riskProfileResponseBasedScore);
		riskProfileResponseBasedScore.setRiskProfileQuestionnaire(null);

		return riskProfileResponseBasedScore;
	}

}