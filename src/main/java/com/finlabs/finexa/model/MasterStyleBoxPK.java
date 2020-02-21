package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the masterStyleBox database table.
 * 
 */
@Embeddable
public class MasterStyleBoxPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String isin;

	@Temporal(TemporalType.DATE)
	private java.util.Date date;

	public MasterStyleBoxPK() {
	}

	public String getIsin() {
		return this.isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
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
		if (!(other instanceof MasterStyleBoxPK)) {
			return false;
		}
		MasterStyleBoxPK castOther = (MasterStyleBoxPK) other;
		return this.isin.equals(castOther.isin) && this.date.equals(castOther.date);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.isin.hashCode();
		hash = hash * prime + this.date.hashCode();

		return hash;
	}
}