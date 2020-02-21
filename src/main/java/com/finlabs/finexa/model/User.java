
package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the advisorUser database table.
 *
 */
@Entity
@Table(name = "user")
@NamedQuery(name = "User.findAll", query = "SELECT a FROM User a")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String activeFlag;

	private String loginPassword;

	private String loginUsername;

	private String admin;
	private String advisorAdmin;
	private String  clientInfoView;
	private String  clientInfoAddEdit;
	private String  clientInfoDelete;
	private String  budgetManagementView;
	private String  portfolioManagementView;
	private String  portfolioManagementAddEdit;
	private String  goalPlanningView;
	private String  goalPlanningAddEdit;
	private String  financialPlanningView;
	private String  financialPlanningAddEdit;
	private String  investView;
	private String  investAddEdit;
	private String  userManagementView;
	private String  userManagementAddEdit;
	private String  userManagementDelete;
	private String  clientRecordsView;
	private String  mastersView;
	private String  mastersAddEdit;
	private String  mastersDelete;
	private String  mfBackOfficeView;
	private String  mfBackOfficeAddEdit;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "advisorRoleID")
	private AdvisorRole advisorRole;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "masterID")
	private AdvisorMaster advisorMaster;

	@OneToOne(mappedBy = "user", fetch = FetchType.LAZY)
	private AdvisorUser advisorUser;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getLoginUsername() {
		return loginUsername;
	}

	public void setLoginUsername(String loginUsername) {
		this.loginUsername = loginUsername;
	}

	public String getAdmin() {
		return admin;
	}

	public void setAdmin(String admin) {
		this.admin = admin;
	}

	public String getAdvisorAdmin() {
		return advisorAdmin;
	}

	public void setAdvisorAdmin(String advisorAdmin) {
		this.advisorAdmin = advisorAdmin;
	}

	public String getClientInfoView() {
		return clientInfoView;
	}

	public void setClientInfoView(String clientInfoView) {
		this.clientInfoView = clientInfoView;
	}

	public String getClientInfoAddEdit() {
		return clientInfoAddEdit;
	}

	public void setClientInfoAddEdit(String clientInfoAddEdit) {
		this.clientInfoAddEdit = clientInfoAddEdit;
	}

	public String getClientInfoDelete() {
		return clientInfoDelete;
	}

	public void setClientInfoDelete(String clientInfoDelete) {
		this.clientInfoDelete = clientInfoDelete;
	}

	public String getBudgetManagementView() {
		return budgetManagementView;
	}

	public void setBudgetManagementView(String budgetManagementView) {
		this.budgetManagementView = budgetManagementView;
	}

	public String getPortfolioManagementView() {
		return portfolioManagementView;
	}

	public void setPortfolioManagementView(String portfolioManagementView) {
		this.portfolioManagementView = portfolioManagementView;
	}

	public String getPortfolioManagementAddEdit() {
		return portfolioManagementAddEdit;
	}

	public void setPortfolioManagementAddEdit(String portfolioManagementAddEdit) {
		this.portfolioManagementAddEdit = portfolioManagementAddEdit;
	}

	public String getGoalPlanningView() {
		return goalPlanningView;
	}

	public void setGoalPlanningView(String goalPlanningView) {
		this.goalPlanningView = goalPlanningView;
	}

	public String getGoalPlanningAddEdit() {
		return goalPlanningAddEdit;
	}

	public void setGoalPlanningAddEdit(String goalPlanningAddEdit) {
		this.goalPlanningAddEdit = goalPlanningAddEdit;
	}

	public String getFinancialPlanningView() {
		return financialPlanningView;
	}

	public void setFinancialPlanningView(String financialPlanningView) {
		this.financialPlanningView = financialPlanningView;
	}

	public String getFinancialPlanningAddEdit() {
		return financialPlanningAddEdit;
	}

	public void setFinancialPlanningAddEdit(String financialPlanningAddEdit) {
		this.financialPlanningAddEdit = financialPlanningAddEdit;
	}

	public String getInvestView() {
		return investView;
	}

	public void setInvestView(String investView) {
		this.investView = investView;
	}

	public String getInvestAddEdit() {
		return investAddEdit;
	}

	public void setInvestAddEdit(String investAddEdit) {
		this.investAddEdit = investAddEdit;
	}

	public String getUserManagementView() {
		return userManagementView;
	}

	public void setUserManagementView(String userManagementView) {
		this.userManagementView = userManagementView;
	}

	public String getUserManagementAddEdit() {
		return userManagementAddEdit;
	}

	public void setUserManagementAddEdit(String userManagementAddEdit) {
		this.userManagementAddEdit = userManagementAddEdit;
	}

	public String getUserManagementDelete() {
		return userManagementDelete;
	}

	public void setUserManagementDelete(String userManagementDelete) {
		this.userManagementDelete = userManagementDelete;
	}

	public String getClientRecordsView() {
		return clientRecordsView;
	}

	public void setClientRecordsView(String clientRecordsView) {
		this.clientRecordsView = clientRecordsView;
	}

	public String getMastersView() {
		return mastersView;
	}

	public void setMastersView(String mastersView) {
		this.mastersView = mastersView;
	}

	public String getMastersAddEdit() {
		return mastersAddEdit;
	}

	public void setMastersAddEdit(String mastersAddEdit) {
		this.mastersAddEdit = mastersAddEdit;
	}

	public String getMastersDelete() {
		return mastersDelete;
	}

	public void setMastersDelete(String mastersDelete) {
		this.mastersDelete = mastersDelete;
	}

	public String getMfBackOfficeView() {
		return mfBackOfficeView;
	}

	public void setMfBackOfficeView(String mfBackOfficeView) {
		this.mfBackOfficeView = mfBackOfficeView;
	}

	public String getMfBackOfficeAddEdit() {
		return mfBackOfficeAddEdit;
	}

	public void setMfBackOfficeAddEdit(String mfBackOfficeAddEdit) {
		this.mfBackOfficeAddEdit = mfBackOfficeAddEdit;
	}
	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public AdvisorRole getAdvisorRole() {
		return advisorRole;
	}

	public void setAdvisorRole(AdvisorRole advisorRole) {
		this.advisorRole = advisorRole;
	}

	public AdvisorMaster getAdvisorMaster() {
		return advisorMaster;
	}

	public void setAdvisorMaster(AdvisorMaster advisorMaster) {
		this.advisorMaster = advisorMaster;
	}

	public AdvisorUser getAdvisorUser() {
		return advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
