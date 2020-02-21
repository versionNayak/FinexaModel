package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the masterTablesUploadHistory database table.
 * 
 */
@Entity
@Table(name = "masterTablesUploadHistory")
@NamedQuery(name = "MasterTablesUploadHistory.findAll", query = "SELECT m FROM MasterTablesUploadHistory m")
public class MasterTablesUploadHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Temporal(TemporalType.DATE)
	private Date effectiveFromDate;

	private int recordsUploaded;

	private String status;

	private String tableName;

	@Temporal(TemporalType.DATE)
	private Date uploadDate;

	// bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uploadedBy")
	private AdvisorUser advisorUser;

	public MasterTablesUploadHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEffectiveFromDate() {
		return this.effectiveFromDate;
	}

	public void setEffectiveFromDate(Date effectiveFromDate) {
		this.effectiveFromDate = effectiveFromDate;
	}

	public int getRecordsUploaded() {
		return this.recordsUploaded;
	}

	public void setRecordsUploaded(int recordsUploaded) {
		this.recordsUploaded = recordsUploaded;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTableName() {
		return this.tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public Date getUploadDate() {
		return this.uploadDate;
	}

	public void setUploadDate(Date uploadDate) {
		this.uploadDate = uploadDate;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

}