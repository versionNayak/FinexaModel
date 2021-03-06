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
 * The persistent class for the masterWealthRatioLogicRationale database table.
 * 
 */
@Entity
@Table(name = "masterWealthRatioLogicRationale")
@NamedQuery(name = "MasterWealthRatioLogicRationale.findAll", query = "SELECT m FROM MasterWealthRatioLogicRationale m")
public class MasterWealthRatioLogicRationale implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String logicRationale;

	// bi-directional many-to-one association to MasterWealthRatioComment
	@OneToMany(mappedBy = "masterWealthRatioLogicRationale")
	private List<MasterWealthRatioComment> masterWealthRatioComments;

	public MasterWealthRatioLogicRationale() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getLogicRationale() {
		return this.logicRationale;
	}

	public void setLogicRationale(String logicRationale) {
		this.logicRationale = logicRationale;
	}

	public List<MasterWealthRatioComment> getMasterWealthRatioComments() {
		return this.masterWealthRatioComments;
	}

	public void setMasterWealthRatioComments(List<MasterWealthRatioComment> masterWealthRatioComments) {
		this.masterWealthRatioComments = masterWealthRatioComments;
	}

	public MasterWealthRatioComment addMasterWealthRatioComment(MasterWealthRatioComment masterWealthRatioComment) {
		getMasterWealthRatioComments().add(masterWealthRatioComment);
		masterWealthRatioComment.setMasterWealthRatioLogicRationale(this);

		return masterWealthRatioComment;
	}

	public MasterWealthRatioComment removeMasterWealthRatioComment(MasterWealthRatioComment masterWealthRatioComment) {
		getMasterWealthRatioComments().remove(masterWealthRatioComment);
		masterWealthRatioComment.setMasterWealthRatioLogicRationale(null);

		return masterWealthRatioComment;
	}

}