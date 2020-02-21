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
 * The persistent class for the finexaExceptionHandling database table.
 * 
 */
@Entity
@Table(name = "finexaExceptionHandling")
@NamedQuery(name = "FinexaExceptionHandling.findAll", query = "SELECT f FROM FinexaExceptionHandling f")
public class FinexaExceptionHandling implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String errorCode;

	private String errorMessage;

	// bi-directional many-to-one association to FinexaBusinessSubmodule
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subModuleID")
	private FinexaBusinessSubmodule finexaBusinessSubmodule;

	// bi-directional many-to-one association to FinexaBusinessFunction
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "functionID")
	private FinexaBusinessFunction finexaBusinessFunction;

	public FinexaExceptionHandling() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public FinexaBusinessSubmodule getFinexaBusinessSubmodule() {
		return this.finexaBusinessSubmodule;
	}

	public void setFinexaBusinessSubmodule(FinexaBusinessSubmodule finexaBusinessSubmodule) {
		this.finexaBusinessSubmodule = finexaBusinessSubmodule;
	}

	public FinexaBusinessFunction getFinexaBusinessFunction() {
		return this.finexaBusinessFunction;
	}

	public void setFinexaBusinessFunction(FinexaBusinessFunction finexaBusinessFunction) {
		this.finexaBusinessFunction = finexaBusinessFunction;
	}

}