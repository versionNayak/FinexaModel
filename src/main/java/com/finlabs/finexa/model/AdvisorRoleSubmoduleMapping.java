package com.finlabs.finexa.model;

import java.io.Serializable;

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

/**
 * The persistent class for the advisorRoleSubmoduleMapping database table.
 * 
 */
@Entity
@Table(name = "advisorRoleSubmoduleMapping")
@NamedQuery(name = "AdvisorRoleSubmoduleMapping.findAll", query = "SELECT a FROM AdvisorRoleSubmoduleMapping a")
public class AdvisorRoleSubmoduleMapping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String addAllowedFlag;

	private String deleteAllowedFlag;

	private String editAllowedFlag;

	private String viewAllowedFlag;

	// bi-directional many-to-one association to FinexaBusinessSubmodule
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "submoduleID")
	private FinexaBusinessSubmodule finexaBusinessSubmodule;

	// bi-directional many-to-one association to AdvisorRole
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roleID")
	private AdvisorRole advisorRole;

	public AdvisorRoleSubmoduleMapping() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddAllowedFlag() {
		return this.addAllowedFlag;
	}

	public void setAddAllowedFlag(String addAllowedFlag) {
		this.addAllowedFlag = addAllowedFlag;
	}

	public String getDeleteAllowedFlag() {
		return this.deleteAllowedFlag;
	}

	public void setDeleteAllowedFlag(String deleteAllowedFlag) {
		this.deleteAllowedFlag = deleteAllowedFlag;
	}

	public String getEditAllowedFlag() {
		return this.editAllowedFlag;
	}

	public void setEditAllowedFlag(String editAllowedFlag) {
		this.editAllowedFlag = editAllowedFlag;
	}

	public String getViewAllowedFlag() {
		return this.viewAllowedFlag;
	}

	public void setViewAllowedFlag(String viewAllowedFlag) {
		this.viewAllowedFlag = viewAllowedFlag;
	}

	public FinexaBusinessSubmodule getFinexaBusinessSubmodule() {
		return this.finexaBusinessSubmodule;
	}

	public void setFinexaBusinessSubmodule(FinexaBusinessSubmodule finexaBusinessSubmodule) {
		this.finexaBusinessSubmodule = finexaBusinessSubmodule;
	}

	public AdvisorRole getAdvisorRole() {
		return this.advisorRole;
	}

	public void setAdvisorRole(AdvisorRole advisorRole) {
		this.advisorRole = advisorRole;
	}

}