package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the masterAPYMonthlyPensionCorpus database table.
 * 
 */
@Entity
@Table(name = "masterAPYMonthlyPensionCorpus")
@NamedQuery(name = "MasterAPYMonthlyPensionCorpus.findAll", query = "SELECT m FROM MasterAPYMonthlyPensionCorpus m")
public class MasterAPYMonthlyPensionCorpus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int monthlyPension;

	private int corpus;

	public MasterAPYMonthlyPensionCorpus() {
	}

	public int getMonthlyPension() {
		return this.monthlyPension;
	}

	public void setMonthlyPension(int monthlyPension) {
		this.monthlyPension = monthlyPension;
	}

	public int getCorpus() {
		return this.corpus;
	}

	public void setCorpus(int corpus) {
		this.corpus = corpus;
	}

}