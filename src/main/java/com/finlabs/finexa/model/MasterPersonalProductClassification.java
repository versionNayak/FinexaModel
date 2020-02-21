package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterPersonalProductClassification database
 * table.
 * 
 */
@Entity
@Table(name = "masterPersonalProductClassification")
@NamedQuery(name = "MasterPersonalProductClassification.findAll", query = "SELECT m FROM MasterPersonalProductClassification m")
public class MasterPersonalProductClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String assetClass;

	private String productName;

	private String subAssetClass;

	public MasterPersonalProductClassification() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssetClass() {
		return this.assetClass;
	}

	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSubAssetClass() {
		return this.subAssetClass;
	}

	public void setSubAssetClass(String subAssetClass) {
		this.subAssetClass = subAssetClass;
	}

}