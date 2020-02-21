package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;

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
 * The persistent class for the masterExpectedHistoricalReturn database table.
 * 
 */
@Entity
@Table(name = "masterExpectedHistoricalReturn")
@NamedQuery(name = "MasterExpectedHistoricalReturn.findAll", query = "SELECT m FROM MasterExpectedHistoricalReturn m")
public class MasterExpectedHistoricalReturn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private BigDecimal returnRate;

	private int year;

	// bi-directional many-to-one association to LookupAssetClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetClassName")
	private LookupAssetClass lookupAssetClass;

	// bi-directional many-to-one association to LookupAssetSubClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subAssetClassName")
	private LookupAssetSubClass lookupAssetSubClass;

	public MasterExpectedHistoricalReturn() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getReturnRate() {
		return this.returnRate;
	}

	public void setReturnRate(BigDecimal returnRate) {
		this.returnRate = returnRate;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public LookupAssetClass getLookupAssetClass() {
		return this.lookupAssetClass;
	}

	public void setLookupAssetClass(LookupAssetClass lookupAssetClass) {
		this.lookupAssetClass = lookupAssetClass;
	}

	public LookupAssetSubClass getLookupAssetSubClass() {
		return this.lookupAssetSubClass;
	}

	public void setLookupAssetSubClass(LookupAssetSubClass lookupAssetSubClass) {
		this.lookupAssetSubClass = lookupAssetSubClass;
	}

}