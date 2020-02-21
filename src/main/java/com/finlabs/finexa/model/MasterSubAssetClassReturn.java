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
 * The persistent class for the masterSubAssetClassReturn database table.
 * 
 */
@Entity
@Table(name = "masterSubAssetClassReturn")
@NamedQuery(name = "MasterSubAssetClassReturn.findAll", query = "SELECT m FROM MasterSubAssetClassReturn m")
public class MasterSubAssetClassReturn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	@Column(name = "BCR")
	private BigDecimal bcr;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	@Column(name = "MLR")
	private BigDecimal mlr;

	private BigDecimal riskStdDev;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	@Column(name = "WCR")
	private BigDecimal wcr;

	// bi-directional many-to-one association to LookupAssetSubClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subAssetClass")
	private LookupAssetSubClass lookupAssetSubClass;

	// bi-directional many-to-one association to MasterIndexName
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "benchmarkIndex")
	private MasterIndexName masterIndexName;

	public MasterSubAssetClassReturn() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public BigDecimal getBcr() {
		return this.bcr;
	}

	public void setBcr(BigDecimal bcr) {
		this.bcr = bcr;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public BigDecimal getMlr() {
		return this.mlr;
	}

	public void setMlr(BigDecimal mlr) {
		this.mlr = mlr;
	}

	public BigDecimal getRiskStdDev() {
		return this.riskStdDev;
	}

	public void setRiskStdDev(BigDecimal riskStdDev) {
		this.riskStdDev = riskStdDev;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public BigDecimal getWcr() {
		return this.wcr;
	}

	public void setWcr(BigDecimal wcr) {
		this.wcr = wcr;
	}

	public LookupAssetSubClass getLookupAssetSubClass() {
		return this.lookupAssetSubClass;
	}

	public void setLookupAssetSubClass(LookupAssetSubClass lookupAssetSubClass) {
		this.lookupAssetSubClass = lookupAssetSubClass;
	}

	public MasterIndexName getMasterIndexName() {
		return this.masterIndexName;
	}

	public void setMasterIndexName(MasterIndexName masterIndexName) {
		this.masterIndexName = masterIndexName;
	}

}