package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the branchMasterDetailsBO database table.
 * 
 */
@Entity
@Table(name="branchMasterDetailsBO")
@NamedQuery(name="BranchMasterDetailsBO.findAll", query="SELECT b FROM BranchMasterDetailsBO b")
public class BranchMasterDetailsBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String branchAddress;

	private String branchCity;

	private String branchCode;

	private BigInteger branchMobileNo;

	private String branchName;

	private BigInteger branchPhoneNo;

	private Integer branchPinCode;

	private String branchState;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="branchHead")
	private AdvisorUser advisorUser;

	public BranchMasterDetailsBO() {
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

	public BigInteger getBranchMobileNo() {
		return this.branchMobileNo;
	}

	public void setBranchMobileNo(BigInteger branchMobileNo) {
		this.branchMobileNo = branchMobileNo;
	}

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public BigInteger getBranchPhoneNo() {
		return this.branchPhoneNo;
	}

	public void setBranchPhoneNo(BigInteger branchPhoneNo) {
		this.branchPhoneNo = branchPhoneNo;
	}

	public Integer getBranchPinCode() {
		return this.branchPinCode;
	}

	public void setBranchPinCode(Integer branchPinCode) {
		this.branchPinCode = branchPinCode;
	}

	public String getBranchState() {
		return this.branchState;
	}

	public void setBranchState(String branchState) {
		this.branchState = branchState;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

}