package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterMFHolding database table.
 * 
 */
@Entity
@Table(name = "masterMFHolding")
@NamedQuery(name = "MasterMFHolding.findAll", query = "SELECT m FROM MasterMFHolding m")
public class MasterMFHolding implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterMFHoldingPK id;

	private BigDecimal assetPercentage;

	private BigDecimal assetValue;

	private BigDecimal couponRate;

	private String maturity;

	private BigInteger numOfShares;
	
	// bi-directional many-to-one association to MasterMFRating
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "creditRatingCode")
	private MasterMFRating masterMfrating;

	public MasterMFHolding() {
	}

	public MasterMFHoldingPK getId() {
		return this.id;
	}

	public void setId(MasterMFHoldingPK id) {
		this.id = id;
	}

	public BigDecimal getAssetPercentage() {
		return this.assetPercentage;
	}

	public void setAssetPercentage(BigDecimal assetPercentage) {
		this.assetPercentage = assetPercentage;
	}

	public BigDecimal getAssetValue() {
		return this.assetValue;
	}

	public void setAssetValue(BigDecimal assetValue) {
		this.assetValue = assetValue;
	}

	public BigDecimal getCouponRate() {
		return this.couponRate;
	}

	public void setCouponRate(BigDecimal couponRate) {
		this.couponRate = couponRate;
	}

	public String getMaturity() {
		return this.maturity;
	}

	public void setMaturity(String maturity) {
		this.maturity = maturity;
	}

	public BigInteger getNumOfShares() {
		return this.numOfShares;
	}

	public void setNumOfShares(BigInteger numOfShares) {
		this.numOfShares = numOfShares;
	}

	public MasterMFRating getMasterMfrating() {
		return masterMfrating;
	}

	public void setMasterMfrating(MasterMFRating masterMfrating) {
		this.masterMfrating = masterMfrating;
	}

}