package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the advisorUserBulkUploadHistory database table.
 * 
 */
@Entity
@Table(name="advisorUserBulkUploadHistory")
@NamedQuery(name="AdvisorUserBulkUploadHistory.findAll", query="SELECT a FROM AdvisorUserBulkUploadHistory a")
public class AdvisorUserBulkUploadHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;

	private String fileName;

	private String reasonOfRejection;

	private int rejectedRecords;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;

	private String status;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="advisorId")
	private AdvisorUser advisorUser;

	public AdvisorUserBulkUploadHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getReasonOfRejection() {
		return this.reasonOfRejection;
	}

	public void setReasonOfRejection(String reasonOfRejection) {
		this.reasonOfRejection = reasonOfRejection;
	}

	public int getRejectedRecords() {
		return this.rejectedRecords;
	}

	public void setRejectedRecords(int rejectedRecords) {
		this.rejectedRecords = rejectedRecords;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

}