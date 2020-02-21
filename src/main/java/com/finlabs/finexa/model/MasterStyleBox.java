package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterStyleBox database table.
 * 
 */
@Entity
@Table(name = "masterStyleBox")
@NamedQuery(name = "MasterStyleBox.findAll", query = "SELECT m FROM MasterStyleBox m")
public class MasterStyleBox implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterStyleBoxPK id;

	private int amfiCode;

	private String capRank;

	private float giantPercentage;

	private String investmentStyle;

	private float largePercentage;

	private float midPercentage;

	private float pb;

	private float pe;

	private int schemeCode;

	private float smallPercentage;

	private float tinyPercentage;

	public MasterStyleBox() {
	}

	public MasterStyleBoxPK getId() {
		return this.id;
	}

	public void setId(MasterStyleBoxPK id) {
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

	public float getGiantPercentage() {
		return this.giantPercentage;
	}

	public void setGiantPercentage(float giantPercentage) {
		this.giantPercentage = giantPercentage;
	}

	public String getInvestmentStyle() {
		return this.investmentStyle;
	}

	public void setInvestmentStyle(String investmentStyle) {
		this.investmentStyle = investmentStyle;
	}

	public float getLargePercentage() {
		return this.largePercentage;
	}

	public void setLargePercentage(float largePercentage) {
		this.largePercentage = largePercentage;
	}

	public float getMidPercentage() {
		return this.midPercentage;
	}

	public void setMidPercentage(float midPercentage) {
		this.midPercentage = midPercentage;
	}

	public float getPb() {
		return this.pb;
	}

	public void setPb(float pb) {
		this.pb = pb;
	}

	public float getPe() {
		return this.pe;
	}

	public void setPe(float pe) {
		this.pe = pe;
	}

	public int getSchemeCode() {
		return this.schemeCode;
	}

	public void setSchemeCode(int schemeCode) {
		this.schemeCode = schemeCode;
	}

	public float getSmallPercentage() {
		return this.smallPercentage;
	}

	public void setSmallPercentage(float smallPercentage) {
		this.smallPercentage = smallPercentage;
	}

	public float getTinyPercentage() {
		return this.tinyPercentage;
	}

	public void setTinyPercentage(float tinyPercentage) {
		this.tinyPercentage = tinyPercentage;
	}

}