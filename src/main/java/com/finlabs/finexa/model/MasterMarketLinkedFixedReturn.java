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
 * The persistent class for the masterMarketLinkedFixedReturn database table.
 * 
 */
@Entity
@Table(name = "masterMarketLinkedFixedReturn")
@NamedQuery(name = "MasterMarketLinkedFixedReturn.findAll", query = "SELECT m FROM MasterMarketLinkedFixedReturn m")
public class MasterMarketLinkedFixedReturn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String assetClassification;

	private String assetType;

	private String marketLinkedFlag;

	public MasterMarketLinkedFixedReturn() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAssetClassification() {
		return this.assetClassification;
	}

	public void setAssetClassification(String assetClassification) {
		this.assetClassification = assetClassification;
	}

	public String getAssetType() {
		return this.assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getMarketLinkedFlag() {
		return this.marketLinkedFlag;
	}

	public void setMarketLinkedFlag(String marketLinkedFlag) {
		this.marketLinkedFlag = marketLinkedFlag;
	}

}