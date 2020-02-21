package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the accordSchemeIsinMaster database table.
 * 
 */
@Entity
@Table(name="accordSchemeIsinMaster")
@NamedQuery(name="AccordSchemeIsinMaster.findAll", query="SELECT a FROM AccordSchemeIsinMaster a")
public class AccordSchemeIsinMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AccordSchemeIsinMasterPK id;

	@Column(name="ID")
	private int ID;
	
	private int amcCode;
	
	private String AMCSchemeCode;

	private String longSchemeDescription;

	private String nseSymbol;

	@Column(name="RTASchemeCode")
	private String rTASchemeCode;

	private String series;

	private String shortSchemeDescription;

	private String status;

	public AccordSchemeIsinMaster() {
	}


	public int getAmcCode() {
		return this.amcCode;
	}

	public void setAmcCode(int amcCode) {
		this.amcCode = amcCode;
	}

	public String getAMCSchemeCode() {
		return this.AMCSchemeCode;
	}

	public void setAMCSchemeCode(String AMCSchemeCode) {
		this.AMCSchemeCode = AMCSchemeCode;
	}

	
	
	public AccordSchemeIsinMasterPK getId() {
		return id;
	}


	public void setId(AccordSchemeIsinMasterPK id) {
		this.id = id;
	}


	public int getID() {
		return ID;
	}


	public void setID(int iD) {
		ID = iD;
	}


	public String getLongSchemeDescription() {
		return this.longSchemeDescription;
	}

	public void setLongSchemeDescription(String longSchemeDescription) {
		this.longSchemeDescription = longSchemeDescription;
	}

	public String getNseSymbol() {
		return this.nseSymbol;
	}

	public void setNseSymbol(String nseSymbol) {
		this.nseSymbol = nseSymbol;
	}

	public String getRTASchemeCode() {
		return this.rTASchemeCode;
	}

	public void setRTASchemeCode(String rTASchemeCode) {
		this.rTASchemeCode = rTASchemeCode;
	}

	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getShortSchemeDescription() {
		return this.shortSchemeDescription;
	}

	public void setShortSchemeDescription(String shortSchemeDescription) {
		this.shortSchemeDescription = shortSchemeDescription;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}