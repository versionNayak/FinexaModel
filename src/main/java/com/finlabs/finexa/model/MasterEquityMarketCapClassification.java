package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the masterEquityMarketCapClassification database
 * table.
 * 
 */
@Entity
@Table(name = "masterEquityMarketCapClassification")
@NamedQuery(name = "MasterEquityMarketCapClassification.findAll", query = "SELECT m FROM MasterEquityMarketCapClassification m")
public class MasterEquityMarketCapClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String marketcapCategory;

	private Float rangeEnd;

	private Float rangeStart;

	// bi-directional many-to-one association to MasterDirectEquityMarketCap
	@OneToMany(mappedBy = "masterEquityMarketCapClassification")
	private List<MasterDirectEquityMarketCap> masterDirectEquityMarketCaps;

	// bi-directional many-to-one association to MasterIndexName
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "benchmarkIndex")
	private MasterIndexName masterIndexName;

	public MasterEquityMarketCapClassification() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMarketcapCategory() {
		return this.marketcapCategory;
	}

	public void setMarketcapCategory(String marketcapCategory) {
		this.marketcapCategory = marketcapCategory;
	}

	public Float getRangeEnd() {
		return rangeEnd;
	}

	public void setRangeEnd(Float rangeEnd) {
		this.rangeEnd = rangeEnd;
	}

	public Float getRangeStart() {
		return rangeStart;
	}

	public void setRangeStart(Float rangeStart) {
		this.rangeStart = rangeStart;
	}

	public List<MasterDirectEquityMarketCap> getMasterDirectEquityMarketCaps() {
		return this.masterDirectEquityMarketCaps;
	}

	public void setMasterDirectEquityMarketCaps(List<MasterDirectEquityMarketCap> masterDirectEquityMarketCaps) {
		this.masterDirectEquityMarketCaps = masterDirectEquityMarketCaps;
	}

	public MasterDirectEquityMarketCap addMasterDirectEquityMarketCap(
			MasterDirectEquityMarketCap masterDirectEquityMarketCap) {
		getMasterDirectEquityMarketCaps().add(masterDirectEquityMarketCap);
		masterDirectEquityMarketCap.setMasterEquityMarketCapClassification(this);

		return masterDirectEquityMarketCap;
	}

	public MasterDirectEquityMarketCap removeMasterDirectEquityMarketCap(
			MasterDirectEquityMarketCap masterDirectEquityMarketCap) {
		getMasterDirectEquityMarketCaps().remove(masterDirectEquityMarketCap);
		masterDirectEquityMarketCap.setMasterEquityMarketCapClassification(null);

		return masterDirectEquityMarketCap;
	}

	public MasterIndexName getMasterIndexName() {
		return this.masterIndexName;
	}

	public void setMasterIndexName(MasterIndexName masterIndexName) {
		this.masterIndexName = masterIndexName;
	}

}