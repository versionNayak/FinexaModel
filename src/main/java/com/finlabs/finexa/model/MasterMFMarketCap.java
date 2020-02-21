package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the masterMFMarketCap database table.
 * 
 */
@Entity
@Table(name = "masterMFMarketCap")
@NamedQuery(name = "MasterMFMarketCap.findAll", query = "SELECT m FROM MasterMFMarketCap m")
public class MasterMFMarketCap implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterMFMarketCapPK id;

	private int amfiCode;

	private String capRank;

	private String investmentStyle;

	private BigDecimal largecap;

	private BigDecimal midcap;

	private BigDecimal pb;

	private BigDecimal pe;

	private String schemeName;

	private BigDecimal smallcap;

	public MasterMFMarketCap() {
	}

	public MasterMFMarketCapPK getId() {
		return this.id;
	}

	public void setId(MasterMFMarketCapPK id) {
		this.id = id;
	}

	public int getAmfiCode() {
		return this.amfiCode;
	}

	public void setAmfiCode(int amfiCode) {
		this.amfiCode = amfiCode;
	}

	public String getCapRank() {
		return this.capRank;
	}

	public void setCapRank(String capRank) {
		this.capRank = capRank;
	}

	public String getInvestmentStyle() {
		return this.investmentStyle;
	}

	public void setInvestmentStyle(String investmentStyle) {
		this.investmentStyle = investmentStyle;
	}

	public BigDecimal getLargecap() {
		return this.largecap;
	}

	public void setLargecap(BigDecimal largecap) {
		this.largecap = largecap;
	}

	public BigDecimal getMidcap() {
		return this.midcap;
	}

	public void setMidcap(BigDecimal midcap) {
		this.midcap = midcap;
	}

	public BigDecimal getPb() {
		return this.pb;
	}

	public void setPb(BigDecimal pb) {
		this.pb = pb;
	}

	public BigDecimal getPe() {
		return this.pe;
	}

	public void setPe(BigDecimal pe) {
		this.pe = pe;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public BigDecimal getSmallcap() {
		return this.smallcap;
	}

	public void setSmallcap(BigDecimal smallcap) {
		this.smallcap = smallcap;
	}

}