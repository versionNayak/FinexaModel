package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the clientLifeInsurance database table.
 * 
 */
@Entity
@Table(name = "clientLifeInsurance")
@NamedQuery(name = "ClientLifeInsurance.findAll", query = "SELECT c FROM ClientLifeInsurance c")
public class ClientLifeInsurance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal currentUnitBalance;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	@Temporal(TemporalType.DATE)
	private Date lockedUptoDate;

	@Temporal(TemporalType.DATE)
	private Date endDate;
	
	private String otherPolicyType;

	private String policyName;

	private String policyNumber;

	@Temporal(TemporalType.DATE)
	private Date policyStartDate;

	private byte policyTenure;

	private BigDecimal premiumAmount;

	private byte premiumFrequency;

	private byte premiumTenure;

	private BigDecimal sumInsured;

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	// bi-directional many-to-one association to LookupInsurancePolicyType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "insurancePolicyTypeID")
	private LookupInsurancePolicyType lookupInsurancePolicyType;

	// bi-directional many-to-one association to MasterInsuranceCompanyName
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "companyNameID")
	private MasterInsuranceCompanyName masterInsuranceCompanyName;
//new
	public ClientLifeInsurance() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public BigDecimal getCurrentUnitBalance() {
		return this.currentUnitBalance;
	}

	public void setCurrentUnitBalance(BigDecimal currentUnitBalance) {
		this.currentUnitBalance = currentUnitBalance;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public Date getLockedUptoDate() {
		return this.lockedUptoDate;
	}

	public void setLockedUptoDate(Date lockedUptoDate) {
		this.lockedUptoDate = lockedUptoDate;
	}

	public String getOtherPolicyType() {
		return this.otherPolicyType;
	}

	public void setOtherPolicyType(String otherPolicyType) {
		this.otherPolicyType = otherPolicyType;
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

	public byte getPolicyTenure() {
		return this.policyTenure;
	}

	public void setPolicyTenure(byte policyTenure) {
		this.policyTenure = policyTenure;
	}

	public BigDecimal getPremiumAmount() {
		return this.premiumAmount;
	}

	public void setPremiumAmount(BigDecimal premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public byte getPremiumFrequency() {
		return this.premiumFrequency;
	}

	public void setPremiumFrequency(byte premiumFrequency) {
		this.premiumFrequency = premiumFrequency;
	}

	public byte getPremiumTenure() {
		return this.premiumTenure;
	}

	public void setPremiumTenure(byte premiumTenure) {
		this.premiumTenure = premiumTenure;
	}

	public BigDecimal getSumInsured() {
		return this.sumInsured;
	}

	public void setSumInsured(BigDecimal sumInsured) {
		this.sumInsured = sumInsured;
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

	public MasterInsuranceCompanyName getMasterInsuranceCompanyName() {
		return this.masterInsuranceCompanyName;
	}

	public void setMasterInsuranceCompanyName(MasterInsuranceCompanyName masterInsuranceCompanyName) {
		this.masterInsuranceCompanyName = masterInsuranceCompanyName;
	}

	public LookupInsurancePolicyType getLookupInsurancePolicyType() {
		return lookupInsurancePolicyType;
	}

	public void setLookupInsurancePolicyType(LookupInsurancePolicyType lookupInsurancePolicyType) {
		this.lookupInsurancePolicyType = lookupInsurancePolicyType;
	}

}