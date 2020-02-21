package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterMFHoldingSectorWise database table.
 * 
 */
@Entity
@Table(name = "masterMFHoldingSectorWise")
@NamedQuery(name = "MasterMFHoldingSectorWise.findAll", query = "SELECT m FROM MasterMFHoldingSectorWise m")
public class MasterMFHoldingSectorWise implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterMFHoldingSectorWisePK id;

	private Integer amfiCode;

	private float holding;

	private String scheme;

	public MasterMFHoldingSectorWise() {
	}

	public MasterMFHoldingSectorWisePK getId() {
		return this.id;
	}

	public void setId(MasterMFHoldingSectorWisePK id) {
		this.id = id;
	}



	public Integer getAmfiCode() {
		return amfiCode;
	}

	public void setAmfiCode(Integer amfiCode) {
		this.amfiCode = amfiCode;
	}

	public float getHolding() {
		return this.holding;
	}

	public void setHolding(float holding) {
		this.holding = holding;
	}

	public String getScheme() {
		return this.scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

}