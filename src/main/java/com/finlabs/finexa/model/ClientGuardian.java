package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
 * The persistent class for the clientGuardian database table.
 * 
 */
@Entity
@Table(name = "clientGuardian")
@NamedQuery(name = "ClientGuardian.findAll", query = "SELECT c FROM ClientGuardian c")
public class ClientGuardian implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private BigInteger aadhar;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private String countryOfResidence;

	private byte createdBy;

	private Timestamp createdOn;

	private String firstName;

	private String gender;

	private String lastName;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private String middleName;

	private String otherResidentType;

	private String pan;

	private byte residentType;

	private String salutation;

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientGuardianContact
	@OneToMany(mappedBy = "clientGuardian")
	private List<ClientGuardianContact> clientGuardianContacts;

	public ClientGuardian() {
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

	public String getCountryOfResidence() {
		return this.countryOfResidence;
	}

	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
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

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
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

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

	public List<ClientGuardianContact> getClientGuardianContacts() {
		return this.clientGuardianContacts;
	}

	public void setClientGuardianContacts(List<ClientGuardianContact> clientGuardianContacts) {
		this.clientGuardianContacts = clientGuardianContacts;
	}

	public ClientGuardianContact addClientGuardianContact(ClientGuardianContact clientGuardianContact) {
		getClientGuardianContacts().add(clientGuardianContact);
		clientGuardianContact.setClientGuardian(this);

		return clientGuardianContact;
	}

	public ClientGuardianContact removeClientGuardianContact(ClientGuardianContact clientGuardianContact) {
		getClientGuardianContacts().remove(clientGuardianContact);
		clientGuardianContact.setClientGuardian(null);

		return clientGuardianContact;
	}

}