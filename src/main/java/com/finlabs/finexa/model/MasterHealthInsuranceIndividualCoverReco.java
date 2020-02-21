package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the masterHealthInsuranceIndividualCoverReco
 * database table.
 * 
 */
@Entity
@Table(name = "masterHealthInsuranceIndividualCoverReco")
@NamedQuery(name = "MasterHealthInsuranceIndividualCoverReco.findAll", query = "SELECT m FROM MasterHealthInsuranceIndividualCoverReco m")
public class MasterHealthInsuranceIndividualCoverReco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private int fromAge;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	private double individualCoverReco;

	private int toAge;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	// bi-directional many-to-one association to LookupRelation
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "relationID")
	private LookupRelation lookupRelation;

	public MasterHealthInsuranceIndividualCoverReco() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFromAge() {
		return this.fromAge;
	}

	public void setFromAge(int fromAge) {
		this.fromAge = fromAge;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public double getIndividualCoverReco() {
		return this.individualCoverReco;
	}

	public void setIndividualCoverReco(double individualCoverReco) {
		this.individualCoverReco = individualCoverReco;
	}

	public int getToAge() {
		return this.toAge;
	}

	public void setToAge(int toAge) {
		this.toAge = toAge;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public LookupRelation getLookupRelation() {
		return this.lookupRelation;
	}

	public void setLookupRelation(LookupRelation lookupRelation) {
		this.lookupRelation = lookupRelation;
	}

}