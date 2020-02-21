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
 * The persistent class for the clientAnnuity database table.
 * 
 */
@Entity
@Table(name = "clientAnnuity")
@NamedQuery(name = "ClientAnnuity.findAll", query = "SELECT c FROM ClientAnnuity c")
public class ClientAnnuity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private BigDecimal annualContributionIncrease;

	private BigDecimal annuityRate;

	@Temporal(TemporalType.DATE)
	private Date annuityStartDate;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal growthRate;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private BigDecimal monthlyBasicDA;

	private BigDecimal pensionableCorpus;

	private Byte serviceYears;

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payoutFrequency")
	private LookupFrequency lookupFrequency;

	// bi-directional many-to-one association to LookupAnnuityType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "annuityType")
	private LookupAnnuityType lookupAnnuityType;

	// bi-directional many-to-one association to MasterProductClassification
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "financialAssetType")
	private MasterProductClassification masterProductClassification;

	// bi-directional many-to-one association to ClientEPF
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientEPFID")
	private ClientEPF clientEpf;

	public ClientAnnuity() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAnnualContributionIncrease() {
		return this.annualContributionIncrease;
	}

	public void setAnnualContributionIncrease(BigDecimal annualContributionIncrease) {
		this.annualContributionIncrease = annualContributionIncrease;
	}

	public BigDecimal getAnnuityRate() {
		return this.annuityRate;
	}

	public void setAnnuityRate(BigDecimal annuityRate) {
		this.annuityRate = annuityRate;
	}

	public Date getAnnuityStartDate() {
		return this.annuityStartDate;
	}

	public void setAnnuityStartDate(Date annuityStartDate) {
		this.annuityStartDate = annuityStartDate;
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

	public BigDecimal getGrowthRate() {
		return this.growthRate;
	}

	public void setGrowthRate(BigDecimal growthRate) {
		this.growthRate = growthRate;
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

	public BigDecimal getMonthlyBasicDA() {
		return this.monthlyBasicDA;
	}

	public void setMonthlyBasicDA(BigDecimal monthlyBasicDA) {
		this.monthlyBasicDA = monthlyBasicDA;
	}

	public BigDecimal getPensionableCorpus() {
		return this.pensionableCorpus;
	}

	public void setPensionableCorpus(BigDecimal pensionableCorpus) {
		this.pensionableCorpus = pensionableCorpus;
	}

	public Byte getServiceYears() {
		return this.serviceYears;
	}

	public void setServiceYears(Byte serviceYears) {
		this.serviceYears = serviceYears;
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

	public LookupFrequency getLookupFrequency() {
		return this.lookupFrequency;
	}

	public void setLookupFrequency(LookupFrequency lookupFrequency) {
		this.lookupFrequency = lookupFrequency;
	}

	public LookupAnnuityType getLookupAnnuityType() {
		return this.lookupAnnuityType;
	}

	public void setLookupAnnuityType(LookupAnnuityType lookupAnnuityType) {
		this.lookupAnnuityType = lookupAnnuityType;
	}

	public MasterProductClassification getMasterProductClassification() {
		return this.masterProductClassification;
	}

	public void setMasterProductClassification(MasterProductClassification masterProductClassification) {
		this.masterProductClassification = masterProductClassification;
	}

	public ClientEPF getClientEpf() {
		return this.clientEpf;
	}

	public void setClientEpf(ClientEPF clientEpf) {
		this.clientEpf = clientEpf;
	}

}