package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * The persistent class for the masterAssetClassReturn database table.
 * 
 */
@Entity
@Table(name = "masterAssetClassReturn")
@NamedQuery(name = "MasterAssetClassReturn.findAll", query = "SELECT m FROM MasterAssetClassReturn m")
public class MasterAssetClassReturn implements Serializable {
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

	// bi-directional many-to-one association to LookupAssetClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetClass")
	private LookupAssetClass lookupAssetClass;

	public MasterAssetClassReturn() {
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

	public LookupAssetClass getLookupAssetClass() {
		return this.lookupAssetClass;
	}

	public void setLookupAssetClass(LookupAssetClass lookupAssetClass) {
		this.lookupAssetClass = lookupAssetClass;
	}

}