package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the brokerageMasterBO database table.
 * 
 */
@Entity
@Table(name="brokerageMasterBO")
@NamedQuery(name="BrokerageMasterBO.findAll", query="SELECT b FROM BrokerageMasterBO b")
public class BrokerageMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private BrokerageMasterBOPK id;

	private String amcCode;

	private String amount;

	private String brokerageAmount;

	private String brokeragePercentage;

	private String brokerageType;

	private String folioNumber;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	private String investorName;

	private String schemeName;

	private String schemeRTACode;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	private String transactionType;

	//bi-directional many-to-one association to LookupRTABO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rtaID")
	private LookupRTABO lookupRtabo;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorUser advisorUser;

	public BrokerageMasterBO() {
	}

	public BrokerageMasterBOPK getId() {
		return this.id;
	}

	public void setId(BrokerageMasterBOPK id) {
		this.id = id;
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

	public String getBrokerageAmount() {
		return this.brokerageAmount;
	}

	public void setBrokerageAmount(String brokerageAmount) {
		this.brokerageAmount = brokerageAmount;
	}

	public String getBrokeragePercentage() {
		return this.brokeragePercentage;
	}

	public void setBrokeragePercentage(String brokeragePercentage) {
		this.brokeragePercentage = brokeragePercentage;
	}

	public String getBrokerageType() {
		return this.brokerageType;
	}

	public void setBrokerageType(String brokerageType) {
		this.brokerageType = brokerageType;
	}

	public String getFolioNumber() {
		return this.folioNumber;
	}

	public void setFolioNumber(String folioNumber) {
		this.folioNumber = folioNumber;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getInvestorName() {
		return this.investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
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

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getTransactionType() {
		return this.transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
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