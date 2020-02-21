package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterContingencyFund database table.
 * 
 */
@Entity
@Table(name = "masterContingencyFund")
@NamedQuery(name = "MasterContingencyFund.findAll", query = "SELECT m FROM MasterContingencyFund m")
public class MasterContingencyFund implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private int ageEndYear;

	private int ageStartYear;

	private int contigencyFactor;

	public MasterContingencyFund() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAgeEndYear() {
		return this.ageEndYear;
	}

	public void setAgeEndYear(int ageEndYear) {
		this.ageEndYear = ageEndYear;
	}

	public int getAgeStartYear() {
		return this.ageStartYear;
	}

	public void setAgeStartYear(int ageStartYear) {
		this.ageStartYear = ageStartYear;
	}

	public int getContigencyFactor() {
		return this.contigencyFactor;
	}

	public void setContigencyFactor(int contigencyFactor) {
		this.contigencyFactor = contigencyFactor;
	}

}