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
 * The persistent class for the masterPORD database table.
 * 
 */
@Entity
@Table(name = "masterPORD")
@NamedQuery(name = "MasterPORD.findAll", query = "SELECT m FROM MasterPORD m")
public class MasterPORD implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Temporal(TemporalType.DATE)
	private Date depositDateFrom;

	@Temporal(TemporalType.DATE)
	private Date depositDateTo;

	private BigDecimal interestRate;

	public MasterPORD() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDepositDateFrom() {
		return this.depositDateFrom;
	}

	public void setDepositDateFrom(Date depositDateFrom) {
		this.depositDateFrom = depositDateFrom;
	}

	public Date getDepositDateTo() {
		return this.depositDateTo;
	}

	public void setDepositDateTo(Date depositDateTo) {
		this.depositDateTo = depositDateTo;
	}

	public BigDecimal getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

}