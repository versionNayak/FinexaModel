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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the lookupAssetSubClass database table.
 * 
 */
@Entity
@Table(name = "lookupAssetSubClass")
@NamedQuery(name = "LookupAssetSubClass.findAll", query = "SELECT l FROM LookupAssetSubClass l")
public class LookupAssetSubClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	// bi-directional many-to-one association to ClientMutualFund
	@OneToMany(mappedBy = "lookupAssetSubClass")
	private List<ClientMutualFund> clientMutualFunds;

	// bi-directional many-to-one association to LookupAssetAllocation
	@OneToMany(mappedBy = "lookupAssetSubClass")
	private List<LookupAssetAllocation> lookupAssetAllocations;

	// bi-directional many-to-one association to LookupAssetClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetClass")
	private LookupAssetClass lookupAssetClass;

	// bi-directional many-to-one association to MasterExpectedHistoricalReturn
	@OneToMany(mappedBy = "lookupAssetSubClass")
	private List<MasterExpectedHistoricalReturn> masterExpectedHistoricalReturns;

	// bi-directional many-to-one association to MasterMFProductRecommendation
	@OneToMany(mappedBy = "lookupAssetSubClass")
	private List<MasterMFProductRecommendation> masterMfproductRecommendations;

	// bi-directional many-to-one association to MasterMutualFundETF
	@OneToMany(mappedBy = "lookupAssetSubClass")
	private List<MasterMutualFundETF> masterMutualFundEtfs;

	// bi-directional many-to-one association to MasterProductClassification
	@OneToMany(mappedBy = "lookupAssetSubClass")
	private List<MasterProductClassification> masterProductClassifications;

	// bi-directional many-to-one association to MasterSubAssetClassReturn
	@OneToOne(mappedBy = "lookupAssetSubClass")
	private MasterSubAssetClassReturn masterSubAssetClassReturns;

	public LookupAssetSubClass() {
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

	public List<ClientMutualFund> getClientMutualFunds() {
		return this.clientMutualFunds;
	}

	public void setClientMutualFunds(List<ClientMutualFund> clientMutualFunds) {
		this.clientMutualFunds = clientMutualFunds;
	}

	public ClientMutualFund addClientMutualFund(ClientMutualFund clientMutualFund) {
		getClientMutualFunds().add(clientMutualFund);
		clientMutualFund.setLookupAssetSubClass(this);

		return clientMutualFund;
	}

	public ClientMutualFund removeClientMutualFund(ClientMutualFund clientMutualFund) {
		getClientMutualFunds().remove(clientMutualFund);
		clientMutualFund.setLookupAssetSubClass(null);

		return clientMutualFund;
	}

	public List<LookupAssetAllocation> getLookupAssetAllocations() {
		return this.lookupAssetAllocations;
	}

	public void setLookupAssetAllocations(List<LookupAssetAllocation> lookupAssetAllocations) {
		this.lookupAssetAllocations = lookupAssetAllocations;
	}

	public LookupAssetAllocation addLookupAssetAllocation(LookupAssetAllocation lookupAssetAllocation) {
		getLookupAssetAllocations().add(lookupAssetAllocation);
		lookupAssetAllocation.setLookupAssetSubClass(this);

		return lookupAssetAllocation;
	}

	public LookupAssetAllocation removeLookupAssetAllocation(LookupAssetAllocation lookupAssetAllocation) {
		getLookupAssetAllocations().remove(lookupAssetAllocation);
		lookupAssetAllocation.setLookupAssetSubClass(null);

		return lookupAssetAllocation;
	}

	public LookupAssetClass getLookupAssetClass() {
		return this.lookupAssetClass;
	}

	public void setLookupAssetClass(LookupAssetClass lookupAssetClass) {
		this.lookupAssetClass = lookupAssetClass;
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
		masterExpectedHistoricalReturn.setLookupAssetSubClass(this);

		return masterExpectedHistoricalReturn;
	}

	public MasterExpectedHistoricalReturn removeMasterExpectedHistoricalReturn(
			MasterExpectedHistoricalReturn masterExpectedHistoricalReturn) {
		getMasterExpectedHistoricalReturns().remove(masterExpectedHistoricalReturn);
		masterExpectedHistoricalReturn.setLookupAssetSubClass(null);

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
		masterMfproductRecommendation.setLookupAssetSubClass(this);

		return masterMfproductRecommendation;
	}

	public MasterMFProductRecommendation removeMasterMfproductRecommendation(
			MasterMFProductRecommendation masterMfproductRecommendation) {
		getMasterMfproductRecommendations().remove(masterMfproductRecommendation);
		masterMfproductRecommendation.setLookupAssetSubClass(null);

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
		masterMutualFundEtf.setLookupAssetSubClass(this);

		return masterMutualFundEtf;
	}

	public MasterMutualFundETF removeMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		getMasterMutualFundEtfs().remove(masterMutualFundEtf);
		masterMutualFundEtf.setLookupAssetSubClass(null);

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
		masterProductClassification.setLookupAssetSubClass(this);

		return masterProductClassification;
	}

	public MasterProductClassification removeMasterProductClassification(
			MasterProductClassification masterProductClassification) {
		getMasterProductClassifications().remove(masterProductClassification);
		masterProductClassification.setLookupAssetSubClass(null);

		return masterProductClassification;
	}

	public MasterSubAssetClassReturn getMasterSubAssetClassReturns() {
		return this.masterSubAssetClassReturns;
	}

	public void setMasterSubAssetClassReturns(MasterSubAssetClassReturn masterSubAssetClassReturns) {
		this.masterSubAssetClassReturns = masterSubAssetClassReturns;
	}

}