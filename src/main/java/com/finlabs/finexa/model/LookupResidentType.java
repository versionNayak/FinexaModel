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
 * The persistent class for the lookupResidentType database table.
 * 
 */
@Entity
@Table(name = "lookupResidentType")
@NamedQuery(name = "LookupResidentType.findAll", query = "SELECT l FROM LookupResidentType l")
public class LookupResidentType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	// bi-directional many-to-one association to ClientMaster
	@OneToMany(mappedBy = "lookupResidentType")
	private List<ClientMaster> clientMasters;
	
	// bi-directional many-to-one association to ClientMaster
	@OneToMany(mappedBy = "taxStatus")
	private List<ClientDetails> clientDetails;

	public LookupResidentType() {
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

	public List<ClientMaster> getClientMasters() {
		return this.clientMasters;
	}

	public void setClientMasters(List<ClientMaster> clientMasters) {
		this.clientMasters = clientMasters;
	}

	public ClientMaster addClientMaster(ClientMaster clientMaster) {
		getClientMasters().add(clientMaster);
		clientMaster.setLookupResidentType(this);

		return clientMaster;
	}

	public ClientMaster removeClientMaster(ClientMaster clientMaster) {
		getClientMasters().remove(clientMaster);
		clientMaster.setLookupResidentType(null);

		return clientMaster;
	}

	public List<ClientDetails> getClientDetails() {
		return clientDetails;
	}

	public void setClientDetails(List<ClientDetails> clientDetails) {
		this.clientDetails = clientDetails;
	}

}