package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the masterCompany database table.
 * 
 */
@Entity
@Table(name="masterCompany")
@NamedQuery(name="MasterCompany.findAll", query="SELECT m FROM MasterCompany m")
public class MasterCompany implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int finCode;

	private String compName;

	private String flag;

	private int industryCode;

	private String industryName;

	private String isin;

	private String schemeName;

	private Integer scripCode;

	private String status;

	private String symbol;

	public MasterCompany() {
	}

	public int getFinCode() {
		return this.finCode;
	}

	public void setFinCode(int finCode) {
		this.finCode = finCode;
	}

	public String getCompName() {
		return this.compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getIndustryCode() {
		return this.industryCode;
	}

	public void setIndustryCode(int industryCode) {
		this.industryCode = industryCode;
	}

	public String getIndustryName() {
		return this.industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}

	public String getIsin() {
		return this.isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	

	public Integer getScripCode() {
		return scripCode;
	}

	public void setScripCode(Integer scripCode) {
		this.scripCode = scripCode;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}