package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the masterMFMarketCap database table.
 * 
 */
@Embeddable
public class MasterMFMarketCapPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	// bi-directional many-to-one association to MasterMutualFundETF
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isin")
	private MasterMutualFundETF masterMutualFundEtf;

	@Temporal(TemporalType.DATE)
	private java.util.Date date;

	public MasterMFMarketCapPK() {
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
		if (!(other instanceof MasterMFMarketCapPK)) {
			return false;
		}
		MasterMFMarketCapPK castOther = (MasterMFMarketCapPK) other;
		return this.masterMutualFundEtf.getIsin().equals(castOther.masterMutualFundEtf.getIsin())
				&& this.date.equals(castOther.date);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.masterMutualFundEtf.getIsin().hashCode();
		hash = hash * prime + this.date.hashCode();

		return hash;
	}

	public MasterMutualFundETF getMasterMutualFundEtf() {
		return masterMutualFundEtf;
	}

	public void setMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		this.masterMutualFundEtf = masterMutualFundEtf;
	}
}