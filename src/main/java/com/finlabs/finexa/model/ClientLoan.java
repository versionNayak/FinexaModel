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
 * The persistent class for the clientLoan database table.
 * 
 */
@Entity
@Table(name = "clientLoan")
@NamedQuery(name = "ClientLoan.findAll", query = "SELECT c FROM ClientLoan c")
public class ClientLoan implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal emiAmount;

	private byte interestPaymentFrequency;

	private BigDecimal interestRate;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private BigDecimal loanAmount;

	private String loanDescription;

	@Temporal(TemporalType.DATE)
	private Date loanEndDate;

	private String loanOriginalFlag;

	@Temporal(TemporalType.DATE)
	private Date loanStartDate;

	private byte loanTenure;

	private byte loanType;

	private String otherLoanCategory;
	
	//private String otherLoanProviderName;

	private int pendingInstalments;

	private String loanProviderName;
	
	private String emiLoanProviderName;

	

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	// bi-directional many-to-one association to LookupLoanCategory
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "loanCategoryID")
	private LookupLoanCategory lookupLoanCategory;

	public ClientLoan() {
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


	/*public String getOtherLoanProviderName() {
		return this.otherLoanProviderName;
	}

	public void setOtherLoanProviderName(String otherLoanProviderName) {
		this.otherLoanProviderName = otherLoanProviderName;
	}*/

	
	public BigDecimal getEmiAmount() {
		return this.emiAmount;
	}

	public void setEmiAmount(BigDecimal emiAmount) {
		this.emiAmount = emiAmount;
	}

	public String getEmiLoanProviderName() {
		return this.emiLoanProviderName;
	}

	public void setEmiLoanProviderName(String emiLoanProviderName) {
		this.emiLoanProviderName = emiLoanProviderName;
	}
	
	public byte getInterestPaymentFrequency() {
		return this.interestPaymentFrequency;
	}

	public void setInterestPaymentFrequency(byte interestPaymentFrequency) {
		this.interestPaymentFrequency = interestPaymentFrequency;
	}

	public BigDecimal getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
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

	public BigDecimal getLoanAmount() {
		return this.loanAmount;
	}

	public void setLoanAmount(BigDecimal loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getLoanDescription() {
		return this.loanDescription;
	}

	public void setLoanDescription(String loanDescription) {
		this.loanDescription = loanDescription;
	}

	public Date getLoanEndDate() {
		return this.loanEndDate;
	}

	public void setLoanEndDate(Date loanEndDate) {
		this.loanEndDate = loanEndDate;
	}

	public String getLoanOriginalFlag() {
		return this.loanOriginalFlag;
	}

	public void setLoanOriginalFlag(String loanOriginalFlag) {
		this.loanOriginalFlag = loanOriginalFlag;
	}

	public Date getLoanStartDate() {
		return this.loanStartDate;
	}

	public void setLoanStartDate(Date loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public byte getLoanTenure() {
		return this.loanTenure;
	}

	public void setLoanTenure(byte loanTenure) {
		this.loanTenure = loanTenure;
	}

	public byte getLoanType() {
		return this.loanType;
	}

	public void setLoanType(byte loanType) {
		this.loanType = loanType;
	}

	public String getOtherLoanCategory() {
		return this.otherLoanCategory;
	}

	public void setOtherLoanCategory(String otherLoanCategory) {
		this.otherLoanCategory = otherLoanCategory;
	}

	public int getPendingInstalments() {
		return this.pendingInstalments;
	}

	public void setPendingInstalments(int pendingInstalments) {
		this.pendingInstalments = pendingInstalments;
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

	public LookupLoanCategory getLookupLoanCategory() {
		return this.lookupLoanCategory;
	}

	public void setLookupLoanCategory(LookupLoanCategory lookupLoanCategory) {
		this.lookupLoanCategory = lookupLoanCategory;
	}

	public String getLoanProviderName() {
		return loanProviderName;
	}

	public void setLoanProviderName(String loanProviderName) {
		this.loanProviderName = loanProviderName;
	}

}