package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterAPYContributionChart database table.
 * 
 */
@Entity
@Table(name = "masterAPYContributionChart")
@NamedQuery(name = "MasterAPYContributionChart.findAll", query = "SELECT m FROM MasterAPYContributionChart m")
public class MasterAPYContributionChart implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterAPYContributionChartPK id;

	private int monthlyContribution;

	public MasterAPYContributionChart() {
	}

	public MasterAPYContributionChartPK getId() {
		return this.id;
	}

	public void setId(MasterAPYContributionChartPK id) {
		this.id = id;
	}

	public int getMonthlyContribution() {
		return this.monthlyContribution;
	}

	public void setMonthlyContribution(int monthlyContribution) {
		this.monthlyContribution = monthlyContribution;
	}

}