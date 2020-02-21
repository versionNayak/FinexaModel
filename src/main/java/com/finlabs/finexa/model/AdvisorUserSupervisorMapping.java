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
 * The persistent class for the advisorUserSupervisorMapping database table.
 * 
 */
@Entity
@Table(name = "advisorUserSupervisorMapping")
@NamedQuery(name = "AdvisorUserSupervisorMapping.findAll", query = "SELECT a FROM AdvisorUserSupervisorMapping a")
public class AdvisorUserSupervisorMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Temporal(TemporalType.DATE)
	private Date effectiveFromDate;

	// bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID")
	private AdvisorUser advisorUser1;

	// bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "supervisorID")
	private AdvisorUser advisorUser2;

	public AdvisorUserSupervisorMapping() {
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

	public AdvisorUser getAdvisorUser1() {
		return this.advisorUser1;
	}

	public void setAdvisorUser1(AdvisorUser advisorUser1) {
		this.advisorUser1 = advisorUser1;
	}

	public AdvisorUser getAdvisorUser2() {
		return this.advisorUser2;
	}

	public void setAdvisorUser2(AdvisorUser advisorUser2) {
		this.advisorUser2 = advisorUser2;
	}

}