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
 * The persistent class for the masterIndexName database table.
 * 
 */
@Entity
@Table(name = "masterIndexName")
@NamedQuery(name = "MasterIndexName.findAll", query = "SELECT m FROM MasterIndexName m")
public class MasterIndexName implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String name;

	// bi-directional many-to-one association to MasterEquityMarketCapClassification
	@OneToMany(mappedBy = "masterIndexName")
	private List<MasterEquityMarketCapClassification> masterEquityMarketCapClassifications;


	// bi-directional many-to-one association to MasterLTSTClassification
	@OneToMany(mappedBy = "masterIndexName")
	private List<MasterLTSTClassification> masterLtstclassifications;

	// bi-directional many-to-one association to MasterMutualFundETF
	@OneToMany(mappedBy = "masterIndexName")
	private List<MasterMutualFundETF> masterMutualFundEtfs;

	// bi-directional many-to-one association to MasterSectorBenchmarkMapping
	@OneToMany(mappedBy = "masterIndexName")
	private List<MasterSectorBenchmarkMapping> masterSectorBenchmarkMappings;

	// bi-directional many-to-one association to MasterSubAssetClassReturn
	@OneToMany(mappedBy = "masterIndexName")
	private List<MasterSubAssetClassReturn> masterSubAssetClassReturns;

	public MasterIndexName() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<MasterEquityMarketCapClassification> getMasterEquityMarketCapClassifications() {
		return this.masterEquityMarketCapClassifications;
	}

	public void setMasterEquityMarketCapClassifications(
			List<MasterEquityMarketCapClassification> masterEquityMarketCapClassifications) {
		this.masterEquityMarketCapClassifications = masterEquityMarketCapClassifications;
	}

	public MasterEquityMarketCapClassification addMasterEquityMarketCapClassification(
			MasterEquityMarketCapClassification masterEquityMarketCapClassification) {
		getMasterEquityMarketCapClassifications().add(masterEquityMarketCapClassification);
		masterEquityMarketCapClassification.setMasterIndexName(this);

		return masterEquityMarketCapClassification;
	}

	public MasterEquityMarketCapClassification removeMasterEquityMarketCapClassification(
			MasterEquityMarketCapClassification masterEquityMarketCapClassification) {
		getMasterEquityMarketCapClassifications().remove(masterEquityMarketCapClassification);
		masterEquityMarketCapClassification.setMasterIndexName(null);

		return masterEquityMarketCapClassification;
	}

	public List<MasterLTSTClassification> getMasterLtstclassifications() {
		return this.masterLtstclassifications;
	}

	public void setMasterLtstclassifications(List<MasterLTSTClassification> masterLtstclassifications) {
		this.masterLtstclassifications = masterLtstclassifications;
	}

	public MasterLTSTClassification addMasterLtstclassification(MasterLTSTClassification masterLtstclassification) {
		getMasterLtstclassifications().add(masterLtstclassification);
		masterLtstclassification.setMasterIndexName(this);

		return masterLtstclassification;
	}

	public MasterLTSTClassification removeMasterLtstclassification(MasterLTSTClassification masterLtstclassification) {
		getMasterLtstclassifications().remove(masterLtstclassification);
		masterLtstclassification.setMasterIndexName(null);

		return masterLtstclassification;
	}

	public List<MasterMutualFundETF> getMasterMutualFundEtfs() {
		return this.masterMutualFundEtfs;
	}

	public void setMasterMutualFundEtfs(List<MasterMutualFundETF> masterMutualFundEtfs) {
		this.masterMutualFundEtfs = masterMutualFundEtfs;
	}

	public MasterMutualFundETF addMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		getMasterMutualFundEtfs().add(masterMutualFundEtf);
		masterMutualFundEtf.setMasterIndexName(this);

		return masterMutualFundEtf;
	}

	public MasterMutualFundETF removeMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		getMasterMutualFundEtfs().remove(masterMutualFundEtf);
		masterMutualFundEtf.setMasterIndexName(null);

		return masterMutualFundEtf;
	}

	public List<MasterSectorBenchmarkMapping> getMasterSectorBenchmarkMappings() {
		return this.masterSectorBenchmarkMappings;
	}

	public void setMasterSectorBenchmarkMappings(List<MasterSectorBenchmarkMapping> masterSectorBenchmarkMappings) {
		this.masterSectorBenchmarkMappings = masterSectorBenchmarkMappings;
	}

	public MasterSectorBenchmarkMapping addMasterSectorBenchmarkMapping(
			MasterSectorBenchmarkMapping masterSectorBenchmarkMapping) {
		getMasterSectorBenchmarkMappings().add(masterSectorBenchmarkMapping);
		masterSectorBenchmarkMapping.setMasterIndexName(this);

		return masterSectorBenchmarkMapping;
	}

	public MasterSectorBenchmarkMapping removeMasterSectorBenchmarkMapping(
			MasterSectorBenchmarkMapping masterSectorBenchmarkMapping) {
		getMasterSectorBenchmarkMappings().remove(masterSectorBenchmarkMapping);
		masterSectorBenchmarkMapping.setMasterIndexName(null);

		return masterSectorBenchmarkMapping;
	}

	public List<MasterSubAssetClassReturn> getMasterSubAssetClassReturns() {
		return this.masterSubAssetClassReturns;
	}

	public void setMasterSubAssetClassReturns(List<MasterSubAssetClassReturn> masterSubAssetClassReturns) {
		this.masterSubAssetClassReturns = masterSubAssetClassReturns;
	}

	public MasterSubAssetClassReturn addMasterSubAssetClassReturn(MasterSubAssetClassReturn masterSubAssetClassReturn) {
		getMasterSubAssetClassReturns().add(masterSubAssetClassReturn);
		masterSubAssetClassReturn.setMasterIndexName(this);

		return masterSubAssetClassReturn;
	}

	public MasterSubAssetClassReturn removeMasterSubAssetClassReturn(
			MasterSubAssetClassReturn masterSubAssetClassReturn) {
		getMasterSubAssetClassReturns().remove(masterSubAssetClassReturn);
		masterSubAssetClassReturn.setMasterIndexName(null);

		return masterSubAssetClassReturn;
	}

}