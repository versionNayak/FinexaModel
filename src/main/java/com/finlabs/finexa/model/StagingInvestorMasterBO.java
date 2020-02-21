package com.finlabs.finexa.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the staginginvestormasterbo database table.
 * 
 */
@Entity
@Table(name = "stagingInvestorMasterBO")
@NamedQuery(name="StaginginvestorMasterBO.findAll", query="SELECT s FROM StagingInvestorMasterBO s")
public class StagingInvestorMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String investorAadhar;

	@Temporal(TemporalType.DATE)
	private Date investorDOB;

	private String investorName;

	private String investorPAN;
	
	private String addressLine1;
	
	private String addressLine2;
	
	private String addressLine3;
	
	private String email;
	
	private String city;
	
	private String mobileNumber;
	
	private String pinCode;
	
	private String distributorARNCode;

	private String createdOn;

	//bi-directional many-to-one association to Stagingfoliomasterbo
	@OneToMany(mappedBy="staginginvestormasterbo")
	private List<StagingFolioMasterBO> stagingfoliomasterbos;

	//bi-directional many-to-one association to Advisoruser
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="advisorId")
	private AdvisorUser advisoruser;
	
	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	public StagingInvestorMasterBO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInvestorAadhar() {
		return this.investorAadhar;
	}

	public void setInvestorAadhar(String investorAadhar) {
		this.investorAadhar = investorAadhar;
	}

	public Date getInvestorDOB() {
		return this.investorDOB;
	}

	public void setInvestorDOB(Date investorDOB) {
		this.investorDOB = investorDOB;
	}

	public String getInvestorName() {
		return this.investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public String getInvestorPAN() {
		return this.investorPAN;
	}

	public void setInvestorPAN(String investorPAN) {
		this.investorPAN = investorPAN;
	}

	public List<StagingFolioMasterBO> getStagingfoliomasterbos() {
		return this.stagingfoliomasterbos;
	}

	public void setStagingfoliomasterbos(List<StagingFolioMasterBO> stagingfoliomasterbos) {
		this.stagingfoliomasterbos = stagingfoliomasterbos;
	}

	public StagingFolioMasterBO addStagingfoliomasterbo(StagingFolioMasterBO stagingfoliomasterbo) {
		getStagingfoliomasterbos().add(stagingfoliomasterbo);
		stagingfoliomasterbo.setStaginginvestormasterbo(this);

		return stagingfoliomasterbo;
	}

	public StagingFolioMasterBO removeStagingfoliomasterbo(StagingFolioMasterBO stagingfoliomasterbo) {
		getStagingfoliomasterbos().remove(stagingfoliomasterbo);
		stagingfoliomasterbo.setStaginginvestormasterbo(null);

		return stagingfoliomasterbo;
	}

	public AdvisorUser getAdvisoruser() {
		return this.advisoruser;
	}

	public void setAdvisoruser(AdvisorUser advisoruser) {
		this.advisoruser = advisoruser;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getDistributorARNCode() {
		return distributorARNCode;
	}

	public void setDistributorARNCode(String distributorARNCode) {
		this.distributorARNCode = distributorARNCode;
	}

}