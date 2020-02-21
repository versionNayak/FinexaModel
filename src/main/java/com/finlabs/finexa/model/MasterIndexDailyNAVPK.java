package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the masterIndexDailyNAV database table.
 * 
 */
@Embeddable
public class MasterIndexDailyNAVPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	// bi-directional many-to-one association to MasterIndexName
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "indexCode")
	private MasterIndexName masterIndexName;

	@Temporal(TemporalType.DATE)
	private java.util.Date date;

	public MasterIndexDailyNAVPK() {
	}

	public java.util.Date getDate() {
		return this.date;
	}

	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public MasterIndexName getMasterIndexName() {
		return masterIndexName;
	}

	public void setMasterIndexName(MasterIndexName masterIndexName) {
		this.masterIndexName = masterIndexName;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MasterIndexDailyNAVPK)) {
			return false;
		}
		MasterIndexDailyNAVPK castOther = (MasterIndexDailyNAVPK) other;
		return (this.masterIndexName.getId() == castOther.masterIndexName.getId()) && this.date.equals(castOther.date);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.masterIndexName.getId();
		hash = hash * prime + this.date.hashCode();

		return hash;
	}
}