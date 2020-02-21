package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the clientNPS database table.
 * 
 */
@Entity
@Table(name="clientNPS")
@NamedQuery(name="ClientNP.findAll", query="SELECT c FROM ClientNPS c")
public class ClientNPS implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	private BigDecimal assetClassCAllocation;

	private BigDecimal assetClassCReturns;

	private BigDecimal assetClassEAllocation;

	private BigDecimal assetClassEReturns;

	private BigDecimal assetClassGAllocation;

	private BigDecimal assetClassGReturns;

	private BigDecimal autoPlanReturns;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal employeeContribution;

	private byte employeeContributionFrequency;

	private byte employeeContributionUptoAge;

	private BigDecimal employerContribution;

	private byte employerContributionFrequency;

	private byte employerContributionUptoAge;

	private BigDecimal expectedAnnualIncrease;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private BigDecimal npsCurrentBalance;

	private byte planType;

	//bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientID")
	private ClientMaster clientMaster;

	//bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	//bi-directional many-to-one association to MasterProductClassification
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="financialAssetType")
	private MasterProductClassification masterProductClassification;

	public ClientNPS() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAssetClassCAllocation() {
		return this.assetClassCAllocation;
	}

	public void setAssetClassCAllocation(BigDecimal assetClassCAllocation) {
		this.assetClassCAllocation = assetClassCAllocation;
	}

	public BigDecimal getAssetClassCReturns() {
		return this.assetClassCReturns;
	}

	public void setAssetClassCReturns(BigDecimal assetClassCReturns) {
		this.assetClassCReturns = assetClassCReturns;
	}

	public BigDecimal getAssetClassEAllocation() {
		return this.assetClassEAllocation;
	}

	public void setAssetClassEAllocation(BigDecimal assetClassEAllocation) {
		this.assetClassEAllocation = assetClassEAllocation;
	}

	public BigDecimal getAssetClassEReturns() {
		return this.assetClassEReturns;
	}

	public void setAssetClassEReturns(BigDecimal assetClassEReturns) {
		this.assetClassEReturns = assetClassEReturns;
	}

	public BigDecimal getAssetClassGAllocation() {
		return this.assetClassGAllocation;
	}

	public void setAssetClassGAllocation(BigDecimal assetClassGAllocation) {
		this.assetClassGAllocation = assetClassGAllocation;
	}

	public BigDecimal getAssetClassGReturns() {
		return this.assetClassGReturns;
	}

	public void setAssetClassGReturns(BigDecimal assetClassGReturns) {
		this.assetClassGReturns = assetClassGReturns;
	}

	public BigDecimal getAutoPlanReturns() {
		return this.autoPlanReturns;
	}

	public void setAutoPlanReturns(BigDecimal autoPlanReturns) {
		this.autoPlanReturns = autoPlanReturns;
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

	public BigDecimal getEmployeeContribution() {
		return this.employeeContribution;
	}

	public void setEmployeeContribution(BigDecimal employeeContribution) {
		this.employeeContribution = employeeContribution;
	}

	public byte getEmployeeContributionFrequency() {
		return this.employeeContributionFrequency;
	}

	public void setEmployeeContributionFrequency(byte employeeContributionFrequency) {
		this.employeeContributionFrequency = employeeContributionFrequency;
	}

	public byte getEmployeeContributionUptoAge() {
		return this.employeeContributionUptoAge;
	}

	public void setEmployeeContributionUptoAge(byte employeeContributionUptoAge) {
		this.employeeContributionUptoAge = employeeContributionUptoAge;
	}

	public BigDecimal getEmployerContribution() {
		return this.employerContribution;
	}

	public void setEmployerContribution(BigDecimal employerContribution) {
		this.employerContribution = employerContribution;
	}

	public byte getEmployerContributionFrequency() {
		return this.employerContributionFrequency;
	}

	public void setEmployerContributionFrequency(byte employerContributionFrequency) {
		this.employerContributionFrequency = employerContributionFrequency;
	}

	public byte getEmployerContributionUptoAge() {
		return this.employerContributionUptoAge;
	}

	public void setEmployerContributionUptoAge(byte employerContributionUptoAge) {
		this.employerContributionUptoAge = employerContributionUptoAge;
	}

	public BigDecimal getExpectedAnnualIncrease() {
		return this.expectedAnnualIncrease;
	}

	public void setExpectedAnnualIncrease(BigDecimal expectedAnnualIncrease) {
		this.expectedAnnualIncrease = expectedAnnualIncrease;
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

	public BigDecimal getNpsCurrentBalance() {
		return this.npsCurrentBalance;
	}

	public void setNpsCurrentBalance(BigDecimal npsCurrentBalance) {
		this.npsCurrentBalance = npsCurrentBalance;
	}

	public byte getPlanType() {
		return this.planType;
	}

	public void setPlanType(byte planType) {
		this.planType = planType;
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

	public MasterProductClassification getMasterProductClassification() {
		return this.masterProductClassification;
	}

	public void setMasterProductClassification(MasterProductClassification masterProductClassification) {
		this.masterProductClassification = masterProductClassification;
	}

}