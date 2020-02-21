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
 * The persistent class for the masterKVPCompoundingFrequency database table.
 * 
 */
@Entity
@Table(name = "masterKVPCompoundingFrequency")
@NamedQuery(name = "MasterKVPCompoundingFrequency.findAll", query = "SELECT m FROM MasterKVPCompoundingFrequency m")
public class MasterKVPCompoundingFrequency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private int compoundingFrequency;

	@Temporal(TemporalType.DATE)
	private Date depositFromDate;

	@Temporal(TemporalType.DATE)
	private Date depositToDate;

	public MasterKVPCompoundingFrequency() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCompoundingFrequency() {
		return this.compoundingFrequency;
	}

	public void setCompoundingFrequency(int compoundingFrequency) {
		this.compoundingFrequency = compoundingFrequency;
	}

	public Date getDepositFromDate() {
		return this.depositFromDate;
	}

	public void setDepositFromDate(Date depositFromDate) {
		this.depositFromDate = depositFromDate;
	}

	public Date getDepositToDate() {
		return this.depositToDate;
	}

	public void setDepositToDate(Date depositToDate) {
		this.depositToDate = depositToDate;
	}

}