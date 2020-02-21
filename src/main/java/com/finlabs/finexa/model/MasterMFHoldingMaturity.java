package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the masterMFHoldingMaturity database table.
 * 
 */
@Entity
@Table(name = "masterMFHoldingMaturity")
@NamedQuery(name = "MasterMFHoldingMaturity.findAll", query = "SELECT m FROM MasterMFHoldingMaturity m")
public class MasterMFHoldingMaturity implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterMFHoldingMaturityPK id;

	private Float averageMaturityPeriod;

	private Float duration;

	private String schemeName;

	private Float ytm;

	public MasterMFHoldingMaturity() {
	}

	public MasterMFHoldingMaturityPK getId() {
		return this.id;
	}

	public void setId(MasterMFHoldingMaturityPK id) {
		this.id = id;
	}

	public Float getAverageMaturityPeriod() {
		return this.averageMaturityPeriod;
	}

	public void setAverageMaturityPeriod(Float averageMaturityPeriod) {
		this.averageMaturityPeriod = averageMaturityPeriod;
	}

	public Float getDuration() {
		return this.duration;
	}

	public void setDuration(Float duration) {
		this.duration = duration;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public Float getYtm() {
		return this.ytm;
	}

	public void setYtm(Float ytm) {
		this.ytm = ytm;
	}

}