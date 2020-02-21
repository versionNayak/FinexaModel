package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;

/**
 * The persistent class for the master52WeekHighLowMF database table.
 * 
 */
@Entity
@Table(name = "master52WeekHighLowMF")
@NamedQuery(name = "Master52WeekHighLowMF.findAll", query = "SELECT m FROM Master52WeekHighLowMF m")
/*@IdClass(value = MasterMutualFundETF.class)*/
public class Master52WeekHighLowMF implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String isin;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isin", nullable = false, insertable = false, updatable = false)
	private MasterMutualFundETF masterMutualFundEtf;

	private String amfiCode;

	/*
	 * @Column(length=5) private String action;
	 */
	@Column(precision = 10, scale = 4)
	private BigDecimal nav52WeekHigh;

	@Column(precision = 10, scale = 4)
	private BigDecimal nav52WeekLow;

	@Column(length = 100)
	private String schemeName;

	public Master52WeekHighLowMF() {
	}

	public String getAmfiCode() {
		return this.amfiCode;
	}

	public void setAmfiCode(String amfiCode) {
		this.amfiCode = amfiCode;
	}

	public BigDecimal getNav52WeekHigh() {
		return this.nav52WeekHigh;
	}

	public void setNav52WeekHigh(BigDecimal nav52WeekHigh) {
		this.nav52WeekHigh = nav52WeekHigh;
	}

	public BigDecimal getNav52WeekLow() {
		return this.nav52WeekLow;
	}

	public void setNav52WeekLow(BigDecimal nav52WeekLow) {
		this.nav52WeekLow = nav52WeekLow;
	}

	public String getSchemeName() {
		return this.schemeName;
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

	public String getIsin() {
		return isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

}