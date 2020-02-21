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
 * The persistent class for the masterNPSAssetClassExpectedReturn database
 * table.
 * 
 */
@Entity
@Table(name = "masterNPSAssetClassExpectedReturn")
@NamedQuery(name = "MasterNPSAssetClassExpectedReturn.findAll", query = "SELECT m FROM MasterNPSAssetClassExpectedReturn m")
public class MasterNPSAssetClassExpectedReturn implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private BigDecimal assetClassEExpectedReturns;

	private String assetClassType;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	public MasterNPSAssetClassExpectedReturn() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAssetClassEExpectedReturns() {
		return this.assetClassEExpectedReturns;
	}

	public void setAssetClassEExpectedReturns(BigDecimal assetClassEExpectedReturns) {
		this.assetClassEExpectedReturns = assetClassEExpectedReturns;
	}

	public String getAssetClassType() {
		return this.assetClassType;
	}

	public void setAssetClassType(String assetClassType) {
		this.assetClassType = assetClassType;
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

}