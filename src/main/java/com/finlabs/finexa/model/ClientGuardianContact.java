package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigInteger;
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

/**
 * The persistent class for the clientGuardianContact database table.
 * 
 */
@Entity
@Table(name = "clientGuardianContact")
@NamedQuery(name = "ClientGuardianContact.findAll", query = "SELECT c FROM ClientGuardianContact c")
public class ClientGuardianContact implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String alternateEmail;

	private String correspondenceAddressLine1;

	private String correspondenceAddressLine2;

	private String correspondenceAddressLine3;

	private String correspondenceCity;

	private int correspondencePincode;

	private String correspondenceState;

	private String countryCode;

	private byte createdBy;

	private Timestamp createdOn;

	private String emailID;

	private BigInteger emergencyContactNo;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private BigInteger mobile;

	private String officeAddressLine1;

	private String officeAddressLine2;

	private String officeAddressLine3;

	private String officeCity;

	private int officePincode;

	private String officeState;

	private String permanentAddressLine1;

	private String permanentAddressLine2;

	private String permanentAddressLine3;

	private String permanentCity;

	private int permanentPincode;

	private String permanentState;

	private BigInteger phone;

	// bi-directional many-to-one association to ClientGuardian
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "guardianID")
	private ClientGuardian clientGuardian;

	// bi-directional many-to-one association to LookupCountry
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "officeCountry")
	private LookupCountry lookupCountry1;

	// bi-directional many-to-one association to LookupCountry
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "permanentCountry")
	private LookupCountry lookupCountry2;

	// bi-directional many-to-one association to LookupCountry
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "correspondenceCountry")
	private LookupCountry lookupCountry3;

	public ClientGuardianContact() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAlternateEmail() {
		return this.alternateEmail;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public String getCorrespondenceAddressLine1() {
		return this.correspondenceAddressLine1;
	}

	public void setCorrespondenceAddressLine1(String correspondenceAddressLine1) {
		this.correspondenceAddressLine1 = correspondenceAddressLine1;
	}

	public String getCorrespondenceAddressLine2() {
		return this.correspondenceAddressLine2;
	}

	public void setCorrespondenceAddressLine2(String correspondenceAddressLine2) {
		this.correspondenceAddressLine2 = correspondenceAddressLine2;
	}

	public String getCorrespondenceAddressLine3() {
		return this.correspondenceAddressLine3;
	}

	public void setCorrespondenceAddressLine3(String correspondenceAddressLine3) {
		this.correspondenceAddressLine3 = correspondenceAddressLine3;
	}

	public String getCorrespondenceCity() {
		return this.correspondenceCity;
	}

	public void setCorrespondenceCity(String correspondenceCity) {
		this.correspondenceCity = correspondenceCity;
	}

	public int getCorrespondencePincode() {
		return this.correspondencePincode;
	}

	public void setCorrespondencePincode(int correspondencePincode) {
		this.correspondencePincode = correspondencePincode;
	}

	public String getCorrespondenceState() {
		return this.correspondenceState;
	}

	public void setCorrespondenceState(String correspondenceState) {
		this.correspondenceState = correspondenceState;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
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

	public String getEmailID() {
		return this.emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}

	public BigInteger getEmergencyContactNo() {
		return this.emergencyContactNo;
	}

	public void setEmergencyContactNo(BigInteger emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
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

	public BigInteger getMobile() {
		return this.mobile;
	}

	public void setMobile(BigInteger mobile) {
		this.mobile = mobile;
	}

	public String getOfficeAddressLine1() {
		return this.officeAddressLine1;
	}

	public void setOfficeAddressLine1(String officeAddressLine1) {
		this.officeAddressLine1 = officeAddressLine1;
	}

	public String getOfficeAddressLine2() {
		return this.officeAddressLine2;
	}

	public void setOfficeAddressLine2(String officeAddressLine2) {
		this.officeAddressLine2 = officeAddressLine2;
	}

	public String getOfficeAddressLine3() {
		return this.officeAddressLine3;
	}

	public void setOfficeAddressLine3(String officeAddressLine3) {
		this.officeAddressLine3 = officeAddressLine3;
	}

	public String getOfficeCity() {
		return this.officeCity;
	}

	public void setOfficeCity(String officeCity) {
		this.officeCity = officeCity;
	}

	public int getOfficePincode() {
		return this.officePincode;
	}

	public void setOfficePincode(int officePincode) {
		this.officePincode = officePincode;
	}

	public String getOfficeState() {
		return this.officeState;
	}

	public void setOfficeState(String officeState) {
		this.officeState = officeState;
	}

	public String getPermanentAddressLine1() {
		return this.permanentAddressLine1;
	}

	public void setPermanentAddressLine1(String permanentAddressLine1) {
		this.permanentAddressLine1 = permanentAddressLine1;
	}

	public String getPermanentAddressLine2() {
		return this.permanentAddressLine2;
	}

	public void setPermanentAddressLine2(String permanentAddressLine2) {
		this.permanentAddressLine2 = permanentAddressLine2;
	}

	public String getPermanentAddressLine3() {
		return this.permanentAddressLine3;
	}

	public void setPermanentAddressLine3(String permanentAddressLine3) {
		this.permanentAddressLine3 = permanentAddressLine3;
	}

	public String getPermanentCity() {
		return this.permanentCity;
	}

	public void setPermanentCity(String permanentCity) {
		this.permanentCity = permanentCity;
	}

	public int getPermanentPincode() {
		return this.permanentPincode;
	}

	public void setPermanentPincode(int permanentPincode) {
		this.permanentPincode = permanentPincode;
	}

	public String getPermanentState() {
		return this.permanentState;
	}

	public void setPermanentState(String permanentState) {
		this.permanentState = permanentState;
	}

	public BigInteger getPhone() {
		return this.phone;
	}

	public void setPhone(BigInteger phone) {
		this.phone = phone;
	}

	public ClientGuardian getClientGuardian() {
		return this.clientGuardian;
	}

	public void setClientGuardian(ClientGuardian clientGuardian) {
		this.clientGuardian = clientGuardian;
	}

	public LookupCountry getLookupCountry1() {
		return this.lookupCountry1;
	}

	public void setLookupCountry1(LookupCountry lookupCountry1) {
		this.lookupCountry1 = lookupCountry1;
	}

	public LookupCountry getLookupCountry2() {
		return this.lookupCountry2;
	}

	public void setLookupCountry2(LookupCountry lookupCountry2) {
		this.lookupCountry2 = lookupCountry2;
	}

	public LookupCountry getLookupCountry3() {
		return this.lookupCountry3;
	}

	public void setLookupCountry3(LookupCountry lookupCountry3) {
		this.lookupCountry3 = lookupCountry3;
	}

}