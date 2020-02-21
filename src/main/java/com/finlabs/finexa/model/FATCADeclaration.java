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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "FATCADeclaration")
@NamedQuery(name = "FATCADeclaration.findAll", query = "SELECT f FROM FATCADeclaration f")
public class FATCADeclaration implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(nullable = false, length = 100)
	private String applicantName;

	@Column(nullable = false, length = 10)
	private String pan;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date birthDate;

	@Column(nullable = false)
	private int bankAccountNumber;

	private Integer OTP;

	@Column(nullable = false, length = 50)
	private String countryOfBirth;

	@Column(nullable = false, length = 100)
	private String placeOfBirth;


	@Column(columnDefinition = "ENUM('Y','N')")
	private String politicallyExposedPerson;

	@Column(length = 100)
	private String countryOfTaxResidency;

	@Column(length = 100)
	private String TaxPayerIdentificationNo;

	@Column(length = 100)
	private String identificationType;

	@Column(length = 500)
	private String declaration;

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
	@JoinColumn(name = "holding", nullable = false)
	private LookupAddressType lookupAddressType;

	// bi-directional many-to-one association 
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "grossAnnualIncome", nullable = false)
	private LookupApplicantIncome lookupApplicantIncome;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getPan() {
		return pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(Integer bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public Integer getOTP() {
		return OTP;
	}

	public void setOTP(Integer oTP) {
		OTP = oTP;
	}

	public String getCountryOfBirth() {
		return countryOfBirth;
	}

	public void setCountryOfBirth(String countryOfBirth) {
		this.countryOfBirth = countryOfBirth;
	}

	public String getPlaceOfBirth() {
		return placeOfBirth;
	}

	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}

	

	public LookupAddressType getLookupAddressType() {
		return lookupAddressType;
	}

	public void setLookupAddressType(LookupAddressType lookupAddressType) {
		this.lookupAddressType = lookupAddressType;
	}

	public LookupApplicantIncome getLookupApplicantIncome() {
		return lookupApplicantIncome;
	}

	public void setLookupApplicantIncome(LookupApplicantIncome lookupApplicantIncome) {
		this.lookupApplicantIncome = lookupApplicantIncome;
	}

	public String getPoliticallyExposedPerson() {
		return politicallyExposedPerson;
	}

	public void setPoliticallyExposedPerson(String politicallyExposedPerson) {
		this.politicallyExposedPerson = politicallyExposedPerson;
	}

	public String getCountryOfTaxResidency() {
		return countryOfTaxResidency;
	}

	public void setCountryOfTaxResidency(String countryOfTaxResidency) {
		this.countryOfTaxResidency = countryOfTaxResidency;
	}

	public String getTaxPayerIdentificationNo() {
		return TaxPayerIdentificationNo;
	}

	public void setTaxPayerIdentificationNo(String taxPayerIdentificationNo) {
		TaxPayerIdentificationNo = taxPayerIdentificationNo;
	}

	public String getIdentificationType() {
		return identificationType;
	}

	public void setIdentificationType(String identificationType) {
		this.identificationType = identificationType;
	}

	public String getDeclaration() {
		return declaration;
	}

	public void setDeclaration(String declaration) {
		this.declaration = declaration;
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

	public void setBankAccountNumber(int bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
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
