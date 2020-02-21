package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the masterMFRatio database table.
 * 
 */
@Embeddable
public class MasterMFRatioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String isin;

	@Temporal(TemporalType.DATE)
	private java.util.Date upddate;

	public MasterMFRatioPK() {
	}
	public String getIsin() {
		return this.isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public java.util.Date getUpddate() {
		return this.upddate;
	}
	public void setUpddate(java.util.Date upddate) {
		this.upddate = upddate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MasterMFRatioPK)) {
			return false;
		}
		MasterMFRatioPK castOther = (MasterMFRatioPK)other;
		return 
			this.isin.equals(castOther.isin)
			&& this.upddate.equals(castOther.upddate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.isin.hashCode();
		hash = hash * prime + this.upddate.hashCode();
		
		return hash;
	}
}