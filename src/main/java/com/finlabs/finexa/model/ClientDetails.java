package com.finlabs.finexa.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the clientMaster database table.
 * 
 */
@Entity
@Table(name = "clientDetails")
@NamedQuery(name = "ClientDetails.findAll", query = "SELECT c FROM ClientDetails c")
public class ClientDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(nullable = false, length = 10)
	private String clientCode;

	
	@Column(nullable = false, length = 150)
	private String clientName;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date birthDate;

	@Column(nullable = false, columnDefinition = "ENUM('M','N')")
	private String gender;

	@Column(length = 150)
	private String secondApplicantName;

	@Column(length = 150)
	private String thirdApplicantName;

	@Column(length = 150)
	private String guardianName;

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
	@JoinColumn(name = "occupation", columnDefinition = "TINYINT(3) UNSIGNED", nullable = false)
	private LookupEmploymentType occupation;

	// bi-directional many-to-one association
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taxStatus", columnDefinition = "TINYINT(3) UNSIGNED", nullable = false)
	private LookupResidentType taxStatus;

	// bi-directional many-to-one association
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "holding", nullable = false)
	private LookupHolding lookupHolding;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClientCode() {
		return clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	
	public LookupHolding getLookupHolding() {
		return lookupHolding;
	}

	public void setLookupHolding(LookupHolding lookupHolding) {
		this.lookupHolding = lookupHolding;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSecondApplicantName() {
		return secondApplicantName;
	}

	public void setSecondApplicantName(String secondApplicantName) {
		this.secondApplicantName = secondApplicantName;
	}

	public String getThirdApplicantName() {
		return thirdApplicantName;
	}

	public void setThirdApplicantName(String thirdApplicantName) {
		this.thirdApplicantName = thirdApplicantName;
	}

	public String getGuardianName() {
		return guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public LookupEmploymentType getOccupation() {
		return occupation;
	}

	public void setOccupation(LookupEmploymentType occupation) {
		this.occupation = occupation;
	}

	public LookupResidentType getTaxStatus() {
		return taxStatus;
	}

	public void setTaxStatus(LookupResidentType taxStatus) {
		this.taxStatus = taxStatus;
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
