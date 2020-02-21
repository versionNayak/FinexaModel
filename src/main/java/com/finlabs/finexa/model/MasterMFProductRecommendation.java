package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the masterMFProductRecommendation database table.
 * 
 */
@Entity
@Table(name = "masterMFProductRecommendation")
@NamedQuery(name = "MasterMFProductRecommendation.findAll", query = "SELECT m FROM MasterMFProductRecommendation m")
public class MasterMFProductRecommendation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterMFProductRecommendationPK id;

	private Integer amfiCode;

	private String schemeName;

	@Temporal(TemporalType.DATE)
	private Date timeframeStartDate;

	@Temporal(TemporalType.DATE)
	//private java.util.Date timeframeEndDate;
	private Date timeframeEndDate;
	
	// bi-directional many-to-one association to LookupAssetClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetClassID")
	private LookupAssetClass lookupAssetClass;

	// bi-directional many-to-one association to LookupAssetSubClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subAssetClassID")
	private LookupAssetSubClass lookupAssetSubClass;

	public MasterMFProductRecommendation() {
	}

	public MasterMFProductRecommendationPK getId() {
		return this.id;
	}

	public void setId(MasterMFProductRecommendationPK id) {
		this.id = id;
	}

	public Integer getAmfiCode() {
		return this.amfiCode;
	}

	public void setAmfiCode(Integer amfiCode) {
		this.amfiCode = amfiCode;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public Date getTimeframeStartDate() {
		return this.timeframeStartDate;
	}

	public void setTimeframeStartDate(Date timeframeStartDate) {
		this.timeframeStartDate = timeframeStartDate;
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

	public java.util.Date getTimeframeEndDate() {
		return timeframeEndDate;
	}

	public void setTimeframeEndDate(java.util.Date timeframeEndDate) {
		this.timeframeEndDate = timeframeEndDate;
	}

}