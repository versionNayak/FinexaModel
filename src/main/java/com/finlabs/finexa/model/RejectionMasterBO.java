package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the rejectionMasterBO database table.
 * l
 */
@Entity
@Table(name="rejectionMasterBO")
@NamedQuery(name="RejectionMasterBO.findAll", query="SELECT r FROM RejectionMasterBO r")
public class RejectionMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String transactionNumber;

	private String address1;

	private String address2;

	private String address3;

	private String amount;

	private String applicationNumber;

	private String city;

	private String distributorCode;

	private String email;

	private String euin;

	private String folioNumber;

	private String instrumentNumber;

	private String investorName;

	private String locationCode;

	private String pan;

	private String phoneOffice;

	private String phoneResidence;

	private String pincode;

	private java.util.Date postedDate;

	private String rejectAt;

	private String remarks;

	private String schemeCode;

	private String schemeRTACode;

	private java.util.Date tradeDate;

	private String transactedLocation;

	private java.util.Date transactionDate;

	private String transactionType;

	private String userCode;

	//bi-directional many-to-one association to LookupRTABO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rtaid")
	private LookupRTABO lookupRtabo;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorUser advisorUser;

	public RejectionMasterBO() {
	}

	public String getTransactionNumber() {
		return this.transactionNumber;
	}

	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}

	public String getAddress1() {
		return this.address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return this.address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getAmount() {
		return this.amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getApplicationNumber() {
		return this.applicationNumber;
	}

	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistributorCode() {
		return this.distributorCode;
	}

	public void setDistributorCode(String distributorCode) {
		this.distributorCode = distributorCode;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEuin() {
		return this.euin;
	}

	public void setEuin(String euin) {
		this.euin = euin;
	}

	public String getFolioNumber() {
		return this.folioNumber;
	}

	public void setFolioNumber(String folioNumber) {
		this.folioNumber = folioNumber;
	}

	public String getInstrumentNumber() {
		return this.instrumentNumber;
	}

	public void setInstrumentNumber(String instrumentNumber) {
		this.instrumentNumber = instrumentNumber;
	}

	public String getInvestorName() {
		return this.investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public String getLocationCode() {
		return this.locationCode;
	}

	public void setLocationCode(String locationCode) {
		this.locationCode = locationCode;
	}

	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getPhoneOffice() {
		return this.phoneOffice;
	}

	public void setPhoneOffice(String phoneOffice) {
		this.phoneOffice = phoneOffice;
	}

	public String getPhoneResidence() {
		return this.phoneResidence;
	}

	public void setPhoneResidence(String phoneResidence) {
		this.phoneResidence = phoneResidence;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public java.util.Date getPostedDate() {
		return this.postedDate;
	}

	public void setPostedDate(java.util.Date postedDate) {
		this.postedDate = postedDate;
	}

	public String getRejectAt() {
		return this.rejectAt;
	}

	public void setRejectAt(String rejectAt) {
		this.rejectAt = rejectAt;
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

	public String getSchemeRTACode() {
		return this.schemeRTACode;
	}

	public void setSchemeRTACode(String schemeRTACode) {
		this.schemeRTACode = schemeRTACode;
	}

	public java.util.Date getTradeDate() {
		return this.tradeDate;
	}

	public void setTradeDate(java.util.Date tradeDate) {
		this.tradeDate = tradeDate;
	}

	public String getTransactedLocation() {
		return this.transactedLocation;
	}

	public void setTransactedLocation(String transactedLocation) {
		this.transactedLocation = transactedLocation;
	}

	public java.util.Date getTransactionDate() {
		return this.transactionDate;
	}

	public void setTransactionDate(java.util.Date transactionDate) {
		this.transactionDate = transactionDate;
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

	public LookupRTABO getLookupRtabo() {
		return this.lookupRtabo;
	}

	public void setLookupRtabo(LookupRTABO lookupRtabo) {
		this.lookupRtabo = lookupRtabo;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

}