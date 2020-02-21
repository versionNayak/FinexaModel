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
 * The persistent class for the masterMaxCriticalInsuranceCover database table.
 * 
 */
@Entity
@Table(name = "masterMaxCriticalInsuranceCover")
@NamedQuery(name = "MasterMaxCriticalInsuranceCover.findAll", query = "SELECT m FROM MasterMaxCriticalInsuranceCover m")
public class MasterMaxCriticalInsuranceCover implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maxCriticalIllnessCoverId;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	private double maxCriticalIllnessCover;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	public MasterMaxCriticalInsuranceCover() {
	}

	public int getMaxCriticalIllnessCoverId() {
		return this.maxCriticalIllnessCoverId;
	}

	public void setMaxCriticalIllnessCoverId(int maxCriticalIllnessCoverId) {
		this.maxCriticalIllnessCoverId = maxCriticalIllnessCoverId;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public double getMaxCriticalIllnessCover() {
		return this.maxCriticalIllnessCover;
	}

	public void setMaxCriticalIllnessCover(double maxCriticalIllnessCover) {
		this.maxCriticalIllnessCover = maxCriticalIllnessCover;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}