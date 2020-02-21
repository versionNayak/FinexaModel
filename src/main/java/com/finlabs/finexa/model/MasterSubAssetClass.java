package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the masterSubAssetClass database table.
 * 
 */
@Entity
@Table(name = "masterSubAssetClass")
@NamedQuery(name = "MasterSubAssetClass.findAll", query = "SELECT m FROM MasterSubAssetClass m")
public class MasterSubAssetClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String assetClass;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	@Column(name = "return")
	private BigDecimal return_;

	private BigDecimal riskStdDev;

	private String subAssetClass;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	public MasterSubAssetClass() {
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

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public BigDecimal getReturn_() {
		return this.return_;
	}

	public void setReturn_(BigDecimal return_) {
		this.return_ = return_;
	}

	public BigDecimal getRiskStdDev() {
		return this.riskStdDev;
	}

	public void setRiskStdDev(BigDecimal riskStdDev) {
		this.riskStdDev = riskStdDev;
	}

	public String getSubAssetClass() {
		return this.subAssetClass;
	}

	public void setSubAssetClass(String subAssetClass) {
		this.subAssetClass = subAssetClass;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}