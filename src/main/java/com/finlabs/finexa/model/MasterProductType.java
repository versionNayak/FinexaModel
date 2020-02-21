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
 * The persistent class for the masterProductType database table.
 * 
 */
@Entity
@Table(name = "masterProductType")
@NamedQuery(name = "MasterProductType.findAll", query = "SELECT m FROM MasterProductType m")
public class MasterProductType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String productType;

	// bi-directional many-to-one association to MasterProductClassification
	@OneToMany(mappedBy = "masterProductType")
	private List<MasterProductClassification> masterProductClassifications;

	public MasterProductType() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public List<MasterProductClassification> getMasterProductClassifications() {
		return this.masterProductClassifications;
	}

	public void setMasterProductClassifications(List<MasterProductClassification> masterProductClassifications) {
		this.masterProductClassifications = masterProductClassifications;
	}

	public MasterProductClassification addMasterProductClassification(
			MasterProductClassification masterProductClassification) {
		getMasterProductClassifications().add(masterProductClassification);
		masterProductClassification.setMasterProductType(this);

		return masterProductClassification;
	}

	public MasterProductClassification removeMasterProductClassification(
			MasterProductClassification masterProductClassification) {
		getMasterProductClassifications().remove(masterProductClassification);
		masterProductClassification.setMasterProductType(null);

		return masterProductClassification;
	}

}