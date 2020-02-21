package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the lookupAssetAllocation database table.
 * 
 */
@Entity
@Table(name = "lookupAssetAllocation")
@NamedQuery(name = "LookupAssetAllocation.findAll", query = "SELECT l FROM LookupAssetAllocation l")
public class LookupAssetAllocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	private BigDecimal weightage;

	// bi-directional many-to-one association to LookupAssetAllocationCategory
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetAllocationCategory")
	private LookupAssetAllocationCategory lookupAssetAllocationCategory;

	// bi-directional many-to-one association to LookupAssetSubClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetSubClass")
	private LookupAssetSubClass lookupAssetSubClass;

	public LookupAssetAllocation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public BigDecimal getWeightage() {
		return this.weightage;
	}

	public void setWeightage(BigDecimal weightage) {
		this.weightage = weightage;
	}

	public LookupAssetAllocationCategory getLookupAssetAllocationCategory() {
		return this.lookupAssetAllocationCategory;
	}

	public void setLookupAssetAllocationCategory(LookupAssetAllocationCategory lookupAssetAllocationCategory) {
		this.lookupAssetAllocationCategory = lookupAssetAllocationCategory;
	}

	public LookupAssetSubClass getLookupAssetSubClass() {
		return this.lookupAssetSubClass;
	}

	public void setLookupAssetSubClass(LookupAssetSubClass lookupAssetSubClass) {
		this.lookupAssetSubClass = lookupAssetSubClass;
	}

}