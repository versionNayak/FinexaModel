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
 * The persistent class for the finexaBusinessSubmodule database table.
 * 
 */
@Entity
@Table(name = "finexaBusinessSubmodule")
@NamedQuery(name = "FinexaBusinessSubmodule.findAll", query = "SELECT f FROM FinexaBusinessSubmodule f")
public class FinexaBusinessSubmodule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String code;

	private String description;

	// bi-directional many-to-one association to AdvisorRoleSubmoduleMapping
	@OneToMany(mappedBy = "finexaBusinessSubmodule")
	private List<AdvisorRoleSubmoduleMapping> advisorRoleSubmoduleMappings;

	// bi-directional many-to-one association to FinexaBusinessFunction
	@OneToMany(mappedBy = "finexaBusinessSubmodule")
	private List<FinexaBusinessFunction> finexaBusinessFunctions;

	// bi-directional many-to-one association to FinexaBusinessModule
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "moduleID")
	private FinexaBusinessModule finexaBusinessModule;

	// bi-directional many-to-one association to FinexaExceptionHandling
	@OneToMany(mappedBy = "finexaBusinessSubmodule")
	private List<FinexaExceptionHandling> finexaExceptionHandlings;

	public FinexaBusinessSubmodule() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<AdvisorRoleSubmoduleMapping> getAdvisorRoleSubmoduleMappings() {
		return this.advisorRoleSubmoduleMappings;
	}

	public void setAdvisorRoleSubmoduleMappings(List<AdvisorRoleSubmoduleMapping> advisorRoleSubmoduleMappings) {
		this.advisorRoleSubmoduleMappings = advisorRoleSubmoduleMappings;
	}

	public AdvisorRoleSubmoduleMapping addAdvisorRoleSubmoduleMapping(
			AdvisorRoleSubmoduleMapping advisorRoleSubmoduleMapping) {
		getAdvisorRoleSubmoduleMappings().add(advisorRoleSubmoduleMapping);
		advisorRoleSubmoduleMapping.setFinexaBusinessSubmodule(this);

		return advisorRoleSubmoduleMapping;
	}

	public AdvisorRoleSubmoduleMapping removeAdvisorRoleSubmoduleMapping(
			AdvisorRoleSubmoduleMapping advisorRoleSubmoduleMapping) {
		getAdvisorRoleSubmoduleMappings().remove(advisorRoleSubmoduleMapping);
		advisorRoleSubmoduleMapping.setFinexaBusinessSubmodule(null);

		return advisorRoleSubmoduleMapping;
	}

	public List<FinexaBusinessFunction> getFinexaBusinessFunctions() {
		return this.finexaBusinessFunctions;
	}

	public void setFinexaBusinessFunctions(List<FinexaBusinessFunction> finexaBusinessFunctions) {
		this.finexaBusinessFunctions = finexaBusinessFunctions;
	}

	public FinexaBusinessFunction addFinexaBusinessFunction(FinexaBusinessFunction finexaBusinessFunction) {
		getFinexaBusinessFunctions().add(finexaBusinessFunction);
		finexaBusinessFunction.setFinexaBusinessSubmodule(this);

		return finexaBusinessFunction;
	}

	public FinexaBusinessFunction removeFinexaBusinessFunction(FinexaBusinessFunction finexaBusinessFunction) {
		getFinexaBusinessFunctions().remove(finexaBusinessFunction);
		finexaBusinessFunction.setFinexaBusinessSubmodule(null);

		return finexaBusinessFunction;
	}

	public FinexaBusinessModule getFinexaBusinessModule() {
		return this.finexaBusinessModule;
	}

	public void setFinexaBusinessModule(FinexaBusinessModule finexaBusinessModule) {
		this.finexaBusinessModule = finexaBusinessModule;
	}

	public List<FinexaExceptionHandling> getFinexaExceptionHandlings() {
		return this.finexaExceptionHandlings;
	}

	public void setFinexaExceptionHandlings(List<FinexaExceptionHandling> finexaExceptionHandlings) {
		this.finexaExceptionHandlings = finexaExceptionHandlings;
	}

	public FinexaExceptionHandling addFinexaExceptionHandling(FinexaExceptionHandling finexaExceptionHandling) {
		getFinexaExceptionHandlings().add(finexaExceptionHandling);
		finexaExceptionHandling.setFinexaBusinessSubmodule(this);

		return finexaExceptionHandling;
	}

	public FinexaExceptionHandling removeFinexaExceptionHandling(FinexaExceptionHandling finexaExceptionHandling) {
		getFinexaExceptionHandlings().remove(finexaExceptionHandling);
		finexaExceptionHandling.setFinexaBusinessSubmodule(null);

		return finexaExceptionHandling;
	}

}