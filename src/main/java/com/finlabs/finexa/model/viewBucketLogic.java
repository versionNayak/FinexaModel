package com.finlabs.finexa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

/**
 * The persistent class for the viewBucketLogic database table.
 * 
 */
@Entity
@Table(name = "viewBucketLogic")
@Immutable
@NamedQuery(name = "viewBucketLogic.findAll", query = "SELECT v FROM viewBucketLogic v")
public class viewBucketLogic {

	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "riskProfile")
	private int riskProfile;

	@Column(name = "bucket")
	private int bucket;

	@Column(name = "MLRMonthly")
	private Double MLRMonthly;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRiskProfile() {
		return riskProfile;
	}

	public void setRiskProfile(int riskProfile) {
		this.riskProfile = riskProfile;
	}

	public int getBucket() {
		return bucket;
	}

	public void setBucket(int bucket) {
		this.bucket = bucket;
	}

	public Double getMLRMonthly() {
		return MLRMonthly;
	}

	public void setMLRMonthly(Double mLRMonthly) {
		MLRMonthly = mLRMonthly;
	}

}