package com.finlabs.finexa.model;

import java.io.Serializable;
import java.sql.Timestamp;

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
@Table(name = "bankDetails")
@NamedQuery(name = "BankDetails.findAll", query = "SELECT b FROM BankDetails b")
public class BankDetails implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(nullable = false, columnDefinition = "BIGINT(12)")
	private String bankAccountNumber;

	@Column(nullable = false, length = 50)
	private String bankName;

	@Column(nullable = false, length = 11)
	private String ifscCode;

	@Column(nullable = false, length = 9)
	private String micrCode;

	@Column(nullable = false, columnDefinition = "ENUM('Y','N')")
	private String yesNo;

	@Column(length = 20)
	private String createdBy;

	@Column(columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp createdOn;

	@Column(length = 20)
	private String lastUpdateddBy;

	@Column(columnDefinition = "TIMESTAMP default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp lastUpdatedOn;
	

	// bi-directional many-to-one association 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "accountType", nullable = false)
	private LookupAccountType lookupAccountType;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public LookupAccountType getLookupAccountType() {
		return lookupAccountType;
	}

	public void setLookupAccountType(LookupAccountType lookupAccountType) {
		this.lookupAccountType = lookupAccountType;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getYesNo() {
		return yesNo;
	}

	public void setYesNo(String yesNo) {
		this.yesNo = yesNo;
	}

	
	public Timestamp getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getLastUpdateddBy() {
		return lastUpdateddBy;
	}

	public void setLastUpdateddBy(String lastUpdateddBy) {
		this.lastUpdateddBy = lastUpdateddBy;
	}

	public Timestamp getLastUpdatedOn() {
		return lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getIfscCode() {
		return ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getMicrCode() {
		return micrCode;
	}

	public void setMicrCode(String micrCode) {
		this.micrCode = micrCode;
	}

}
