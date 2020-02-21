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
 * The persistent class for the masterMaxPACover database table.
 * 
 */
@Entity
@Table(name = "masterMaxPACover")
@NamedQuery(name = "MasterMaxPACover.findAll", query = "SELECT m FROM MasterMaxPACover m")
public class MasterMaxPACover implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int maxPACoverId;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	private double maxPACover;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	public MasterMaxPACover() {
	}

	public int getMaxPACoverId() {
		return this.maxPACoverId;
	}

	public void setMaxPACoverId(int maxPACoverId) {
		this.maxPACoverId = maxPACoverId;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public double getMaxPACover() {
		return this.maxPACover;
	}

	public void setMaxPACover(double maxPACover) {
		this.maxPACover = maxPACover;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}