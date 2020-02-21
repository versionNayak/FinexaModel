package com.finlabs.finexa.model;

import java.io.Serializable;
import java.sql.Timestamp;
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
 * The persistent class for the clientMaster database table.
 * 
 */
@Entity
@Table(name = "clientTask")
@NamedQuery(name = "ClientTask.findAll", query = "SELECT c FROM ClientTask c")
public class ClientTask implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	private String name;
	
	@Temporal(TemporalType.DATE)
	private Date taskDate;
	
	private String time;

	private String taskDescription;
	
	private String comment;
	
	private String clientType;

	private Integer lastUpdatedBy;

	private Timestamp lastUpdatedOn;
	
	private Integer createdBy;

	private Timestamp createdOn;


	// bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID")
	private AdvisorUser advisorUser;


	public ClientTask() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getTaskDate() {
		return taskDate;
	}


	public void setTaskDate(Date taskDate) {
		this.taskDate = taskDate;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}

	public Integer getLastUpdatedBy() {
		return lastUpdatedBy;
	}


	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}


	public Timestamp getLastUpdatedOn() {
		return lastUpdatedOn;
	}


	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}


	public Integer getCreatedBy() {
		return createdBy;
	}


	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}


	public Timestamp getCreatedOn() {
		return createdOn;
	}


	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}


	public AdvisorUser getAdvisorUser() {
		return advisorUser;
	}


	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}


	public String getComment() {
		return comment;
	}


	public void setComment(String comment) {
		this.comment = comment;
	}


	public String getTaskDescription() {
		return taskDescription;
	}


	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}


	public String getClientType() {
		return clientType;
	}


	public void setClientType(String clientType) {
		this.clientType = clientType;
	}


	

}


