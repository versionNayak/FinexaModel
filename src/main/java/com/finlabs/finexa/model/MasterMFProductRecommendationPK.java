package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * The primary key class for the masterMFProductRecommendation database table.
 * 
 */
@Embeddable
public class MasterMFProductRecommendationPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	// bi-directional many-to-one association to AdvisorMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "advisorID")
	private AdvisorMaster advisorMaster;
	// bi-directional many-to-one association to MasterMutualFundETF
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isin")
	private MasterMutualFundETF masterMutualFundEtf;

	public MasterMFProductRecommendationPK() {
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((advisorMaster == null) ? 0 : advisorMaster.hashCode());
		result = prime * result + ((masterMutualFundEtf == null) ? 0 : masterMutualFundEtf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MasterMFProductRecommendationPK other = (MasterMFProductRecommendationPK) obj;
		if (advisorMaster == null) {
			if (other.advisorMaster != null)
				return false;
		} else if (!advisorMaster.equals(other.advisorMaster))
			return false;
		if (masterMutualFundEtf == null) {
			if (other.masterMutualFundEtf != null)
				return false;
		} else if (!masterMutualFundEtf.equals(other.masterMutualFundEtf))
			return false;
		return true;
	}

	public MasterMutualFundETF getMasterMutualFundEtf() {
		return masterMutualFundEtf;
	}

	public void setMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		this.masterMutualFundEtf = masterMutualFundEtf;
	}

	public AdvisorMaster getAdvisorMaster() {
		return advisorMaster;
	}

	public void setAdvisorMaster(AdvisorMaster advisorMaster) {
		this.advisorMaster = advisorMaster;
	}

	

	
}