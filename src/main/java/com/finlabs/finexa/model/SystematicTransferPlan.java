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
@Table(name = "systematicTransferPlan")
@NamedQuery(name = "SystematicTransferPlan.findAll", query = "SELECT s FROM SystematicTransferPlan s")
public class SystematicTransferPlan implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(nullable = false, length = 50)
	private String amcName;

	@Column(nullable = false, length = 200)
	private String fromScemeName;

	@Column(nullable = false, length = 12)
	private String fromIsinNo;

	@Column(nullable = false, length = 20)
	private String fromScemeCode;

	@Column(nullable = false, length = 20)
	private String fromScemetype;

	@Column(nullable = false, length = 200)
	private String toScemeName;

	@Column(nullable = false, length = 12)
	private String toIsinNo;

	@Column(nullable = false, length = 20)
	private String toScemeCode;

	@Column(nullable = false, length = 20)
	private String toScemeType;

	@Column(length = 20)
	private String folioNo;

	@Column(nullable = false,columnDefinition = "Decimal(20,2)")
	private double transferAmount;

	@Column(nullable = false)
	private int installmentNo;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date stpStartDate;

	@Temporal(TemporalType.DATE)
	private Date stpEndDate;

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

	public String getFromScemeName() {
		return fromScemeName;
	}

	public void setFromScemeName(String fromScemeName) {
		this.fromScemeName = fromScemeName;
	}

	public String getFromIsinNo() {
		return fromIsinNo;
	}

	public void setFromIsinNo(String fromIsinNo) {
		this.fromIsinNo = fromIsinNo;
	}

	public String getFromScemeCode() {
		return fromScemeCode;
	}

	public void setFromScemeCode(String fromScemeCode) {
		this.fromScemeCode = fromScemeCode;
	}

	public String getFromScemetype() {
		return fromScemetype;
	}

	public void setFromScemetype(String fromScemetype) {
		this.fromScemetype = fromScemetype;
	}

	public String getToScemeName() {
		return toScemeName;
	}

	public void setToScemeName(String toScemeName) {
		this.toScemeName = toScemeName;
	}

	public String getToIsinNo() {
		return toIsinNo;
	}

	public void setToIsinNo(String toIsinNo) {
		this.toIsinNo = toIsinNo;
	}

	public String getToScemeCode() {
		return toScemeCode;
	}

	public void setToScemeCode(String toScemeCode) {
		this.toScemeCode = toScemeCode;
	}

	public String getToScemeType() {
		return toScemeType;
	}

	public void setToScemeType(String toScemeType) {
		this.toScemeType = toScemeType;
	}

	public String getFolioNo() {
		return folioNo;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}

	public double getTransferAmount() {
		return transferAmount;
	}

	public void setTransferAmount(double transferAmount) {
		this.transferAmount = transferAmount;
	}

	public int getInstallmentNo() {
		return installmentNo;
	}

	public void setInstallmentNo(int installmentNo) {
		this.installmentNo = installmentNo;
	}

	public Date getStpStartDate() {
		return stpStartDate;
	}

	public void setStpStartDate(Date stpStartDate) {
		this.stpStartDate = stpStartDate;
	}

	public Date getStpEndDate() {
		return stpEndDate;
	}

	public void setStpEndDate(Date stpEndDate) {
		this.stpEndDate = stpEndDate;
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

	public LookupTransactInvestmentMode getLookupTransactInvestmentMode() {
		return lookupTransactInvestmentMode;
	}

	public void setLookupTransactInvestmentMode(LookupTransactInvestmentMode lookupTransactInvestmentMode) {
		this.lookupTransactInvestmentMode = lookupTransactInvestmentMode;
	}
	

}
