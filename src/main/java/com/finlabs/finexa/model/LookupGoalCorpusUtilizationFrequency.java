package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the lookupGoalCorpusUtilizationFrequency database
 * table.
 * 
 */
@Entity
@Table(name = "lookupGoalCorpusUtilizationFrequency")
@NamedQuery(name = "LookupGoalCorpusUtilizationFrequency.findAll", query = "SELECT l FROM LookupGoalCorpusUtilizationFrequency l")
public class LookupGoalCorpusUtilizationFrequency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	private BigDecimal frequency;

	// bi-directional many-to-one association to ClientGoal
	@OneToMany(mappedBy = "lookupGoalCorpusUtilizationFrequency")
	private List<ClientGoal> clientGoals;
	
	// bi-directional many-to-one association to ClientGoal
	@OneToMany(mappedBy = "lookupGoalCorpusUtilizationFrequencyForPayoutFrequency")
	private List<ClientGoal> clientGoalsForPayoutFrequency;

	public LookupGoalCorpusUtilizationFrequency() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(byte displayOrder) {
		this.displayOrder = displayOrder;
	}

	public BigDecimal getFrequency() {
		return this.frequency;
	}

	public void setFrequency(BigDecimal frequency) {
		this.frequency = frequency;
	}

	public List<ClientGoal> getClientGoals() {
		return this.clientGoals;
	}

	public void setClientGoals(List<ClientGoal> clientGoals) {
		this.clientGoals = clientGoals;
	}

	public ClientGoal addClientGoal(ClientGoal clientGoal) {
		getClientGoals().add(clientGoal);
		clientGoal.setLookupGoalCorpusUtilizationFrequency(this);

		return clientGoal;
	}

	public List<ClientGoal> getClientGoalsForPayoutFrequency() {
		return clientGoalsForPayoutFrequency;
	}

	public void setClientGoalsForPayoutFrequency(List<ClientGoal> clientGoalsForPayoutFrequency) {
		this.clientGoalsForPayoutFrequency = clientGoalsForPayoutFrequency;
	}

	public ClientGoal removeClientGoal(ClientGoal clientGoal) {
		getClientGoals().remove(clientGoal);
		clientGoal.setLookupGoalCorpusUtilizationFrequency(null);

		return clientGoal;
	}

}