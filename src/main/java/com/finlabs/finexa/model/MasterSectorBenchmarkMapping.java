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
 * The persistent class for the masterSectorBenchmarkMapping database table.
 * 
 */
@Entity
@Table(name = "masterSectorBenchmarkMapping")
@NamedQuery(name = "MasterSectorBenchmarkMapping.findAll", query = "SELECT m FROM MasterSectorBenchmarkMapping m")
public class MasterSectorBenchmarkMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	// bi-directional many-to-one association to MasterMFSector
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sectorID")
	private MasterMFSector masterMfsector;

	// bi-directional many-to-one association to MasterIndexName
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "benchmarkIndex")
	private MasterIndexName masterIndexName;

	public MasterSectorBenchmarkMapping() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MasterMFSector getMasterMfsector() {
		return this.masterMfsector;
	}

	public void setMasterMfsector(MasterMFSector masterMfsector) {
		this.masterMfsector = masterMfsector;
	}

	public MasterIndexName getMasterIndexName() {
		return this.masterIndexName;
	}

	public void setMasterIndexName(MasterIndexName masterIndexName) {
		this.masterIndexName = masterIndexName;
	}

}