package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

/**
 * The persistent class for the accordschemedetails database table.
 * 
 */
@Entity
@Table(name = "accordSchemeDetails")
@NamedQuery(name = "AccordSchemeDetails.findAll", query = "SELECT a FROM AccordSchemeDetails a")
public class AccordSchemeDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int schemeCode;

	@Column(name = "amfi_code")
	private int amfiCode;

	private String isin_code;

	@Column(name = "primary_fd_code")
	private int primaryFdCode;

	@Column(name = "s_name")
	private String sName;

	public AccordSchemeDetails() {
	}

	public int getSchemeCode() {
		return this.schemeCode;
	}

	public void setSchemeCode(int schemeCode) {
		this.schemeCode = schemeCode;
	}

	public int getAmfiCode() {
		return this.amfiCode;
	}

	public void setAmfiCode(int amfiCode) {
		this.amfiCode = amfiCode;
	}

	public String getIsin_code() {
		return this.isin_code;
	}

	public void setIsin_code(String isin_code) {
		this.isin_code = isin_code;
	}

	public int getPrimaryFdCode() {
		return this.primaryFdCode;
	}

	public void setPrimaryFdCode(int primaryFdCode) {
		this.primaryFdCode = primaryFdCode;
	}

	public String getSName() {
		return this.sName;
	}

	public void setSName(String sName) {
		this.sName = sName;
	}

	@Override
	public String toString() {
		return "AccordSchemeDetail [schemeCode=" + schemeCode + ", amfiCode=" + amfiCode + ", isin_code=" + isin_code
				+ ", primaryFdCode=" + primaryFdCode + ", sName=" + sName + "]";
	}

}