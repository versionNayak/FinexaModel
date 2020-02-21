package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the masterProductRecommendationRank database table.
 * 
 */
@Embeddable
public class MasterProductRecommendationRankPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	// bi-directional many-to-one association to MasterMutualFundETF
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isin")
	private MasterMutualFundETF masterMutualFundEtf;

	@Temporal(TemporalType.DATE)
	private java.util.Date timeframeEndDate;

	public MasterMutualFundETF getMasterMutualFundEtf() {
		return masterMutualFundEtf;
	}

	public void setMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		this.masterMutualFundEtf = masterMutualFundEtf;
	}

	public MasterProductRecommendationRankPK() {
	}

	public java.util.Date getTimeframeEndDate() {
		return this.timeframeEndDate;
	}

	public void setTimeframeEndDate(java.util.Date timeframeEndDate) {
		this.timeframeEndDate = timeframeEndDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MasterProductRecommendationRankPK)) {
			return false;
		}
		MasterProductRecommendationRankPK castOther = (MasterProductRecommendationRankPK) other;
		return this.masterMutualFundEtf.getIsin().equals(castOther.masterMutualFundEtf.getIsin())
				&& this.timeframeEndDate.equals(castOther.timeframeEndDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.masterMutualFundEtf.getIsin().hashCode();
		hash = hash * prime + this.timeframeEndDate.hashCode();

		return hash;
	}
}