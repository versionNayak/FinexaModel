package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the masterMFDailyNAV database table.
 * 
 */

@Entity
@Table(name = "masterMFDailyNAV")
@NamedQuery(name = "MasterMFDailyNAV.findAll", query = "SELECT m FROM MasterMFDailyNAV m")
public class MasterMFDailyNAV implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterMFDailyNAVPK id;

	private Float adjNav;

	private Integer amfiCode;

	private Float nav;

	private Integer schemeCode;

	private String schemeName;

	public MasterMFDailyNAV() {
	}

	public MasterMFDailyNAVPK getId() {
		return id;
	}

	public void setId(MasterMFDailyNAVPK id) {
		this.id = id;
	}

	public Float getAdjNav() {
		return adjNav;
	}

	public void setAdjNav(Float adjNav) {
		this.adjNav = adjNav;
	}

	public Integer getAmfiCode() {
		return amfiCode;
	}

	public void setAmfiCode(Integer amfiCode) {
		this.amfiCode = amfiCode;
	}

	public Float getNav() {
		return nav;
	}

	public void setNav(Float nav) {
		this.nav = nav;
	}

	public Integer getSchemeCode() {
		return schemeCode;
	}

	public void setSchemeCode(Integer schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getSchemeName() {
		return schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

}