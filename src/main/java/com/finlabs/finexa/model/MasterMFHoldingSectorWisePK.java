package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the masterMFHoldingSectorWise database table.
 * 
 */
@Embeddable
public class MasterMFHoldingSectorWisePK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Temporal(TemporalType.DATE)
	private java.util.Date date;
	// bi-directional many-to-one association to MasterMFSector
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sectorID")
	private MasterMFSector masterMfsector;

	// bi-directional many-to-one association to MasterMutualFundETF
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isin")
	private MasterMutualFundETF masterMutualFundEtf;

	public MasterMFHoldingSectorWisePK() {
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public MasterMFSector getMasterMfsector() {
		return masterMfsector;
	}

	public void setMasterMfsector(MasterMFSector masterMfsector) {
		this.masterMfsector = masterMfsector;
	}

	public MasterMutualFundETF getMasterMutualFundEtf() {
		return masterMutualFundEtf;
	}

	public void setMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		this.masterMutualFundEtf = masterMutualFundEtf;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MasterMFHoldingSectorWisePK)) {
			return false;
		}
		MasterMFHoldingSectorWisePK castOther = (MasterMFHoldingSectorWisePK) other;
		return this.date.equals(castOther.date)
				&& this.masterMutualFundEtf.getIsin().equals(castOther.masterMutualFundEtf.getIsin())
				&& (this.masterMfsector.getId() == castOther.masterMfsector.getId());
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.date.hashCode();
		hash = hash * prime + this.masterMutualFundEtf.getIsin().hashCode();
		hash = hash * prime + this.masterMfsector.getId();

		return hash;
	}
}