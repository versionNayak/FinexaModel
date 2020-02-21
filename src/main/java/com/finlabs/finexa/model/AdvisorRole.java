package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * The persistent class for the advisorRole database table.
 * 
 */
@Entity
@Table(name="advisorRole")
@NamedQuery(name="AdvisorRole.findAll", query="SELECT a FROM AdvisorRole a")
public class AdvisorRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	private String roleDescription;

	private Integer supervisorRoleID;

	//bi-directional many-to-one association to AdvisorMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorMaster advisorMaster;

	//bi-directional many-to-one association to AdvisorRoleSubmoduleMapping
	@OneToMany(mappedBy="advisorRole")
	private List<AdvisorRoleSubmoduleMapping> advisorRoleSubmoduleMappings;

	//bi-directional many-to-one association to AdvisorUserRoleMapping
	@OneToMany(mappedBy="advisorRole")
	private List<AdvisorUserRoleMapping> advisorUserRoleMappings;
	
	//bi-directional many-to-one association to AdvisorUserRoleMapping
	@OneToMany(mappedBy="advisorRole")
	private List<User> user;

	public AdvisorRole() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRoleDescription() {
		return this.roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Integer getSupervisorRoleID() {
		return this.supervisorRoleID;
	}

	public void setSupervisorRoleID(Integer supervisorRoleID) {
		this.supervisorRoleID = supervisorRoleID;
	}

	public AdvisorMaster getAdvisorMaster() {
		return this.advisorMaster;
	}

	public void setAdvisorMaster(AdvisorMaster advisorMaster) {
		this.advisorMaster = advisorMaster;
	}

	public List<AdvisorRoleSubmoduleMapping> getAdvisorRoleSubmoduleMappings() {
		return this.advisorRoleSubmoduleMappings;
	}

	public void setAdvisorRoleSubmoduleMappings(List<AdvisorRoleSubmoduleMapping> advisorRoleSubmoduleMappings) {
		this.advisorRoleSubmoduleMappings = advisorRoleSubmoduleMappings;
	}

	public AdvisorRoleSubmoduleMapping addAdvisorRoleSubmoduleMapping(AdvisorRoleSubmoduleMapping advisorRoleSubmoduleMapping) {
		getAdvisorRoleSubmoduleMappings().add(advisorRoleSubmoduleMapping);
		advisorRoleSubmoduleMapping.setAdvisorRole(this);

		return advisorRoleSubmoduleMapping;
	}

	public AdvisorRoleSubmoduleMapping removeAdvisorRoleSubmoduleMapping(AdvisorRoleSubmoduleMapping advisorRoleSubmoduleMapping) {
		getAdvisorRoleSubmoduleMappings().remove(advisorRoleSubmoduleMapping);
		advisorRoleSubmoduleMapping.setAdvisorRole(null);

		return advisorRoleSubmoduleMapping;
	}

	public List<AdvisorUserRoleMapping> getAdvisorUserRoleMappings() {
		return this.advisorUserRoleMappings;
	}

	public void setAdvisorUserRoleMappings(List<AdvisorUserRoleMapping> advisorUserRoleMappings) {
		this.advisorUserRoleMappings = advisorUserRoleMappings;
	}

	public AdvisorUserRoleMapping addAdvisorUserRoleMapping(AdvisorUserRoleMapping advisorUserRoleMapping) {
		getAdvisorUserRoleMappings().add(advisorUserRoleMapping);
		advisorUserRoleMapping.setAdvisorRole(this);

		return advisorUserRoleMapping;
	}

	public AdvisorUserRoleMapping removeAdvisorUserRoleMapping(AdvisorUserRoleMapping advisorUserRoleMapping) {
		getAdvisorUserRoleMappings().remove(advisorUserRoleMapping);
		advisorUserRoleMapping.setAdvisorRole(null);

		return advisorUserRoleMapping;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}

}