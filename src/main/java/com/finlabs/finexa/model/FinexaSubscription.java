package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
 * The persistent class for the finexaSubscription database table.
 * 
 */
@Entity
@Table(name = "finexaSubscription")
@NamedQuery(name = "FinexaSubscription.findAll", query = "SELECT f FROM FinexaSubscription f")
public class FinexaSubscription implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private int clientNumber;

	@Temporal(TemporalType.DATE)
	private Date dateOfSubscription;

	private String promoCode;

	private BigDecimal subscriptionAmount;

	private int subscriptionPeriod;

	private int userNumber;

	// bi-directional many-to-one association to AdvisorMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "advisorMasterId")
	private AdvisorMaster advisorMaster;

	// bi-directional many-to-one association to FinexaBusinessModule
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "moduleId")
	private FinexaBusinessModule finexaBusinessModule;

	public FinexaSubscription() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getClientNumber() {
		return this.clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public Date getDateOfSubscription() {
		return this.dateOfSubscription;
	}

	public void setDateOfSubscription(Date dateOfSubscription) {
		this.dateOfSubscription = dateOfSubscription;
	}

	public String getPromoCode() {
		return this.promoCode;
	}

	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}

	public BigDecimal getSubscriptionAmount() {
		return this.subscriptionAmount;
	}

	public void setSubscriptionAmount(BigDecimal subscriptionAmount) {
		this.subscriptionAmount = subscriptionAmount;
	}

	public int getSubscriptionPeriod() {
		return this.subscriptionPeriod;
	}

	public void setSubscriptionPeriod(int subscriptionPeriod) {
		this.subscriptionPeriod = subscriptionPeriod;
	}

	public int getUserNumber() {
		return this.userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public AdvisorMaster getAdvisorMaster() {
		return this.advisorMaster;
	}

	public void setAdvisorMaster(AdvisorMaster advisorMaster) {
		this.advisorMaster = advisorMaster;
	}

	public FinexaBusinessModule getFinexaBusinessModule() {
		return this.finexaBusinessModule;
	}

	public void setFinexaBusinessModule(FinexaBusinessModule finexaBusinessModule) {
		this.finexaBusinessModule = finexaBusinessModule;
	}

}