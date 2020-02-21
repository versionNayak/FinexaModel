package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the schemeIsinMasterBO database table.
 * 
 */
@Entity
@Table(name="schemeIsinMasterBO")
@NamedQuery(name="SchemeIsinMasterBO.findAll", query="SELECT s FROM SchemeIsinMasterBO s")
public class SchemeIsinMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String isin;

	private int amcCode;

	@Lob
	private String AMCSchemecode;

	@Lob
	@Column(name="cams_code")
	private String camsCode;

	@Lob
	private String flag;

	private int id;

	@Lob
	private String longSchemeDescrip;

	@Lob
	private String nseSymbol;

	@Lob
	private String RTASchemecode;

	private int schemeCode;

	@Lob
	private String series;

	@Lob
	private String shortSchemeDescrip;

	@Lob
	private String status;

	public SchemeIsinMasterBO() {
	}

	public String getIsin() {
		return this.isin;
	}

	public void setIsin(String isin) {
		this.isin = isin;
	}

	public int getAmcCode() {
		return this.amcCode;
	}

	public void setAmcCode(int amcCode) {
		this.amcCode = amcCode;
	}

	public String getAMCSchemecode() {
		return this.AMCSchemecode;
	}

	public void setAMCSchemecode(String AMCSchemecode) {
		this.AMCSchemecode = AMCSchemecode;
	}

	public String getCamsCode() {
		return this.camsCode;
	}

	public void setCamsCode(String camsCode) {
		this.camsCode = camsCode;
	}

	public String getFlag() {
		return this.flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLongSchemeDescrip() {
		return this.longSchemeDescrip;
	}

	public void setLongSchemeDescrip(String longSchemeDescrip) {
		this.longSchemeDescrip = longSchemeDescrip;
	}

	public String getNseSymbol() {
		return this.nseSymbol;
	}

	public void setNseSymbol(String nseSymbol) {
		this.nseSymbol = nseSymbol;
	}

	public String getRTASchemecode() {
		return this.RTASchemecode;
	}

	public void setRTASchemecode(String RTASchemecode) {
		this.RTASchemecode = RTASchemecode;
	}

	public int getSchemeCode() {
		return this.schemeCode;
	}

	public void setSchemeCode(int schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getSeries() {
		return this.series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getShortSchemeDescrip() {
		return this.shortSchemeDescrip;
	}

	public void setShortSchemeDescrip(String shortSchemeDescrip) {
		this.shortSchemeDescrip = shortSchemeDescrip;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}