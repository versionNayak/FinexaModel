package com.finlabs.finexa.model;

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
@Table(name = "SystematicWithdrawalPlan")
@NamedQuery(name = "SystematicWithdrawalPlan.findAll", query = "SELECT s FROM SystematicWithdrawalPlan s")
public class SystematicWithdrawalPlan {private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "ID")
private int id;

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
private double withdrawalAmount;

@Column(nullable = false, columnDefinition = "Decimal(20,2)")
private double withdrawalUnits;

@Column(nullable = false)
private int installmentNo;

@Temporal(TemporalType.DATE)
@Column(nullable = false)
private Date swpStartDate;

@Temporal(TemporalType.DATE)
private Date swpEndDate;

// bi-directional many-to-one association 
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "transactInvestmentMode")
private LookupTransactInvestmentMode lookupTransactInvestmentMode;

// bi-directional many-to-one association 
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "frequencyType", columnDefinition = "TINYINT(3) UNSIGNED", nullable = false)
private LookupFrequency lookupFrequency;

// bi-directional many-to-one association 
@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "transactionMode", nullable = false)
private LookupTransactionMode lookupTransactionMode;

public int getId() {
	return id;
}

public void setId(int id) {
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

public double getWithdrawalAmount() {
	return withdrawalAmount;
}

public void setWithdrawalAmount(double withdrawalAmount) {
	this.withdrawalAmount = withdrawalAmount;
}

public double getWithdrawalUnits() {
	return withdrawalUnits;
}

public void setWithdrawalUnits(double withdrawalUnits) {
	this.withdrawalUnits = withdrawalUnits;
}

public int getInstallmentNo() {
	return installmentNo;
}

public void setInstallmentNo(int installmentNo) {
	this.installmentNo = installmentNo;
}

public LookupTransactInvestmentMode getLookupTransactInvestmentMode() {
	return lookupTransactInvestmentMode;
}

public void setLookupTransactInvestmentMode(LookupTransactInvestmentMode lookupTransactInvestmentMode) {
	this.lookupTransactInvestmentMode = lookupTransactInvestmentMode;
}

public LookupFrequency getLookupFrequency() {
	return lookupFrequency;
}

public void setLookupFrequency(LookupFrequency lookupFrequency) {
	this.lookupFrequency = lookupFrequency;
}

public LookupTransactionMode getLookupTransactionMode() {
	return lookupTransactionMode;
}

public void setLookupTransactionMode(LookupTransactionMode lookupTransactionMode) {
	this.lookupTransactionMode = lookupTransactionMode;
}

public Date getSwpStartDate() {
	return swpStartDate;
}

public void setSwpStartDate(Date swpStartDate) {
	this.swpStartDate = swpStartDate;
}

public Date getSwpEndDate() {
	return swpEndDate;
}

public void setSwpEndDate(Date swpEndDate) {
	this.swpEndDate = swpEndDate;
}


}
