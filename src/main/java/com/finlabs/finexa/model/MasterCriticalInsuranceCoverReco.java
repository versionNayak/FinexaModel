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
 * The persistent class for the masterCriticalInsuranceCoverReco database table.
 * 
 */
@Entity
@Table(name = "masterCriticalInsuranceCoverReco")
@NamedQuery(name = "MasterCriticalInsuranceCoverReco.findAll", query = "SELECT m FROM MasterCriticalInsuranceCoverReco m")
public class MasterCriticalInsuranceCoverReco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private double annualIncomeRangeFrom;

	private double annualIncomeRangeTo;

	private double criticalInsuranceCoverMultiplier;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	public MasterCriticalInsuranceCoverReco() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getAnnualIncomeRangeFrom() {
		return this.annualIncomeRangeFrom;
	}

	public void setAnnualIncomeRangeFrom(double annualIncomeRangeFrom) {
		this.annualIncomeRangeFrom = annualIncomeRangeFrom;
	}

	public double getAnnualIncomeRangeTo() {
		return this.annualIncomeRangeTo;
	}

	public void setAnnualIncomeRangeTo(double annualIncomeRangeTo) {
		this.annualIncomeRangeTo = annualIncomeRangeTo;
	}

	public double getCriticalInsuranceCoverMultiplier() {
		return this.criticalInsuranceCoverMultiplier;
	}

	public void setCriticalInsuranceCoverMultiplier(double criticalInsuranceCoverMultiplier) {
		this.criticalInsuranceCoverMultiplier = criticalInsuranceCoverMultiplier;
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