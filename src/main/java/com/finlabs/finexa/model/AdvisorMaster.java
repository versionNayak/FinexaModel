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
 * The persistent class for the advisorMaster database table.
 * 
 */
@Entity
@Table(name = "advisorMaster")
@NamedQuery(name = "AdvisorMaster.findAll", query = "SELECT a FROM AdvisorMaster a")
public class AdvisorMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;
	
	private String distributorCode;

	private String orgFlag;

	private String orgName;
	
	private String camsPassword;
	
	private String karvyPassword;
	
	

	private String franklinPassword;
	
	private String sundaramPassword;
	private String autoCreateClient;
	
	

	// bi-directional many-to-one association to AdvisorRole
	@OneToMany(mappedBy = "advisorMaster")
	private List<AdvisorRole> advisorRoles;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	// bi-directional many-to-one association to AdvisorUser
	@OneToMany(mappedBy = "advisorMaster")
	private List<AdvisorUser> advisorUsers;

	@OneToMany(mappedBy = "advisorMaster")
	private List<User> users;
	
	// bi-directional many-to-one association to FinexaSubscription
	@OneToMany(mappedBy = "advisorMaster")
	private List<FinexaSubscription> finexaSubscriptions;

	// bi-directional many-to-one association to RiskProfileMaster
	@OneToMany(mappedBy = "advisorMaster")
	private List<RiskProfileMaster> riskProfileMasters;

	// bi-directional many-to-one association to RiskProfileQuestionnaire
	@OneToMany(mappedBy = "advisorMaster")
	private List<RiskProfileQuestionnaire> riskProfileQuestionnaires;

	// bi-directional many-to-one association to RiskProfileResponseBasedScore
	@OneToMany(mappedBy = "advisorMaster")
	private List<RiskProfileResponseBasedScore> riskProfileResponseBasedScores;

	public AdvisorMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDistributorCode() {
		return this.distributorCode;
	}

	public void setDistributorCode(String distributorCode) {
		this.distributorCode = distributorCode;
	}

	public String getOrgFlag() {
		return this.orgFlag;
	}

	public void setOrgFlag(String orgFlag) {
		this.orgFlag = orgFlag;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getCamsPassword() {
		return camsPassword;
	}

	public void setCamsPassword(String camsPassword) {
		this.camsPassword = camsPassword;
	}

	public String getKarvyPassword() {
		return karvyPassword;
	}

	public void setKarvyPassword(String karvyPassword) {
		this.karvyPassword = karvyPassword;
	}

	public String getFranklinPassword() {
		return franklinPassword;
	}

	public void setFranklinPassword(String franklinPassword) {
		this.franklinPassword = franklinPassword;
	}

	public String getSundaramPassword() {
		return sundaramPassword;
	}

	public void setSundaramPassword(String sundaramPassword) {
		this.sundaramPassword = sundaramPassword;
	}
	
	
	public String getAutoCreateClient() {
		return autoCreateClient;
	}

	public void setAutoCreateClient(String autoCreateClient) {
		this.autoCreateClient = autoCreateClient;
	}

	public List<AdvisorRole> getAdvisorRoles() {
		return this.advisorRoles;
	}

	public void setAdvisorRoles(List<AdvisorRole> advisorRoles) {
		this.advisorRoles = advisorRoles;
	}

	public AdvisorRole addAdvisorRole(AdvisorRole advisorRole) {
		getAdvisorRoles().add(advisorRole);
		advisorRole.setAdvisorMaster(this);

		return advisorRole;
	}

	public AdvisorRole removeAdvisorRole(AdvisorRole advisorRole) {
		getAdvisorRoles().remove(advisorRole);
		advisorRole.setAdvisorMaster(null);

		return advisorRole;
	}

	public List<AdvisorUser> getAdvisorUsers() {
		return this.advisorUsers;
	}

	public void setAdvisorUsers(List<AdvisorUser> advisorUsers) {
		this.advisorUsers = advisorUsers;
	}

	public AdvisorUser addAdvisorUser(AdvisorUser advisorUser) {
		getAdvisorUsers().add(advisorUser);
		advisorUser.setAdvisorMaster(this);

		return advisorUser;
	}

	public AdvisorUser removeAdvisorUser(AdvisorUser advisorUser) {
		getAdvisorUsers().remove(advisorUser);
		advisorUser.setAdvisorMaster(null);

		return advisorUser;
	}

	public List<FinexaSubscription> getFinexaSubscriptions() {
		return this.finexaSubscriptions;
	}

	public void setFinexaSubscriptions(List<FinexaSubscription> finexaSubscriptions) {
		this.finexaSubscriptions = finexaSubscriptions;
	}

	public FinexaSubscription addFinexaSubscription(FinexaSubscription finexaSubscription) {
		getFinexaSubscriptions().add(finexaSubscription);
		finexaSubscription.setAdvisorMaster(this);

		return finexaSubscription;
	}

	public FinexaSubscription removeFinexaSubscription(FinexaSubscription finexaSubscription) {
		getFinexaSubscriptions().remove(finexaSubscription);
		finexaSubscription.setAdvisorMaster(null);

		return finexaSubscription;
	}

	public List<RiskProfileMaster> getRiskProfileMasters() {
		return this.riskProfileMasters;
	}

	public void setRiskProfileMasters(List<RiskProfileMaster> riskProfileMasters) {
		this.riskProfileMasters = riskProfileMasters;
	}

	public RiskProfileMaster addRiskProfileMaster(RiskProfileMaster riskProfileMaster) {
		getRiskProfileMasters().add(riskProfileMaster);
		riskProfileMaster.setAdvisorMaster(this);

		return riskProfileMaster;
	}

	public RiskProfileMaster removeRiskProfileMaster(RiskProfileMaster riskProfileMaster) {
		getRiskProfileMasters().remove(riskProfileMaster);
		riskProfileMaster.setAdvisorMaster(null);

		return riskProfileMaster;
	}

	public List<RiskProfileQuestionnaire> getRiskProfileQuestionnaires() {
		return this.riskProfileQuestionnaires;
	}

	public void setRiskProfileQuestionnaires(List<RiskProfileQuestionnaire> riskProfileQuestionnaires) {
		this.riskProfileQuestionnaires = riskProfileQuestionnaires;
	}

	public RiskProfileQuestionnaire addRiskProfileQuestionnaire(RiskProfileQuestionnaire riskProfileQuestionnaire) {
		getRiskProfileQuestionnaires().add(riskProfileQuestionnaire);
		riskProfileQuestionnaire.setAdvisorMaster(this);

		return riskProfileQuestionnaire;
	}

	public RiskProfileQuestionnaire removeRiskProfileQuestionnaire(RiskProfileQuestionnaire riskProfileQuestionnaire) {
		getRiskProfileQuestionnaires().remove(riskProfileQuestionnaire);
		riskProfileQuestionnaire.setAdvisorMaster(null);

		return riskProfileQuestionnaire;
	}

	public List<RiskProfileResponseBasedScore> getRiskProfileResponseBasedScores() {
		return this.riskProfileResponseBasedScores;
	}

	public void setRiskProfileResponseBasedScores(List<RiskProfileResponseBasedScore> riskProfileResponseBasedScores) {
		this.riskProfileResponseBasedScores = riskProfileResponseBasedScores;
	}

	public RiskProfileResponseBasedScore addRiskProfileResponseBasedScore(
			RiskProfileResponseBasedScore riskProfileResponseBasedScore) {
		getRiskProfileResponseBasedScores().add(riskProfileResponseBasedScore);
		riskProfileResponseBasedScore.setAdvisorMaster(this);

		return riskProfileResponseBasedScore;
	}

	public RiskProfileResponseBasedScore removeRiskProfileResponseBasedScore(
			RiskProfileResponseBasedScore riskProfileResponseBasedScore) {
		getRiskProfileResponseBasedScores().remove(riskProfileResponseBasedScore);
		riskProfileResponseBasedScore.setAdvisorMaster(null);

		return riskProfileResponseBasedScore;
	}
	
}