package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the lookupCountry database table.
 * 
 */
@Entity
@Table(name = "lookupCountry")
@NamedQuery(name = "LookupCountry.findAll", query = "SELECT l FROM LookupCountry l")
public class LookupCountry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String iso;

	private String iso3;

	private String name;

	private String nicename;

	private Integer numcode;

	private Integer phonecode;

	// bi-directional many-to-one association to AdvisorUser
	@OneToMany(mappedBy = "lookupCountry")
	private List<AdvisorUser> advisorUsers;

	// bi-directional many-to-one association to ClientContact
	@OneToMany(mappedBy = "lookupCountry1")
	private List<ClientContact> clientContacts1;

	// bi-directional many-to-one association to ClientContact
	@OneToMany(mappedBy = "lookupCountry2")
	private List<ClientContact> clientContacts2;

	// bi-directional many-to-one association to ClientContact
	@OneToMany(mappedBy = "lookupCountry3")
	private List<ClientContact> clientContacts3;

	// bi-directional many-to-one association to ClientGuardianContact
	@OneToMany(mappedBy = "lookupCountry1")
	private List<ClientGuardianContact> clientGuardianContacts1;

	// bi-directional many-to-one association to ClientGuardianContact
	@OneToMany(mappedBy = "lookupCountry2")
	private List<ClientGuardianContact> clientGuardianContacts2;

	// bi-directional many-to-one association to ClientGuardianContact
	@OneToMany(mappedBy = "lookupCountry3")
	private List<ClientGuardianContact> clientGuardianContacts3;

	// bi-directional many-to-one association to ClientMaster
	@OneToMany(mappedBy = "lookupCountry")
	private List<ClientMaster> clientMasters;

	public LookupCountry() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getIso() {
		return this.iso;
	}

	public void setIso(String iso) {
		this.iso = iso;
	}

	public String getIso3() {
		return this.iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNicename() {
		return this.nicename;
	}

	public void setNicename(String nicename) {
		this.nicename = nicename;
	}

	public Integer getNumcode() {
		return this.numcode;
	}

	public void setNumcode(Integer numcode) {
		this.numcode = numcode;
	}

	public Integer getPhonecode() {
		return this.phonecode;
	}

	public void setPhonecode(Integer phonecode) {
		this.phonecode = phonecode;
	}

	public List<AdvisorUser> getAdvisorUsers() {
		return this.advisorUsers;
	}

	public void setAdvisorUsers(List<AdvisorUser> advisorUsers) {
		this.advisorUsers = advisorUsers;
	}

	public AdvisorUser addAdvisorUser(AdvisorUser advisorUser) {
		getAdvisorUsers().add(advisorUser);
		advisorUser.setLookupCountry(this);

		return advisorUser;
	}

	public AdvisorUser removeAdvisorUser(AdvisorUser advisorUser) {
		getAdvisorUsers().remove(advisorUser);
		advisorUser.setLookupCountry(null);

		return advisorUser;
	}

	public List<ClientContact> getClientContacts1() {
		return this.clientContacts1;
	}

	public void setClientContacts1(List<ClientContact> clientContacts1) {
		this.clientContacts1 = clientContacts1;
	}

	public ClientContact addClientContacts1(ClientContact clientContacts1) {
		getClientContacts1().add(clientContacts1);
		clientContacts1.setLookupCountry1(this);

		return clientContacts1;
	}

	public ClientContact removeClientContacts1(ClientContact clientContacts1) {
		getClientContacts1().remove(clientContacts1);
		clientContacts1.setLookupCountry1(null);

		return clientContacts1;
	}

	public List<ClientContact> getClientContacts2() {
		return this.clientContacts2;
	}

	public void setClientContacts2(List<ClientContact> clientContacts2) {
		this.clientContacts2 = clientContacts2;
	}

	public ClientContact addClientContacts2(ClientContact clientContacts2) {
		getClientContacts2().add(clientContacts2);
		clientContacts2.setLookupCountry2(this);

		return clientContacts2;
	}

	public ClientContact removeClientContacts2(ClientContact clientContacts2) {
		getClientContacts2().remove(clientContacts2);
		clientContacts2.setLookupCountry2(null);

		return clientContacts2;
	}

	public List<ClientContact> getClientContacts3() {
		return this.clientContacts3;
	}

	public void setClientContacts3(List<ClientContact> clientContacts3) {
		this.clientContacts3 = clientContacts3;
	}

	public ClientContact addClientContacts3(ClientContact clientContacts3) {
		getClientContacts3().add(clientContacts3);
		clientContacts3.setLookupCountry3(this);

		return clientContacts3;
	}

	public ClientContact removeClientContacts3(ClientContact clientContacts3) {
		getClientContacts3().remove(clientContacts3);
		clientContacts3.setLookupCountry3(null);

		return clientContacts3;
	}

	public List<ClientGuardianContact> getClientGuardianContacts1() {
		return this.clientGuardianContacts1;
	}

	public void setClientGuardianContacts1(List<ClientGuardianContact> clientGuardianContacts1) {
		this.clientGuardianContacts1 = clientGuardianContacts1;
	}

	public ClientGuardianContact addClientGuardianContacts1(ClientGuardianContact clientGuardianContacts1) {
		getClientGuardianContacts1().add(clientGuardianContacts1);
		clientGuardianContacts1.setLookupCountry1(this);

		return clientGuardianContacts1;
	}

	public ClientGuardianContact removeClientGuardianContacts1(ClientGuardianContact clientGuardianContacts1) {
		getClientGuardianContacts1().remove(clientGuardianContacts1);
		clientGuardianContacts1.setLookupCountry1(null);

		return clientGuardianContacts1;
	}

	public List<ClientGuardianContact> getClientGuardianContacts2() {
		return this.clientGuardianContacts2;
	}

	public void setClientGuardianContacts2(List<ClientGuardianContact> clientGuardianContacts2) {
		this.clientGuardianContacts2 = clientGuardianContacts2;
	}

	public ClientGuardianContact addClientGuardianContacts2(ClientGuardianContact clientGuardianContacts2) {
		getClientGuardianContacts2().add(clientGuardianContacts2);
		clientGuardianContacts2.setLookupCountry2(this);

		return clientGuardianContacts2;
	}

	public ClientGuardianContact removeClientGuardianContacts2(ClientGuardianContact clientGuardianContacts2) {
		getClientGuardianContacts2().remove(clientGuardianContacts2);
		clientGuardianContacts2.setLookupCountry2(null);

		return clientGuardianContacts2;
	}

	public List<ClientGuardianContact> getClientGuardianContacts3() {
		return this.clientGuardianContacts3;
	}

	public void setClientGuardianContacts3(List<ClientGuardianContact> clientGuardianContacts3) {
		this.clientGuardianContacts3 = clientGuardianContacts3;
	}

	public ClientGuardianContact addClientGuardianContacts3(ClientGuardianContact clientGuardianContacts3) {
		getClientGuardianContacts3().add(clientGuardianContacts3);
		clientGuardianContacts3.setLookupCountry3(this);

		return clientGuardianContacts3;
	}

	public ClientGuardianContact removeClientGuardianContacts3(ClientGuardianContact clientGuardianContacts3) {
		getClientGuardianContacts3().remove(clientGuardianContacts3);
		clientGuardianContacts3.setLookupCountry3(null);

		return clientGuardianContacts3;
	}

	public List<ClientMaster> getClientMasters() {
		return this.clientMasters;
	}

	public void setClientMasters(List<ClientMaster> clientMasters) {
		this.clientMasters = clientMasters;
	}

	public ClientMaster addClientMaster(ClientMaster clientMaster) {
		getClientMasters().add(clientMaster);
		clientMaster.setLookupCountry(this);

		return clientMaster;
	}

	public ClientMaster removeClientMaster(ClientMaster clientMaster) {
		getClientMasters().remove(clientMaster);
		clientMaster.setLookupCountry(null);

		return clientMaster;
	}

}