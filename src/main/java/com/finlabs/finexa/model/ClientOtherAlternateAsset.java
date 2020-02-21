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
 * The persistent class for the clientOtherAlternateAsset database table.
 * 
 */
@Entity
@Table(name = "clientOtherAlternateAsset")
@NamedQuery(name = "ClientOtherAlternateAsset.findAll", query = "SELECT c FROM ClientOtherAlternateAsset c")
public class ClientOtherAlternateAsset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String closeEndedFlag;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal currentMarketValue;

	private String fundDescription;

	@Temporal(TemporalType.DATE)
	private Date investmentDate;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	@Temporal(TemporalType.DATE)
	private Date maturityDate;

	private BigDecimal outstandingAmount;

	private String schemeName;

	private BigDecimal totalDrawdownAmount;

	private BigDecimal totalInterestReceived;

	private BigDecimal totalInvestmentAmount;

	private BigDecimal totalPrincipalReceived;

	// bi-directional many-to-one association to MasterProductClassification
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "financialAssetType")
	private MasterProductClassification masterProductClassification;

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

	public ClientOtherAlternateAsset() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getFundDescription() {
		return this.fundDescription;
	}

	public void setFundDescription(String fundDescription) {
		this.fundDescription = fundDescription;
	}

	public Date getInvestmentDate() {
		return this.investmentDate;
	}

	public void setInvestmentDate(Date investmentDate) {
		this.investmentDate = investmentDate;
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

	public Date getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getOutstandingAmount() {
		return this.outstandingAmount;
	}

	public void setOutstandingAmount(BigDecimal outstandingAmount) {
		this.outstandingAmount = outstandingAmount;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public BigDecimal getTotalDrawdownAmount() {
		return this.totalDrawdownAmount;
	}

	public void setTotalDrawdownAmount(BigDecimal totalDrawdownAmount) {
		this.totalDrawdownAmount = totalDrawdownAmount;
	}

	public BigDecimal getTotalInterestReceived() {
		return this.totalInterestReceived;
	}

	public void setTotalInterestReceived(BigDecimal totalInterestReceived) {
		this.totalInterestReceived = totalInterestReceived;
	}

	public BigDecimal getTotalInvestmentAmount() {
		return this.totalInvestmentAmount;
	}

	public void setTotalInvestmentAmount(BigDecimal totalInvestmentAmount) {
		this.totalInvestmentAmount = totalInvestmentAmount;
	}

	public BigDecimal getTotalPrincipalReceived() {
		return this.totalPrincipalReceived;
	}

	public void setTotalPrincipalReceived(BigDecimal totalPrincipalReceived) {
		this.totalPrincipalReceived = totalPrincipalReceived;
	}

	public MasterProductClassification getMasterProductClassification() {
		return this.masterProductClassification;
	}

	public void setMasterProductClassification(MasterProductClassification masterProductClassification) {
		this.masterProductClassification = masterProductClassification;
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

}