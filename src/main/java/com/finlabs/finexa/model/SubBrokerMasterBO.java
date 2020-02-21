package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the subBrokerMasterBO database table.
 * 
 */
@Entity
@Table(name="subBrokerMasterBO")
@NamedQuery(name="SubBrokerMasterBO.findAll", query="SELECT s FROM SubBrokerMasterBO s")
public class SubBrokerMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int subBrokerMasterID;


	private String subBrokerMasterBOemailID;

	private String subBrokerMasterEmployeeCode;

	private BigInteger subBrokerMasterMobileNumber;

	private String subBrokerMasterName;

	//bi-directional many-to-one association to InvestorBranchMasterBO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="subBrokerMasterBranch")
	private InvestorBranchMasterBO investorBranchMasterBo;
	
	//bi-directional many-to-one association to AdvisorUser
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="advisorID")
    private AdvisorUser advisorUser;
    
    
    
	public AdvisorUser getAdvisorUser() {
		return advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public SubBrokerMasterBO() {
	}

	public int getSubBrokerMasterID() {
		return this.subBrokerMasterID;
	}

	public void setSubBrokerMasterID(int subBrokerMasterID) {
		this.subBrokerMasterID = subBrokerMasterID;
	}

	
	public String getSubBrokerMasterBOemailID() {
		return this.subBrokerMasterBOemailID;
	}

	public void setSubBrokerMasterBOemailID(String subBrokerMasterBOemailID) {
		this.subBrokerMasterBOemailID = subBrokerMasterBOemailID;
	}

	public String getSubBrokerMasterEmployeeCode() {
		return this.subBrokerMasterEmployeeCode;
	}

	public void setSubBrokerMasterEmployeeCode(String subBrokerMasterEmployeeCode) {
		this.subBrokerMasterEmployeeCode = subBrokerMasterEmployeeCode;
	}

	public BigInteger getSubBrokerMasterMobileNumber() {
		return this.subBrokerMasterMobileNumber;
	}

	public void setSubBrokerMasterMobileNumber(BigInteger subBrokerMasterMobileNumber) {
		this.subBrokerMasterMobileNumber = subBrokerMasterMobileNumber;
	}

	public String getSubBrokerMasterName() {
		return this.subBrokerMasterName;
	}

	public void setSubBrokerMasterName(String subBrokerMasterName) {
		this.subBrokerMasterName = subBrokerMasterName;
	}

	public InvestorBranchMasterBO getInvestorBranchMasterBo() {
		return this.investorBranchMasterBo;
	}

	public void setInvestorBranchMasterBo(InvestorBranchMasterBO investorBranchMasterBo) {
		this.investorBranchMasterBo = investorBranchMasterBo;
	}

}