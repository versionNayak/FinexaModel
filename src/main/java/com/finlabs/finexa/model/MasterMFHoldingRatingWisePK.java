package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the masterMFHoldingRatingWise database table.
 * 
 */
@Embeddable
public class MasterMFHoldingRatingWisePK implements Serializable {

	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date date;

	// bi-directional many-to-one association to MasterMutualFundETF
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isin")
	private MasterMutualFundETF masterMutualFundEtf;

	// bi-directional many-to-one association to MasterMFRating
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ratingID")
	private MasterMFRating masterMfrating;

	public MasterMFHoldingRatingWisePK() {
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MasterMFHoldingRatingWisePK)) {
			return false;
		}
		MasterMFHoldingRatingWisePK castOther = (MasterMFHoldingRatingWisePK) other;
		return this.date.equals(castOther.date)
				&& this.masterMutualFundEtf.getIsin().equals(castOther.masterMutualFundEtf.getIsin())
				&& (this.masterMfrating.getId() == castOther.masterMfrating.getId());
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.date.hashCode();
		hash = hash * prime + this.masterMutualFundEtf.getIsin().hashCode();
		hash = hash * prime + ((int) this.masterMfrating.getId());

		return hash;
	}

	public MasterMutualFundETF getMasterMutualFundEtf() {
		return masterMutualFundEtf;
	}

	public void setMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		this.masterMutualFundEtf = masterMutualFundEtf;
	}

	public MasterMFRating getMasterMfrating() {
		return masterMfrating;
	}

	public void setMasterMfrating(MasterMFRating masterMfrating) {
		this.masterMfrating = masterMfrating;
	}
}