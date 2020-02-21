package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

/**
 * The primary key class for the masterAPYContributionChart database table.
 * 
 */
@Embeddable
public class MasterAPYContributionChartPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private int entryAge;

	private int vestingPeriod;

	private int frequency;

	private int monthlyPension;

	public MasterAPYContributionChartPK() {
	}

	public int getEntryAge() {
		return this.entryAge;
	}

	public void setEntryAge(int entryAge) {
		this.entryAge = entryAge;
	}

	public int getVestingPeriod() {
		return this.vestingPeriod;
	}

	public void setVestingPeriod(int vestingPeriod) {
		this.vestingPeriod = vestingPeriod;
	}

	public int getFrequency() {
		return this.frequency;
	}

	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	public int getMonthlyPension() {
		return this.monthlyPension;
	}

	public void setMonthlyPension(int monthlyPension) {
		this.monthlyPension = monthlyPension;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MasterAPYContributionChartPK)) {
			return false;
		}
		MasterAPYContributionChartPK castOther = (MasterAPYContributionChartPK) other;
		return (this.entryAge == castOther.entryAge) && (this.vestingPeriod == castOther.vestingPeriod)
				&& (this.frequency == castOther.frequency) && (this.monthlyPension == castOther.monthlyPension);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.entryAge;
		hash = hash * prime + this.vestingPeriod;
		hash = hash * prime + this.frequency;
		hash = hash * prime + this.monthlyPension;

		return hash;
	}
}