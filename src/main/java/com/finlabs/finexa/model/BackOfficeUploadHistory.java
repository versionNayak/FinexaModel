package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the backOfficeUploadHistory database table.
 * 
 */
@Entity
@Table(name="backOfficeUploadHistory")
@NamedQuery(name="BackOfficeUploadHistory.findAll", query="SELECT b FROM BackOfficeUploadHistory b")
public class BackOfficeUploadHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String autoClientCreationStatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endTime;

	private String fileName;

	private String reasonOfRejection;

	private int rejectedRecords;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startTime;

	private String status;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorId")
	private AdvisorUser advisorUser;

	//bi-directional many-to-one association to LookupRTABO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rtaId")
	private LookupRTABO lookupRtabo;

	//bi-directional many-to-one association to LookupRTAFileName
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fileType")
	private LookupRTAFileName lookupRtafileName;

	public BackOfficeUploadHistory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutoClientCreationStatus() {
		return this.autoClientCreationStatus;
	}

	public void setAutoClientCreationStatus(String autoClientCreationStatus) {
		this.autoClientCreationStatus = autoClientCreationStatus;
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

	public LookupRTABO getLookupRtabo() {
		return this.lookupRtabo;
	}

	public void setLookupRtabo(LookupRTABO lookupRtabo) {
		this.lookupRtabo = lookupRtabo;
	}

	public LookupRTAFileName getLookupRtafileName() {
		return this.lookupRtafileName;
	}

	public void setLookupRtafileName(LookupRTAFileName lookupRtafileName) {
		this.lookupRtafileName = lookupRtafileName;
	}

}