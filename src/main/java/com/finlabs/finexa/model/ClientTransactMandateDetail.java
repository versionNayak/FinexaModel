package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigInteger;

import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the clientTransactMandateDetails database table.
 * 
 */
@Entity
@Table(name="clientTransactMandateDetails")
@NamedQuery(name="ClientTransactMandateDetail.findAll", query="SELECT c FROM ClientTransactMandateDetail c")
public class ClientTransactMandateDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private BigInteger id;

	private String bseResponse;

	private String bseResponseCode;

	private String clientCode;

	private String createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	private String lastUpdatedBy;

	private Timestamp lastUpdatedOn;

	@Lob
	private byte[] nachMandateForm;

	private String saveMode;
	
	private String mandateId;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorId")
	private AdvisorUser advisorUser;

	//bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientId")
	private ClientMaster clientMaster;


	public ClientTransactMandateDetail() {
	}

	public String getBseResponse() {
		return this.bseResponse;
	}

	public void setBseResponse(String bseResponse) {
		this.bseResponse = bseResponse;
	}

	public String getBseResponseCode() {
		return this.bseResponseCode;
	}

	public void setBseResponseCode(String bseResponseCode) {
		this.bseResponseCode = bseResponseCode;
	}

	public String getClientCode() {
		return this.clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public byte[] getNachMandateForm() {
		return this.nachMandateForm;
	}

	public void setNachMandateForm(byte[] nachMandateForm) {
		this.nachMandateForm = nachMandateForm;
	}

	public String getSaveMode() {
		return this.saveMode;
	}

	public void setSaveMode(String saveMode) {
		this.saveMode = saveMode;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getMandateId() {
		return mandateId;
	}

	public void setMandateId(String mandateId) {
		this.mandateId = mandateId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}