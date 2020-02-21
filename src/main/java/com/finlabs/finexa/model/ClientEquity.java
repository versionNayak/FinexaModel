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
 * The persistent class for the clientEquity database table.
 * 
 */
@Entity
@Table(name="clientEquity")
@NamedQuery(name="ClientEquity.findAll", query="SELECT c FROM ClientEquity c")
public class ClientEquity implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal currentMarketValue;

	@Temporal(TemporalType.DATE)
	private Date esopVestingDate;

	private BigDecimal investmentAmount;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private String listedFlag;

	@Temporal(TemporalType.DATE)
	private Date purchaseDate;

	private int quantity;

	private String unlistedStockName;

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

	//bi-directional many-to-one association to MasterDirectEquity
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ISIN")
	private MasterDirectEquity masterDirectEquity;

	public ClientEquity() {
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

	public BigDecimal getCurrentMarketValue() {
		return this.currentMarketValue;
	}

	public void setCurrentMarketValue(BigDecimal currentMarketValue) {
		this.currentMarketValue = currentMarketValue;
	}

	public Date getEsopVestingDate() {
		return this.esopVestingDate;
	}

	public void setEsopVestingDate(Date esopVestingDate) {
		this.esopVestingDate = esopVestingDate;
	}

	public BigDecimal getInvestmentAmount() {
		return this.investmentAmount;
	}

	public void setInvestmentAmount(BigDecimal investmentAmount) {
		this.investmentAmount = investmentAmount;
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

	public String getListedFlag() {
		return this.listedFlag;
	}

	public void setListedFlag(String listedFlag) {
		this.listedFlag = listedFlag;
	}

	public Date getPurchaseDate() {
		return this.purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getUnlistedStockName() {
		return this.unlistedStockName;
	}

	public void setUnlistedStockName(String unlistedStockName) {
		this.unlistedStockName = unlistedStockName;
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

	public MasterDirectEquity getMasterDirectEquity() {
		return this.masterDirectEquity;
	}

	public void setMasterDirectEquity(MasterDirectEquity masterDirectEquity) {
		this.masterDirectEquity = masterDirectEquity;
	}

}