package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the masterMFMaturityProfile database table.
 * 
 */
@Embeddable
public class MasterMFMaturityProfilePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String isin;

	@Temporal(TemporalType.DATE)
	private java.util.Date invdate;

	public MasterMFMaturityProfilePK() {
	}
	public String getIsin() {
		return this.isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public java.util.Date getInvdate() {
		return this.invdate;
	}
	public void setInvdate(java.util.Date invdate) {
		this.invdate = invdate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MasterMFMaturityProfilePK)) {
			return false;
		}
		MasterMFMaturityProfilePK castOther = (MasterMFMaturityProfilePK)other;
		return 
			this.isin.equals(castOther.isin)
			&& this.invdate.equals(castOther.invdate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.isin.hashCode();
		hash = hash * prime + this.invdate.hashCode();
		
		return hash;
	}
}