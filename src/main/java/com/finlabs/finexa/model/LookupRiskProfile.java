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
 * The persistent class for the lookupRiskProfile database table.
 * 
 */
@Entity
@Table(name = "lookupRiskProfile")
@NamedQuery(name = "LookupRiskProfile.findAll", query = "SELECT l FROM LookupRiskProfile l")
public class LookupRiskProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	// bi-directional many-to-one association to LookupBucketLogic
	@OneToMany(mappedBy = "lookupRiskProfile")
	private List<LookupBucketLogic> lookupBucketLogics;

	public LookupRiskProfile() {
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

	public List<LookupBucketLogic> getLookupBucketLogics() {
		return this.lookupBucketLogics;
	}

	public void setLookupBucketLogics(List<LookupBucketLogic> lookupBucketLogics) {
		this.lookupBucketLogics = lookupBucketLogics;
	}

	public LookupBucketLogic addLookupBucketLogic(LookupBucketLogic lookupBucketLogic) {
		getLookupBucketLogics().add(lookupBucketLogic);
		lookupBucketLogic.setLookupRiskProfile(this);

		return lookupBucketLogic;
	}

	public LookupBucketLogic removeLookupBucketLogic(LookupBucketLogic lookupBucketLogic) {
		getLookupBucketLogics().remove(lookupBucketLogic);
		lookupBucketLogic.setLookupRiskProfile(null);

		return lookupBucketLogic;
	}

}