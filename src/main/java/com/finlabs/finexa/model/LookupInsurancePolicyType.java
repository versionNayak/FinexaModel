package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the lookupInsurancePolicyType database table.
 * 
 */
@Entity
@Table(name = "lookupInsurancePolicyType")
@NamedQuery(name = "LookupInsurancePolicyType.findAll", query = "SELECT l FROM LookupInsurancePolicyType l")
public class LookupInsurancePolicyType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	// bi-directional many-to-one association to ClientLifeInsurance
	@OneToMany(mappedBy = "lookupInsurancePolicyType")
	private List<ClientLifeInsurance> clientLifeInsurances;

	// bi-directional many-to-one association to ClientNonLifeInsurance
	@OneToMany(mappedBy = "lookupInsurancePolicyType")
	private List<ClientNonLifeInsurance> clientNonLifeInsurances;


	// bi-directional many-to-one association to LookupInsuranceType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "insuranceTypeID")
	private LookupInsuranceType lookupInsuranceType;

	// bi-directional many-to-one association to MasterInsurancePolicy
	@OneToMany(mappedBy = "lookupInsurancePolicyType")
	private List<MasterInsurancePolicy> masterInsurancePolicies;

	public LookupInsurancePolicyType() {
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

	public List<ClientLifeInsurance> getClientLifeInsurances() {
		return this.clientLifeInsurances;
	}

	public void setClientLifeInsurances(List<ClientLifeInsurance> clientLifeInsurances) {
		this.clientLifeInsurances = clientLifeInsurances;
	}

	public ClientLifeInsurance addClientLifeInsurances(ClientLifeInsurance clientLifeInsurances) {
		getClientLifeInsurances().add(clientLifeInsurances);

		return clientLifeInsurances;
	}

	public ClientLifeInsurance removeClientLifeInsurances(ClientLifeInsurance clientLifeInsurances) {
		getClientLifeInsurances().remove(clientLifeInsurances);
		return clientLifeInsurances;
	}

	

	

	public List<ClientNonLifeInsurance> getClientNonLifeInsurances() {
		return this.clientNonLifeInsurances;
	}

	public void setClientNonLifeInsurances(List<ClientNonLifeInsurance> clientNonLifeInsurances) {
		this.clientNonLifeInsurances = clientNonLifeInsurances;
	}

	public ClientNonLifeInsurance addClientNonLifeInsurances(ClientNonLifeInsurance clientNonLifeInsurances) {
		getClientNonLifeInsurances().add(clientNonLifeInsurances);
		clientNonLifeInsurances.setLookupInsurancePolicyType(this);

		return clientNonLifeInsurances;
	}

	public ClientNonLifeInsurance removeClientNonLifeInsurances(ClientNonLifeInsurance clientNonLifeInsurances) {
		getClientNonLifeInsurances().remove(clientNonLifeInsurances);
		clientNonLifeInsurances.setLookupInsurancePolicyType(null);

		return clientNonLifeInsurances;
	}
	
	public LookupInsuranceType getLookupInsuranceType() {
		return this.lookupInsuranceType;
	}

	public void setLookupInsuranceType(LookupInsuranceType lookupInsuranceType) {
		this.lookupInsuranceType = lookupInsuranceType;
	}

	public List<MasterInsurancePolicy> getMasterInsurancePolicies() {
		return this.masterInsurancePolicies;
	}

	public void setMasterInsurancePolicies(List<MasterInsurancePolicy> masterInsurancePolicies) {
		this.masterInsurancePolicies = masterInsurancePolicies;
	}

	public MasterInsurancePolicy addMasterInsurancePolicy(MasterInsurancePolicy masterInsurancePolicy) {
		getMasterInsurancePolicies().add(masterInsurancePolicy);
		masterInsurancePolicy.setLookupInsurancePolicyType(this);

		return masterInsurancePolicy;
	}

	public MasterInsurancePolicy removeMasterInsurancePolicy(MasterInsurancePolicy masterInsurancePolicy) {
		getMasterInsurancePolicies().remove(masterInsurancePolicy);
		masterInsurancePolicy.setLookupInsurancePolicyType(null);

		return masterInsurancePolicy;
	}

}