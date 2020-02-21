package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the investorBranchMasterBO database table.
 * 
 */
@Entity
@Table(name="investorBranchMasterBO")
@NamedQuery(name="InvestorBranchMasterBO.findAll", query="SELECT i FROM InvestorBranchMasterBO i")
public class InvestorBranchMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;

	

	private String branchAddress;

	private String branchCity;

	private String branchCode;

	private String branchHead;

	private int branchMobileNo;

	private String branchName;

	private int branchPhoneNo;

	private int branchPinCode;

	private String branchState;
	
	//bi-directional many-to-one association to AdvisorUser
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="advisorId")
    private AdvisorUser advisorUser;

	//bi-directional many-to-one association to RmMasterBO
	@OneToMany(mappedBy="investorBranchMasterBo")
	private List<RmMasterBO> rmMasterBos;

	//bi-directional many-to-one association to SubBrokerMasterBO
	@OneToMany(mappedBy="investorBranchMasterBo")
	private List<SubBrokerMasterBO> subBrokerMasterBos;

	public InvestorBranchMasterBO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	


	public String getBranchAddress() {
		return this.branchAddress;
	}

	public void setBranchAddress(String branchAddress) {
		this.branchAddress = branchAddress;
	}

	public String getBranchCity() {
		return this.branchCity;
	}

	public void setBranchCity(String branchCity) {
		this.branchCity = branchCity;
	}

	public String getBranchCode() {
		return this.branchCode;
	}

	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}

	public String getBranchHead() {
		return this.branchHead;
	}

	public void setBranchHead(String branchHead) {
		this.branchHead = branchHead;
	}

	public int getBranchMobileNo() {
		return this.branchMobileNo;
	}

	public void setBranchMobileNo(int branchMobileNo) {
		this.branchMobileNo = branchMobileNo;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public int getBranchPhoneNo() {
		return this.branchPhoneNo;
	}

	public void setBranchPhoneNo(int branchPhoneNo) {
		this.branchPhoneNo = branchPhoneNo;
	}

	public int getBranchPinCode() {
		return this.branchPinCode;
	}

	public void setBranchPinCode(int branchPinCode) {
		this.branchPinCode = branchPinCode;
	}

	public String getBranchState() {
		return this.branchState;
	}

	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}

	public List<RmMasterBO> getRmMasterBos() {
		return this.rmMasterBos;
	}

	public void setRmMasterBos(List<RmMasterBO> rmMasterBos) {
		this.rmMasterBos = rmMasterBos;
	}

	public RmMasterBO addRmMasterBo(RmMasterBO rmMasterBo) {
		getRmMasterBos().add(rmMasterBo);
		rmMasterBo.setInvestorBranchMasterBo(this);

		return rmMasterBo;
	}

	public RmMasterBO removeRmMasterBo(RmMasterBO rmMasterBo) {
		getRmMasterBos().remove(rmMasterBo);
		rmMasterBo.setInvestorBranchMasterBo(null);

		return rmMasterBo;
	}

	public List<SubBrokerMasterBO> getSubBrokerMasterBos() {
		return this.subBrokerMasterBos;
	}

	public void setSubBrokerMasterBos(List<SubBrokerMasterBO> subBrokerMasterBos) {
		this.subBrokerMasterBos = subBrokerMasterBos;
	}
	
	public AdvisorUser getAdvisorUser() {
        return this.advisorUser;
    }

    public void setAdvisorUser(AdvisorUser advisorUser) {
        this.advisorUser = advisorUser;
    }

	public SubBrokerMasterBO addSubBrokerMasterBo(SubBrokerMasterBO subBrokerMasterBo) {
		getSubBrokerMasterBos().add(subBrokerMasterBo);
		subBrokerMasterBo.setInvestorBranchMasterBo(this);

		return subBrokerMasterBo;
	}

	public SubBrokerMasterBO removeSubBrokerMasterBo(SubBrokerMasterBO subBrokerMasterBo) {
		getSubBrokerMasterBos().remove(subBrokerMasterBo);
		subBrokerMasterBo.setInvestorBranchMasterBo(null);

		return subBrokerMasterBo;
	}

}