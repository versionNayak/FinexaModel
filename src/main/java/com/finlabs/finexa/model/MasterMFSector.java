package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the masterMFSector database table.
 * 
 */
@Entity
@Table(name = "masterMFSector")
@NamedQuery(name = "MasterMFSector.findAll", query = "SELECT m FROM MasterMFSector m")
public class MasterMFSector implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String sector;

	// bi-directional many-to-one association to MasterDirectEquity
	@OneToMany(mappedBy = "masterMfsector")
	private List<MasterDirectEquity> masterDirectEquities;

	// bi-directional many-to-one association to MasterSectorBenchmarkMapping
	@OneToMany(mappedBy = "masterMfsector")
	private List<MasterSectorBenchmarkMapping> masterSectorBenchmarkMappings;

	public MasterMFSector() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSector() {
		return this.sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public List<MasterDirectEquity> getMasterDirectEquities() {
		return this.masterDirectEquities;
	}

	public void setMasterDirectEquities(List<MasterDirectEquity> masterDirectEquities) {
		this.masterDirectEquities = masterDirectEquities;
	}

	public MasterDirectEquity addMasterDirectEquity(MasterDirectEquity masterDirectEquity) {
		getMasterDirectEquities().add(masterDirectEquity);
		masterDirectEquity.setMasterMfsector(this);

		return masterDirectEquity;
	}

	public MasterDirectEquity removeMasterDirectEquity(MasterDirectEquity masterDirectEquity) {
		getMasterDirectEquities().remove(masterDirectEquity);
		masterDirectEquity.setMasterMfsector(null);

		return masterDirectEquity;
	}

	public void setMasterSectorBenchmarkMappings(List<MasterSectorBenchmarkMapping> masterSectorBenchmarkMappings) {
		this.masterSectorBenchmarkMappings = masterSectorBenchmarkMappings;
	}

	public List<MasterSectorBenchmarkMapping> getMasterSectorBenchmarkMappings() {
		return masterSectorBenchmarkMappings;
	}

}