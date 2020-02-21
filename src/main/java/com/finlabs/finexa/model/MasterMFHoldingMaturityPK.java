package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the masterMFHoldingMaturity database table.
 * 
 */
@Embeddable
public class MasterMFHoldingMaturityPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	// bi-directional many-to-one association to MasterMutualFundETF
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isin")
	private MasterMutualFundETF masterMutualFundEtf;

	private int amfiCode;

	@Temporal(TemporalType.DATE)
	private java.util.Date asOfDate;

	public MasterMFHoldingMaturityPK() {
	}

	public int getAmfiCode() {
		return this.amfiCode;
	}

	public void setAmfiCode(int amfiCode) {
		this.amfiCode = amfiCode;
	}

	public java.util.Date getAsOfDate() {
		return this.asOfDate;
	}

	public void setAsOfDate(java.util.Date asOfDate) {
		this.asOfDate = asOfDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MasterMFHoldingMaturityPK)) {
			return false;
		}
		MasterMFHoldingMaturityPK castOther = (MasterMFHoldingMaturityPK) other;
		return this.masterMutualFundEtf.getIsin().equals(castOther.masterMutualFundEtf.getIsin())
				&& (this.amfiCode == castOther.amfiCode) && this.asOfDate.equals(castOther.asOfDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.masterMutualFundEtf.getIsin().hashCode();
		hash = hash * prime + this.amfiCode;
		hash = hash * prime + this.asOfDate.hashCode();

		return hash;
	}
}