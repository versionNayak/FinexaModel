package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the clientAccessRight database table.
 * 
 */
@Entity
@Table(name="clientAccessRight")
@NamedQuery(name="ClientAccessRight.findAll", query="SELECT c FROM ClientAccessRight c")
public class ClientAccessRight implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String budgetManagementView;

	private String clientInfoAddEdit;

	private String clientInfoDelete;

	private String clientInfoView;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	private String financialPlanningAddEdit;

	private String financialPlanningView;

	private String goalPlanningAddEdit;

	private String goalPlanningView;

	private String investAddEdit;

	private String investView;

	private String mfBackOfficeView;

	private String portfolioManagementAddEdit;

	private String portfolioManagementView;

	//bi-directional one-to-one association to ClientMaster
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	public ClientAccessRight() {
	}

	public String getBudgetManagementView() {
		return this.budgetManagementView;
	}

	public void setBudgetManagementView(String budgetManagementView) {
		this.budgetManagementView = budgetManagementView;
	}

	public String getClientInfoAddEdit() {
		return this.clientInfoAddEdit;
	}

	public void setClientInfoAddEdit(String clientInfoAddEdit) {
		this.clientInfoAddEdit = clientInfoAddEdit;
	}

	public String getClientInfoDelete() {
		return this.clientInfoDelete;
	}

	public void setClientInfoDelete(String clientInfoDelete) {
		this.clientInfoDelete = clientInfoDelete;
	}

	public String getClientInfoView() {
		return this.clientInfoView;
	}

	public void setClientInfoView(String clientInfoView) {
		this.clientInfoView = clientInfoView;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getFinancialPlanningAddEdit() {
		return this.financialPlanningAddEdit;
	}

	public void setFinancialPlanningAddEdit(String financialPlanningAddEdit) {
		this.financialPlanningAddEdit = financialPlanningAddEdit;
	}

	public String getFinancialPlanningView() {
		return this.financialPlanningView;
	}

	public void setFinancialPlanningView(String financialPlanningView) {
		this.financialPlanningView = financialPlanningView;
	}

	public String getGoalPlanningAddEdit() {
		return this.goalPlanningAddEdit;
	}

	public void setGoalPlanningAddEdit(String goalPlanningAddEdit) {
		this.goalPlanningAddEdit = goalPlanningAddEdit;
	}

	public String getGoalPlanningView() {
		return this.goalPlanningView;
	}

	public void setGoalPlanningView(String goalPlanningView) {
		this.goalPlanningView = goalPlanningView;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInvestAddEdit() {
		return this.investAddEdit;
	}

	public void setInvestAddEdit(String investAddEdit) {
		this.investAddEdit = investAddEdit;
	}

	public String getInvestView() {
		return this.investView;
	}

	public void setInvestView(String investView) {
		this.investView = investView;
	}

	public String getMfBackOfficeView() {
		return this.mfBackOfficeView;
	}

	public void setMfBackOfficeView(String mfBackOfficeView) {
		this.mfBackOfficeView = mfBackOfficeView;
	}

	public String getPortfolioManagementAddEdit() {
		return this.portfolioManagementAddEdit;
	}

	public void setPortfolioManagementAddEdit(String portfolioManagementAddEdit) {
		this.portfolioManagementAddEdit = portfolioManagementAddEdit;
	}

	public String getPortfolioManagementView() {
		return this.portfolioManagementView;
	}

	public void setPortfolioManagementView(String portfolioManagementView) {
		this.portfolioManagementView = portfolioManagementView;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

}