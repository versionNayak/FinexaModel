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
 * The persistent class for the masterWealthRatios database table.
 * 
 */
@Entity
@Table(name = "masterWealthRatios")
@NamedQuery(name = "MasterWealthRatio.findAll", query = "SELECT m FROM MasterWealthRatio m")
public class MasterWealthRatio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String ratio;

	// bi-directional many-to-one association to MasterWealthRatioComment
	@OneToMany(mappedBy = "masterWealthRatio")
	private List<MasterWealthRatioComment> masterWealthRatioComments;

	public MasterWealthRatio() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getRatio() {
		return this.ratio;
	}

	public void setRatio(String ratio) {
		this.ratio = ratio;
	}

	public List<MasterWealthRatioComment> getMasterWealthRatioComments() {
		return this.masterWealthRatioComments;
	}

	public void setMasterWealthRatioComments(List<MasterWealthRatioComment> masterWealthRatioComments) {
		this.masterWealthRatioComments = masterWealthRatioComments;
	}

	public MasterWealthRatioComment addMasterWealthRatioComment(MasterWealthRatioComment masterWealthRatioComment) {
		getMasterWealthRatioComments().add(masterWealthRatioComment);
		masterWealthRatioComment.setMasterWealthRatio(this);

		return masterWealthRatioComment;
	}

	public MasterWealthRatioComment removeMasterWealthRatioComment(MasterWealthRatioComment masterWealthRatioComment) {
		getMasterWealthRatioComments().remove(masterWealthRatioComment);
		masterWealthRatioComment.setMasterWealthRatio(null);

		return masterWealthRatioComment;
	}

}