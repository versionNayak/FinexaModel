package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the masterPPFInterestRate database table.
 * 
 */
@Entity
@Table(name = "masterPPFInterestRate")
@NamedQuery(name = "MasterPPFInterestRate.findAll", query = "SELECT m FROM MasterPPFInterestRate m")
public class MasterPPFInterestRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Temporal(TemporalType.DATE)
	private Date validFromDate;

	private BigDecimal interestRate;

	@Temporal(TemporalType.DATE)
	private Date validToDate;

	public MasterPPFInterestRate() {
	}

	public Date getValidFromDate() {
		return this.validFromDate;
	}

	public void setValidFromDate(Date validFromDate) {
		this.validFromDate = validFromDate;
	}

	public BigDecimal getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public Date getValidToDate() {
		return this.validToDate;
	}

	public void setValidToDate(Date validToDate) {
		this.validToDate = validToDate;
	}

}