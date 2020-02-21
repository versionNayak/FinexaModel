package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the masterTransactMandate database table.
 * 
 */
@Entity
@Table(name="masterTransactMandate")
@NamedQuery(name="MasterTransactMandate.findAll", query="SELECT m FROM MasterTransactMandate m")
public class MasterTransactMandate implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mandateCode")
	private String mandateCode;
	
	private double amount;
	
	@Temporal(TemporalType.DATE)
	private Date approvedDate;
	
	private String bankAccountNo;

	private String bankBranch;

	private String bankName;

	private String clientCode;

	private String clientName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateOfUpload;

	private String mandateType;

	private String mandateCollectionType;

	private String memberCode;

	@Temporal(TemporalType.DATE)
	private Date regnDate;

	private String remarks;

	private String status;

	private String umrnNo;

	public MasterTransactMandate() {
	}

	public String getMandateCode() {
		return this.mandateCode;
	}

	public void setMandateCode(String mandateCode) {
		this.mandateCode = mandateCode;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Date getApprovedDate() {
		return this.approvedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public String getBankAccountNo() {
		return this.bankAccountNo;
	}

	public void setBankAccountNo(String bankAccountNo) {
		this.bankAccountNo = bankAccountNo;
	}

	public String getBankBranch() {
		return this.bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getClientCode() {
		return this.clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getClientName() {
		return this.clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getDateOfUpload() {
		return this.dateOfUpload;
	}

	public void setDateOfUpload(Date dateOfUpload) {
		this.dateOfUpload = dateOfUpload;
	}

	public String getMandateType() {
		return this.mandateType;
	}

	public void setMandateType(String mandateType) {
		this.mandateType = mandateType;
	}

	public String getMandateCollectionType() {
		return this.mandateCollectionType;
	}

	public void setMandateCollectionType(String mandateCollectionType) {
		this.mandateCollectionType = mandateCollectionType;
	}

	public String getMemberCode() {
		return this.memberCode;
	}

	public void setMemberCode(String memberCode) {
		this.memberCode = memberCode;
	}

	public Date getRegnDate() {
		return this.regnDate;
	}

	public void setRegnDate(Date regnDate) {
		this.regnDate = regnDate;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUmrnNo() {
		return this.umrnNo;
	}

	public void setUmrnNo(String umrnNo) {
		this.umrnNo = umrnNo;
	}

}