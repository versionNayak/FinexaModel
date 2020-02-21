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
 * The persistent class for the lookupGoalHorizonBucket database table.
 * 
 */
@Entity
@Table(name = "lookupGoalHorizonBucket")
@NamedQuery(name = "LookupGoalHorizonBucket.findAll", query = "SELECT l FROM LookupGoalHorizonBucket l")
public class LookupGoalHorizonBucket implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String bucketCode;

	private int LCMonthToGoal;

	private int UCMonthToGoal;

	// bi-directional many-to-one association to LookupBucketLogic
	@OneToMany(mappedBy = "lookupGoalHorizonBucket")
	private List<LookupBucketLogic> lookupBucketLogics;

	public LookupGoalHorizonBucket() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBucketCode() {
		return this.bucketCode;
	}

	public void setBucketCode(String bucketCode) {
		this.bucketCode = bucketCode;
	}

	public int getLCMonthToGoal() {
		return this.LCMonthToGoal;
	}

	public void setLCMonthToGoal(int LCMonthToGoal) {
		this.LCMonthToGoal = LCMonthToGoal;
	}

	public int getUCMonthToGoal() {
		return this.UCMonthToGoal;
	}

	public void setUCMonthToGoal(int UCMonthToGoal) {
		this.UCMonthToGoal = UCMonthToGoal;
	}

	public List<LookupBucketLogic> getLookupBucketLogics() {
		return this.lookupBucketLogics;
	}

	public void setLookupBucketLogics(List<LookupBucketLogic> lookupBucketLogics) {
		this.lookupBucketLogics = lookupBucketLogics;
	}

	public LookupBucketLogic addLookupBucketLogic(LookupBucketLogic lookupBucketLogic) {
		getLookupBucketLogics().add(lookupBucketLogic);
		lookupBucketLogic.setLookupGoalHorizonBucket(this);

		return lookupBucketLogic;
	}

	public LookupBucketLogic removeLookupBucketLogic(LookupBucketLogic lookupBucketLogic) {
		getLookupBucketLogics().remove(lookupBucketLogic);
		lookupBucketLogic.setLookupGoalHorizonBucket(null);

		return lookupBucketLogic;
	}

}