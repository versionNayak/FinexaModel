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
 * The persistent class for the advisorUserRoleMapping database table.
 * 
 */
@Entity
@Table(name = "advisorUserRoleMapping")
@NamedQuery(name = "AdvisorUserRoleMapping.findAll", query = "SELECT a FROM AdvisorUserRoleMapping a")
public class AdvisorUserRoleMapping implements Serializable {
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
	private AdvisorUser advisorUser;

	// bi-directional many-to-one association to AdvisorRole
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roleID")
	private AdvisorRole advisorRole;

	public AdvisorUserRoleMapping() {
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

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public AdvisorRole getAdvisorRole() {
		return this.advisorRole;
	}

	public void setAdvisorRole(AdvisorRole advisorRole) {
		this.advisorRole = advisorRole;
	}

}