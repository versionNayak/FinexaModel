package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "ISIPMandateRegistration")
@NamedQuery(name = "ISIPMandateRegistration.findAll", query = "SELECT i FROM ISIPMandateRegistration i")
public class ISIPMandateRegistration implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	@Column(nullable=false,length=50)
	private String bankName;
	
	@Column(nullable=false,length=100)
	private String branch;
	
	@Column(nullable=false)
	private int bankAccountNumber;
	
	@Column(nullable=false,columnDefinition="Decimal(15,2)")
	private double amount;

	
	@Column(nullable=false,length=100)
	private String mandateType;

	@Column(length = 20)
	private String createdBy;
	
	@Column(columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp createdOn;
	
	@Column(length = 20)
	private String lastUpdateddBy;

	@Column(columnDefinition="TIMESTAMP default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP")
	private Timestamp lastUpdatedOn;

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public int getBankAccountNumber() {
		return bankAccountNumber;
	}


	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	public String getMandateType() {
		return mandateType;
	}


	public void setMandateType(String mandateType) {
		this.mandateType = mandateType;
	}

	public Timestamp getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}


	public Timestamp getLastUpdatedOn() {
		return lastUpdatedOn;
	}


	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
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
	
	
	
	

}
