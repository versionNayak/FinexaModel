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
 * The persistent class for the clientAtalPensionYojana database table.
 * 
 */
@Entity
@Table(name = "clientAtalPensionYojana")
@NamedQuery(name = "ClientAtalPensionYojana.findAll", query = "SELECT c FROM ClientAtalPensionYojana c")
public class ClientAtalPensionYojana implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Temporal(TemporalType.DATE)
	private Date apyStartDate;

	private byte createdBy;

	private Timestamp createdOn;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private BigDecimal monthlyPensionRequired;

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
	@JoinColumn(name = "investmentFrequency")
	private LookupFrequency lookupFrequency;

	// bi-directional many-to-one association to MasterProductClassification
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "financialAssetType")
	private MasterProductClassification masterProductClassification;

	public ClientAtalPensionYojana() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getApyStartDate() {
		return this.apyStartDate;
	}

	public void setApyStartDate(Date apyStartDate) {
		this.apyStartDate = apyStartDate;
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

	public BigDecimal getMonthlyPensionRequired() {
		return this.monthlyPensionRequired;
	}

	public void setMonthlyPensionRequired(BigDecimal monthlyPensionRequired) {
		this.monthlyPensionRequired = monthlyPensionRequired;
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

	public MasterProductClassification getMasterProductClassification() {
		return this.masterProductClassification;
	}

	public void setMasterProductClassification(MasterProductClassification masterProductClassification) {
		this.masterProductClassification = masterProductClassification;
	}

}