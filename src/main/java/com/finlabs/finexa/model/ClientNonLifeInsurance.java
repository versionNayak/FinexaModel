package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the clientNonLifeInsurance database table.
 * 
 */
@Entity
@Table(name = "clientNonLifeInsurance")
@NamedQuery(name = "ClientNonLifeInsurance.findAll", query = "SELECT c FROM ClientNonLifeInsurance c")
public class ClientNonLifeInsurance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String coverFlag;

	private byte createdBy;

	private Timestamp createdOn;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private String otherPolicyType;

	@Temporal(TemporalType.DATE)
	private Date policyEndDate;

	private String policyName;

	private String policyNumber;

	@Temporal(TemporalType.DATE)
	private Date policyStartDate;

	private BigDecimal premiumAmount;

	private BigDecimal sumInsured;

	private byte insuranceTypeID;

	// bi-directional many-to-one association to ClientFloaterCover
	@OneToMany(mappedBy = "clientNonLifeInsurance")
	private List<ClientFloaterCover> clientFloaterCovers;

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	/*
	 * // bi-directional many-to-one association to LookupInsuranceType
	 * 
	 * @ManyToOne(fetch = FetchType.LAZY)
	 * 
	 * @JoinColumn(name = "insuranceTypeID") private LookupInsuranceType
	 * lookupInsuranceType;
	 */

	// bi-directional many-to-one association to MasterInsuranceCompanyName
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "companyNameID")
	private MasterInsuranceCompanyName masterInsuranceCompanyName;

	// bi-directional many-to-one association to LookupInsurancePolicyType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "insurancePolicyTypeID")
	private LookupInsurancePolicyType lookupInsurancePolicyType;

	public ClientNonLifeInsurance() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCoverFlag() {
		return this.coverFlag;
	}

	public void setCoverFlag(String coverFlag) {
		this.coverFlag = coverFlag;
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

	public String getOtherPolicyType() {
		return this.otherPolicyType;
	}

	public void setOtherPolicyType(String otherPolicyType) {
		this.otherPolicyType = otherPolicyType;
	}

	public Date getPolicyEndDate() {
		return this.policyEndDate;
	}

	public void setPolicyEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}

	public String getPolicyName() {
		return this.policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyNumber() {
		return this.policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public Date getPolicyStartDate() {
		return this.policyStartDate;
	}

	public void setPolicyStartDate(Date policyStartDate) {
		this.policyStartDate = policyStartDate;
	}

	public BigDecimal getPremiumAmount() {
		return this.premiumAmount;
	}

	public void setPremiumAmount(BigDecimal premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public BigDecimal getSumInsured() {
		return this.sumInsured;
	}

	public void setSumInsured(BigDecimal sumInsured) {
		this.sumInsured = sumInsured;
	}

	public List<ClientFloaterCover> getClientFloaterCovers() {
		return this.clientFloaterCovers;
	}

	public void setClientFloaterCovers(List<ClientFloaterCover> clientFloaterCovers) {
		this.clientFloaterCovers = clientFloaterCovers;
	}

	public ClientFloaterCover addClientFloaterCover(ClientFloaterCover clientFloaterCover) {
		getClientFloaterCovers().add(clientFloaterCover);
		clientFloaterCover.setClientNonLifeInsurance(this);

		return clientFloaterCover;
	}

	public ClientFloaterCover removeClientFloaterCover(ClientFloaterCover clientFloaterCover) {
		getClientFloaterCovers().remove(clientFloaterCover);
		clientFloaterCover.setClientNonLifeInsurance(null);

		return clientFloaterCover;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

	public ClientFamilyMember getClientFamilyMember() {
		return this.clientFamilyMember;
	}

	public void setClientFamilyMember(ClientFamilyMember clientFamilyMember) {
		this.clientFamilyMember = clientFamilyMember;
	}

	/*
	 * public LookupInsuranceType getLookupInsuranceType() { return
	 * this.lookupInsuranceType; }
	 * 
	 * public void setLookupInsuranceType(LookupInsuranceType
	 * lookupInsuranceType) { this.lookupInsuranceType = lookupInsuranceType; }
	 */

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

	public byte getInsuranceTypeID() {
		return insuranceTypeID;
	}

	public void setInsuranceTypeID(byte insuranceTypeID) {
		this.insuranceTypeID = insuranceTypeID;
	}

}