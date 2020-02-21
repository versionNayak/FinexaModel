package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the masterState database table.
 * 
 */
@Entity
@Table(name = "masterState")
@NamedQuery(name = "MasterState.findAll", query = "SELECT m FROM MasterState m")
public class MasterState implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String state;

	private String stateCode;

	// bi-directional many-to-one association to MasterPincode
	@OneToMany(mappedBy = "masterState")
	private List<MasterPincode> masterPincodes;

	public MasterState() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateCode() {
		return this.stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public List<MasterPincode> getMasterPincodes() {
		return this.masterPincodes;
	}

	public void setMasterPincodes(List<MasterPincode> masterPincodes) {
		this.masterPincodes = masterPincodes;
	}

	public MasterPincode addMasterPincode(MasterPincode masterPincode) {
		getMasterPincodes().add(masterPincode);
		masterPincode.setMasterState(this);

		return masterPincode;
	}

	public MasterPincode removeMasterPincode(MasterPincode masterPincode) {
		getMasterPincodes().remove(masterPincode);
		masterPincode.setMasterState(null);

		return masterPincode;
	}

}