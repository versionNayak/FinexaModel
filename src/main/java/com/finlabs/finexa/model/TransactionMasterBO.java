package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the transactionMasterBO database table.
 * 
 */
@Entity
@Table(name="transactionMasterBO")
@NamedQuery(name="TransactionMasterBO.findAll", query="SELECT t FROM TransactionMasterBO t")
public class TransactionMasterBO implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	private String transactionNumber;

	private String amcCode;

	private String applicationNo;

	private String bankName;

	private String basicTDS;

	private String brokerageAmt;

	private String brokeragePercentage;

	@Temporal(TemporalType.DATE)
	private Date caInitiatedDate;

	private String cgstAmt;

	private String distributorARNCode;

	private String dpId;

	private String eligibleAmt;

	private String entryLoad;

	private String euin;

	private String euinOpted;

	private String euinValidIndicator;

	private String exchangeFlag;

	private String exchDcFlag;

	private String folioNo;

	private String form15HDetails;

	private String gstStateCode;

	private String igstAmt;

	private String investorAccountNo;

	private String investorId;

	private String investorMin;

	private String investorName;

	private String investorPan;

	private String location;

	private String locationCategory;

	private String micrNo;

	private String micrRemarks;

	private String multBrokerOption;

	private String nav;

	private String oldFolioNo;

	@Temporal(TemporalType.DATE)
	private Date processDate;

	private String reinvestFlag;

	@Temporal(TemporalType.DATE)
	private Date reportDate;

	private String reportTime;

	private String reversalCode;

	private String scanRefNo;

	private String schemeName;

	private String schemeRTACode;

	private String schemeType;

	private String sequenceNo;

	private String sgstAmt;

	private String sipTransNo;

	private String sourceBrokerCode;

	private String sourceCode;

	private String sourceSerialNumber;

	private String subBrokerARN;

	private String subBrokerCode;

	private String swFlag;

	@Temporal(TemporalType.DATE)
	private Date sysRegDate;

	private String targetSrcScheme;

	private String taxStatus;

	private String tdsAmt;

	@Temporal(TemporalType.DATE)
	private Date ticobPostedDate;

	private String ticobTransNo;

	private String ticobTransType;

	@Temporal(TemporalType.DATE)
	private Date transactionDate;

	private String transactionMode;

	private String transactionStatus;

	private String transactionSubType;

	private String transactionTax;

	private String transAmt;

	private String transCharges;

	private String transSrc;

	private String transSuffix;

	private String transType;

	private String transUnits;

	private String txnType;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorUser advisorUser;

	//bi-directional many-to-one association to LookupRTABO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rtaID")
	private LookupRTABO lookupRtabo;

	//bi-directional many-to-one association to LookupTransactionRule
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="transTypeCode")
	private LookupTransactionRule lookupTransactionRule;

	private String transactionDescription;
	
	private String transactionDescriptionCode;	
		
	public String getTransactionDescriptionCode() {
		return transactionDescriptionCode;
	}

	public void setTransactionDescriptionCode(String transactionDescriptionCode) {
		this.transactionDescriptionCode = transactionDescriptionCode;
	}

	public String getTransactionDescription() {
		return transactionDescription;
	}

	public void setTransactionDescription(String transactionDescription) {
		this.transactionDescription = transactionDescription;
	}

	public TransactionMasterBO() {
	}

	public String getTransactionNumber() {
		return this.transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getAmcCode() {
		return this.amcCode;
	}

	public void setAmcCode(String amcCode) {
		this.amcCode = amcCode;
	}

	public String getApplicationNo() {
		return this.applicationNo;
	}

	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBasicTDS() {
		return this.basicTDS;
	}

	public void setBasicTDS(String basicTDS) {
		this.basicTDS = basicTDS;
	}

	public String getBrokerageAmt() {
		return this.brokerageAmt;
	}

	public void setBrokerageAmt(String brokerageAmt) {
		this.brokerageAmt = brokerageAmt;
	}

	public String getBrokeragePercentage() {
		return this.brokeragePercentage;
	}

	public void setBrokeragePercentage(String brokeragePercentage) {
		this.brokeragePercentage = brokeragePercentage;
	}

	public Date getCaInitiatedDate() {
		return this.caInitiatedDate;
	}

	public void setCaInitiatedDate(Date caInitiatedDate) {
		this.caInitiatedDate = caInitiatedDate;
	}

	public String getCgstAmt() {
		return this.cgstAmt;
	}

	public void setCgstAmt(String cgstAmt) {
		this.cgstAmt = cgstAmt;
	}

	public String getDistributorARNCode() {
		return this.distributorARNCode;
	}

	public void setDistributorARNCode(String distributorARNCode) {
		this.distributorARNCode = distributorARNCode;
	}

	public String getDpId() {
		return this.dpId;
	}

	public void setDpId(String dpId) {
		this.dpId = dpId;
	}

	public String getEligibleAmt() {
		return this.eligibleAmt;
	}

	public void setEligibleAmt(String eligibleAmt) {
		this.eligibleAmt = eligibleAmt;
	}

	public String getEntryLoad() {
		return this.entryLoad;
	}

	public void setEntryLoad(String entryLoad) {
		this.entryLoad = entryLoad;
	}

	public String getEuin() {
		return this.euin;
	}

	public void setEuin(String euin) {
		this.euin = euin;
	}

	public String getEuinOpted() {
		return this.euinOpted;
	}

	public void setEuinOpted(String euinOpted) {
		this.euinOpted = euinOpted;
	}

	public String getEuinValidIndicator() {
		return this.euinValidIndicator;
	}

	public void setEuinValidIndicator(String euinValidIndicator) {
		this.euinValidIndicator = euinValidIndicator;
	}

	public String getExchangeFlag() {
		return this.exchangeFlag;
	}

	public void setExchangeFlag(String exchangeFlag) {
		this.exchangeFlag = exchangeFlag;
	}

	public String getExchDcFlag() {
		return this.exchDcFlag;
	}

	public void setExchDcFlag(String exchDcFlag) {
		this.exchDcFlag = exchDcFlag;
	}

	public String getFolioNo() {
		return this.folioNo;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}

	public String getForm15HDetails() {
		return this.form15HDetails;
	}

	public void setForm15HDetails(String form15HDetails) {
		this.form15HDetails = form15HDetails;
	}

	public String getGstStateCode() {
		return this.gstStateCode;
	}

	public void setGstStateCode(String gstStateCode) {
		this.gstStateCode = gstStateCode;
	}

	public String getIgstAmt() {
		return this.igstAmt;
	}

	public void setIgstAmt(String igstAmt) {
		this.igstAmt = igstAmt;
	}

	public String getInvestorAccountNo() {
		return this.investorAccountNo;
	}

	public void setInvestorAccountNo(String investorAccountNo) {
		this.investorAccountNo = investorAccountNo;
	}

	public String getInvestorId() {
		return this.investorId;
	}

	public void setInvestorId(String investorId) {
		this.investorId = investorId;
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

	public String getInvestorPan() {
		return this.investorPan;
	}

	public void setInvestorPan(String investorPan) {
		this.investorPan = investorPan;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLocationCategory() {
		return this.locationCategory;
	}

	public void setLocationCategory(String locationCategory) {
		this.locationCategory = locationCategory;
	}

	public String getMicrNo() {
		return this.micrNo;
	}

	public void setMicrNo(String micrNo) {
		this.micrNo = micrNo;
	}

	public String getMicrRemarks() {
		return this.micrRemarks;
	}

	public void setMicrRemarks(String micrRemarks) {
		this.micrRemarks = micrRemarks;
	}

	public String getMultBrokerOption() {
		return this.multBrokerOption;
	}

	public void setMultBrokerOption(String multBrokerOption) {
		this.multBrokerOption = multBrokerOption;
	}

	public String getNav() {
		return this.nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public String getOldFolioNo() {
		return this.oldFolioNo;
	}

	public void setOldFolioNo(String oldFolioNo) {
		this.oldFolioNo = oldFolioNo;
	}

	public Date getProcessDate() {
		return this.processDate;
	}

	public void setProcessDate(Date processDate) {
		this.processDate = processDate;
	}

	public String getReinvestFlag() {
		return this.reinvestFlag;
	}

	public void setReinvestFlag(String reinvestFlag) {
		this.reinvestFlag = reinvestFlag;
	}

	public Date getReportDate() {
		return this.reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getReportTime() {
		return this.reportTime;
	}

	public void setReportTime(String reportTime) {
		this.reportTime = reportTime;
	}

	public String getReversalCode() {
		return this.reversalCode;
	}

	public void setReversalCode(String reversalCode) {
		this.reversalCode = reversalCode;
	}

	public String getScanRefNo() {
		return this.scanRefNo;
	}

	public void setScanRefNo(String scanRefNo) {
		this.scanRefNo = scanRefNo;
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

	public String getSchemeType() {
		return this.schemeType;
	}

	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}

	public String getSequenceNo() {
		return this.sequenceNo;
	}

	public void setSequenceNo(String sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	public String getSgstAmt() {
		return this.sgstAmt;
	}

	public void setSgstAmt(String sgstAmt) {
		this.sgstAmt = sgstAmt;
	}

	public String getSipTransNo() {
		return this.sipTransNo;
	}

	public void setSipTransNo(String sipTransNo) {
		this.sipTransNo = sipTransNo;
	}

	public String getSourceBrokerCode() {
		return this.sourceBrokerCode;
	}

	public void setSourceBrokerCode(String sourceBrokerCode) {
		this.sourceBrokerCode = sourceBrokerCode;
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSourceSerialNumber() {
		return this.sourceSerialNumber;
	}

	public void setSourceSerialNumber(String sourceSerialNumber) {
		this.sourceSerialNumber = sourceSerialNumber;
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

	public String getSwFlag() {
		return this.swFlag;
	}

	public void setSwFlag(String swFlag) {
		this.swFlag = swFlag;
	}

	public Date getSysRegDate() {
		return this.sysRegDate;
	}

	public void setSysRegDate(Date sysRegDate) {
		this.sysRegDate = sysRegDate;
	}

	public String getTargetSrcScheme() {
		return this.targetSrcScheme;
	}

	public void setTargetSrcScheme(String targetSrcScheme) {
		this.targetSrcScheme = targetSrcScheme;
	}

	public String getTaxStatus() {
		return this.taxStatus;
	}

	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}

	public String getTdsAmt() {
		return this.tdsAmt;
	}

	public void setTdsAmt(String tdsAmt) {
		this.tdsAmt = tdsAmt;
	}

	public Date getTicobPostedDate() {
		return this.ticobPostedDate;
	}

	public void setTicobPostedDate(Date ticobPostedDate) {
		this.ticobPostedDate = ticobPostedDate;
	}

	public String getTicobTransNo() {
		return this.ticobTransNo;
	}

	public void setTicobTransNo(String ticobTransNo) {
		this.ticobTransNo = ticobTransNo;
	}

	public String getTicobTransType() {
		return this.ticobTransType;
	}

	public void setTicobTransType(String ticobTransType) {
		this.ticobTransType = ticobTransType;
	}

	public Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionMode() {
		return this.transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
	}

	public String getTransactionStatus() {
		return this.transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public String getTransactionSubType() {
		return this.transactionSubType;
	}

	public void setTransactionSubType(String transactionSubType) {
		this.transactionSubType = transactionSubType;
	}

	public String getTransactionTax() {
		return this.transactionTax;
	}

	public void setTransactionTax(String transactionTax) {
		this.transactionTax = transactionTax;
	}

	public String getTransAmt() {
		return this.transAmt;
	}

	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	public String getTransCharges() {
		return this.transCharges;
	}

	public void setTransCharges(String transCharges) {
		this.transCharges = transCharges;
	}

	public String getTransSrc() {
		return this.transSrc;
	}

	public void setTransSrc(String transSrc) {
		this.transSrc = transSrc;
	}

	public String getTransSuffix() {
		return this.transSuffix;
	}

	public void setTransSuffix(String transSuffix) {
		this.transSuffix = transSuffix;
	}

	public String getTransType() {
		return this.transType;
	}

	public void setTransType(String transType) {
		this.transType = transType;
	}

	public String getTransUnits() {
		return this.transUnits;
	}

	public void setTransUnits(String transUnits) {
		this.transUnits = transUnits;
	}

	public String getTxnType() {
		return this.txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
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

	public LookupTransactionRule getLookupTransactionRule() {
		return this.lookupTransactionRule;
	}

	public void setLookupTransactionRule(LookupTransactionRule lookupTransactionRule) {
		this.lookupTransactionRule = lookupTransactionRule;
	}

}