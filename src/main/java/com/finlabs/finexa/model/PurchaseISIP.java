package com.finlabs.finexa.model;

import java.io.Serializable;
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

@Entity
@Table(name = "purchaseISIP")
@NamedQuery(name = "PurchaseISIP.findAll", query = "SELECT l FROM PurchaseISIP l")
public class PurchaseISIP implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	@Column(nullable = false, length = 50)
	private String amcName;

	@Column(nullable = false, length = 200)
	private String scemeName;

	@Column(nullable = false, length = 12)
	private String isinNo;

	@Column(nullable = false, length = 20)
	private String scemeCode;

	@Column(nullable = false, length = 20)
	private String scemetype;

	@Column(length = 20)
	private String folioNo;

	@Column(nullable = false, columnDefinition = "Decimal(20,2)")
	private double installAmount;
	
	@Column(nullable = false)
	private int installmentNo;
	
	@Temporal(TemporalType.DATE)
	private Date sipStartDate;
	
	@Temporal(TemporalType.DATE)
	private Date sipEndDate;

	

	// bi-directional many-to-one association 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "investmentMode", columnDefinition = "TINYINT(3) UNSIGNED")
	private LookupFundInvestmentMode lookupFundInvestmentMode;

	// bi-directional many-to-one association 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transactionType", nullable = false)
	private LookupTransactionType lookupTransactionType;

	// bi-directional many-to-one association 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transactionMode", nullable = false)
	private LookupTransactionMode lookupTransactionMode;

	// bi-directional many-to-one association 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "frequencyType", columnDefinition = "TINYINT(3) UNSIGNED", nullable = false)
	private LookupFrequency lookupFrequency;

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getAmcName() {
		return amcName;
	}

	public void setAmcName(String amcName) {
		this.amcName = amcName;
	}

	public String getScemeName() {
		return scemeName;
	}

	public void setScemeName(String scemeName) {
		this.scemeName = scemeName;
	}

	public String getIsinNo() {
		return isinNo;
	}

	public void setIsinNo(String isinNo) {
		this.isinNo = isinNo;
	}

	public String getScemeCode() {
		return scemeCode;
	}

	public void setScemeCode(String scemeCode) {
		this.scemeCode = scemeCode;
	}

	public String getScemetype() {
		return scemetype;
	}

	public void setScemetype(String scemetype) {
		this.scemetype = scemetype;
	}

	public String getFolioNo() {
		return folioNo;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}

	public double getInstallAmount() {
		return installAmount;
	}

	public void setInstallAmount(double installAmount) {
		this.installAmount = installAmount;
	}

	

	public Date getSipStartDate() {
		return sipStartDate;
	}

	public void setSipStartDate(Date sipStartDate) {
		this.sipStartDate = sipStartDate;
	}

	public Date getSipEndDate() {
		return sipEndDate;
	}

	public void setSipEndDate(Date sipEndDate) {
		this.sipEndDate = sipEndDate;
	}

	

	public LookupFundInvestmentMode getLookupFundInvestmentMode() {
		return lookupFundInvestmentMode;
	}

	public void setLookupFundInvestmentMode(LookupFundInvestmentMode lookupFundInvestmentMode) {
		this.lookupFundInvestmentMode = lookupFundInvestmentMode;
	}

	public LookupTransactionType getLookupTransactionType() {
		return lookupTransactionType;
	}

	public void setLookupTransactionType(LookupTransactionType lookupTransactionType) {
		this.lookupTransactionType = lookupTransactionType;
	}

	public LookupTransactionMode getLookupTransactionMode() {
		return lookupTransactionMode;
	}

	public void setLookupTransactionMode(LookupTransactionMode lookupTransactionMode) {
		this.lookupTransactionMode = lookupTransactionMode;
	}

	

	public LookupFrequency getLookupFrequency() {
		return lookupFrequency;
	}

	public void setLookupFrequency(LookupFrequency lookupFrequency) {
		this.lookupFrequency = lookupFrequency;
	}

	public int getInstallmentNo() {
		return installmentNo;
	}

	public void setInstallmentNo(int installmentNo) {
		this.installmentNo = installmentNo;
	}
	
	
}
