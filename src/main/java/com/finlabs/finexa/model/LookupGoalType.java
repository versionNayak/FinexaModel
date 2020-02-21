package com.finlabs.finexa.model;

import java.io.Serializable;
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
 * The persistent class for the lookupGoalType database table.
 * 
 */
@Entity
@Table(name = "lookupGoalType")
@NamedQuery(name = "LookupGoalType.findAll", query = "SELECT l FROM LookupGoalType l")
public class LookupGoalType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	// bi-directional many-to-one association to ClientGoal
	@OneToMany(mappedBy = "lookupGoalType")
	private List<ClientGoal> clientGoals;

	// bi-directional many-to-one association to MasterGoalInflationRate
	@OneToMany(mappedBy = "lookupGoalType")
	private List<MasterGoalInflationRate> masterGoalInflationRates;

	public LookupGoalType() {
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

	public List<ClientGoal> getClientGoals() {
		return this.clientGoals;
	}

	public void setClientGoals(List<ClientGoal> clientGoals) {
		this.clientGoals = clientGoals;
	}

	public ClientGoal addClientGoal(ClientGoal clientGoal) {
		getClientGoals().add(clientGoal);
		clientGoal.setLookupGoalType(this);

		return clientGoal;
	}

	public ClientGoal removeClientGoal(ClientGoal clientGoal) {
		getClientGoals().remove(clientGoal);
		clientGoal.setLookupGoalType(null);

		return clientGoal;
	}

	public List<MasterGoalInflationRate> getMasterGoalInflationRates() {
		return this.masterGoalInflationRates;
	}

	public void setMasterGoalInflationRates(List<MasterGoalInflationRate> masterGoalInflationRates) {
		this.masterGoalInflationRates = masterGoalInflationRates;
	}

	public MasterGoalInflationRate addMasterGoalInflationRate(MasterGoalInflationRate masterGoalInflationRate) {
		getMasterGoalInflationRates().add(masterGoalInflationRate);
		masterGoalInflationRate.setLookupGoalType(this);

		return masterGoalInflationRate;
	}

	public MasterGoalInflationRate removeMasterGoalInflationRate(MasterGoalInflationRate masterGoalInflationRate) {
		getMasterGoalInflationRates().remove(masterGoalInflationRate);
		masterGoalInflationRate.setLookupGoalType(null);

		return masterGoalInflationRate;
	}

}