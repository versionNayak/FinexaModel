package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;


/**
 * The persistent class for the advisorProductReco database table.
 * 
 */
@Entity
@Table(name="advisorProductReco")
@NamedQuery(name="AdvisorProductReco.findAll", query="SELECT a FROM AdvisorProductReco a")
public class AdvisorProductReco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID")
	private int id;

	private String module;

	@Lob
	private String productPlan;

	@Temporal(TemporalType.DATE)
	private Date recoSaveDate;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorUser advisorUser;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goalID")
	private ClientGoal clientGoal;

	public AdvisorProductReco() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModule() {
		return this.module;
	}

	public void setModule(String module) {
		this.module = module;
	}

	public String getProductPlan() {
		return this.productPlan;
	}

	public void setProductPlan(String productPlan) {
		this.productPlan = productPlan;
	}

	public Date getRecoSaveDate() {
		return this.recoSaveDate;
	}

	public void setRecoSaveDate(Date recoSaveDate) {
		this.recoSaveDate = recoSaveDate;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public ClientMaster getClientMaster() {
		return clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

	public ClientGoal getClientGoal() {
		return clientGoal;
	}

	public void setClientGoal(ClientGoal clientGoal) {
		this.clientGoal = clientGoal;
	}

}