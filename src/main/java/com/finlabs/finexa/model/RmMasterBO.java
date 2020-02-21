package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the rmMasterBO database table.
 * 
 */
@Entity
@Table(name="rmMasterBO")
@NamedQuery(name="RmMasterBO.findAll", query="SELECT r FROM RmMasterBO r")
public class RmMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int rmMasterID;



	private String rmMasterEmailID;

	private String rmMasterEmployeeCode;

	private BigInteger rmMasterMobileNumber;

	private String rmMasterName;
	
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

	//bi-directional many-to-one association to InvestorBranchMasterBO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rmMasterBranch")
	private InvestorBranchMasterBO investorBranchMasterBo;

	public RmMasterBO() {
	}

	public int getRmMasterID() {
		return this.rmMasterID;
	}

	public void setRmMasterID(int rmMasterID) {
		this.rmMasterID = rmMasterID;
	}

	
	public String getRmMasterEmailID() {
		return this.rmMasterEmailID;
	}

	public void setRmMasterEmailID(String rmMasterEmailID) {
		this.rmMasterEmailID = rmMasterEmailID;
	}

	public String getRmMasterEmployeeCode() {
		return this.rmMasterEmployeeCode;
	}

	public void setRmMasterEmployeeCode(String rmMasterEmployeeCode) {
		this.rmMasterEmployeeCode = rmMasterEmployeeCode;
	}

	public BigInteger getRmMasterMobileNumber() {
		return this.rmMasterMobileNumber;
	}

	public void setRmMasterMobileNumber(BigInteger rmMasterMobileNumber) {
		this.rmMasterMobileNumber = rmMasterMobileNumber;
	}

	public String getRmMasterName() {
		return this.rmMasterName;
	}

	public void setRmMasterName(String rmMasterName) {
		this.rmMasterName = rmMasterName;
	}

	public InvestorBranchMasterBO getInvestorBranchMasterBo() {
		return this.investorBranchMasterBo;
	}

	public void setInvestorBranchMasterBo(InvestorBranchMasterBO investorBranchMasterBo) {
		this.investorBranchMasterBo = investorBranchMasterBo;
	}

}