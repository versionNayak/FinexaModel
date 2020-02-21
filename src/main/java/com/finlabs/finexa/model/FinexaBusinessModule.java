package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the finexaBusinessModule database table.
 * 
 */
@Entity
@Table(name = "finexaBusinessModule")
@NamedQuery(name = "FinexaBusinessModule.findAll", query = "SELECT f FROM FinexaBusinessModule f")
public class FinexaBusinessModule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String code;

	private String description;

	// bi-directional many-to-one association to FinexaBusinessSubmodule
	@OneToMany(mappedBy = "finexaBusinessModule")
	private List<FinexaBusinessSubmodule> finexaBusinessSubmodules;

	// bi-directional many-to-one association to FinexaSubscription
	@OneToMany(mappedBy = "finexaBusinessModule")
	private List<FinexaSubscription> finexaSubscriptions;

	public FinexaBusinessModule() {
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

	public List<FinexaBusinessSubmodule> getFinexaBusinessSubmodules() {
		return this.finexaBusinessSubmodules;
	}

	public void setFinexaBusinessSubmodules(List<FinexaBusinessSubmodule> finexaBusinessSubmodules) {
		this.finexaBusinessSubmodules = finexaBusinessSubmodules;
	}

	public FinexaBusinessSubmodule addFinexaBusinessSubmodule(FinexaBusinessSubmodule finexaBusinessSubmodule) {
		getFinexaBusinessSubmodules().add(finexaBusinessSubmodule);
		finexaBusinessSubmodule.setFinexaBusinessModule(this);

		return finexaBusinessSubmodule;
	}

	public FinexaBusinessSubmodule removeFinexaBusinessSubmodule(FinexaBusinessSubmodule finexaBusinessSubmodule) {
		getFinexaBusinessSubmodules().remove(finexaBusinessSubmodule);
		finexaBusinessSubmodule.setFinexaBusinessModule(null);

		return finexaBusinessSubmodule;
	}

	public List<FinexaSubscription> getFinexaSubscriptions() {
		return this.finexaSubscriptions;
	}

	public void setFinexaSubscriptions(List<FinexaSubscription> finexaSubscriptions) {
		this.finexaSubscriptions = finexaSubscriptions;
	}

	public FinexaSubscription addFinexaSubscription(FinexaSubscription finexaSubscription) {
		getFinexaSubscriptions().add(finexaSubscription);
		finexaSubscription.setFinexaBusinessModule(this);

		return finexaSubscription;
	}

	public FinexaSubscription removeFinexaSubscription(FinexaSubscription finexaSubscription) {
		getFinexaSubscriptions().remove(finexaSubscription);
		finexaSubscription.setFinexaBusinessModule(null);

		return finexaSubscription;
	}

}