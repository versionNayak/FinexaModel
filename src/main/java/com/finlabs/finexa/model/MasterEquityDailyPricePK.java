package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the masterEquityDailyPrice database table.
 * 
 */
@Embeddable
public class MasterEquityDailyPricePK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	// bi-directional many-to-one association to MasterDirectEquity
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isin")
	private MasterDirectEquity masterDirectEquity;

	@Temporal(TemporalType.DATE)
	private java.util.Date date;

	public MasterEquityDailyPricePK() {
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public MasterDirectEquity getMasterDirectEquity() {
		return masterDirectEquity;
	}

	public void setMasterDirectEquity(MasterDirectEquity masterDirectEquity) {
		this.masterDirectEquity = masterDirectEquity;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MasterEquityDailyPricePK)) {
			return false;
		}
		MasterEquityDailyPricePK castOther = (MasterEquityDailyPricePK) other;
		return this.masterDirectEquity.getIsin().equals(castOther.masterDirectEquity.getIsin())
				&& this.date.equals(castOther.date);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.masterDirectEquity.getIsin().hashCode();
		hash = hash * prime + this.date.hashCode();

		return hash;
	}
}