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
 * The persistent class for the masterInsuranceCompanyName database table.
 * 
 */
@Entity
@Table(name = "masterInsuranceCompanyName")
@NamedQuery(name = "MasterInsuranceCompanyName.findAll", query = "SELECT m FROM MasterInsuranceCompanyName m")
public class MasterInsuranceCompanyName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String description;

	private int displayOrder;

	// bi-directional many-to-one association to ClientLifeInsurance
	@OneToMany(mappedBy = "masterInsuranceCompanyName")
	private List<ClientLifeInsurance> clientLifeInsurances;

	// bi-directional many-to-one association to ClientNonLifeInsurance
	@OneToMany(mappedBy = "masterInsuranceCompanyName")
	private List<ClientNonLifeInsurance> clientNonLifeInsurances;

	// bi-directional many-to-one association to MasterInsurancePolicy
	@OneToMany(mappedBy = "masterInsuranceCompanyName")
	private List<MasterInsurancePolicy> masterInsurancePolicies;

	public MasterInsuranceCompanyName() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(int displayOrder) {
		this.displayOrder = displayOrder;
	}

	public List<ClientLifeInsurance> getClientLifeInsurances() {
		return this.clientLifeInsurances;
	}

	public void setClientLifeInsurances(List<ClientLifeInsurance> clientLifeInsurances) {
		this.clientLifeInsurances = clientLifeInsurances;
	}

	public ClientLifeInsurance addClientLifeInsurance(ClientLifeInsurance clientLifeInsurance) {
		getClientLifeInsurances().add(clientLifeInsurance);
		clientLifeInsurance.setMasterInsuranceCompanyName(this);

		return clientLifeInsurance;
	}

	public ClientLifeInsurance removeClientLifeInsurance(ClientLifeInsurance clientLifeInsurance) {
		getClientLifeInsurances().remove(clientLifeInsurance);
		clientLifeInsurance.setMasterInsuranceCompanyName(null);

		return clientLifeInsurance;
	}

	public List<ClientNonLifeInsurance> getClientNonLifeInsurances() {
		return this.clientNonLifeInsurances;
	}

	public void setClientNonLifeInsurances(List<ClientNonLifeInsurance> clientNonLifeInsurances) {
		this.clientNonLifeInsurances = clientNonLifeInsurances;
	}

	public ClientNonLifeInsurance addClientNonLifeInsurance(ClientNonLifeInsurance clientNonLifeInsurance) {
		getClientNonLifeInsurances().add(clientNonLifeInsurance);
		clientNonLifeInsurance.setMasterInsuranceCompanyName(this);

		return clientNonLifeInsurance;
	}

	public ClientNonLifeInsurance removeClientNonLifeInsurance(ClientNonLifeInsurance clientNonLifeInsurance) {
		getClientNonLifeInsurances().remove(clientNonLifeInsurance);
		clientNonLifeInsurance.setMasterInsuranceCompanyName(null);

		return clientNonLifeInsurance;
	}

	public List<MasterInsurancePolicy> getMasterInsurancePolicies() {
		return this.masterInsurancePolicies;
	}

	public void setMasterInsurancePolicies(List<MasterInsurancePolicy> masterInsurancePolicies) {
		this.masterInsurancePolicies = masterInsurancePolicies;
	}

	public MasterInsurancePolicy addMasterInsurancePolicy(MasterInsurancePolicy masterInsurancePolicy) {
		getMasterInsurancePolicies().add(masterInsurancePolicy);
		masterInsurancePolicy.setMasterInsuranceCompanyName(this);

		return masterInsurancePolicy;
	}

	public MasterInsurancePolicy removeMasterInsurancePolicy(MasterInsurancePolicy masterInsurancePolicy) {
		getMasterInsurancePolicies().remove(masterInsurancePolicy);
		masterInsurancePolicy.setMasterInsuranceCompanyName(null);

		return masterInsurancePolicy;
	}

}