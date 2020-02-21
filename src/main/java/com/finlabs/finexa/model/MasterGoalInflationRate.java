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
 * The persistent class for the masterGoalInflationRate database table.
 * 
 */
@Entity
@Table(name = "masterGoalInflationRate")
@NamedQuery(name = "MasterGoalInflationRate.findAll", query = "SELECT m FROM MasterGoalInflationRate m")
public class MasterGoalInflationRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	private BigDecimal inflationRate;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	// bi-directional many-to-one association to LookupGoalType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goalType")
	private LookupGoalType lookupGoalType;

	public MasterGoalInflationRate() {
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

	public BigDecimal getInflationRate() {
		return this.inflationRate;
	}

	public void setInflationRate(BigDecimal inflationRate) {
		this.inflationRate = inflationRate;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public LookupGoalType getLookupGoalType() {
		return this.lookupGoalType;
	}

	public void setLookupGoalType(LookupGoalType lookupGoalType) {
		this.lookupGoalType = lookupGoalType;
	}

}