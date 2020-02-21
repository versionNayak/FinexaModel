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
 * The persistent class for the masterRiskFreeRate database table.
 * 
 */
@Entity
@Table(name = "masterRiskFreeRate")
@NamedQuery(name = "MasterRiskFreeRate.findAll", query = "SELECT m FROM MasterRiskFreeRate m")
public class MasterRiskFreeRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Temporal(TemporalType.DATE)
	private Date date;

	private BigDecimal riskfreeRate;

	public MasterRiskFreeRate() {
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getRiskfreeRate() {
		return this.riskfreeRate;
	}

	public void setRiskfreeRate(BigDecimal riskfreeRate) {
		this.riskfreeRate = riskfreeRate;
	}

}