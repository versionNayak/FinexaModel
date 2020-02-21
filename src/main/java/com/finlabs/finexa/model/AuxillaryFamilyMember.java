package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the auxillaryFamilyMember database table.
 * 
 */
@Entity
@Table(name="auxillaryFamilyMember")
@NamedQuery(name="AuxillaryFamilyMember.findAll", query="SELECT a FROM AuxillaryFamilyMember a")
public class AuxillaryFamilyMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	private BigInteger aadhar;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private int clientID;

	private byte createdBy;

	private Timestamp createdOn;

	private String dependentFlag;

	private String firstName;

	private String hasDiseaseHistory;

	private String hasNormalBP;

	private String isFamilyHead;

	private String isProperBMI;

	private String isTobaccoUser;

	private String lastName;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private byte lifeExpectancy;

	private String middleName;

	private String otherRelation;

	private String pan;

	private byte relationID;

	private String retiredFlag;

	private byte retirementAge;

	//bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="familyMemberId")
	private ClientFamilyMember clientFamilyMember;

	public AuxillaryFamilyMember() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(BigInteger aadhar) {
		this.aadhar = aadhar;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public int getClientID() {
		return this.clientID;
	}

	public void setClientID(int clientID) {
		this.clientID = clientID;
	}

	public byte getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(byte createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getDependentFlag() {
		return this.dependentFlag;
	}

	public void setDependentFlag(String dependentFlag) {
		this.dependentFlag = dependentFlag;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHasDiseaseHistory() {
		return this.hasDiseaseHistory;
	}

	public void setHasDiseaseHistory(String hasDiseaseHistory) {
		this.hasDiseaseHistory = hasDiseaseHistory;
	}

	public String getHasNormalBP() {
		return this.hasNormalBP;
	}

	public void setHasNormalBP(String hasNormalBP) {
		this.hasNormalBP = hasNormalBP;
	}

	public String getIsFamilyHead() {
		return this.isFamilyHead;
	}

	public void setIsFamilyHead(String isFamilyHead) {
		this.isFamilyHead = isFamilyHead;
	}

	public String getIsProperBMI() {
		return this.isProperBMI;
	}

	public void setIsProperBMI(String isProperBMI) {
		this.isProperBMI = isProperBMI;
	}

	public String getIsTobaccoUser() {
		return this.isTobaccoUser;
	}

	public void setIsTobaccoUser(String isTobaccoUser) {
		this.isTobaccoUser = isTobaccoUser;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public byte getLastUpdateddBy() {
		return this.lastUpdateddBy;
	}

	public void setLastUpdateddBy(byte lastUpdateddBy) {
		this.lastUpdateddBy = lastUpdateddBy;
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

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getOtherRelation() {
		return this.otherRelation;
	}

	public void setOtherRelation(String otherRelation) {
		this.otherRelation = otherRelation;
	}

	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public byte getRelationID() {
		return this.relationID;
	}

	public void setRelationID(byte relationID) {
		this.relationID = relationID;
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

	public ClientFamilyMember getClientFamilyMember() {
		return this.clientFamilyMember;
	}

	public void setClientFamilyMember(ClientFamilyMember clientFamilyMember) {
		this.clientFamilyMember = clientFamilyMember;
	}

}