package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the masterMFAssetAllocation database table.
 * 
 */
@Entity
@Table(name = "masterMFAssetAllocation")
@NamedQuery(name = "MasterMFAssetAllocation.findAll", query = "SELECT m FROM MasterMFAssetAllocation m")
public class MasterMFAssetAllocation implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterMFAssetAllocationPK id;

	private Integer amfiCode;

	private Float aum;

	private Float debtRatio;

	private Float equityRatio;

	private Float expenseRatio;

	private Float othersRatio;

	private Float portfolioTurnOver;

	private String schemeName;

	// bi-directional many-to-one association to MasterMutualFundETF
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isin")
	private MasterMutualFundETF masterMutualFundEtf;

	public MasterMFAssetAllocation() {
	}

	public MasterMFAssetAllocationPK getId() {
		return this.id;
	}

	public void setId(MasterMFAssetAllocationPK id) {
		this.id = id;
	}

	public Integer getAmfiCode() {
		return amfiCode;
	}

	public void setAmfiCode(Integer amfiCode) {
		this.amfiCode = amfiCode;
	}

	public Float getAum() {
		return aum;
	}

	public void setAum(Float aum) {
		this.aum = aum;
	}

	public Float getDebtRatio() {
		return debtRatio;
	}

	public void setDebtRatio(Float debtRatio) {
		this.debtRatio = debtRatio;
	}

	public Float getEquityRatio() {
		return equityRatio;
	}

	public void setEquityRatio(Float equityRatio) {
		this.equityRatio = equityRatio;
	}

	public Float getExpenseRatio() {
		return expenseRatio;
	}

	public void setExpenseRatio(Float expenseRatio) {
		this.expenseRatio = expenseRatio;
	}

	public Float getOthersRatio() {
		return othersRatio;
	}

	public void setOthersRatio(Float othersRatio) {
		this.othersRatio = othersRatio;
	}

	public Float getPortfolioTurnOver() {
		return portfolioTurnOver;
	}

	public void setPortfolioTurnOver(Float portfolioTurnOver) {
		this.portfolioTurnOver = portfolioTurnOver;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public MasterMutualFundETF getMasterMutualFundEtf() {
		return this.masterMutualFundEtf;
	}

	public void setMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		this.masterMutualFundEtf = masterMutualFundEtf;
	}

}