package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterWealthRatioComment database table.
 * 
 */
@Entity
@Table(name = "masterWealthRatioComment")
@NamedQuery(name = "MasterWealthRatioComment.findAll", query = "SELECT m FROM MasterWealthRatioComment m")
public class MasterWealthRatioComment implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Lob
	private String commentMaster;

	private BigDecimal fromRange;

	private BigDecimal toRange;

	// bi-directional many-to-one association to MasterWealthRatio
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ratioID")
	private MasterWealthRatio masterWealthRatio;

	// bi-directional many-to-one association to MasterWealthRatioLogicRationale
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "logicRationaleID")
	private MasterWealthRatioLogicRationale masterWealthRatioLogicRationale;

	public MasterWealthRatioComment() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCommentMaster() {
		return this.commentMaster;
	}

	public void setCommentMaster(String commentMaster) {
		this.commentMaster = commentMaster;
	}

	public BigDecimal getFromRange() {
		return this.fromRange;
	}

	public void setFromRange(BigDecimal fromRange) {
		this.fromRange = fromRange;
	}

	public BigDecimal getToRange() {
		return this.toRange;
	}

	public void setToRange(BigDecimal toRange) {
		this.toRange = toRange;
	}

	public MasterWealthRatio getMasterWealthRatio() {
		return this.masterWealthRatio;
	}

	public void setMasterWealthRatio(MasterWealthRatio masterWealthRatio) {
		this.masterWealthRatio = masterWealthRatio;
	}

	public MasterWealthRatioLogicRationale getMasterWealthRatioLogicRationale() {
		return this.masterWealthRatioLogicRationale;
	}

	public void setMasterWealthRatioLogicRationale(MasterWealthRatioLogicRationale masterWealthRatioLogicRationale) {
		this.masterWealthRatioLogicRationale = masterWealthRatioLogicRationale;
	}

}