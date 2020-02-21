package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the finexaimpactanalysis database table.
 * 
 */
@Entity
@Table(name = "finexaImpactAnalysis")
@NamedQuery(name = "FinexaImpactAnalysis.findAll", query = "SELECT f FROM FinexaImpactAnalysis f")
public class FinexaImpactAnalysis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Lob
	private String changes;

	private String controller;

	@Lob
	private String impact;

	private String masterTableName;

	private String method;

	private String moduleName;

	private String serviceImpl;

	private String subModuleName;

	private String repository;

	public FinexaImpactAnalysis() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getChanges() {
		return this.changes;
	}

	public void setChanges(String changes) {
		this.changes = changes;
	}

	public String getController() {
		return this.controller;
	}

	public void setController(String controller) {
		this.controller = controller;
	}

	public String getImpact() {
		return this.impact;
	}

	public void setImpact(String impact) {
		this.impact = impact;
	}

	public String getMasterTableName() {
		return this.masterTableName;
	}

	public void setMasterTableName(String masterTableName) {
		this.masterTableName = masterTableName;
	}

	public String getMethod() {
		return this.method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public String getServiceImpl() {
		return this.serviceImpl;
	}

	public void setServiceImpl(String serviceImpl) {
		this.serviceImpl = serviceImpl;
	}

	public String getSubModuleName() {
		return this.subModuleName;
	}

	public void setSubModuleName(String subModuleName) {
		this.subModuleName = subModuleName;
	}

	public String getRepository() {
		return repository;
	}

	public void setRepository(String repository) {
		this.repository = repository;
	}

}