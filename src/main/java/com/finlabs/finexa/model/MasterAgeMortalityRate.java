package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterAgeMortalityRate database table.
 * 
 */
@Entity
@Table(name = "masterAgeMortalityRate")
@NamedQuery(name = "MasterAgeMortalityRate.findAll", query = "SELECT m FROM MasterAgeMortalityRate m")
public class MasterAgeMortalityRate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int age;

	private double mortalityRate;

	public MasterAgeMortalityRate() {
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getMortalityRate() {
		return this.mortalityRate;
	}

	public void setMortalityRate(double mortalityRate) {
		this.mortalityRate = mortalityRate;
	}

}