package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the clientUCCDetails database table.
 * 
 */
@Entity
@Table(name="clientUCCDetails")
@NamedQuery(name="ClientUCCDetail.findAll", query="SELECT c FROM ClientUCCDetail c")
public class ClientUCCDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="clientCode")
	private String clientCode;

	private String clientAccNo1;

	private String clientAccNo2;

	private String clientAccNo3;

	private String clientAccNo4;

	private String clientAccNo5;

	private String clientAdd1;

	private String clientAdd2;

	private String clientAdd3;

	private String clientAppName1;

	private String clientAppName2;

	private String clientAppName3;

	private String clientCDSLCLTID;

	private String clientCDSLDPID;

	private String clientChequeName5;

	private String clientCity;

	private String clientCountry;

	private String clientDOB;

	private String clientEmail;

	private String clientGender;

	private String clientGuardian;

	private String clientGuardianPan;

	private String clientIfscCode1;

	private String clientIfscCode2;

	private String clientIfscCode3;

	private String clientIfscCode4;

	private String clientIfscCode5;

	private String clientMicrNo1;

	private String clientMicrNo2;

	private String clientMicrNo3;

	private String clientMicrNo4;

	private String clientMicrNo5;

	private String clientNominee;

	private String clientNomineeRelation;

	private String clientNSDLCLTID;

	private String clientNSDLDPID;

	private String clientOfficeFax;

	private String clientOfficePhone;

	private String clientPan;

	private String clientPan2;

	private String clientPan3;

	private String clientPincode;

	private String clientResiFax;

	private String clientResiPhone;

	private String cmForAdd1;

	private String cmForAdd2;

	private String cmForAdd3;

	private String cmForCity;

	private String cmForCountry;

	private String cmForOffFax;

	private String cmForOffPhone;

	private String cmForPinCode;

	private String cmForResiFax;

	private String cmForResiPhone;

	private String cmForState;

	private String cmMobile;

	private String defaultBankFlag1;

	private String defaultBankFlag2;

	private String defaultBankFlag3;

	private String defaultBankFlag4;

	private String defaultBankFlag5;

	private String mapinNo;

	//bi-directional many-to-one association to LookupTansactHoldingType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientHolding")
	private LookupTansactHoldingType lookupTansactHoldingType;

	//bi-directional many-to-one association to MasterTransactStateCode
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientState")
	private MasterTransactStateCode masterTransactStateCode;

	//bi-directional many-to-one association to MasterTransactCommunicationMode
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientCommMode")
	private MasterTransactCommunicationMode masterTransactCommunicationMode;

	//bi-directional many-to-one association to MasterTransactDivPayMode
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientDivPayMode")
	private MasterTransactDivPayMode masterTransactDivPayMode;

	//bi-directional many-to-one association to MasterTransactTaxStatus
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientTaxStatus")
	private MasterTransactTaxStatus masterTransactTaxStatus;

	//bi-directional many-to-one association to MasterTransactOccupationCode
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientOccupationCode")
	private MasterTransactOccupationCode masterTransactOccupationCode;

	//bi-directional many-to-one association to LookupTransactUCCClientType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientType")
	private LookupTransactUCCClientType lookupTransactUccclientType;

	//bi-directional many-to-one association to LookupTransactUCCClientDefaultDP
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientDefaultDP")
	private LookupTransactUCCClientDefaultDP lookupTransactUccclientDefaultDp;


	//bi-directional many-to-one association to MasterTransactAccountType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientAccType1")
	private MasterTransactAccountType masterTransactAccountType1;

	//bi-directional many-to-one association to MasterTransactAccountType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientAccType2")
	private MasterTransactAccountType masterTransactAccountType2;

	//bi-directional many-to-one association to MasterTransactAccountType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientAccType3")
	private MasterTransactAccountType masterTransactAccountType3;

	//bi-directional many-to-one association to MasterTransactAccountType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientAccType4")
	private MasterTransactAccountType masterTransactAccountType4;

	//bi-directional many-to-one association to MasterTransactAccountType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientAccType5")
	private MasterTransactAccountType masterTransactAccountType5;
	
	//bi-directional many-to-one association to ClientMaster
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="clientID")
		private ClientMaster clientMaster;

		//bi-directional many-to-one association to AdvisorUser
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="advisorID")
		private AdvisorUser advisorUser;
		
		
	public ClientUCCDetail() {
	}

	public String getClientAccNo1() {
		return this.clientAccNo1;
	}

	public void setClientAccNo1(String clientAccNo1) {
		this.clientAccNo1 = clientAccNo1;
	}

	public String getClientAccNo2() {
		return this.clientAccNo2;
	}

	public void setClientAccNo2(String clientAccNo2) {
		this.clientAccNo2 = clientAccNo2;
	}

	public String getClientAccNo3() {
		return this.clientAccNo3;
	}

	public void setClientAccNo3(String clientAccNo3) {
		this.clientAccNo3 = clientAccNo3;
	}

	public String getClientAccNo4() {
		return this.clientAccNo4;
	}

	public void setClientAccNo4(String clientAccNo4) {
		this.clientAccNo4 = clientAccNo4;
	}

	public String getClientAccNo5() {
		return this.clientAccNo5;
	}

	public void setClientAccNo5(String clientAccNo5) {
		this.clientAccNo5 = clientAccNo5;
	}

	public String getClientAdd1() {
		return this.clientAdd1;
	}

	public void setClientAdd1(String clientAdd1) {
		this.clientAdd1 = clientAdd1;
	}

	public String getClientAdd2() {
		return this.clientAdd2;
	}

	public void setClientAdd2(String clientAdd2) {
		this.clientAdd2 = clientAdd2;
	}

	public String getClientAdd3() {
		return this.clientAdd3;
	}

	public void setClientAdd3(String clientAdd3) {
		this.clientAdd3 = clientAdd3;
	}

	public String getClientAppName1() {
		return this.clientAppName1;
	}

	public void setClientAppName1(String clientAppName1) {
		this.clientAppName1 = clientAppName1;
	}

	public String getClientAppName2() {
		return this.clientAppName2;
	}

	public void setClientAppName2(String clientAppName2) {
		this.clientAppName2 = clientAppName2;
	}

	public String getClientAppName3() {
		return this.clientAppName3;
	}

	public void setClientAppName3(String clientAppName3) {
		this.clientAppName3 = clientAppName3;
	}

	public String getClientCDSLCLTID() {
		return this.clientCDSLCLTID;
	}

	public void setClientCDSLCLTID(String clientCDSLCLTID) {
		this.clientCDSLCLTID = clientCDSLCLTID;
	}

	public String getClientCDSLDPID() {
		return this.clientCDSLDPID;
	}

	public void setClientCDSLDPID(String clientCDSLDPID) {
		this.clientCDSLDPID = clientCDSLDPID;
	}

	public String getClientChequeName5() {
		return this.clientChequeName5;
	}

	public void setClientChequeName5(String clientChequeName5) {
		this.clientChequeName5 = clientChequeName5;
	}

	public String getClientCity() {
		return this.clientCity;
	}

	public void setClientCity(String clientCity) {
		this.clientCity = clientCity;
	}

	public String getClientCode() {
		return this.clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getClientCountry() {
		return this.clientCountry;
	}

	public void setClientCountry(String clientCountry) {
		this.clientCountry = clientCountry;
	}

	public String getClientDOB() {
		return this.clientDOB;
	}

	public void setClientDOB(String clientDOB) {
		this.clientDOB = clientDOB;
	}

	public String getClientEmail() {
		return this.clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public String getClientGender() {
		return this.clientGender;
	}

	public void setClientGender(String clientGender) {
		this.clientGender = clientGender;
	}

	public String getClientGuardian() {
		return this.clientGuardian;
	}

	public void setClientGuardian(String clientGuardian) {
		this.clientGuardian = clientGuardian;
	}

	public String getClientGuardianPan() {
		return this.clientGuardianPan;
	}

	public void setClientGuardianPan(String clientGuardianPan) {
		this.clientGuardianPan = clientGuardianPan;
	}

	public String getClientIfscCode1() {
		return this.clientIfscCode1;
	}

	public void setClientIfscCode1(String clientIfscCode1) {
		this.clientIfscCode1 = clientIfscCode1;
	}

	public String getClientIfscCode2() {
		return this.clientIfscCode2;
	}

	public void setClientIfscCode2(String clientIfscCode2) {
		this.clientIfscCode2 = clientIfscCode2;
	}

	public String getClientIfscCode3() {
		return this.clientIfscCode3;
	}

	public void setClientIfscCode3(String clientIfscCode3) {
		this.clientIfscCode3 = clientIfscCode3;
	}

	public String getClientIfscCode4() {
		return this.clientIfscCode4;
	}

	public void setClientIfscCode4(String clientIfscCode4) {
		this.clientIfscCode4 = clientIfscCode4;
	}

	public String getClientIfscCode5() {
		return this.clientIfscCode5;
	}

	public void setClientIfscCode5(String clientIfscCode5) {
		this.clientIfscCode5 = clientIfscCode5;
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

	public String getClientNSDLCLTID() {
		return this.clientNSDLCLTID;
	}

	public void setClientNSDLCLTID(String clientNSDLCLTID) {
		this.clientNSDLCLTID = clientNSDLCLTID;
	}

	public String getClientNSDLDPID() {
		return this.clientNSDLDPID;
	}

	public void setClientNSDLDPID(String clientNSDLDPID) {
		this.clientNSDLDPID = clientNSDLDPID;
	}

	public String getClientOfficeFax() {
		return this.clientOfficeFax;
	}

	public void setClientOfficeFax(String clientOfficeFax) {
		this.clientOfficeFax = clientOfficeFax;
	}

	public String getClientOfficePhone() {
		return this.clientOfficePhone;
	}

	public void setClientOfficePhone(String clientOfficePhone) {
		this.clientOfficePhone = clientOfficePhone;
	}

	public String getClientPan() {
		return this.clientPan;
	}

	public void setClientPan(String clientPan) {
		this.clientPan = clientPan;
	}

	public String getClientPan2() {
		return this.clientPan2;
	}

	public void setClientPan2(String clientPan2) {
		this.clientPan2 = clientPan2;
	}

	public String getClientPan3() {
		return this.clientPan3;
	}

	public void setClientPan3(String clientPan3) {
		this.clientPan3 = clientPan3;
	}

	public String getClientPincode() {
		return this.clientPincode;
	}

	public void setClientPincode(String clientPincode) {
		this.clientPincode = clientPincode;
	}

	public String getClientResiFax() {
		return this.clientResiFax;
	}

	public void setClientResiFax(String clientResiFax) {
		this.clientResiFax = clientResiFax;
	}

	public String getClientResiPhone() {
		return this.clientResiPhone;
	}

	public void setClientResiPhone(String clientResiPhone) {
		this.clientResiPhone = clientResiPhone;
	}

	public String getCmForAdd1() {
		return this.cmForAdd1;
	}

	public void setCmForAdd1(String cmForAdd1) {
		this.cmForAdd1 = cmForAdd1;
	}

	public String getCmForAdd2() {
		return this.cmForAdd2;
	}

	public void setCmForAdd2(String cmForAdd2) {
		this.cmForAdd2 = cmForAdd2;
	}

	public String getCmForAdd3() {
		return this.cmForAdd3;
	}

	public void setCmForAdd3(String cmForAdd3) {
		this.cmForAdd3 = cmForAdd3;
	}

	public String getCmForCity() {
		return this.cmForCity;
	}

	public void setCmForCity(String cmForCity) {
		this.cmForCity = cmForCity;
	}

	public String getCmForCountry() {
		return this.cmForCountry;
	}

	public void setCmForCountry(String cmForCountry) {
		this.cmForCountry = cmForCountry;
	}

	public String getCmForOffFax() {
		return this.cmForOffFax;
	}

	public void setCmForOffFax(String cmForOffFax) {
		this.cmForOffFax = cmForOffFax;
	}

	public String getCmForOffPhone() {
		return this.cmForOffPhone;
	}

	public void setCmForOffPhone(String cmForOffPhone) {
		this.cmForOffPhone = cmForOffPhone;
	}

	public String getCmForPinCode() {
		return this.cmForPinCode;
	}

	public void setCmForPinCode(String cmForPinCode) {
		this.cmForPinCode = cmForPinCode;
	}

	public String getCmForResiFax() {
		return this.cmForResiFax;
	}

	public void setCmForResiFax(String cmForResiFax) {
		this.cmForResiFax = cmForResiFax;
	}

	public String getCmForResiPhone() {
		return this.cmForResiPhone;
	}

	public void setCmForResiPhone(String cmForResiPhone) {
		this.cmForResiPhone = cmForResiPhone;
	}

	public String getCmForState() {
		return this.cmForState;
	}

	public void setCmForState(String cmForState) {
		this.cmForState = cmForState;
	}

	public String getCmMobile() {
		return this.cmMobile;
	}

	public void setCmMobile(String cmMobile) {
		this.cmMobile = cmMobile;
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

	public String getMapinNo() {
		return this.mapinNo;
	}

	public void setMapinNo(String mapinNo) {
		this.mapinNo = mapinNo;
	}

	public LookupTansactHoldingType getLookupTansactHoldingType() {
		return this.lookupTansactHoldingType;
	}

	public void setLookupTansactHoldingType(LookupTansactHoldingType lookupTansactHoldingType) {
		this.lookupTansactHoldingType = lookupTansactHoldingType;
	}

	public MasterTransactAccountType getMasterTransactAccountType1() {
		return this.masterTransactAccountType1;
	}

	public void setMasterTransactAccountType1(MasterTransactAccountType masterTransactAccountType1) {
		this.masterTransactAccountType1 = masterTransactAccountType1;
	}

	public MasterTransactStateCode getMasterTransactStateCode() {
		return this.masterTransactStateCode;
	}

	public void setMasterTransactStateCode(MasterTransactStateCode masterTransactStateCode) {
		this.masterTransactStateCode = masterTransactStateCode;
	}

	public MasterTransactCommunicationMode getMasterTransactCommunicationMode() {
		return this.masterTransactCommunicationMode;
	}

	public void setMasterTransactCommunicationMode(MasterTransactCommunicationMode masterTransactCommunicationMode) {
		this.masterTransactCommunicationMode = masterTransactCommunicationMode;
	}

	public MasterTransactDivPayMode getMasterTransactDivPayMode() {
		return this.masterTransactDivPayMode;
	}

	public void setMasterTransactDivPayMode(MasterTransactDivPayMode masterTransactDivPayMode) {
		this.masterTransactDivPayMode = masterTransactDivPayMode;
	}

	public MasterTransactTaxStatus getMasterTransactTaxStatus() {
		return this.masterTransactTaxStatus;
	}

	public void setMasterTransactTaxStatus(MasterTransactTaxStatus masterTransactTaxStatus) {
		this.masterTransactTaxStatus = masterTransactTaxStatus;
	}

	public MasterTransactOccupationCode getMasterTransactOccupationCode() {
		return this.masterTransactOccupationCode;
	}

	public void setMasterTransactOccupationCode(MasterTransactOccupationCode masterTransactOccupationCode) {
		this.masterTransactOccupationCode = masterTransactOccupationCode;
	}

	public LookupTransactUCCClientType getLookupTransactUccclientType() {
		return this.lookupTransactUccclientType;
	}

	public void setLookupTransactUccclientType(LookupTransactUCCClientType lookupTransactUccclientType) {
		this.lookupTransactUccclientType = lookupTransactUccclientType;
	}

	public LookupTransactUCCClientDefaultDP getLookupTransactUccclientDefaultDp() {
		return this.lookupTransactUccclientDefaultDp;
	}

	public void setLookupTransactUccclientDefaultDp(LookupTransactUCCClientDefaultDP lookupTransactUccclientDefaultDp) {
		this.lookupTransactUccclientDefaultDp = lookupTransactUccclientDefaultDp;
	}

	public MasterTransactAccountType getMasterTransactAccountType2() {
		return this.masterTransactAccountType2;
	}

	public void setMasterTransactAccountType2(MasterTransactAccountType masterTransactAccountType2) {
		this.masterTransactAccountType2 = masterTransactAccountType2;
	}

	public MasterTransactAccountType getMasterTransactAccountType3() {
		return this.masterTransactAccountType3;
	}

	public void setMasterTransactAccountType3(MasterTransactAccountType masterTransactAccountType3) {
		this.masterTransactAccountType3 = masterTransactAccountType3;
	}

	public MasterTransactAccountType getMasterTransactAccountType4() {
		return this.masterTransactAccountType4;
	}

	public void setMasterTransactAccountType4(MasterTransactAccountType masterTransactAccountType4) {
		this.masterTransactAccountType4 = masterTransactAccountType4;
	}

	public MasterTransactAccountType getMasterTransactAccountType5() {
		return this.masterTransactAccountType5;
	}

	public void setMasterTransactAccountType5(MasterTransactAccountType masterTransactAccountType5) {
		this.masterTransactAccountType5 = masterTransactAccountType5;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}
	
	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}
	
}