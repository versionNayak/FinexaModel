package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterEquityDailyPrice database table.
 * 
 */
@Entity
@Table(name = "masterEquityDailyPrice")
@NamedQuery(name = "MasterEquityDailyPrice.findAll", query = "SELECT m FROM MasterEquityDailyPrice m")
public class MasterEquityDailyPrice implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterEquityDailyPricePK id;

	private Double closingPrice;

	private String stockName;

	public MasterEquityDailyPrice() {
	}

	public MasterEquityDailyPricePK getId() {
		return this.id;
	}

	public void setId(MasterEquityDailyPricePK id) {
		this.id = id;
	}

	public Double getClosingPrice() {
		return this.closingPrice;
	}

	public void setClosingPrice(Double closingPrice) {
		this.closingPrice = closingPrice;
	}

	public String getStockName() {
		return this.stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

}