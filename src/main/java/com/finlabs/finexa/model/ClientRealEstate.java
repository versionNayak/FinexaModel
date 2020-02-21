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
 * The persistent class for the clientRealEstate database table.
 * 
 */
@Entity
@Table(name = "clientRealEstate")
@NamedQuery(name = "ClientRealEstate.findAll", query = "SELECT c FROM ClientRealEstate c")
public class ClientRealEstate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal currentValue;

	private String description;

	@Temporal(TemporalType.DATE)
	private Date investmentDate;

	private BigDecimal investmentValue;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private byte lienMarked;

	@Temporal(TemporalType.DATE)
	private Date lienReleaseDate;

	private BigDecimal rentalIncome;

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	// bi-directional many-to-one association to LookupAlternateInvestmentsAssetType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetType")
	private LookupAlternateInvestmentsAssetType lookupAlternateInvestmentsAssetType;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rentalIncomeFrequency")
	private LookupFrequency lookupFrequency;

	// bi-directional many-to-one association to MasterProductClassification
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "financialAssetType")
	private MasterProductClassification masterProductClassification;

	public ClientRealEstate() {
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

	public BigDecimal getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(BigDecimal currentValue) {
		this.currentValue = currentValue;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getInvestmentDate() {
		return this.investmentDate;
	}

	public void setInvestmentDate(Date investmentDate) {
		this.investmentDate = investmentDate;
	}

	public BigDecimal getInvestmentValue() {
		return this.investmentValue;
	}

	public void setInvestmentValue(BigDecimal investmentValue) {
		this.investmentValue = investmentValue;
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

	public byte getLienMarked() {
		return this.lienMarked;
	}

	public void setLienMarked(byte lienMarked) {
		this.lienMarked = lienMarked;
	}

	public Date getLienReleaseDate() {
		return this.lienReleaseDate;
	}

	public void setLienReleaseDate(Date lienReleaseDate) {
		this.lienReleaseDate = lienReleaseDate;
	}

	public BigDecimal getRentalIncome() {
		return this.rentalIncome;
	}

	public void setRentalIncome(BigDecimal rentalIncome) {
		this.rentalIncome = rentalIncome;
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

	public LookupAlternateInvestmentsAssetType getLookupAlternateInvestmentsAssetType() {
		return this.lookupAlternateInvestmentsAssetType;
	}

	public void setLookupAlternateInvestmentsAssetType(
			LookupAlternateInvestmentsAssetType lookupAlternateInvestmentsAssetType) {
		this.lookupAlternateInvestmentsAssetType = lookupAlternateInvestmentsAssetType;
	}

	public LookupFrequency getLookupFrequency() {
		return this.lookupFrequency;
	}

	public void setLookupFrequency(LookupFrequency lookupFrequency) {
		this.lookupFrequency = lookupFrequency;
	}

	public MasterProductClassification getMasterProductClassification() {
		return this.masterProductClassification;
	}

	public void setMasterProductClassification(MasterProductClassification masterProductClassification) {
		this.masterProductClassification = masterProductClassification;
	}

}