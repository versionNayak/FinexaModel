package com.finlabs.finexa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterGPFactorLumpsum database table.
 * 
 */
@Entity
@Table(name = "masterGPFactorLumpsum")
@NamedQuery(name = "MasterGPFactorLumpsum.findAll", query = "SELECT c FROM MasterGPFactorLumpsum c")
public class MasterGPFactorLumpsum {

	@Id
	@Column(name = "monthsToGoal")
	private int monthsToGoal;

	@Column(name = "GPFactor")
	private Double GPFactor;

	@Column(name = "actualMonthsToGoal")
	private int actualMonthsToGoal;

	public int getMonthsToGoal() {
		return monthsToGoal;
	}

	public void setMonthsToGoal(int monthsToGoal) {
		this.monthsToGoal = monthsToGoal;
	}

	public Double getGPFactor() {
		return GPFactor;
	}

	public void setGPFactor(Double gPFactor) {
		GPFactor = gPFactor;
	}

	public MasterGPFactorLumpsum() {
	}

	public int getActualMonthsToGoal() {
		return actualMonthsToGoal;
	}

	public void setActualMonthsToGoal(int actualMonthsToGoal) {
		this.actualMonthsToGoal = actualMonthsToGoal;
	}

}