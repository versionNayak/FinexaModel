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
 * The persistent class for the lookupAssetAllocationCategory database table.
 * 
 */
@Entity
@Table(name = "lookupAssetAllocationCategory")
@NamedQuery(name = "LookupAssetAllocationCategory.findAll", query = "SELECT l FROM LookupAssetAllocationCategory l")
public class LookupAssetAllocationCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String description;

	// bi-directional many-to-one association to LookupAssetAllocation
	@OneToMany(mappedBy = "lookupAssetAllocationCategory")
	private List<LookupAssetAllocation> lookupAssetAllocations;

	// bi-directional many-to-one association to LookupBucketLogic
	@OneToMany(mappedBy = "lookupAssetAllocationCategory")
	private List<LookupBucketLogic> lookupBucketLogics;

	public LookupAssetAllocationCategory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<LookupAssetAllocation> getLookupAssetAllocations() {
		return this.lookupAssetAllocations;
	}

	public void setLookupAssetAllocations(List<LookupAssetAllocation> lookupAssetAllocations) {
		this.lookupAssetAllocations = lookupAssetAllocations;
	}

	public LookupAssetAllocation addLookupAssetAllocation(LookupAssetAllocation lookupAssetAllocation) {
		getLookupAssetAllocations().add(lookupAssetAllocation);
		lookupAssetAllocation.setLookupAssetAllocationCategory(this);

		return lookupAssetAllocation;
	}

	public LookupAssetAllocation removeLookupAssetAllocation(LookupAssetAllocation lookupAssetAllocation) {
		getLookupAssetAllocations().remove(lookupAssetAllocation);
		lookupAssetAllocation.setLookupAssetAllocationCategory(null);

		return lookupAssetAllocation;
	}

	public List<LookupBucketLogic> getLookupBucketLogics() {
		return this.lookupBucketLogics;
	}

	public void setLookupBucketLogics(List<LookupBucketLogic> lookupBucketLogics) {
		this.lookupBucketLogics = lookupBucketLogics;
	}

	public LookupBucketLogic addLookupBucketLogic(LookupBucketLogic lookupBucketLogic) {
		getLookupBucketLogics().add(lookupBucketLogic);
		lookupBucketLogic.setLookupAssetAllocationCategory(this);

		return lookupBucketLogic;
	}

	public LookupBucketLogic removeLookupBucketLogic(LookupBucketLogic lookupBucketLogic) {
		getLookupBucketLogics().remove(lookupBucketLogic);
		lookupBucketLogic.setLookupAssetAllocationCategory(null);

		return lookupBucketLogic;
	}

}