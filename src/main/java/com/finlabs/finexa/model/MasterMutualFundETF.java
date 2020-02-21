package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the masterMutualFundETF database table.
 * 
 */
@Entity
@Table(name = "masterMutualFundETF")
@NamedQuery(name = "MasterMutualFundETF.findAll", query = "SELECT m FROM MasterMutualFundETF m")
public class MasterMutualFundETF implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String isin;

	private Integer amfiCode;

	private String closeEndedFlag;

	@Lob
	private String exitLoadAndPeriod;

	private String fundHouse;

	private float minInvestmentAmount;

	private String regularDirectFlag;

	@Temporal(TemporalType.DATE)
	private Date schemeEndDate;

	@Temporal(TemporalType.DATE)
	private Date schemeInceptionDate;

	private String schemeName;

	private String schemeOption;

	private String status;

	// bi-directional many-to-one association to LookupAssetClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetClassID")
	private LookupAssetClass lookupAssetClass;

	// bi-directional many-to-one association to LookupAssetSubClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subAssetClassID")
	private LookupAssetSubClass lookupAssetSubClass;

	// bi-directional many-to-one association to MasterFundManager
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fundManagerCode")
	private MasterFundManager masterFundManager;

	// bi-directional many-to-one association to MasterIndexName
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "benchmarkIndex")
	private MasterIndexName masterIndexName;

	// bi-directional many-to-one association to MasterMFAssetAllocation
	@OneToMany(mappedBy = "masterMutualFundEtf")
	private List<MasterMFAssetAllocation> masterMfassetAllocations;

	/*// bi-directional many-to-one association to MasterMFMaturityProfile
	@OneToMany(mappedBy = "masterMutualFundEtf")
	private List<MasterMFMaturityProfile> masterMfmaturityProfiles;*/

	public MasterMutualFundETF() {
	}

	public String getIsin() {
		return this.isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public Integer getAmfiCode() {
		return this.amfiCode;
	}

	public void setAmfiCode(Integer amfiCode) {
		this.amfiCode = amfiCode;
	}

	public String getCloseEndedFlag() {
		return this.closeEndedFlag;
	}

	public void setCloseEndedFlag(String closeEndedFlag) {
		this.closeEndedFlag = closeEndedFlag;
	}

	public String getExitLoadAndPeriod() {
		return this.exitLoadAndPeriod;
	}

	public void setExitLoadAndPeriod(String exitLoadAndPeriod) {
		this.exitLoadAndPeriod = exitLoadAndPeriod;
	}

	public String getFundHouse() {
		return this.fundHouse;
	}

	public void setFundHouse(String fundHouse) {
		this.fundHouse = fundHouse;
	}

	public float getMinInvestmentAmount() {
		return this.minInvestmentAmount;
	}

	public void setMinInvestmentAmount(float minInvestmentAmount) {
		this.minInvestmentAmount = minInvestmentAmount;
	}

	public String getRegularDirectFlag() {
		return this.regularDirectFlag;
	}

	public void setRegularDirectFlag(String regularDirectFlag) {
		this.regularDirectFlag = regularDirectFlag;
	}

	public Date getSchemeEndDate() {
		return this.schemeEndDate;
	}

	public void setSchemeEndDate(Date schemeEndDate) {
		this.schemeEndDate = schemeEndDate;
	}

	public Date getSchemeInceptionDate() {
		return this.schemeInceptionDate;
	}

	public void setSchemeInceptionDate(Date schemeInceptionDate) {
		this.schemeInceptionDate = schemeInceptionDate;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSchemeOption() {
		return this.schemeOption;
	}

	public void setSchemeOption(String schemeOption) {
		this.schemeOption = schemeOption;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LookupAssetClass getLookupAssetClass() {
		return this.lookupAssetClass;
	}

	public void setLookupAssetClass(LookupAssetClass lookupAssetClass) {
		this.lookupAssetClass = lookupAssetClass;
	}

	public LookupAssetSubClass getLookupAssetSubClass() {
		return this.lookupAssetSubClass;
	}

	public void setLookupAssetSubClass(LookupAssetSubClass lookupAssetSubClass) {
		this.lookupAssetSubClass = lookupAssetSubClass;
	}

	public MasterFundManager getMasterFundManager() {
		return this.masterFundManager;
	}

	public void setMasterFundManager(MasterFundManager masterFundManager) {
		this.masterFundManager = masterFundManager;
	}

	public MasterIndexName getMasterIndexName() {
		return this.masterIndexName;
	}

	public void setMasterIndexName(MasterIndexName masterIndexName) {
		this.masterIndexName = masterIndexName;
	}

	public List<MasterMFAssetAllocation> getMasterMfassetAllocations() {
		return this.masterMfassetAllocations;
	}

	public void setMasterMfassetAllocations(List<MasterMFAssetAllocation> masterMfassetAllocations) {
		this.masterMfassetAllocations = masterMfassetAllocations;
	}

	public MasterMFAssetAllocation addMasterMfassetAllocation(MasterMFAssetAllocation masterMfassetAllocation) {
		getMasterMfassetAllocations().add(masterMfassetAllocation);
		masterMfassetAllocation.setMasterMutualFundEtf(this);

		return masterMfassetAllocation;
	}

	public MasterMFAssetAllocation removeMasterMfassetAllocation(MasterMFAssetAllocation masterMfassetAllocation) {
		getMasterMfassetAllocations().remove(masterMfassetAllocation);
		masterMfassetAllocation.setMasterMutualFundEtf(null);

		return masterMfassetAllocation;
	}

	/*public List<MasterMFMaturityProfile> getMasterMfmaturityProfiles() {
		return this.masterMfmaturityProfiles;
	}

	public void setMasterMfmaturityProfiles(List<MasterMFMaturityProfile> masterMfmaturityProfiles) {
		this.masterMfmaturityProfiles = masterMfmaturityProfiles;
	}*/

	

}