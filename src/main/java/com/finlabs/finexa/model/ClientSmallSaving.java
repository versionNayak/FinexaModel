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
 * The persistent class for the clientSmallSaving database table.
 * 
 */
@Entity
@Table(name = "clientSmallSaving")
@NamedQuery(name = "ClientSmallSaving.findAll", query = "SELECT c FROM ClientSmallSaving c")
public class ClientSmallSaving implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private byte createdBy;

	private Timestamp createdOn;

	private byte depositTenure;

	private BigDecimal interestRate;

	private BigDecimal investmentAmount;

	private byte kvpTenureMonth;

	private byte kvpTenureYear;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	@Temporal(TemporalType.DATE)
	private Date maturityDate;

	private byte maturityTenure;

	@Temporal(TemporalType.DATE)
	private Date startDate;

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

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "compoundingFrequency")
	private LookupFrequency lookupFrequency1;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "interestPayoutFrequency")
	private LookupFrequency lookupFrequency2;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "depositFrequency")
	private LookupFrequency lookupFrequency3;

	public ClientSmallSaving() {
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

	public byte getDepositTenure() {
		return this.depositTenure;
	}

	public void setDepositTenure(byte depositTenure) {
		this.depositTenure = depositTenure;
	}

	public BigDecimal getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public BigDecimal getInvestmentAmount() {
		return this.investmentAmount;
	}

	public void setInvestmentAmount(BigDecimal investmentAmount) {
		this.investmentAmount = investmentAmount;
	}

	public byte getKvpTenureMonth() {
		return this.kvpTenureMonth;
	}

	public void setKvpTenureMonth(byte kvpTenureMonth) {
		this.kvpTenureMonth = kvpTenureMonth;
	}

	public byte getKvpTenureYear() {
		return this.kvpTenureYear;
	}

	public void setKvpTenureYear(byte kvpTenureYear) {
		this.kvpTenureYear = kvpTenureYear;
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

	public byte getMaturityTenure() {
		return this.maturityTenure;
	}

	public void setMaturityTenure(byte maturityTenure) {
		this.maturityTenure = maturityTenure;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
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

	public LookupFrequency getLookupFrequency1() {
		return this.lookupFrequency1;
	}

	public void setLookupFrequency1(LookupFrequency lookupFrequency1) {
		this.lookupFrequency1 = lookupFrequency1;
	}

	public LookupFrequency getLookupFrequency2() {
		return this.lookupFrequency2;
	}

	public void setLookupFrequency2(LookupFrequency lookupFrequency2) {
		this.lookupFrequency2 = lookupFrequency2;
	}

	public LookupFrequency getLookupFrequency3() {
		return this.lookupFrequency3;
	}

	public void setLookupFrequency3(LookupFrequency lookupFrequency3) {
		this.lookupFrequency3 = lookupFrequency3;
	}

}