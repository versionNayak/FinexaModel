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
 * The persistent class for the lookupBucketLogic database table.
 * 
 */
@Entity
@Table(name = "lookupBucketLogic")
@NamedQuery(name = "LookupBucketLogic.findAll", query = "SELECT l FROM LookupBucketLogic l")
public class LookupBucketLogic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	// bi-directional many-to-one association to LookupAssetAllocationCategory
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetAllocationCategory")
	private LookupAssetAllocationCategory lookupAssetAllocationCategory;

	// bi-directional many-to-one association to LookupGoalHorizonBucket
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goalHorizonBucket")
	private LookupGoalHorizonBucket lookupGoalHorizonBucket;

	// bi-directional many-to-one association to LookupRiskProfile
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "riskProfile")
	private LookupRiskProfile lookupRiskProfile;

	public LookupBucketLogic() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LookupAssetAllocationCategory getLookupAssetAllocationCategory() {
		return this.lookupAssetAllocationCategory;
	}

	public void setLookupAssetAllocationCategory(LookupAssetAllocationCategory lookupAssetAllocationCategory) {
		this.lookupAssetAllocationCategory = lookupAssetAllocationCategory;
	}

	public LookupGoalHorizonBucket getLookupGoalHorizonBucket() {
		return this.lookupGoalHorizonBucket;
	}

	public void setLookupGoalHorizonBucket(LookupGoalHorizonBucket lookupGoalHorizonBucket) {
		this.lookupGoalHorizonBucket = lookupGoalHorizonBucket;
	}

	public LookupRiskProfile getLookupRiskProfile() {
		return this.lookupRiskProfile;
	}

	public void setLookupRiskProfile(LookupRiskProfile lookupRiskProfile) {
		this.lookupRiskProfile = lookupRiskProfile;
	}

}