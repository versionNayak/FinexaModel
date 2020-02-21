package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the auxillaryInvestorMaster database table.
 * 
 */
@Entity
@Table(name="auxillaryInvestorMaster")
@NamedQuery(name="AuxillaryInvestorMaster.findAll", query="SELECT a FROM AuxillaryInvestorMaster a")
public class AuxillaryInvestorMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	private String aadhar;

	private String activeFlag;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private int countryOfResidence;

	private int createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	private String currDesignation;

	private byte eduQualification;

	private byte employmentType;

	private String firstName;

	private String gender;

	private String lastName;

	private int lastUpdatedBy;

	private Timestamp lastUpdatedOn;

	private byte lifeExpectancy;

	private byte maritalStatus;

	private String middleName;

	private byte olderRiskProfile;

	private String orgName;

	private String otherEduQualification;

	private String otherEmploymentType;

	private String otherMaritalStatus;

	private String otherResidentType;

	private String pan;

	private byte residentType;

	private String retiredFlag;

	private byte retirementAge;

	private byte riskProfile;

	private String salutation;

	private int userID;

	//bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientMasterId")
	private ClientMaster clientMaster;

	public AuxillaryInvestorMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getCountryOfResidence() {
		return this.countryOfResidence;
	}

	public void setCountryOfResidence(int countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

	public int getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getCurrDesignation() {
		return this.currDesignation;
	}

	public void setCurrDesignation(String currDesignation) {
		this.currDesignation = currDesignation;
	}

	public byte getEduQualification() {
		return this.eduQualification;
	}

	public void setEduQualification(byte eduQualification) {
		this.eduQualification = eduQualification;
	}

	public byte getEmploymentType() {
		return this.employmentType;
	}

	public void setEmploymentType(byte employmentType) {
		this.employmentType = employmentType;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(int lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public byte getLifeExpectancy() {
		return this.lifeExpectancy;
	}

	public void setLifeExpectancy(byte lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public byte getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(byte maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public byte getOlderRiskProfile() {
		return this.olderRiskProfile;
	}

	public void setOlderRiskProfile(byte olderRiskProfile) {
		this.olderRiskProfile = olderRiskProfile;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOtherEduQualification() {
		return this.otherEduQualification;
	}

	public void setOtherEduQualification(String otherEduQualification) {
		this.otherEduQualification = otherEduQualification;
	}

	public String getOtherEmploymentType() {
		return this.otherEmploymentType;
	}

	public void setOtherEmploymentType(String otherEmploymentType) {
		this.otherEmploymentType = otherEmploymentType;
	}

	public String getOtherMaritalStatus() {
		return this.otherMaritalStatus;
	}

	public void setOtherMaritalStatus(String otherMaritalStatus) {
		this.otherMaritalStatus = otherMaritalStatus;
	}

	public String getOtherResidentType() {
		return this.otherResidentType;
	}

	public void setOtherResidentType(String otherResidentType) {
		this.otherResidentType = otherResidentType;
	}

	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public byte getResidentType() {
		return this.residentType;
	}

	public void setResidentType(byte residentType) {
		this.residentType = residentType;
	}

	public String getRetiredFlag() {
		return this.retiredFlag;
	}

	public void setRetiredFlag(String retiredFlag) {
		this.retiredFlag = retiredFlag;
	}

	public byte getRetirementAge() {
		return this.retirementAge;
	}

	public void setRetirementAge(byte retirementAge) {
		this.retirementAge = retirementAge;
	}

	public byte getRiskProfile() {
		return this.riskProfile;
	}

	public void setRiskProfile(byte riskProfile) {
		this.riskProfile = riskProfile;
	}

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

}