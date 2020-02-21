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
 * The persistent class for the masterIncomeGrowthRate database table.
 * 
 */
@Entity
@Table(name = "masterIncomeGrowthRate")
@NamedQuery(name = "MasterIncomeGrowthRate.findAll", query = "SELECT m FROM MasterIncomeGrowthRate m")
public class MasterIncomeGrowthRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private BigDecimal cagr;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	private String incomeCategory;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	public MasterIncomeGrowthRate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getCagr() {
		return this.cagr;
	}

	public void setCagr(BigDecimal cagr) {
		this.cagr = cagr;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getIncomeCategory() {
		return this.incomeCategory;
	}

	public void setIncomeCategory(String incomeCategory) {
		this.incomeCategory = incomeCategory;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}