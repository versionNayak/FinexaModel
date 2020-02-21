package com.finlabs.finexa.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "CKYCDetails")
@NamedQuery(name = "CKYCDetails.findAll", query = "SELECT c FROM CKYCDetails c")
public class CKYCDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(nullable = false, columnDefinition = "ENUM('Y','N')")
	private String ckyc;

	@Column(length = 50)
	private String kycTypeFirstApplicant;

	@Column(length = 14)
	private String ckycNoFirstApplicant;

	@Column(length = 50)
	private String kycTypeSecondApplicant;

	@Column(length = 14)
	private String ckycNoSecondApplicant;

	@Column(length = 50)
	private String kycTypeThirdApplicant;

	@Column(length = 14)
	private String ckycNoThirdApplicant;

	@Column(length = 50)
	private String branch;

	@Column(length = 50)
	private String status;

	@Column(length = 50)
	private String dividenPaymentMode;

	@Column(length = 50)
	private String dipositoryDetailsClientType;

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
	@JoinColumn(name = "communicationMode", nullable = false)
	private LookupCommunicationMode lookupCommunicationMode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCkyc() {
		return ckyc;
	}

	public void setCkyc(String ckyc) {
		this.ckyc = ckyc;
	}

	public String getKycTypeFirstApplicant() {
		return kycTypeFirstApplicant;
	}

	public void setKycTypeFirstApplicant(String kycTypeFirstApplicant) {
		this.kycTypeFirstApplicant = kycTypeFirstApplicant;
	}

	public String getCkycNoFirstApplicant() {
		return ckycNoFirstApplicant;
	}

	public void setCkycNoFirstApplicant(String ckycNoFirstApplicant) {
		this.ckycNoFirstApplicant = ckycNoFirstApplicant;
	}

	public String getKycTypeSecondApplicant() {
		return kycTypeSecondApplicant;
	}

	public void setKycTypeSecondApplicant(String kycTypeSecondApplicant) {
		this.kycTypeSecondApplicant = kycTypeSecondApplicant;
	}

	public String getCkycNoSecondApplicant() {
		return ckycNoSecondApplicant;
	}

	public void setCkycNoSecondApplicant(String ckycNoSecondApplicant) {
		this.ckycNoSecondApplicant = ckycNoSecondApplicant;
	}

	public String getKycTypeThirdApplicant() {
		return kycTypeThirdApplicant;
	}

	public void setKycTypeThirdApplicant(String kycTypeThirdApplicant) {
		this.kycTypeThirdApplicant = kycTypeThirdApplicant;
	}

	public String getCkycNoThirdApplicant() {
		return ckycNoThirdApplicant;
	}

	public void setCkycNoThirdApplicant(String ckycNoThirdApplicant) {
		this.ckycNoThirdApplicant = ckycNoThirdApplicant;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDividenPaymentMode() {
		return dividenPaymentMode;
	}

	public void setDividenPaymentMode(String dividenPaymentMode) {
		this.dividenPaymentMode = dividenPaymentMode;
	}

	public String getDipositoryDetailsClientType() {
		return dipositoryDetailsClientType;
	}

	public void setDipositoryDetailsClientType(String dipositoryDetailsClientType) {
		this.dipositoryDetailsClientType = dipositoryDetailsClientType;
	}

	public LookupCommunicationMode getLookupCommunicationMode() {
		return lookupCommunicationMode;
	}

	public void setLookupCommunicationMode(LookupCommunicationMode lookupCommunicationMode) {
		this.lookupCommunicationMode = lookupCommunicationMode;
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

}
