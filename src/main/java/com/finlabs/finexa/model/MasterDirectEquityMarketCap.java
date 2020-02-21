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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * The persistent class for the masterDirectEquityMarketCap database table.
 * 
 */
@Entity
@Table(name = "masterDirectEquityMarketCap")
@NamedQuery(name = "MasterDirectEquityMarketCap.findAll", query = "SELECT m FROM MasterDirectEquityMarketCap m")
public class MasterDirectEquityMarketCap implements Serializable {
	private static final long serialVersionUID = 1L;

	
	//bi-directional one-to-one association to MasterDirectEquity
	@Id
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ISIN", nullable=false, insertable=false, updatable=false)
	private MasterDirectEquity masterDirectEquity;

	private Float dailyTradedVolume;

	private Float divYield;

	private Float lastClosingPrice;

	private Float marketcap;

	@Column(name = "`P/B`")
	private Float p_b;

	@Column(name = "`P/E`")
	private Float p_e;

	private Float price52WeekHigh;

	private Float price52WeekLow;

	private String stockName;


	// bi-directional many-to-one association to MasterEquityMarketCapClassification
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classificationID")
	private MasterEquityMarketCapClassification masterEquityMarketCapClassification;

	public MasterDirectEquityMarketCap() {
	}


	public Float getDailyTradedVolume() {
		return this.dailyTradedVolume;
	}

	public void setDailyTradedVolume(Float dailyTradedVolume) {
		this.dailyTradedVolume = dailyTradedVolume;
	}

	public Float getDivYield() {
		return this.divYield;
	}

	public void setDivYield(Float divYield) {
		this.divYield = divYield;
	}

	public Float getLastClosingPrice() {
		return this.lastClosingPrice;
	}

	public void setLastClosingPrice(Float lastClosingPrice) {
		this.lastClosingPrice = lastClosingPrice;
	}

	public Float getMarketcap() {
		return this.marketcap;
	}

	public void setMarketcap(Float marketcap) {
		this.marketcap = marketcap;
	}

	public Float getP_b() {
		return this.p_b;
	}

	public void setP_b(Float p_b) {
		this.p_b = p_b;
	}

	public Float getP_e() {
		return this.p_e;
	}

	public void setP_e(Float p_e) {
		this.p_e = p_e;
	}

	public Float getPrice52WeekHigh() {
		return this.price52WeekHigh;
	}

	public void setPrice52WeekHigh(Float price52WeekHigh) {
		this.price52WeekHigh = price52WeekHigh;
	}

	public Float getPrice52WeekLow() {
		return this.price52WeekLow;
	}

	public void setPrice52WeekLow(Float price52WeekLow) {
		this.price52WeekLow = price52WeekLow;
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	
	public MasterDirectEquity getMasterDirectEquity() {
		return this.masterDirectEquity;
	}

	public void setMasterDirectEquity(MasterDirectEquity masterDirectEquity) {
		this.masterDirectEquity = masterDirectEquity;
	}

	public MasterEquityMarketCapClassification getMasterEquityMarketCapClassification() {
		return this.masterEquityMarketCapClassification;
	}

	public void setMasterEquityMarketCapClassification(
			MasterEquityMarketCapClassification masterEquityMarketCapClassification) {
		this.masterEquityMarketCapClassification = masterEquityMarketCapClassification;
	}

}