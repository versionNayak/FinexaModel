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
 * The persistent class for the lookupAlternateInvestmentsAssetType database
 * table.
 * 
 */
@Entity
@Table(name = "lookupAlternateInvestmentsAssetType")
@NamedQuery(name = "LookupAlternateInvestmentsAssetType.findAll", query = "SELECT l FROM LookupAlternateInvestmentsAssetType l")
public class LookupAlternateInvestmentsAssetType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	// bi-directional many-to-one association to ClientOtherAlternateAsset
	@OneToMany(mappedBy = "lookupAlternateInvestmentsAssetType")
	private List<ClientOtherAlternateAsset> clientOtherAlternateAssets;

	// bi-directional many-to-one association to ClientPreciousMetal
	@OneToMany(mappedBy = "lookupAlternateInvestmentsAssetType")
	private List<ClientPreciousMetal> clientPreciousMetals;

	// bi-directional many-to-one association to ClientRealEstate
	@OneToMany(mappedBy = "lookupAlternateInvestmentsAssetType")
	private List<ClientRealEstate> clientRealEstates;

	// bi-directional many-to-one association to ClientVehicle
	@OneToMany(mappedBy = "lookupAlternateInvestmentsAssetType")
	private List<ClientVehicle> clientVehicles;

	public LookupAlternateInvestmentsAssetType() {
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

	public List<ClientOtherAlternateAsset> getClientOtherAlternateAssets() {
		return this.clientOtherAlternateAssets;
	}

	public void setClientOtherAlternateAssets(List<ClientOtherAlternateAsset> clientOtherAlternateAssets) {
		this.clientOtherAlternateAssets = clientOtherAlternateAssets;
	}

	public ClientOtherAlternateAsset addClientOtherAlternateAsset(ClientOtherAlternateAsset clientOtherAlternateAsset) {
		getClientOtherAlternateAssets().add(clientOtherAlternateAsset);
		clientOtherAlternateAsset.setLookupAlternateInvestmentsAssetType(this);

		return clientOtherAlternateAsset;
	}

	public ClientOtherAlternateAsset removeClientOtherAlternateAsset(
			ClientOtherAlternateAsset clientOtherAlternateAsset) {
		getClientOtherAlternateAssets().remove(clientOtherAlternateAsset);
		clientOtherAlternateAsset.setLookupAlternateInvestmentsAssetType(null);

		return clientOtherAlternateAsset;
	}

	public List<ClientPreciousMetal> getClientPreciousMetals() {
		return this.clientPreciousMetals;
	}

	public void setClientPreciousMetals(List<ClientPreciousMetal> clientPreciousMetals) {
		this.clientPreciousMetals = clientPreciousMetals;
	}

	public ClientPreciousMetal addClientPreciousMetal(ClientPreciousMetal clientPreciousMetal) {
		getClientPreciousMetals().add(clientPreciousMetal);
		clientPreciousMetal.setLookupAlternateInvestmentsAssetType(this);

		return clientPreciousMetal;
	}

	public ClientPreciousMetal removeClientPreciousMetal(ClientPreciousMetal clientPreciousMetal) {
		getClientPreciousMetals().remove(clientPreciousMetal);
		clientPreciousMetal.setLookupAlternateInvestmentsAssetType(null);

		return clientPreciousMetal;
	}

	public List<ClientRealEstate> getClientRealEstates() {
		return this.clientRealEstates;
	}

	public void setClientRealEstates(List<ClientRealEstate> clientRealEstates) {
		this.clientRealEstates = clientRealEstates;
	}

	public ClientRealEstate addClientRealEstate(ClientRealEstate clientRealEstate) {
		getClientRealEstates().add(clientRealEstate);
		clientRealEstate.setLookupAlternateInvestmentsAssetType(this);

		return clientRealEstate;
	}

	public ClientRealEstate removeClientRealEstate(ClientRealEstate clientRealEstate) {
		getClientRealEstates().remove(clientRealEstate);
		clientRealEstate.setLookupAlternateInvestmentsAssetType(null);

		return clientRealEstate;
	}

	public List<ClientVehicle> getClientVehicles() {
		return this.clientVehicles;
	}

	public void setClientVehicles(List<ClientVehicle> clientVehicles) {
		this.clientVehicles = clientVehicles;
	}

	public ClientVehicle addClientVehicle(ClientVehicle clientVehicle) {
		getClientVehicles().add(clientVehicle);
		clientVehicle.setLookupAlternateInvestmentsAssetType(this);

		return clientVehicle;
	}

	public ClientVehicle removeClientVehicle(ClientVehicle clientVehicle) {
		getClientVehicles().remove(clientVehicle);
		clientVehicle.setLookupAlternateInvestmentsAssetType(null);

		return clientVehicle;
	}

}