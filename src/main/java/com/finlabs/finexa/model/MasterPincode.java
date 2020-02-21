package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterPincode database table.
 * 
 */
@Entity
@Table(name = "masterPincode")
@NamedQuery(name = "MasterPincode.findAll", query = "SELECT m FROM MasterPincode m")
public class MasterPincode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String district;

	private int pincode;

	// bi-directional many-to-one association to MasterState
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "stateID")
	private MasterState masterState;

	public MasterPincode() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public MasterState getMasterState() {
		return this.masterState;
	}

	public void setMasterState(MasterState masterState) {
		this.masterState = masterState;
	}

}