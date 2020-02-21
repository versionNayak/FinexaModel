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
 * The persistent class for the masterHealthInsuranceBasePolicyThresholdCover
 * database table.
 * 
 */
@Entity
@Table(name = "masterHealthInsuranceBasePolicyThresholdCover")
@NamedQuery(name = "MasterHealthInsuranceBasePolicyThresholdCover.findAll", query = "SELECT m FROM MasterHealthInsuranceBasePolicyThresholdCover m")
public class MasterHealthInsuranceBasePolicyThresholdCover implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	private double maxHealthCoverBasePolicy;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	public MasterHealthInsuranceBasePolicyThresholdCover() {
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

	public double getMaxHealthCoverBasePolicy() {
		return this.maxHealthCoverBasePolicy;
	}

	public void setMaxHealthCoverBasePolicy(double maxHealthCoverBasePolicy) {
		this.maxHealthCoverBasePolicy = maxHealthCoverBasePolicy;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}