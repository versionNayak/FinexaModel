package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterLTSTClassification database table.
 * 
 */
@Entity
@Table(name = "masterLTSTClassification")
@NamedQuery(name = "MasterLTSTClassification.findAll", query = "SELECT m FROM MasterLTSTClassification m")
public class MasterLTSTClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private int avgMaturityEnd;

	private int avgMaturityStart;

	private String classification;

	// bi-directional many-to-one association to MasterIndexName
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "benchmarkIndex")
	private MasterIndexName masterIndexName;

	public MasterLTSTClassification() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAvgMaturityEnd() {
		return this.avgMaturityEnd;
	}

	public void setAvgMaturityEnd(int avgMaturityEnd) {
		this.avgMaturityEnd = avgMaturityEnd;
	}

	public int getAvgMaturityStart() {
		return this.avgMaturityStart;
	}

	public void setAvgMaturityStart(int avgMaturityStart) {
		this.avgMaturityStart = avgMaturityStart;
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public MasterIndexName getMasterIndexName() {
		return this.masterIndexName;
	}

	public void setMasterIndexName(MasterIndexName masterIndexName) {
		this.masterIndexName = masterIndexName;
	}

}