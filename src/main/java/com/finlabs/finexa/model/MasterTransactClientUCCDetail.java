package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the masterTransactClientUCCDetails database table.
 * 
 */
@Entity
@Table(name="masterTransactClientUCCDetails")
@NamedQuery(name="MasterTransactClientUCCDetail.findAll", query="SELECT m FROM MasterTransactClientUCCDetail m")
public class MasterTransactClientUCCDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="clientCode")
	private String clientCode;

	@Column(name="1stHolderCkyc")
	private String _stHolderCkyc;

	@Column(name="2ndHolderCkyc")
	private String _ndHolderCkyc;

	@Column(name="3rdHolderCkyc")
	private String _rdHolderCkyc;

	private String accNumber1;

	private String accNumber2;

	private String accNumber3;

	private String accNumber4;

	private String accNumber5;

	private String accType1;

	private String accType2;

	private String accType3;

	private String accType4;

	private String accType5;

	private String add1;

	private String add2;

	private String add3;

	private String bankBranch1;

	private String bankBranch2;

	private String bankBranch3;

	private String bankBranch4;

	private String bankBranch5;

	private String bankName1;

	private String bankName2;

	private String bankName3;

	private String bankName4;

	private String bankName5;

	private String branch;

	@Column(name="CDSLCLTID")
	private String cdslcltid;

	@Column(name="CDSLDPID")
	private String cdsldpid;

	private String city;

	private String ckyc;

	private String clientDefaultDP;

	private String clientEmail;

	private String clientGuardian;

	private String clientHolding;

	private String clientMicrNo1;

	private String clientMicrNo2;

	private String clientMicrNo3;

	private String clientMicrNo4;

	private String clientMicrNo5;

	private String clientNominee;

	private String clientNomineeRelation;

	private String clientOfficeFax;

	private String clientState;

	private String clientType;

	private String commMode;

	private String country;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	private String createdBy;

	private String dealer;

	private String defaultBankFlag1;

	private String defaultBankFlag2;

	private String defaultBankFlag3;

	private String defaultBankFlag4;

	private String defaultBankFlag5;

	private String divPayMode;

	private String firstAppGender;

	private String firstApplicantDOB;

	private String firstApplicantName;

	private String firstApplicantPan;

	private String forAdd1;

	private String forAdd2;

	private String forAdd3;

	private String forCity;

	private String forCountry;

	private String forOffFax;

	private String forOffPhone;

	private String forPinCode;

	private String forResiFax;

	private String forResiPhone;

	private String forState;

	private String guardianCKYC;

	private String guardianCKYCDOB;

	private String guardianPan;

	private String jointHolder1DOB;

	private String jointHolder2DOB;

	private String kycType1;

	private String kycType2;

	private String kycType3;

	private String kycTypeGuardian;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedAt;

	private String lastModifiedBy;

	private String mapinNo;

	private String mobile;

	@Column(name="NeftIfscCode1")
	private String neftIfscCode1;

	@Column(name="NeftIfscCode2")
	private String neftIfscCode2;

	private String neftIfscCode3;

	private String neftIfscCode4;

	private String neftIfscCode5;

	@Column(name="NSDLCLTID")
	private String nsdlcltid;

	@Column(name="NSDLDPID")
	private String nsdldpid;

	private String occupation;

	private String officephone;

	private String pinCode;

	private String resiFax;

	private String resiPhone;

	private String secondApplicantName;

	private String secondAppName1;

	private String taxStatus;

	private String thirdApplicantName;

	private String thirdAppPan;

	public MasterTransactClientUCCDetail() {
	}

	public String getClientCode() {
		return this.clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String get_stHolderCkyc() {
		return this._stHolderCkyc;
	}

	public void set_stHolderCkyc(String _stHolderCkyc) {
		this._stHolderCkyc = _stHolderCkyc;
	}

	public String get_ndHolderCkyc() {
		return this._ndHolderCkyc;
	}

	public void set_ndHolderCkyc(String _ndHolderCkyc) {
		this._ndHolderCkyc = _ndHolderCkyc;
	}

	public String get_rdHolderCkyc() {
		return this._rdHolderCkyc;
	}

	public void set_rdHolderCkyc(String _rdHolderCkyc) {
		this._rdHolderCkyc = _rdHolderCkyc;
	}

	public String getAccNumber1() {
		return this.accNumber1;
	}

	public void setAccNumber1(String accNumber1) {
		this.accNumber1 = accNumber1;
	}

	public String getAccNumber2() {
		return this.accNumber2;
	}

	public void setAccNumber2(String accNumber2) {
		this.accNumber2 = accNumber2;
	}

	public String getAccNumber3() {
		return this.accNumber3;
	}

	public void setAccNumber3(String accNumber3) {
		this.accNumber3 = accNumber3;
	}

	public String getAccNumber4() {
		return this.accNumber4;
	}

	public void setAccNumber4(String accNumber4) {
		this.accNumber4 = accNumber4;
	}

	public String getAccNumber5() {
		return this.accNumber5;
	}

	public void setAccNumber5(String accNumber5) {
		this.accNumber5 = accNumber5;
	}

	public String getAccType1() {
		return this.accType1;
	}

	public void setAccType1(String accType1) {
		this.accType1 = accType1;
	}

	public String getAccType2() {
		return this.accType2;
	}

	public void setAccType2(String accType2) {
		this.accType2 = accType2;
	}

	public String getAccType3() {
		return this.accType3;
	}

	public void setAccType3(String accType3) {
		this.accType3 = accType3;
	}

	public String getAccType4() {
		return this.accType4;
	}

	public void setAccType4(String accType4) {
		this.accType4 = accType4;
	}

	public String getAccType5() {
		return this.accType5;
	}

	public void setAccType5(String accType5) {
		this.accType5 = accType5;
	}

	public String getAdd1() {
		return this.add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return this.add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getAdd3() {
		return this.add3;
	}

	public void setAdd3(String add3) {
		this.add3 = add3;
	}

	public String getBankBranch1() {
		return this.bankBranch1;
	}

	public void setBankBranch1(String bankBranch1) {
		this.bankBranch1 = bankBranch1;
	}

	public String getBankBranch2() {
		return this.bankBranch2;
	}

	public void setBankBranch2(String bankBranch2) {
		this.bankBranch2 = bankBranch2;
	}

	public String getBankBranch3() {
		return this.bankBranch3;
	}

	public void setBankBranch3(String bankBranch3) {
		this.bankBranch3 = bankBranch3;
	}

	public String getBankBranch4() {
		return this.bankBranch4;
	}

	public void setBankBranch4(String bankBranch4) {
		this.bankBranch4 = bankBranch4;
	}

	public String getBankBranch5() {
		return this.bankBranch5;
	}

	public void setBankBranch5(String bankBranch5) {
		this.bankBranch5 = bankBranch5;
	}

	public String getBankName1() {
		return this.bankName1;
	}

	public void setBankName1(String bankName1) {
		this.bankName1 = bankName1;
	}

	public String getBankName2() {
		return this.bankName2;
	}

	public void setBankName2(String bankName2) {
		this.bankName2 = bankName2;
	}

	public String getBankName3() {
		return this.bankName3;
	}

	public void setBankName3(String bankName3) {
		this.bankName3 = bankName3;
	}

	public String getBankName4() {
		return this.bankName4;
	}

	public void setBankName4(String bankName4) {
		this.bankName4 = bankName4;
	}

	public String getBankName5() {
		return this.bankName5;
	}

	public void setBankName5(String bankName5) {
		this.bankName5 = bankName5;
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getCdslcltid() {
		return this.cdslcltid;
	}

	public void setCdslcltid(String cdslcltid) {
		this.cdslcltid = cdslcltid;
	}

	public String getCdsldpid() {
		return this.cdsldpid;
	}

	public void setCdsldpid(String cdsldpid) {
		this.cdsldpid = cdsldpid;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCkyc() {
		return this.ckyc;
	}

	public void setCkyc(String ckyc) {
		this.ckyc = ckyc;
	}

	public String getClientDefaultDP() {
		return this.clientDefaultDP;
	}

	public void setClientDefaultDP(String clientDefaultDP) {
		this.clientDefaultDP = clientDefaultDP;
	}

	public String getClientEmail() {
		return this.clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientGuardian() {
		return this.clientGuardian;
	}

	public void setClientGuardian(String clientGuardian) {
		this.clientGuardian = clientGuardian;
	}

	public String getClientHolding() {
		return this.clientHolding;
	}

	public void setClientHolding(String clientHolding) {
		this.clientHolding = clientHolding;
	}

	public String getClientMicrNo1() {
		return this.clientMicrNo1;
	}

	public void setClientMicrNo1(String clientMicrNo1) {
		this.clientMicrNo1 = clientMicrNo1;
	}

	public String getClientMicrNo2() {
		return this.clientMicrNo2;
	}

	public void setClientMicrNo2(String clientMicrNo2) {
		this.clientMicrNo2 = clientMicrNo2;
	}

	public String getClientMicrNo3() {
		return this.clientMicrNo3;
	}

	public void setClientMicrNo3(String clientMicrNo3) {
		this.clientMicrNo3 = clientMicrNo3;
	}

	public String getClientMicrNo4() {
		return this.clientMicrNo4;
	}

	public void setClientMicrNo4(String clientMicrNo4) {
		this.clientMicrNo4 = clientMicrNo4;
	}

	public String getClientMicrNo5() {
		return this.clientMicrNo5;
	}

	public void setClientMicrNo5(String clientMicrNo5) {
		this.clientMicrNo5 = clientMicrNo5;
	}

	public String getClientNominee() {
		return this.clientNominee;
	}

	public void setClientNominee(String clientNominee) {
		this.clientNominee = clientNominee;
	}

	public String getClientNomineeRelation() {
		return this.clientNomineeRelation;
	}

	public void setClientNomineeRelation(String clientNomineeRelation) {
		this.clientNomineeRelation = clientNomineeRelation;
	}

	public String getClientOfficeFax() {
		return this.clientOfficeFax;
	}

	public void setClientOfficeFax(String clientOfficeFax) {
		this.clientOfficeFax = clientOfficeFax;
	}

	public String getClientState() {
		return this.clientState;
	}

	public void setClientState(String clientState) {
		this.clientState = clientState;
	}

	public String getClientType() {
		return this.clientType;
	}

	public void setClientType(String clientType) {
		this.clientType = clientType;
	}

	public String getCommMode() {
		return this.commMode;
	}

	public void setCommMode(String commMode) {
		this.commMode = commMode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDealer() {
		return this.dealer;
	}

	public void setDealer(String dealer) {
		this.dealer = dealer;
	}

	public String getDefaultBankFlag1() {
		return this.defaultBankFlag1;
	}

	public void setDefaultBankFlag1(String defaultBankFlag1) {
		this.defaultBankFlag1 = defaultBankFlag1;
	}

	public String getDefaultBankFlag2() {
		return this.defaultBankFlag2;
	}

	public void setDefaultBankFlag2(String defaultBankFlag2) {
		this.defaultBankFlag2 = defaultBankFlag2;
	}

	public String getDefaultBankFlag3() {
		return this.defaultBankFlag3;
	}

	public void setDefaultBankFlag3(String defaultBankFlag3) {
		this.defaultBankFlag3 = defaultBankFlag3;
	}

	public String getDefaultBankFlag4() {
		return this.defaultBankFlag4;
	}

	public void setDefaultBankFlag4(String defaultBankFlag4) {
		this.defaultBankFlag4 = defaultBankFlag4;
	}

	public String getDefaultBankFlag5() {
		return this.defaultBankFlag5;
	}

	public void setDefaultBankFlag5(String defaultBankFlag5) {
		this.defaultBankFlag5 = defaultBankFlag5;
	}

	public String getDivPayMode() {
		return this.divPayMode;
	}

	public void setDivPayMode(String divPayMode) {
		this.divPayMode = divPayMode;
	}

	public String getFirstAppGender() {
		return this.firstAppGender;
	}

	public void setFirstAppGender(String firstAppGender) {
		this.firstAppGender = firstAppGender;
	}

	public String getFirstApplicantDOB() {
		return this.firstApplicantDOB;
	}

	public void setFirstApplicantDOB(String firstApplicantDOB) {
		this.firstApplicantDOB = firstApplicantDOB;
	}

	public String getFirstApplicantName() {
		return this.firstApplicantName;
	}

	public void setFirstApplicantName(String firstApplicantName) {
		this.firstApplicantName = firstApplicantName;
	}

	public String getFirstApplicantPan() {
		return this.firstApplicantPan;
	}

	public void setFirstApplicantPan(String firstApplicantPan) {
		this.firstApplicantPan = firstApplicantPan;
	}

	public String getForAdd1() {
		return this.forAdd1;
	}

	public void setForAdd1(String forAdd1) {
		this.forAdd1 = forAdd1;
	}

	public String getForAdd2() {
		return this.forAdd2;
	}

	public void setForAdd2(String forAdd2) {
		this.forAdd2 = forAdd2;
	}

	public String getForAdd3() {
		return this.forAdd3;
	}

	public void setForAdd3(String forAdd3) {
		this.forAdd3 = forAdd3;
	}

	public String getForCity() {
		return this.forCity;
	}

	public void setForCity(String forCity) {
		this.forCity = forCity;
	}

	public String getForCountry() {
		return this.forCountry;
	}

	public void setForCountry(String forCountry) {
		this.forCountry = forCountry;
	}

	public String getForOffFax() {
		return this.forOffFax;
	}

	public void setForOffFax(String forOffFax) {
		this.forOffFax = forOffFax;
	}

	public String getForOffPhone() {
		return this.forOffPhone;
	}

	public void setForOffPhone(String forOffPhone) {
		this.forOffPhone = forOffPhone;
	}

	public String getForPinCode() {
		return this.forPinCode;
	}

	public void setForPinCode(String forPinCode) {
		this.forPinCode = forPinCode;
	}

	public String getForResiFax() {
		return this.forResiFax;
	}

	public void setForResiFax(String forResiFax) {
		this.forResiFax = forResiFax;
	}

	public String getForResiPhone() {
		return this.forResiPhone;
	}

	public void setForResiPhone(String forResiPhone) {
		this.forResiPhone = forResiPhone;
	}

	public String getForState() {
		return this.forState;
	}

	public void setForState(String forState) {
		this.forState = forState;
	}

	public String getGuardianCKYC() {
		return this.guardianCKYC;
	}

	public void setGuardianCKYC(String guardianCKYC) {
		this.guardianCKYC = guardianCKYC;
	}

	public String getGuardianCKYCDOB() {
		return this.guardianCKYCDOB;
	}

	public void setGuardianCKYCDOB(String guardianCKYCDOB) {
		this.guardianCKYCDOB = guardianCKYCDOB;
	}

	public String getGuardianPan() {
		return this.guardianPan;
	}

	public void setGuardianPan(String guardianPan) {
		this.guardianPan = guardianPan;
	}

	public String getJointHolder1DOB() {
		return this.jointHolder1DOB;
	}

	public void setJointHolder1DOB(String jointHolder1DOB) {
		this.jointHolder1DOB = jointHolder1DOB;
	}

	public String getJointHolder2DOB() {
		return this.jointHolder2DOB;
	}

	public void setJointHolder2DOB(String jointHolder2DOB) {
		this.jointHolder2DOB = jointHolder2DOB;
	}

	public String getKycType1() {
		return this.kycType1;
	}

	public void setKycType1(String kycType1) {
		this.kycType1 = kycType1;
	}

	public String getKycType2() {
		return this.kycType2;
	}

	public void setKycType2(String kycType2) {
		this.kycType2 = kycType2;
	}

	public String getKycType3() {
		return this.kycType3;
	}

	public void setKycType3(String kycType3) {
		this.kycType3 = kycType3;
	}

	public String getKycTypeGuardian() {
		return this.kycTypeGuardian;
	}

	public void setKycTypeGuardian(String kycTypeGuardian) {
		this.kycTypeGuardian = kycTypeGuardian;
	}

	public Date getLastModifiedAt() {
		return this.lastModifiedAt;
	}

	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getMapinNo() {
		return this.mapinNo;
	}

	public void setMapinNo(String mapinNo) {
		this.mapinNo = mapinNo;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNeftIfscCode1() {
		return this.neftIfscCode1;
	}

	public void setNeftIfscCode1(String neftIfscCode1) {
		this.neftIfscCode1 = neftIfscCode1;
	}

	public String getNeftIfscCode2() {
		return this.neftIfscCode2;
	}

	public void setNeftIfscCode2(String neftIfscCode2) {
		this.neftIfscCode2 = neftIfscCode2;
	}

	public String getNeftIfscCode3() {
		return this.neftIfscCode3;
	}

	public void setNeftIfscCode3(String neftIfscCode3) {
		this.neftIfscCode3 = neftIfscCode3;
	}

	public String getNeftIfscCode4() {
		return this.neftIfscCode4;
	}

	public void setNeftIfscCode4(String neftIfscCode4) {
		this.neftIfscCode4 = neftIfscCode4;
	}

	public String getNeftIfscCode5() {
		return this.neftIfscCode5;
	}

	public void setNeftIfscCode5(String neftIfscCode5) {
		this.neftIfscCode5 = neftIfscCode5;
	}

	public String getNsdlcltid() {
		return this.nsdlcltid;
	}

	public void setNsdlcltid(String nsdlcltid) {
		this.nsdlcltid = nsdlcltid;
	}

	public String getNsdldpid() {
		return this.nsdldpid;
	}

	public void setNsdldpid(String nsdldpid) {
		this.nsdldpid = nsdldpid;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public String getOfficephone() {
		return this.officephone;
	}

	public void setOfficephone(String officephone) {
		this.officephone = officephone;
	}

	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getResiFax() {
		return this.resiFax;
	}

	public void setResiFax(String resiFax) {
		this.resiFax = resiFax;
	}

	public String getResiPhone() {
		return this.resiPhone;
	}

	public void setResiPhone(String resiPhone) {
		this.resiPhone = resiPhone;
	}

	public String getSecondApplicantName() {
		return this.secondApplicantName;
	}

	public void setSecondApplicantName(String secondApplicantName) {
		this.secondApplicantName = secondApplicantName;
	}

	public String getSecondAppName1() {
		return this.secondAppName1;
	}

	public void setSecondAppName1(String secondAppName1) {
		this.secondAppName1 = secondAppName1;
	}

	public String getTaxStatus() {
		return this.taxStatus;
	}

	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}

	public String getThirdApplicantName() {
		return this.thirdApplicantName;
	}

	public void setThirdApplicantName(String thirdApplicantName) {
		this.thirdApplicantName = thirdApplicantName;
	}

	public String getThirdAppPan() {
		return this.thirdAppPan;
	}

	public void setThirdAppPan(String thirdAppPan) {
		this.thirdAppPan = thirdAppPan;
	}

}