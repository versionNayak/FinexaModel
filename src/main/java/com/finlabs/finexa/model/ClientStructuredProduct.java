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
 * The persistent class for the clientStructuredProduct database table.
 * 
 */
@Entity
@Table(name = "clientStructuredProduct")
@NamedQuery(name = "ClientStructuredProduct.findAll", query = "SELECT c FROM ClientStructuredProduct c")
public class ClientStructuredProduct implements Serializable {
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
	private Date investmentStartDate;

	private BigDecimal investmentValue;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	@Temporal(TemporalType.DATE)
	private Date maturityDate;

	private BigDecimal maturityValue;

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

	public ClientStructuredProduct() {
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

	public Date getInvestmentStartDate() {
		return this.investmentStartDate;
	}

	public void setInvestmentStartDate(Date investmentStartDate) {
		this.investmentStartDate = investmentStartDate;
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

	public Date getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getMaturityValue() {
		return this.maturityValue;
	}

	public void setMaturityValue(BigDecimal maturityValue) {
		this.maturityValue = maturityValue;
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

}