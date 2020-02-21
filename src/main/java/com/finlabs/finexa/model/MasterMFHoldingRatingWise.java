package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterMFHoldingRatingWise database table.
 * 
 */
@Entity
@Table(name = "masterMFHoldingRatingWise")
@NamedQuery(name = "MasterMFHoldingRatingWise.findAll", query = "SELECT m FROM MasterMFHoldingRatingWise m")
public class MasterMFHoldingRatingWise implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterMFHoldingRatingWisePK id;

	private int amfiCode;

	private float holding;

	private String schemeName;

	public MasterMFHoldingRatingWise() {
	}

	public MasterMFHoldingRatingWisePK getId() {
		return this.id;
	}

	public void setId(MasterMFHoldingRatingWisePK id) {
		this.id = id;
	}

	public int getAmfiCode() {
		return this.amfiCode;
	}

	public void setAmfiCode(int amfiCode) {
		this.amfiCode = amfiCode;
	}

	public float getHolding() {
		return this.holding;
	}

	public void setHolding(float holding) {
		this.holding = holding;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

}