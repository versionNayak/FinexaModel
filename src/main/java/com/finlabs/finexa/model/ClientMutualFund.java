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
 * The persistent class for the clientMutualFund database table.
 * 
 */
@Entity
@Table(name = "clientMutualFund")
@NamedQuery(name = "ClientMutualFund.findAll", query = "SELECT c FROM ClientMutualFund c")
public class ClientMutualFund implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String isin;

	private String closeEndedFlag;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal currentMarketValue;

	private BigDecimal investmentAmount;

	@Temporal(TemporalType.DATE)
	private Date investmentStartDate;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private BigDecimal lumpsumUnitsPurchased;

	@Temporal(TemporalType.DATE)
	private Date mfLumpsumLockedInDate;

	private String pmsProvider;

	private String pmsSchemeName;

	private byte sipFrequency;

	private Integer sipInstalments;
	
	private String backOfficeEntry;
	
	private String folioNumber;

	// bi-directional many-to-one association to MasterProductClassification
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fundTypeID")
	private MasterProductClassification masterProductClassification;

	// bi-directional many-to-one association to LookupAssetSubClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subAssetID")
	private LookupAssetSubClass lookupAssetSubClass;

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	// bi-directional many-to-one association to LookupFundInvestmentMode
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "investmentModeID")
	private LookupFundInvestmentMode lookupFundInvestmentMode;

	// bi-directional many-to-one association to LookupFundCategory
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fundCategoryID")
	private LookupFundCategory lookupFundCategory;

	public ClientMutualFund() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getCloseEndedFlag() {
		return this.closeEndedFlag;
	}

	public void setCloseEndedFlag(String closeEndedFlag) {
		this.closeEndedFlag = closeEndedFlag;
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

	public BigDecimal getCurrentMarketValue() {
		return this.currentMarketValue;
	}

	public void setCurrentMarketValue(BigDecimal currentMarketValue) {
		this.currentMarketValue = currentMarketValue;
	}

	public BigDecimal getInvestmentAmount() {
		return this.investmentAmount;
	}

	public void setInvestmentAmount(BigDecimal investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public Date getInvestmentStartDate() {
		return this.investmentStartDate;
	}

	public void setInvestmentStartDate(Date investmentStartDate) {
		this.investmentStartDate = investmentStartDate;
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

	public BigDecimal getLumpsumUnitsPurchased() {
		return this.lumpsumUnitsPurchased;
	}

	public void setLumpsumUnitsPurchased(BigDecimal lumpsumUnitsPurchased) {
		this.lumpsumUnitsPurchased = lumpsumUnitsPurchased;
	}

	public Date getMfLumpsumLockedInDate() {
		return this.mfLumpsumLockedInDate;
	}

	public void setMfLumpsumLockedInDate(Date mfLumpsumLockedInDate) {
		this.mfLumpsumLockedInDate = mfLumpsumLockedInDate;
	}

	public String getPmsProvider() {
		return this.pmsProvider;
	}

	public void setPmsProvider(String pmsProvider) {
		this.pmsProvider = pmsProvider;
	}

	public String getPmsSchemeName() {
		return this.pmsSchemeName;
	}

	public void setPmsSchemeName(String pmsSchemeName) {
		this.pmsSchemeName = pmsSchemeName;
	}

	public byte getSipFrequency() {
		return this.sipFrequency;
	}

	public void setSipFrequency(byte sipFrequency) {
		this.sipFrequency = sipFrequency;
	}

	public Integer getSipInstalments() {
		return this.sipInstalments;
	}

	public void setSipInstalments(Integer sipInstalments) {
		this.sipInstalments = sipInstalments;
	}

	public MasterProductClassification getMasterProductClassification() {
		return this.masterProductClassification;
	}

	public void setMasterProductClassification(MasterProductClassification masterProductClassification) {
		this.masterProductClassification = masterProductClassification;
	}

	public LookupAssetSubClass getLookupAssetSubClass() {
		return this.lookupAssetSubClass;
	}

	public void setLookupAssetSubClass(LookupAssetSubClass lookupAssetSubClass) {
		this.lookupAssetSubClass = lookupAssetSubClass;
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

	public LookupFundInvestmentMode getLookupFundInvestmentMode() {
		return this.lookupFundInvestmentMode;
	}

	public void setLookupFundInvestmentMode(LookupFundInvestmentMode lookupFundInvestmentMode) {
		this.lookupFundInvestmentMode = lookupFundInvestmentMode;
	}

	public LookupFundCategory getLookupFundCategory() {
		return this.lookupFundCategory;
	}

	public void setLookupFundCategory(LookupFundCategory lookupFundCategory) {
		this.lookupFundCategory = lookupFundCategory;
	}
	
	public String getBackOfficeEntry() {
		return this.backOfficeEntry;
	}

	public void setBackOfficeEntry(String backOfficeEntry) {
		this.backOfficeEntry = backOfficeEntry;
	}

	public String getFolioNumber() {
		return this.folioNumber;
	}

	public void setFolioNumber(String folioNumber) {
		this.folioNumber = folioNumber;
	}
}