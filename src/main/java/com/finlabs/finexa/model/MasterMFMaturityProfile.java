package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the masterMFMaturityProfile database table.
 * 
 */
@Entity
@Table(name="masterMFMaturityProfile")
@NamedQuery(name="MasterMFMaturityProfile.findAll", query="SELECT m FROM MasterMFMaturityProfile m")
public class MasterMFMaturityProfile implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private MasterMFMaturityProfilePK id;

	@Column(name="`0-1M`")
	private float __1m;

	@Column(name="`1-2Y`")
	private float __2y;

	@Column(name="`1-3M`")
	private float __3m;

	@Column(name="`10-15Y`")
	private float _0_15y;

	@Column(name="`15Y+`")
	private float _5y_;

	@Column(name="`2-3Y`")
	private float __3y;

	@Column(name="`3-5Y`")
	private float __5y;

	@Column(name="`3-6M`")
	private float __6m;

	@Column(name="`5-7Y`")
	private float __7y;

	@Column(name="`6-9M`")
	private float __9m;

	@Column(name="`7-10Y`")
	private float __10y;

	@Column(name="`9-12M`")
	private float __12m;

	private Integer amfiCode;

	@Column(name="Others")
	private float others;

	private int schemecode;

	@Column(name="Total")
	private int total;

	public MasterMFMaturityProfile() {
	}

	public MasterMFMaturityProfilePK getId() {
		return this.id;
	}

	public void setId(MasterMFMaturityProfilePK id) {
		this.id = id;
	}

	public float get__1m() {
		return this.__1m;
	}

	public void set__1m(float __1m) {
		this.__1m = __1m;
	}

	public float get__2y() {
		return this.__2y;
	}

	public void set__2y(float __2y) {
		this.__2y = __2y;
	}

	public float get__3m() {
		return this.__3m;
	}

	public void set__3m(float __3m) {
		this.__3m = __3m;
	}

	public float get_0_15y() {
		return this._0_15y;
	}

	public void set_0_15y(float _0_15y) {
		this._0_15y = _0_15y;
	}

	public float get_5y_() {
		return this._5y_;
	}

	public void set_5y_(float _5y_) {
		this._5y_ = _5y_;
	}

	public float get__3y() {
		return this.__3y;
	}

	public void set__3y(float __3y) {
		this.__3y = __3y;
	}

	public float get__5y() {
		return this.__5y;
	}

	public void set__5y(float __5y) {
		this.__5y = __5y;
	}

	public float get__6m() {
		return this.__6m;
	}

	public void set__6m(float __6m) {
		this.__6m = __6m;
	}

	public float get__7y() {
		return this.__7y;
	}

	public void set__7y(float __7y) {
		this.__7y = __7y;
	}

	public float get__9m() {
		return this.__9m;
	}

	public void set__9m(float __9m) {
		this.__9m = __9m;
	}

	public float get__10y() {
		return this.__10y;
	}

	public void set__10y(float __10y) {
		this.__10y = __10y;
	}

	public float get__12m() {
		return this.__12m;
	}

	public void set__12m(float __12m) {
		this.__12m = __12m;
	}

	public int getAmfiCode() {
		return this.amfiCode;
	}

	public void setAmfiCode(int amfiCode) {
		this.amfiCode = amfiCode;
	}

	public float getOthers() {
		return this.others;
	}

	public void setOthers(float others) {
		this.others = others;
	}

	public int getSchemecode() {
		return this.schemecode;
	}

	public void setSchemecode(int schemecode) {
		this.schemecode = schemecode;
	}

	public int getTotal() {
		return this.total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}