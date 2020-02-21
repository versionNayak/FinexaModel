package com.finlabs.finexa.model;

import java.io.Serializable;

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

@Entity
@Table(name = "purchaseLumpsumTransaction")
@NamedQuery(name = "PurchaseLumpsumTransaction.findAll", query = "SELECT l FROM PurchaseLumpsumTransaction l")
public class PurchaseLumpsumTransaction implements Serializable {
	
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

	@Column(columnDefinition = "Decimal(20,2)")
	private double amountInvested;

	@Column(nullable = false, columnDefinition = "Decimal(20,2)")
	private int unitsPurchased;

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

	public double getAmountInvested() {
		return amountInvested;
	}

	public void setAmountInvested(double amountInvested) {
		this.amountInvested = amountInvested;
	}

	public int getUnitsPurchased() {
		return unitsPurchased;
	}

	public void setUnitsPurchased(int unitsPurchased) {
		this.unitsPurchased = unitsPurchased;
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
	
	

}
