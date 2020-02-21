package com.finlabs.finexa.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.*;


/**
 * The persistent class for the investorMasterBO database table.
 * 
 */
@Entity
@Table(name="investorMasterBO")
@NamedQuery(name="InvestorMasterBO.findAll", query="SELECT i FROM InvestorMasterBO i")
public class InvestorMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private InvestorMasterBOPK id;

	private String addressLine1;

	private String addressLine2;

	private String addressLine3;

	private String amcCode;

	private java.util.Date balanceDate;

	private String bankAccountNumber;

	private String bankAccountType;

	private String bankAddress1;

	private String bankAddress2;

	private String bankAddress3;

	private String bankBranch;

	private String bankCity;

	private String bankName;

	private String bankPincode;

	private String brokerDealerCode;

	private String city;

	private String demat;

	private String distributorARNCode;

	private String dpId;

	private String email;

	private String firstHolderCKYCNumber;

	private java.util.Date folioCreateDate;

	private String gstStateCode;

	private String guardianCKYCNumber;

	private java.util.Date guardianDOB;

	private String guardianName;

	private String guardianPAN;

	private String ifscCode;

	private String investorAdhaarNumber;

	//private String rtaId;

	private java.util.Date investorDOB;

	private String investorMin;

	private String investorName;

	private String joint1PAN;

	private String joint2PAN;

	private String jointHolder1CKYCNumber;

	private java.util.Date jointHolder1DOB;

	private String jointHolder2CKYCNumber;

	private java.util.Date jointHolder2DOB;

	private String jointName1;

	private String jointName2;

	private String mobileNumber;

	private String modeOfHolding;

	private String nominee2Address1;

	private String nominee2Address2;

	private String nominee2Address3;

	private String nominee2City;

	private String nominee2Email;

	private String nominee2Name;

	private String nominee2Percentage;

	private String nominee2PhoneOffice;

	private String nominee2PhoneResidence;

	private String nominee2Pincode;

	private String nominee2Relation;

	private String nominee2State;

	private String nominee3Address1;

	private String nominee3Address2;

	private String nominee3Address3;

	private String nominee3City;

	private String nominee3Email;

	private String nominee3Name;

	private String nominee3Percentage;

	private String nominee3PhoneOffice;

	private String nominee3PhoneResidence;

	private String nominee3Pincode;

	private String nominee3Relation;

	private String nominee3State;

	private String nomineeAddress1;

	private String nomineeAddress2;

	private String nomineeAddress3;

	private String nomineeCity;

	private String nomineeEmail;

	private String nomineeName;

	private String nomineePercentage;

	private String nomineePhoneOffice;

	private String nomineePhoneResidence;

	private String nomineePincode;

	private String nomineeRelation;

	private String nomineeState;

	private String occupation;

	private String phoneOffice;

	private String phoneResidence;

	private String pincode;

	private String reinvFlag;

	private String rupeeBalance;

	private String schemeName;

	private String schemeRTACode;

	private String subbrokerDealerCode;

	private String taxStatus;

	private String tpaLinked;

	private String uin;

	private String unitBalance;
	
	private String createdOn;

	

	public String getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}

	//bi-directional many-to-one association to LookupRTABO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rtaId")
	private LookupRTABO lookupRtabo;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorUser advisorUser;

	public InvestorMasterBO() {
	}

	public InvestorMasterBOPK getId() {
		return this.id;
	}

	public void setId(InvestorMasterBOPK id) {
		this.id = id;
	}

	public String getAddressLine1() {
		return this.addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return this.addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return this.addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAmcCode() {
		return this.amcCode;
	}

	public void setAmcCode(String amcCode) {
		this.amcCode = amcCode;
	}

	public java.util.Date getBalanceDate() {
		return this.balanceDate;
	}

	public void setBalanceDate(java.util.Date balanceDate) {
		this.balanceDate = balanceDate;
	}

	public String getBankAccountNumber() {
		return this.bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public String getBankAccountType() {
		return this.bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	public String getBankAddress1() {
		return this.bankAddress1;
	}

	public void setBankAddress1(String bankAddress1) {
		this.bankAddress1 = bankAddress1;
	}

	public String getBankAddress2() {
		return this.bankAddress2;
	}

	public void setBankAddress2(String bankAddress2) {
		this.bankAddress2 = bankAddress2;
	}

	public String getBankAddress3() {
		return this.bankAddress3;
	}

	public void setBankAddress3(String bankAddress3) {
		this.bankAddress3 = bankAddress3;
	}

	public String getBankBranch() {
		return this.bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getBankCity() {
		return this.bankCity;
	}

	public void setBankCity(String bankCity) {
		this.bankCity = bankCity;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankPincode() {
		return this.bankPincode;
	}

	public void setBankPincode(String bankPincode) {
		this.bankPincode = bankPincode;
	}

	public String getBrokerDealerCode() {
		return this.brokerDealerCode;
	}

	public void setBrokerDealerCode(String brokerDealerCode) {
		this.brokerDealerCode = brokerDealerCode;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDemat() {
		return this.demat;
	}

	public void setDemat(String demat) {
		this.demat = demat;
	}

	public String getDistributorARNCode() {
		return this.distributorARNCode;
	}

	public void setDistributorARNCode(String distributorARNCode) {
		this.distributorARNCode = distributorARNCode;
	}

	public String getDpId() {
		return this.dpId;
	}

	public void setDpId(String dpId) {
		this.dpId = dpId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstHolderCKYCNumber() {
		return this.firstHolderCKYCNumber;
	}

	public void setFirstHolderCKYCNumber(String firstHolderCKYCNumber) {
		this.firstHolderCKYCNumber = firstHolderCKYCNumber;
	}

	public java.util.Date getFolioCreateDate() {
		return this.folioCreateDate;
	}

	public void setFolioCreateDate(java.util.Date folioCreateDate) {
		this.folioCreateDate = folioCreateDate;
	}

	public String getGstStateCode() {
		return this.gstStateCode;
	}

	public void setGstStateCode(String gstStateCode) {
		this.gstStateCode = gstStateCode;
	}

	public String getGuardianCKYCNumber() {
		return this.guardianCKYCNumber;
	}

	public void setGuardianCKYCNumber(String guardianCKYCNumber) {
		this.guardianCKYCNumber = guardianCKYCNumber;
	}

	public java.util.Date getGuardianDOB() {
		return this.guardianDOB;
	}

	public void setGuardianDOB(java.util.Date guardianDOB) {
		this.guardianDOB = guardianDOB;
	}

	public String getGuardianName() {
		return this.guardianName;
	}

	public void setGuardianName(String guardianName) {
		this.guardianName = guardianName;
	}

	public String getGuardianPAN() {
		return this.guardianPAN;
	}

	public void setGuardianPAN(String guardianPAN) {
		this.guardianPAN = guardianPAN;
	}

	public String getIfscCode() {
		return this.ifscCode;
	}

	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	public String getInvestorAdhaarNumber() {
		return this.investorAdhaarNumber;
	}

	public void setInvestorAdhaarNumber(String investorAdhaarNumber) {
		this.investorAdhaarNumber = investorAdhaarNumber;
	}

	public java.util.Date getInvestorDOB() {
		return this.investorDOB;
	}

	public void setInvestorDOB(java.util.Date investorDOB) {
		this.investorDOB = investorDOB;
	}

	public String getInvestorMin() {
		return this.investorMin;
	}

	public void setInvestorMin(String investorMin) {
		this.investorMin = investorMin;
	}

	public String getInvestorName() {
		return this.investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public String getJoint1PAN() {
		return this.joint1PAN;
	}

	public void setJoint1PAN(String joint1PAN) {
		this.joint1PAN = joint1PAN;
	}

	public String getJoint2PAN() {
		return this.joint2PAN;
	}

	public void setJoint2PAN(String joint2PAN) {
		this.joint2PAN = joint2PAN;
	}

	public String getJointHolder1CKYCNumber() {
		return this.jointHolder1CKYCNumber;
	}

	public void setJointHolder1CKYCNumber(String jointHolder1CKYCNumber) {
		this.jointHolder1CKYCNumber = jointHolder1CKYCNumber;
	}

	public java.util.Date getJointHolder1DOB() {
		return this.jointHolder1DOB;
	}

	public void setJointHolder1DOB(java.util.Date jointHolder1DOB) {
		this.jointHolder1DOB = jointHolder1DOB;
	}

	public String getJointHolder2CKYCNumber() {
		return this.jointHolder2CKYCNumber;
	}

	public void setJointHolder2CKYCNumber(String jointHolder2CKYCNumber) {
		this.jointHolder2CKYCNumber = jointHolder2CKYCNumber;
	}

	public java.util.Date getJointHolder2DOB() {
		return this.jointHolder2DOB;
	}

	public void setJointHolder2DOB(java.util.Date jointHolder2DOB) {
		this.jointHolder2DOB = jointHolder2DOB;
	}

	public String getJointName1() {
		return this.jointName1;
	}

	public void setJointName1(String jointName1) {
		this.jointName1 = jointName1;
	}

	public String getJointName2() {
		return this.jointName2;
	}

	public void setJointName2(String jointName2) {
		this.jointName2 = jointName2;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getModeOfHolding() {
		return this.modeOfHolding;
	}

	public void setModeOfHolding(String modeOfHolding) {
		this.modeOfHolding = modeOfHolding;
	}

	public String getNominee2Address1() {
		return this.nominee2Address1;
	}

	public void setNominee2Address1(String nominee2Address1) {
		this.nominee2Address1 = nominee2Address1;
	}

	public String getNominee2Address2() {
		return this.nominee2Address2;
	}

	public void setNominee2Address2(String nominee2Address2) {
		this.nominee2Address2 = nominee2Address2;
	}

	public String getNominee2Address3() {
		return this.nominee2Address3;
	}

	public void setNominee2Address3(String nominee2Address3) {
		this.nominee2Address3 = nominee2Address3;
	}

	public String getNominee2City() {
		return this.nominee2City;
	}

	public void setNominee2City(String nominee2City) {
		this.nominee2City = nominee2City;
	}

	public String getNominee2Email() {
		return this.nominee2Email;
	}

	public void setNominee2Email(String nominee2Email) {
		this.nominee2Email = nominee2Email;
	}

	public String getNominee2Name() {
		return this.nominee2Name;
	}

	public void setNominee2Name(String nominee2Name) {
		this.nominee2Name = nominee2Name;
	}

	public String getNominee2Percentage() {
		return this.nominee2Percentage;
	}

	public void setNominee2Percentage(String nominee2Percentage) {
		this.nominee2Percentage = nominee2Percentage;
	}

	public String getNominee2PhoneOffice() {
		return this.nominee2PhoneOffice;
	}

	public void setNominee2PhoneOffice(String nominee2PhoneOffice) {
		this.nominee2PhoneOffice = nominee2PhoneOffice;
	}

	public String getNominee2PhoneResidence() {
		return this.nominee2PhoneResidence;
	}

	public void setNominee2PhoneResidence(String nominee2PhoneResidence) {
		this.nominee2PhoneResidence = nominee2PhoneResidence;
	}

	public String getNominee2Pincode() {
		return this.nominee2Pincode;
	}

	public void setNominee2Pincode(String nominee2Pincode) {
		this.nominee2Pincode = nominee2Pincode;
	}

	public String getNominee2Relation() {
		return this.nominee2Relation;
	}

	public void setNominee2Relation(String nominee2Relation) {
		this.nominee2Relation = nominee2Relation;
	}

	public String getNominee2State() {
		return this.nominee2State;
	}

	public void setNominee2State(String nominee2State) {
		this.nominee2State = nominee2State;
	}

	public String getNominee3Address1() {
		return this.nominee3Address1;
	}

	public void setNominee3Address1(String nominee3Address1) {
		this.nominee3Address1 = nominee3Address1;
	}

	public String getNominee3Address2() {
		return this.nominee3Address2;
	}

	public void setNominee3Address2(String nominee3Address2) {
		this.nominee3Address2 = nominee3Address2;
	}

	public String getNominee3Address3() {
		return this.nominee3Address3;
	}

	public void setNominee3Address3(String nominee3Address3) {
		this.nominee3Address3 = nominee3Address3;
	}

	public String getNominee3City() {
		return this.nominee3City;
	}

	public void setNominee3City(String nominee3City) {
		this.nominee3City = nominee3City;
	}

	public String getNominee3Email() {
		return this.nominee3Email;
	}

	public void setNominee3Email(String nominee3Email) {
		this.nominee3Email = nominee3Email;
	}

	public String getNominee3Name() {
		return this.nominee3Name;
	}

	public void setNominee3Name(String nominee3Name) {
		this.nominee3Name = nominee3Name;
	}

	public String getNominee3Percentage() {
		return this.nominee3Percentage;
	}

	public void setNominee3Percentage(String nominee3Percentage) {
		this.nominee3Percentage = nominee3Percentage;
	}

	public String getNominee3PhoneOffice() {
		return this.nominee3PhoneOffice;
	}

	public void setNominee3PhoneOffice(String nominee3PhoneOffice) {
		this.nominee3PhoneOffice = nominee3PhoneOffice;
	}

	public String getNominee3PhoneResidence() {
		return this.nominee3PhoneResidence;
	}

	public void setNominee3PhoneResidence(String nominee3PhoneResidence) {
		this.nominee3PhoneResidence = nominee3PhoneResidence;
	}

	public String getNominee3Pincode() {
		return this.nominee3Pincode;
	}

	public void setNominee3Pincode(String nominee3Pincode) {
		this.nominee3Pincode = nominee3Pincode;
	}

	public String getNominee3Relation() {
		return this.nominee3Relation;
	}

	public void setNominee3Relation(String nominee3Relation) {
		this.nominee3Relation = nominee3Relation;
	}

	public String getNominee3State() {
		return this.nominee3State;
	}

	public void setNominee3State(String nominee3State) {
		this.nominee3State = nominee3State;
	}

	public String getNomineeAddress1() {
		return this.nomineeAddress1;
	}

	public void setNomineeAddress1(String nomineeAddress1) {
		this.nomineeAddress1 = nomineeAddress1;
	}

	public String getNomineeAddress2() {
		return this.nomineeAddress2;
	}

	public void setNomineeAddress2(String nomineeAddress2) {
		this.nomineeAddress2 = nomineeAddress2;
	}

	public String getNomineeAddress3() {
		return this.nomineeAddress3;
	}

	public void setNomineeAddress3(String nomineeAddress3) {
		this.nomineeAddress3 = nomineeAddress3;
	}

	public String getNomineeCity() {
		return this.nomineeCity;
	}

	public void setNomineeCity(String nomineeCity) {
		this.nomineeCity = nomineeCity;
	}

	public String getNomineeEmail() {
		return this.nomineeEmail;
	}

	public void setNomineeEmail(String nomineeEmail) {
		this.nomineeEmail = nomineeEmail;
	}

	public String getNomineeName() {
		return this.nomineeName;
	}

	public void setNomineeName(String nomineeName) {
		this.nomineeName = nomineeName;
	}

	public String getNomineePercentage() {
		return this.nomineePercentage;
	}

	public void setNomineePercentage(String nomineePercentage) {
		this.nomineePercentage = nomineePercentage;
	}

	public String getNomineePhoneOffice() {
		return this.nomineePhoneOffice;
	}

	public void setNomineePhoneOffice(String nomineePhoneOffice) {
		this.nomineePhoneOffice = nomineePhoneOffice;
	}

	public String getNomineePhoneResidence() {
		return this.nomineePhoneResidence;
	}

	public void setNomineePhoneResidence(String nomineePhoneResidence) {
		this.nomineePhoneResidence = nomineePhoneResidence;
	}

	public String getNomineePincode() {
		return this.nomineePincode;
	}

	public void setNomineePincode(String nomineePincode) {
		this.nomineePincode = nomineePincode;
	}

	public String getNomineeRelation() {
		return this.nomineeRelation;
	}

	public void setNomineeRelation(String nomineeRelation) {
		this.nomineeRelation = nomineeRelation;
	}

	public String getNomineeState() {
		return this.nomineeState;
	}

	public void setNomineeState(String nomineeState) {
		this.nomineeState = nomineeState;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getPhoneOffice() {
		return this.phoneOffice;
	}

	public void setPhoneOffice(String phoneOffice) {
		this.phoneOffice = phoneOffice;
	}

	public String getPhoneResidence() {
		return this.phoneResidence;
	}

	public void setPhoneResidence(String phoneResidence) {
		this.phoneResidence = phoneResidence;
	}

	public String getPincode() {
		return this.pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getReinvFlag() {
		return this.reinvFlag;
	}

	public void setReinvFlag(String reinvFlag) {
		this.reinvFlag = reinvFlag;
	}

	public String getRupeeBalance() {
		return this.rupeeBalance;
	}

	public void setRupeeBalance(String rupeeBalance) {
		this.rupeeBalance = rupeeBalance;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSchemeRTACode() {
		return this.schemeRTACode;
	}

	public void setSchemeRTACode(String schemeRTACode) {
		this.schemeRTACode = schemeRTACode;
	}

	public String getSubbrokerDealerCode() {
		return this.subbrokerDealerCode;
	}

	public void setSubbrokerDealerCode(String subbrokerDealerCode) {
		this.subbrokerDealerCode = subbrokerDealerCode;
	}

	public String getTaxStatus() {
		return this.taxStatus;
	}

	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}

	public String getTpaLinked() {
		return this.tpaLinked;
	}

	public void setTpaLinked(String tpaLinked) {
		this.tpaLinked = tpaLinked;
	}

	public String getUin() {
		return this.uin;
	}

	public void setUin(String uin) {
		this.uin = uin;
	}

	public String getUnitBalance() {
		return this.unitBalance;
	}

	public void setUnitBalance(String unitBalance) {
		this.unitBalance = unitBalance;
	}

	public LookupRTABO getLookupRtabo() {
		return this.lookupRtabo;
	}

	public void setLookupRtabo(LookupRTABO lookupRtabo) {
		this.lookupRtabo = lookupRtabo;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

}