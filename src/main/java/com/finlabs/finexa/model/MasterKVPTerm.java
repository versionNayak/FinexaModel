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
 * The persistent class for the masterKVPTerm database table.
 * 
 */
@Entity
@Table(name = "masterKVPTerm")
@NamedQuery(name = "MasterKVPTerm.findAll", query = "SELECT m FROM MasterKVPTerm m")
public class MasterKVPTerm implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Temporal(TemporalType.DATE)
	private Date depositFromDate;

	@Temporal(TemporalType.DATE)
	private Date depositToDate;

	private int termMonths;

	private int termYears;

	public MasterKVPTerm() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getTermMonths() {
		return this.termMonths;
	}

	public void setTermMonths(int termMonths) {
		this.termMonths = termMonths;
	}

	public int getTermYears() {
		return this.termYears;
	}

	public void setTermYears(int termYears) {
		this.termYears = termYears;
	}

}