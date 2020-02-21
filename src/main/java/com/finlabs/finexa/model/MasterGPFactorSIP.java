package com.finlabs.finexa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterGPfactorSIP database table.
 * 
 */
@Entity
@Table(name = "masterGPfactorSIP")
@NamedQuery(name = "MasterGPFactorSIP.findAll", query = "SELECT c FROM MasterGPFactorSIP c")
public class MasterGPFactorSIP {

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

	public MasterGPFactorSIP() {
	}

	public int getActualMonthsToGoal() {
		return actualMonthsToGoal;
	}

	public void setActualMonthsToGoal(int actualMonthsToGoal) {
		this.actualMonthsToGoal = actualMonthsToGoal;
	}

}