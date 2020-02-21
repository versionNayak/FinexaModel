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
 * The persistent class for the lookupRelation database table.
 * 
 */
@Entity
@Table(name = "lookupRelation")
@NamedQuery(name = "LookupRelation.findAll", query = "SELECT l FROM LookupRelation l")
public class LookupRelation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	// bi-directional many-to-one association to ClientFamilyMember
	@OneToMany(mappedBy = "lookupRelation")
	private List<ClientFamilyMember> clientFamilyMembers;

	// bi-directional many-to-one association to
	// MasterHealthInsuranceFloaterCoverReco
	@OneToMany(mappedBy = "lookupRelation")
	private List<MasterHealthInsuranceFloaterCoverReco> masterHealthInsuranceFloaterCoverRecos;

	// bi-directional many-to-one association to
	// MasterHealthInsuranceIndividualCoverReco
	@OneToMany(mappedBy = "lookupRelation")
	private List<MasterHealthInsuranceIndividualCoverReco> masterHealthInsuranceIndividualCoverRecos;

	public LookupRelation() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(byte displayOrder) {
		this.displayOrder = displayOrder;
	}

	public List<ClientFamilyMember> getClientFamilyMembers() {
		return this.clientFamilyMembers;
	}

	public void setClientFamilyMembers(List<ClientFamilyMember> clientFamilyMembers) {
		this.clientFamilyMembers = clientFamilyMembers;
	}

	public ClientFamilyMember addClientFamilyMember(ClientFamilyMember clientFamilyMember) {
		getClientFamilyMembers().add(clientFamilyMember);
		clientFamilyMember.setLookupRelation(this);

		return clientFamilyMember;
	}

	public ClientFamilyMember removeClientFamilyMember(ClientFamilyMember clientFamilyMember) {
		getClientFamilyMembers().remove(clientFamilyMember);
		clientFamilyMember.setLookupRelation(null);

		return clientFamilyMember;
	}

	public List<MasterHealthInsuranceFloaterCoverReco> getMasterHealthInsuranceFloaterCoverRecos() {
		return this.masterHealthInsuranceFloaterCoverRecos;
	}

	public void setMasterHealthInsuranceFloaterCoverRecos(
			List<MasterHealthInsuranceFloaterCoverReco> masterHealthInsuranceFloaterCoverRecos) {
		this.masterHealthInsuranceFloaterCoverRecos = masterHealthInsuranceFloaterCoverRecos;
	}

	public MasterHealthInsuranceFloaterCoverReco addMasterHealthInsuranceFloaterCoverReco(
			MasterHealthInsuranceFloaterCoverReco masterHealthInsuranceFloaterCoverReco) {
		getMasterHealthInsuranceFloaterCoverRecos().add(masterHealthInsuranceFloaterCoverReco);
		masterHealthInsuranceFloaterCoverReco.setLookupRelation(this);

		return masterHealthInsuranceFloaterCoverReco;
	}

	public MasterHealthInsuranceFloaterCoverReco removeMasterHealthInsuranceFloaterCoverReco(
			MasterHealthInsuranceFloaterCoverReco masterHealthInsuranceFloaterCoverReco) {
		getMasterHealthInsuranceFloaterCoverRecos().remove(masterHealthInsuranceFloaterCoverReco);
		masterHealthInsuranceFloaterCoverReco.setLookupRelation(null);

		return masterHealthInsuranceFloaterCoverReco;
	}

	public List<MasterHealthInsuranceIndividualCoverReco> getMasterHealthInsuranceIndividualCoverRecos() {
		return this.masterHealthInsuranceIndividualCoverRecos;
	}

	public void setMasterHealthInsuranceIndividualCoverRecos(
			List<MasterHealthInsuranceIndividualCoverReco> masterHealthInsuranceIndividualCoverRecos) {
		this.masterHealthInsuranceIndividualCoverRecos = masterHealthInsuranceIndividualCoverRecos;
	}

	public MasterHealthInsuranceIndividualCoverReco addMasterHealthInsuranceIndividualCoverReco(
			MasterHealthInsuranceIndividualCoverReco masterHealthInsuranceIndividualCoverReco) {
		getMasterHealthInsuranceIndividualCoverRecos().add(masterHealthInsuranceIndividualCoverReco);
		masterHealthInsuranceIndividualCoverReco.setLookupRelation(this);

		return masterHealthInsuranceIndividualCoverReco;
	}

	public MasterHealthInsuranceIndividualCoverReco removeMasterHealthInsuranceIndividualCoverReco(
			MasterHealthInsuranceIndividualCoverReco masterHealthInsuranceIndividualCoverReco) {
		getMasterHealthInsuranceIndividualCoverRecos().remove(masterHealthInsuranceIndividualCoverReco);
		masterHealthInsuranceIndividualCoverReco.setLookupRelation(null);

		return masterHealthInsuranceIndividualCoverReco;
	}

}