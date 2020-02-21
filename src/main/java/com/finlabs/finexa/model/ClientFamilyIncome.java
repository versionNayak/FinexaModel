package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

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

//import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the clientFamilyIncome database table.
 * 
 */
@Entity
@Table(name = "clientFamilyIncome")
@NamedQuery(name = "ClientFamilyIncome.findAll", query = "SELECT c FROM ClientFamilyIncome c")
public class ClientFamilyIncome implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal incomeAmount;

	private byte incomeType;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	// bi-directional many-to-one association to ClientMaster
	//@JsonIgnore******************************************Done by Smita
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "incomeFrequency")
	private LookupFrequency lookupFrequency;

	// bi-directional many-to-one association to LookupMonth
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "referenceMonth")
	private LookupMonth lookupMonth;

	// bi-directional many-to-one association to LookupIncomeExpenseDuration
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "incomeEndYear")
	private LookupIncomeExpenseDuration lookupIncomeExpenseDuration;

	public ClientFamilyIncome() {
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

	public BigDecimal getIncomeAmount() {
		return this.incomeAmount;
	}

	public void setIncomeAmount(BigDecimal incomeAmount) {
		this.incomeAmount = incomeAmount;
	}

	public byte getIncomeType() {
		return this.incomeType;
	}

	public void setIncomeType(byte incomeType) {
		this.incomeType = incomeType;
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

	public LookupMonth getLookupMonth() {
		return this.lookupMonth;
	}

	public void setLookupMonth(LookupMonth lookupMonth) {
		this.lookupMonth = lookupMonth;
	}

	public LookupIncomeExpenseDuration getLookupIncomeExpenseDuration() {
		return this.lookupIncomeExpenseDuration;
	}

	public void setLookupIncomeExpenseDuration(LookupIncomeExpenseDuration lookupIncomeExpenseDuration) {
		this.lookupIncomeExpenseDuration = lookupIncomeExpenseDuration;
	}

}