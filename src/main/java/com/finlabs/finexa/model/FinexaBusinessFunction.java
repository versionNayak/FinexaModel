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
 * The persistent class for the finexaBusinessFunction database table.
 * 
 */
@Entity
@Table(name = "finexaBusinessFunction")
@NamedQuery(name = "FinexaBusinessFunction.findAll", query = "SELECT f FROM FinexaBusinessFunction f")
public class FinexaBusinessFunction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String event;

	private String function;

	private String subEvent;

	private String subFunction;

	// bi-directional many-to-one association to FinexaBusinessSubmodule
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subModuleID")
	private FinexaBusinessSubmodule finexaBusinessSubmodule;

	// bi-directional many-to-one association to FinexaExceptionHandling
	@OneToMany(mappedBy = "finexaBusinessFunction")
	private List<FinexaExceptionHandling> finexaExceptionHandlings;

	public FinexaBusinessFunction() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getFunction() {
		return this.function;
	}

	public void setFunction(String function) {
		this.function = function;
	}

	public String getSubEvent() {
		return this.subEvent;
	}

	public void setSubEvent(String subEvent) {
		this.subEvent = subEvent;
	}

	public String getSubFunction() {
		return this.subFunction;
	}

	public void setSubFunction(String subFunction) {
		this.subFunction = subFunction;
	}

	public FinexaBusinessSubmodule getFinexaBusinessSubmodule() {
		return this.finexaBusinessSubmodule;
	}

	public void setFinexaBusinessSubmodule(FinexaBusinessSubmodule finexaBusinessSubmodule) {
		this.finexaBusinessSubmodule = finexaBusinessSubmodule;
	}

	public List<FinexaExceptionHandling> getFinexaExceptionHandlings() {
		return this.finexaExceptionHandlings;
	}

	public void setFinexaExceptionHandlings(List<FinexaExceptionHandling> finexaExceptionHandlings) {
		this.finexaExceptionHandlings = finexaExceptionHandlings;
	}

	public FinexaExceptionHandling addFinexaExceptionHandling(FinexaExceptionHandling finexaExceptionHandling) {
		getFinexaExceptionHandlings().add(finexaExceptionHandling);
		finexaExceptionHandling.setFinexaBusinessFunction(this);

		return finexaExceptionHandling;
	}

	public FinexaExceptionHandling removeFinexaExceptionHandling(FinexaExceptionHandling finexaExceptionHandling) {
		getFinexaExceptionHandlings().remove(finexaExceptionHandling);
		finexaExceptionHandling.setFinexaBusinessFunction(null);

		return finexaExceptionHandling;
	}

}