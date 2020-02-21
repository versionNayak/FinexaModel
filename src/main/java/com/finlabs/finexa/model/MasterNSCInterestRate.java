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
 * The persistent class for the masterNSCInterestRate database table.
 * 
 */
@Entity
@Table(name = "masterNSCInterestRate")
@NamedQuery(name = "MasterNSCInterestRate.findAll", query = "SELECT m FROM MasterNSCInterestRate m")
public class MasterNSCInterestRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private BigDecimal interestRate;

	private String issueId;

	@Temporal(TemporalType.DATE)
	private Date periodEnd;

	@Temporal(TemporalType.DATE)
	private Date periodStart;

	public MasterNSCInterestRate() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public String getIssueId() {
		return this.issueId;
	}

	public void setIssueId(String issueId) {
		this.issueId = issueId;
	}

	public Date getPeriodEnd() {
		return this.periodEnd;
	}

	public void setPeriodEnd(Date periodEnd) {
		this.periodEnd = periodEnd;
	}

	public Date getPeriodStart() {
		return this.periodStart;
	}

	public void setPeriodStart(Date periodStart) {
		this.periodStart = periodStart;
	}

}