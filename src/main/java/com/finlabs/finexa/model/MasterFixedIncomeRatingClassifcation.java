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
 * The persistent class for the masterFixedIncomeRatingClassifcation database
 * table.
 * 
 */
@Entity
@Table(name = "masterFixedIncomeRatingClassifcation")
@NamedQuery(name = "MasterFixedIncomeRatingClassifcation.findAll", query = "SELECT m FROM MasterFixedIncomeRatingClassifcation m")
public class MasterFixedIncomeRatingClassifcation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String bucket;

	private String rating;

	public MasterFixedIncomeRatingClassifcation() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBucket() {
		return this.bucket;
	}

	public void setBucket(String bucket) {
		this.bucket = bucket;
	}

	public String getRating() {
		return this.rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}