package com.finlabs.finexa.model;

import java.io.Serializable;
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
 * The persistent class for the masterMaxAgeLifeInsurance database table.
 * 
 */
@Entity
@Table(name = "masterMaxAgeLifeInsurance")
@NamedQuery(name = "MasterMaxAgeLifeInsurance.findAll", query = "SELECT m FROM MasterMaxAgeLifeInsurance m")
public class MasterMaxAgeLifeInsurance implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maxAgeLifeCoverId;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	private int maxAgeLifeCover;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	public MasterMaxAgeLifeInsurance() {
	}

	public int getMaxAgeLifeCoverId() {
		return this.maxAgeLifeCoverId;
	}

	public void setMaxAgeLifeCoverId(int maxAgeLifeCoverId) {
		this.maxAgeLifeCoverId = maxAgeLifeCoverId;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public int getMaxAgeLifeCover() {
		return this.maxAgeLifeCover;
	}

	public void setMaxAgeLifeCover(int maxAgeLifeCover) {
		this.maxAgeLifeCover = maxAgeLifeCover;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}