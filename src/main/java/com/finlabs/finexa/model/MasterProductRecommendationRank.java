package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the masterProductRecommendationRank database table.
 * 
 */
@Entity
@Table(name = "masterProductRecommendationRank")
@NamedQuery(name = "MasterProductRecommendationRank.findAll", query = "SELECT m FROM MasterProductRecommendationRank m")
public class MasterProductRecommendationRank implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterProductRecommendationRankPK id;

	private int amfiCode;

	private String category;

	private String rank;

	private String schemeName;

	@Temporal(TemporalType.DATE)
	private Date timeframeStartDate;

	public MasterProductRecommendationRank() {
	}

	public MasterProductRecommendationRankPK getId() {
		return this.id;
	}

	public void setId(MasterProductRecommendationRankPK id) {
		this.id = id;
	}

	public int getAmfiCode() {
		return this.amfiCode;
	}

	public void setAmfiCode(int amfiCode) {
		this.amfiCode = amfiCode;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
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

}