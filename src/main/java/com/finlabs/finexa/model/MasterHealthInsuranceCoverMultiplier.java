package com.finlabs.finexa.model;

import java.io.Serializable;
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
 * The persistent class for the masterHealthInsuranceCoverMultiplier database
 * table.
 * 
 */
@Entity
@Table(name = "masterHealthInsuranceCoverMultiplier")
@NamedQuery(name = "MasterHealthInsuranceCoverMultiplier.findAll", query = "SELECT m FROM MasterHealthInsuranceCoverMultiplier m")
public class MasterHealthInsuranceCoverMultiplier implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private double annualIncomeFrom;

	private double annualIncomeTo;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	private double healthInsuranceCoverMultiplier;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	public MasterHealthInsuranceCoverMultiplier() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAnnualIncomeFrom() {
		return this.annualIncomeFrom;
	}

	public void setAnnualIncomeFrom(double annualIncomeFrom) {
		this.annualIncomeFrom = annualIncomeFrom;
	}

	public double getAnnualIncomeTo() {
		return this.annualIncomeTo;
	}

	public void setAnnualIncomeTo(double annualIncomeTo) {
		this.annualIncomeTo = annualIncomeTo;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public double getHealthInsuranceCoverMultiplier() {
		return this.healthInsuranceCoverMultiplier;
	}

	public void setHealthInsuranceCoverMultiplier(double healthInsuranceCoverMultiplier) {
		this.healthInsuranceCoverMultiplier = healthInsuranceCoverMultiplier;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}