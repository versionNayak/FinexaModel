package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * The persistent class for the clientLumpsumInflow database table.
 * 
 */
@Entity
@Table(name = "clientLumpsumInflow")
@NamedQuery(name = "ClientLumpsumInflow.findAll", query = "SELECT c FROM ClientLumpsumInflow c")
public class ClientLumpsumInflow implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	private byte createdBy;
	
	private Timestamp createdOn;
	
	private BigDecimal expectedInflow;
	
	@Temporal(TemporalType.DATE)
	private Date expectedInflowDate;
	
	private String inflowDesc;
	
	private byte lastUpdateddBy;
	
	private Timestamp lastUpdatedOn;
	
	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	public ClientLumpsumInflow() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(byte createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public BigDecimal getExpectedInflow() {
		return this.expectedInflow;
	}

	public void setExpectedInflow(BigDecimal expectedInflow) {
		this.expectedInflow = expectedInflow;
	}

	public Date getExpectedInflowDate() {
		return this.expectedInflowDate;
	}

	public void setExpectedInflowDate(Date expectedInflowDate) {
		this.expectedInflowDate = expectedInflowDate;
	}

	public String getInflowDesc() {
		return this.inflowDesc;
	}

	public void setInflowDesc(String inflowDesc) {
		this.inflowDesc = inflowDesc;
	}

	public byte getLastUpdateddBy() {
		return this.lastUpdateddBy;
	}

	public void setLastUpdateddBy(byte lastUpdateddBy) {
		this.lastUpdateddBy = lastUpdateddBy;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

}