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
 * The persistent class for the lookupAssetClass database table.
 * 
 */
@Entity
@Table(name = "lookupAssetClass")
@NamedQuery(name = "LookupAssetClass.findAll", query = "SELECT l FROM LookupAssetClass l")
public class LookupAssetClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private Integer displayOrder;

	// bi-directional many-to-one association to LookupAssetSubClass
	@OneToMany(mappedBy = "lookupAssetClass")
	private List<LookupAssetSubClass> lookupAssetSubClasses;

	// bi-directional many-to-one association to MasterAssetClassReturn
	@OneToMany(mappedBy = "lookupAssetClass")
	private List<MasterAssetClassReturn> masterAssetClassReturns;

	// bi-directional many-to-one association to MasterExpectedHistoricalReturn
	@OneToMany(mappedBy = "lookupAssetClass")
	private List<MasterExpectedHistoricalReturn> masterExpectedHistoricalReturns;

	// bi-directional many-to-one association to MasterMFProductRecommendation
	@OneToMany(mappedBy = "lookupAssetClass")
	private List<MasterMFProductRecommendation> masterMfproductRecommendations;

	// bi-directional many-to-one association to MasterMutualFundETF
	@OneToMany(mappedBy = "lookupAssetClass")
	private List<MasterMutualFundETF> masterMutualFundEtfs;

	// bi-directional many-to-one association to MasterProductClassification
	@OneToMany(mappedBy = "lookupAssetClass")
	private List<MasterProductClassification> masterProductClassifications;

	public LookupAssetClass() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public List<LookupAssetSubClass> getLookupAssetSubClasses() {
		return this.lookupAssetSubClasses;
	}

	public void setLookupAssetSubClasses(List<LookupAssetSubClass> lookupAssetSubClasses) {
		this.lookupAssetSubClasses = lookupAssetSubClasses;
	}

	public LookupAssetSubClass addLookupAssetSubClass(LookupAssetSubClass lookupAssetSubClass) {
		getLookupAssetSubClasses().add(lookupAssetSubClass);
		lookupAssetSubClass.setLookupAssetClass(this);

		return lookupAssetSubClass;
	}

	public LookupAssetSubClass removeLookupAssetSubClass(LookupAssetSubClass lookupAssetSubClass) {
		getLookupAssetSubClasses().remove(lookupAssetSubClass);
		lookupAssetSubClass.setLookupAssetClass(null);

		return lookupAssetSubClass;
	}

	public List<MasterAssetClassReturn> getMasterAssetClassReturns() {
		return this.masterAssetClassReturns;
	}

	public void setMasterAssetClassReturns(List<MasterAssetClassReturn> masterAssetClassReturns) {
		this.masterAssetClassReturns = masterAssetClassReturns;
	}

	public MasterAssetClassReturn addMasterAssetClassReturn(MasterAssetClassReturn masterAssetClassReturn) {
		getMasterAssetClassReturns().add(masterAssetClassReturn);
		masterAssetClassReturn.setLookupAssetClass(this);

		return masterAssetClassReturn;
	}

	public MasterAssetClassReturn removeMasterAssetClassReturn(MasterAssetClassReturn masterAssetClassReturn) {
		getMasterAssetClassReturns().remove(masterAssetClassReturn);
		masterAssetClassReturn.setLookupAssetClass(null);

		return masterAssetClassReturn;
	}

	public List<MasterExpectedHistoricalReturn> getMasterExpectedHistoricalReturns() {
		return this.masterExpectedHistoricalReturns;
	}

	public void setMasterExpectedHistoricalReturns(
			List<MasterExpectedHistoricalReturn> masterExpectedHistoricalReturns) {
		this.masterExpectedHistoricalReturns = masterExpectedHistoricalReturns;
	}

	public MasterExpectedHistoricalReturn addMasterExpectedHistoricalReturn(
			MasterExpectedHistoricalReturn masterExpectedHistoricalReturn) {
		getMasterExpectedHistoricalReturns().add(masterExpectedHistoricalReturn);
		masterExpectedHistoricalReturn.setLookupAssetClass(this);

		return masterExpectedHistoricalReturn;
	}

	public MasterExpectedHistoricalReturn removeMasterExpectedHistoricalReturn(
			MasterExpectedHistoricalReturn masterExpectedHistoricalReturn) {
		getMasterExpectedHistoricalReturns().remove(masterExpectedHistoricalReturn);
		masterExpectedHistoricalReturn.setLookupAssetClass(null);

		return masterExpectedHistoricalReturn;
	}

	public List<MasterMFProductRecommendation> getMasterMfproductRecommendations() {
		return this.masterMfproductRecommendations;
	}

	public void setMasterMfproductRecommendations(List<MasterMFProductRecommendation> masterMfproductRecommendations) {
		this.masterMfproductRecommendations = masterMfproductRecommendations;
	}

	public MasterMFProductRecommendation addMasterMfproductRecommendation(
			MasterMFProductRecommendation masterMfproductRecommendation) {
		getMasterMfproductRecommendations().add(masterMfproductRecommendation);
		masterMfproductRecommendation.setLookupAssetClass(this);

		return masterMfproductRecommendation;
	}

	public MasterMFProductRecommendation removeMasterMfproductRecommendation(
			MasterMFProductRecommendation masterMfproductRecommendation) {
		getMasterMfproductRecommendations().remove(masterMfproductRecommendation);
		masterMfproductRecommendation.setLookupAssetClass(null);

		return masterMfproductRecommendation;
	}

	public List<MasterMutualFundETF> getMasterMutualFundEtfs() {
		return this.masterMutualFundEtfs;
	}

	public void setMasterMutualFundEtfs(List<MasterMutualFundETF> masterMutualFundEtfs) {
		this.masterMutualFundEtfs = masterMutualFundEtfs;
	}

	public MasterMutualFundETF addMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		getMasterMutualFundEtfs().add(masterMutualFundEtf);
		masterMutualFundEtf.setLookupAssetClass(this);

		return masterMutualFundEtf;
	}

	public MasterMutualFundETF removeMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		getMasterMutualFundEtfs().remove(masterMutualFundEtf);
		masterMutualFundEtf.setLookupAssetClass(null);

		return masterMutualFundEtf;
	}

	public List<MasterProductClassification> getMasterProductClassifications() {
		return this.masterProductClassifications;
	}

	public void setMasterProductClassifications(List<MasterProductClassification> masterProductClassifications) {
		this.masterProductClassifications = masterProductClassifications;
	}

	public MasterProductClassification addMasterProductClassification(
			MasterProductClassification masterProductClassification) {
		getMasterProductClassifications().add(masterProductClassification);
		masterProductClassification.setLookupAssetClass(this);

		return masterProductClassification;
	}

	public MasterProductClassification removeMasterProductClassification(
			MasterProductClassification masterProductClassification) {
		getMasterProductClassifications().remove(masterProductClassification);
		masterProductClassification.setLookupAssetClass(null);

		return masterProductClassification;
	}

}