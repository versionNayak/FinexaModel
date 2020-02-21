package com.finlabs.finexa.model;


import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the sipSTPMasterBO database table.
 * kk
 */
@Entity
@Table(name="sipSTPMasterBO")
@NamedQuery(name="SIPSTPMasterBO.findAll", query="SELECT s FROM SIPSTPMasterBO s")
public class SIPSTPMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String transactionNumber;

	private String accountHolder;

	private String accountName;

	private String accountType;

	private String amcCode;

	private String amount;

	private String arnEmpCode;

	private String branch;

	private String chequeMICR;

	private String folioNumber;

	private String frequency;

	private java.util.Date fromDate;

	private String instrumentNumber;

	private String investorMin;

	private String investorName;

	private String investorPAN;

	private String location;

	private String paymentMode;

	private String periodDay;

	private java.util.Date registrationDate;

	private String remarks;

	private String schemeCode;

	private String schemeName;

	private String schemeRTACode;

	private String subBrokerARN;

	private String subBrokerCode;

	private String targetScheme;
	
	private String targetSchemeRTACode;

	private java.util.Date terminationDate;

	private java.util.Date toDate;

	private String topUpAmount;

	private String topUpFrequency;

	private String topUpPercentage;

	private String transactionType;

	private String userCode;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorUser advisorUser;

	//bi-directional many-to-one association to LookupRTABO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rtaID")
	private LookupRTABO lookupRtabo;

	public SIPSTPMasterBO() {
	}

	public String getTransactionNumber() {
		return this.transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getAccountHolder() {
		return this.accountHolder;
	}

	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getAmcCode() {
		return this.amcCode;
	}

	public void setAmcCode(String amcCode) {
		this.amcCode = amcCode;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getArnEmpCode() {
		return this.arnEmpCode;
	}

	public void setArnEmpCode(String arnEmpCode) {
		this.arnEmpCode = arnEmpCode;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getChequeMICR() {
		return this.chequeMICR;
	}

	public void setChequeMICR(String chequeMICR) {
		this.chequeMICR = chequeMICR;
	}

	public String getFolioNumber() {
		return this.folioNumber;
	}

	public void setFolioNumber(String folioNumber) {
		this.folioNumber = folioNumber;
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public java.util.Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(java.util.Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getInstrumentNumber() {
		return this.instrumentNumber;
	}

	public void setInstrumentNumber(String instrumentNumber) {
		this.instrumentNumber = instrumentNumber;
	}

	public String getInvestorMin() {
		return this.investorMin;
	}

	public void setInvestorMin(String investorMin) {
		this.investorMin = investorMin;
	}

	public String getInvestorName() {
		return this.investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public String getInvestorPAN() {
		return this.investorPAN;
	}

	public void setInvestorPAN(String investorPAN) {
		this.investorPAN = investorPAN;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPaymentMode() {
		return this.paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getPeriodDay() {
		return this.periodDay;
	}

	public void setPeriodDay(String periodDay) {
		this.periodDay = periodDay;
	}

	public java.util.Date getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(java.util.Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSchemeCode() {
		return this.schemeCode;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSchemeRTACode() {
		return this.schemeRTACode;
	}

	public void setSchemeRTACode(String schemeRTACode) {
		this.schemeRTACode = schemeRTACode;
	}

	
	public String getSubBrokerARN() {
		return this.subBrokerARN;
	}

	public void setSubBrokerARN(String subBrokerARN) {
		this.subBrokerARN = subBrokerARN;
	}

	public String getSubBrokerCode() {
		return this.subBrokerCode;
	}

	public void setSubBrokerCode(String subBrokerCode) {
		this.subBrokerCode = subBrokerCode;
	}

	public String getTargetScheme() {
		return this.targetScheme;
	}

	public void setTargetScheme(String targetScheme) {
		this.targetScheme = targetScheme;
	}

	public String getTargetSchemeRTACode() {
		return this.targetSchemeRTACode;
	}

	public void setTargetSchemeRTACode(String targetSchemeRTACode) {
		this.targetSchemeRTACode = targetSchemeRTACode;
	}

	public java.util.Date getTerminationDate() {
		return this.terminationDate;
	}

	public void setTerminationDate(java.util.Date terminationDate) {
		this.terminationDate = terminationDate;
	}

	public java.util.Date getToDate() {
		return this.toDate;
	}

	public void setToDate(java.util.Date toDate) {
		this.toDate = toDate;
	}

	public String getTopUpAmount() {
		return this.topUpAmount;
	}

	public void setTopUpAmount(String topUpAmount) {
		this.topUpAmount = topUpAmount;
	}

	public String getTopUpFrequency() {
		return this.topUpFrequency;
	}

	public void setTopUpFrequency(String topUpFrequency) {
		this.topUpFrequency = topUpFrequency;
	}

	public String getTopUpPercentage() {
		return this.topUpPercentage;
	}

	public void setTopUpPercentage(String topUpPercentage) {
		this.topUpPercentage = topUpPercentage;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public String getUserCode() {
		return this.userCode;
	}

	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public LookupRTABO getLookupRtabo() {
		return this.lookupRtabo;
	}

	public void setLookupRtabo(LookupRTABO lookupRtabo) {
		this.lookupRtabo = lookupRtabo;
	}

}