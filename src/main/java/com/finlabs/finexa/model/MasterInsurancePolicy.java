package com.finlabs.finexa.model;

import java.io.Serializable;

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
 * The persistent class for the masterInsurancePolicy database table.
 * 
 */
@Entity
@Table(name = "masterInsurancePolicy")
@NamedQuery(name = "MasterInsurancePolicy.findAll", query = "SELECT m FROM MasterInsurancePolicy m")
public class MasterInsurancePolicy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String policyName;

	// bi-directional many-to-one association to MasterInsuranceCompanyName
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "companyNameID")
	private MasterInsuranceCompanyName masterInsuranceCompanyName;

	// bi-directional many-to-one association to LookupInsurancePolicyType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "insurancePolicyTypeID")
	private LookupInsurancePolicyType lookupInsurancePolicyType;

	public MasterInsurancePolicy() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public MasterInsuranceCompanyName getMasterInsuranceCompanyName() {
		return this.masterInsuranceCompanyName;
	}

	public void setMasterInsuranceCompanyName(MasterInsuranceCompanyName masterInsuranceCompanyName) {
		this.masterInsuranceCompanyName = masterInsuranceCompanyName;
	}

	public LookupInsurancePolicyType getLookupInsurancePolicyType() {
		return this.lookupInsurancePolicyType;
	}

	public void setLookupInsurancePolicyType(LookupInsurancePolicyType lookupInsurancePolicyType) {
		this.lookupInsurancePolicyType = lookupInsurancePolicyType;
	}

}