package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the masterNAVHistory database table.
 * 
 */
@Entity
@Table(name="masterNAVHistory")
@NamedQuery(name="MasterNAVHistory.findAll", query="SELECT m FROM MasterNAVHistory m")
public class MasterNAVHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String isin;

	private String assetClass;

	private String camsCode;

	private BigDecimal dayFiveNAV;

	private BigDecimal dayFourNAV;

	private BigDecimal dayOneNAV;

	private BigDecimal daySevenNAV;

	private BigDecimal daySixNAV;

	private BigDecimal dayThreeNAV;

	private BigDecimal dayTwoNAV;

	private String schemeName;

	public MasterNAVHistory() {
	}

	public String getIsin() {
		return this.isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getAssetClass() {
		return this.assetClass;
	}

	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}

	public String getCamsCode() {
		return this.camsCode;
	}

	public void setCamsCode(String camsCode) {
		this.camsCode = camsCode;
	}

	public BigDecimal getDayFiveNAV() {
		return this.dayFiveNAV;
	}

	public void setDayFiveNAV(BigDecimal dayFiveNAV) {
		this.dayFiveNAV = dayFiveNAV;
	}

	public BigDecimal getDayFourNAV() {
		return this.dayFourNAV;
	}

	public void setDayFourNAV(BigDecimal dayFourNAV) {
		this.dayFourNAV = dayFourNAV;
	}

	public BigDecimal getDayOneNAV() {
		return this.dayOneNAV;
	}

	public void setDayOneNAV(BigDecimal dayOneNAV) {
		this.dayOneNAV = dayOneNAV;
	}

	public BigDecimal getDaySevenNAV() {
		return this.daySevenNAV;
	}

	public void setDaySevenNAV(BigDecimal daySevenNAV) {
		this.daySevenNAV = daySevenNAV;
	}

	public BigDecimal getDaySixNAV() {
		return this.daySixNAV;
	}

	public void setDaySixNAV(BigDecimal daySixNAV) {
		this.daySixNAV = daySixNAV;
	}

	public BigDecimal getDayThreeNAV() {
		return this.dayThreeNAV;
	}

	public void setDayThreeNAV(BigDecimal dayThreeNAV) {
		this.dayThreeNAV = dayThreeNAV;
	}

	public BigDecimal getDayTwoNAV() {
		return this.dayTwoNAV;
	}

	public void setDayTwoNAV(BigDecimal dayTwoNAV) {
		this.dayTwoNAV = dayTwoNAV;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

}