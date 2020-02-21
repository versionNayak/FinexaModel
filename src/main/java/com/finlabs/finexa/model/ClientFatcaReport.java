package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;

/**
 * The persistent class for the clientFatcaReport database table.
 * 
 */
@Entity
@Table(name = "clientFatcaReport")
@NamedQuery(name = "ClientFatcaReport.findAll", query = "SELECT c FROM ClientFatcaReport c")
public class ClientFatcaReport implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;

	private String aadhaarRp;

	private String actNfeSc;

	private String bseResponse;

	private String bseResponseCode;

	private String clientCode;

	private String corpServs;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	private String dataSrc;

	@Temporal(TemporalType.DATE)
	private Date dob;

	private String exchName;

	private String exempCode;

	private String ffiDrnfe;

	private String filler1;

	private String filler2;

	private String frName;

	private String giinExemc;

	private String giinNa;

	private String giinNo;

	private String id2Type;

	private String id3Type;

	private String id4Type;

	private String invName;

	private Timestamp lastUpdatedOn;

	private String logName;

	private String natureBus;

	private BigInteger netWorth;

	private String newChange;

	private String nffeCatg;

	@Temporal(TemporalType.DATE)
	private Date nwDate;

	private String occType;

	private String panRP;

	private String pekrn;

	private String pepFlag;

	private String poBirInc;

	private String relListed;

	private String saveMode;

	private String sdfFlag;

	private String spName;

	private String sprEntity;

	private String taxRes2;

	private String taxRes3;

	private String taxRes4;

	private String tpin1;

	private String tpin2;

	private String tpin3;

	private String tpin4;

	private String uboAdd1;

	private String uboAdd2;

	private String uboAdd3;

	private String uboAddTy;

	private String uboAppl;

	private String uboCity;

	private String uboCntry;

	private String uboCob;

	private String uboCode;

	private String uboCount;

	private String uboCtr;

	private String uboDf;

	@Temporal(TemporalType.DATE)
	private Date uboDob;

	private String uboFrNam;

	private String uboGender;

	private String uboHolPc;

	private String uboIdTy;

	private String uboMobile;

	private String uboName;

	private String uboNation;

	private String uboOcc;

	private String uboOccTy;

	private String uboPan;

	private String uboPin;

	private String uboState;

	private String uboTel;

	private String uboTin;

	// bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "advisorID")
	private AdvisorUser advisorUser;

	// bi-directional many-to-one association to MasterTransactIdentificationType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id1Type")
	private MasterTransactIdentificationType masterTransactIdentificationType;

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to MasterTransactTaxStatus
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taxStatus")
	private MasterTransactTaxStatus masterTransactTaxStatus;

	// bi-directional many-to-one association to MasterTransactAddressType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "addrType")
	private MasterTransactAddressType masterTransactAddressType;

	// bi-directional many-to-one association to MasterTransactCountryNationality
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "coBirInc")
	private MasterTransactCountryNationality masterTransactCountryNationality1;

	// bi-directional many-to-one association to MasterTransactCountryNationality
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taxRes1")
	private MasterTransactCountryNationality masterTransactCountryNationality2;

	// bi-directional many-to-one association to MasterTransactSourceOfWealth
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "srceWealt")
	private MasterTransactSourceOfWealth masterTransactSourceOfWealth;

	// bi-directional many-to-one association to MasterTransactSourceOfWealth
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "incSlab")
	private MasterTransactIncome masterTransactIncome;

	// bi-directional many-to-one association to MasterTransactOccupationCode
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "occCode")
	private MasterTransactOccupationCode masterTransactOccupationCode;

	public ClientFatcaReport() {
	}

	public String getAadhaarRp() {
		return this.aadhaarRp;
	}

	public void setAadhaarRp(String aadhaarRp) {
		this.aadhaarRp = aadhaarRp;
	}

	public String getActNfeSc() {
		return this.actNfeSc;
	}

	public void setActNfeSc(String actNfeSc) {
		this.actNfeSc = actNfeSc;
	}

	public String getBseResponse() {
		return this.bseResponse;
	}

	public void setBseResponse(String bseResponse) {
		this.bseResponse = bseResponse;
	}

	public String getBseResponseCode() {
		return this.bseResponseCode;
	}

	public void setBseResponseCode(String bseResponseCode) {
		this.bseResponseCode = bseResponseCode;
	}

	public String getClientCode() {
		return this.clientCode;
	}

	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}

	public String getCorpServs() {
		return this.corpServs;
	}

	public void setCorpServs(String corpServs) {
		this.corpServs = corpServs;
	}

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getDataSrc() {
		return this.dataSrc;
	}

	public void setDataSrc(String dataSrc) {
		this.dataSrc = dataSrc;
	}

	public Date getDob() {
		return this.dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getExchName() {
		return this.exchName;
	}

	public void setExchName(String exchName) {
		this.exchName = exchName;
	}

	public String getExempCode() {
		return this.exempCode;
	}

	public void setExempCode(String exempCode) {
		this.exempCode = exempCode;
	}

	public String getFfiDrnfe() {
		return this.ffiDrnfe;
	}

	public void setFfiDrnfe(String ffiDrnfe) {
		this.ffiDrnfe = ffiDrnfe;
	}

	public String getFiller1() {
		return this.filler1;
	}

	public void setFiller1(String filler1) {
		this.filler1 = filler1;
	}

	public String getFiller2() {
		return this.filler2;
	}

	public void setFiller2(String filler2) {
		this.filler2 = filler2;
	}

	public String getFrName() {
		return this.frName;
	}

	public void setFrName(String frName) {
		this.frName = frName;
	}

	public String getGiinExemc() {
		return this.giinExemc;
	}

	public void setGiinExemc(String giinExemc) {
		this.giinExemc = giinExemc;
	}

	public String getGiinNa() {
		return this.giinNa;
	}

	public void setGiinNa(String giinNa) {
		this.giinNa = giinNa;
	}

	public String getGiinNo() {
		return this.giinNo;
	}

	public void setGiinNo(String giinNo) {
		this.giinNo = giinNo;
	}

	public String getId2Type() {
		return this.id2Type;
	}

	public void setId2Type(String id2Type) {
		this.id2Type = id2Type;
	}

	public String getId3Type() {
		return this.id3Type;
	}

	public void setId3Type(String id3Type) {
		this.id3Type = id3Type;
	}

	public String getId4Type() {
		return this.id4Type;
	}

	public void setId4Type(String id4Type) {
		this.id4Type = id4Type;
	}

	public String getInvName() {
		return this.invName;
	}

	public void setInvName(String invName) {
		this.invName = invName;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getLogName() {
		return this.logName;
	}

	public void setLogName(String logName) {
		this.logName = logName;
	}

	public String getNatureBus() {
		return this.natureBus;
	}

	public void setNatureBus(String natureBus) {
		this.natureBus = natureBus;
	}

	public BigInteger getNetWorth() {
		return this.netWorth;
	}

	public void setNetWorth(BigInteger netWorth) {
		this.netWorth = netWorth;
	}

	public String getNewChange() {
		return this.newChange;
	}

	public void setNewChange(String newChange) {
		this.newChange = newChange;
	}

	public String getNffeCatg() {
		return this.nffeCatg;
	}

	public void setNffeCatg(String nffeCatg) {
		this.nffeCatg = nffeCatg;
	}

	public Date getNwDate() {
		return this.nwDate;
	}

	public void setNwDate(Date nwDate) {
		this.nwDate = nwDate;
	}

	public String getOccType() {
		return this.occType;
	}

	public void setOccType(String occType) {
		this.occType = occType;
	}

	public String getPanRP() {
		return this.panRP;
	}

	public void setPanRP(String panRP) {
		this.panRP = panRP;
	}

	public String getPekrn() {
		return this.pekrn;
	}

	public void setPekrn(String pekrn) {
		this.pekrn = pekrn;
	}

	public String getPepFlag() {
		return this.pepFlag;
	}

	public void setPepFlag(String pepFlag) {
		this.pepFlag = pepFlag;
	}

	public String getPoBirInc() {
		return this.poBirInc;
	}

	public void setPoBirInc(String poBirInc) {
		this.poBirInc = poBirInc;
	}

	public String getRelListed() {
		return this.relListed;
	}

	public void setRelListed(String relListed) {
		this.relListed = relListed;
	}

	public String getSaveMode() {
		return this.saveMode;
	}

	public void setSaveMode(String saveMode) {
		this.saveMode = saveMode;
	}

	public String getSdfFlag() {
		return this.sdfFlag;
	}

	public void setSdfFlag(String sdfFlag) {
		this.sdfFlag = sdfFlag;
	}

	public String getSpName() {
		return this.spName;
	}

	public void setSpName(String spName) {
		this.spName = spName;
	}

	public String getSprEntity() {
		return this.sprEntity;
	}

	public void setSprEntity(String sprEntity) {
		this.sprEntity = sprEntity;
	}

	public String getTaxRes2() {
		return this.taxRes2;
	}

	public void setTaxRes2(String taxRes2) {
		this.taxRes2 = taxRes2;
	}

	public String getTaxRes3() {
		return this.taxRes3;
	}

	public void setTaxRes3(String taxRes3) {
		this.taxRes3 = taxRes3;
	}

	public String getTaxRes4() {
		return this.taxRes4;
	}

	public void setTaxRes4(String taxRes4) {
		this.taxRes4 = taxRes4;
	}

	public String getTpin1() {
		return this.tpin1;
	}

	public void setTpin1(String tpin1) {
		this.tpin1 = tpin1;
	}

	public String getTpin2() {
		return this.tpin2;
	}

	public void setTpin2(String tpin2) {
		this.tpin2 = tpin2;
	}

	public String getTpin3() {
		return this.tpin3;
	}

	public void setTpin3(String tpin3) {
		this.tpin3 = tpin3;
	}

	public String getTpin4() {
		return this.tpin4;
	}

	public void setTpin4(String tpin4) {
		this.tpin4 = tpin4;
	}

	public String getUboAdd1() {
		return this.uboAdd1;
	}

	public void setUboAdd1(String uboAdd1) {
		this.uboAdd1 = uboAdd1;
	}

	public String getUboAdd2() {
		return this.uboAdd2;
	}

	public void setUboAdd2(String uboAdd2) {
		this.uboAdd2 = uboAdd2;
	}

	public String getUboAdd3() {
		return this.uboAdd3;
	}

	public void setUboAdd3(String uboAdd3) {
		this.uboAdd3 = uboAdd3;
	}

	public String getUboAddTy() {
		return this.uboAddTy;
	}

	public void setUboAddTy(String uboAddTy) {
		this.uboAddTy = uboAddTy;
	}

	public String getUboAppl() {
		return this.uboAppl;
	}

	public void setUboAppl(String uboAppl) {
		this.uboAppl = uboAppl;
	}

	public String getUboCity() {
		return this.uboCity;
	}

	public void setUboCity(String uboCity) {
		this.uboCity = uboCity;
	}

	public String getUboCntry() {
		return this.uboCntry;
	}

	public void setUboCntry(String uboCntry) {
		this.uboCntry = uboCntry;
	}

	public String getUboCob() {
		return this.uboCob;
	}

	public void setUboCob(String uboCob) {
		this.uboCob = uboCob;
	}

	public String getUboCode() {
		return this.uboCode;
	}

	public void setUboCode(String uboCode) {
		this.uboCode = uboCode;
	}

	public String getUboCount() {
		return this.uboCount;
	}

	public void setUboCount(String uboCount) {
		this.uboCount = uboCount;
	}

	public String getUboCtr() {
		return this.uboCtr;
	}

	public void setUboCtr(String uboCtr) {
		this.uboCtr = uboCtr;
	}

	public String getUboDf() {
		return this.uboDf;
	}

	public void setUboDf(String uboDf) {
		this.uboDf = uboDf;
	}

	public Date getUboDob() {
		return this.uboDob;
	}

	public void setUboDob(Date uboDob) {
		this.uboDob = uboDob;
	}

	public String getUboFrNam() {
		return this.uboFrNam;
	}

	public void setUboFrNam(String uboFrNam) {
		this.uboFrNam = uboFrNam;
	}

	public String getUboGender() {
		return this.uboGender;
	}

	public void setUboGender(String uboGender) {
		this.uboGender = uboGender;
	}

	public String getUboHolPc() {
		return this.uboHolPc;
	}

	public void setUboHolPc(String uboHolPc) {
		this.uboHolPc = uboHolPc;
	}

	public String getUboIdTy() {
		return this.uboIdTy;
	}

	public void setUboIdTy(String uboIdTy) {
		this.uboIdTy = uboIdTy;
	}

	public String getUboMobile() {
		return this.uboMobile;
	}

	public void setUboMobile(String uboMobile) {
		this.uboMobile = uboMobile;
	}

	public String getUboName() {
		return this.uboName;
	}

	public void setUboName(String uboName) {
		this.uboName = uboName;
	}

	public String getUboNation() {
		return this.uboNation;
	}

	public void setUboNation(String uboNation) {
		this.uboNation = uboNation;
	}

	public String getUboOcc() {
		return this.uboOcc;
	}

	public void setUboOcc(String uboOcc) {
		this.uboOcc = uboOcc;
	}

	public String getUboOccTy() {
		return this.uboOccTy;
	}

	public void setUboOccTy(String uboOccTy) {
		this.uboOccTy = uboOccTy;
	}

	public String getUboPan() {
		return this.uboPan;
	}

	public void setUboPan(String uboPan) {
		this.uboPan = uboPan;
	}

	public String getUboPin() {
		return this.uboPin;
	}

	public void setUboPin(String uboPin) {
		this.uboPin = uboPin;
	}

	public String getUboState() {
		return this.uboState;
	}

	public void setUboState(String uboState) {
		this.uboState = uboState;
	}

	public String getUboTel() {
		return this.uboTel;
	}

	public void setUboTel(String uboTel) {
		this.uboTel = uboTel;
	}

	public String getUboTin() {
		return this.uboTin;
	}

	public void setUboTin(String uboTin) {
		this.uboTin = uboTin;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public MasterTransactIdentificationType getMasterTransactIdentificationType() {
		return this.masterTransactIdentificationType;
	}

	public void setMasterTransactIdentificationType(MasterTransactIdentificationType masterTransactIdentificationType) {
		this.masterTransactIdentificationType = masterTransactIdentificationType;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

	public MasterTransactTaxStatus getMasterTransactTaxStatus() {
		return this.masterTransactTaxStatus;
	}

	public void setMasterTransactTaxStatus(MasterTransactTaxStatus masterTransactTaxStatus) {
		this.masterTransactTaxStatus = masterTransactTaxStatus;
	}

	public MasterTransactAddressType getMasterTransactAddressType() {
		return this.masterTransactAddressType;
	}

	public void setMasterTransactAddressType(MasterTransactAddressType masterTransactAddressType) {
		this.masterTransactAddressType = masterTransactAddressType;
	}

	public MasterTransactCountryNationality getMasterTransactCountryNationality1() {
		return this.masterTransactCountryNationality1;
	}

	public void setMasterTransactCountryNationality1(
			MasterTransactCountryNationality masterTransactCountryNationality1) {
		this.masterTransactCountryNationality1 = masterTransactCountryNationality1;
	}

	public MasterTransactCountryNationality getMasterTransactCountryNationality2() {
		return this.masterTransactCountryNationality2;
	}

	public void setMasterTransactCountryNationality2(
			MasterTransactCountryNationality masterTransactCountryNationality2) {
		this.masterTransactCountryNationality2 = masterTransactCountryNationality2;
	}

	public MasterTransactSourceOfWealth getMasterTransactSourceOfWealth() {
		return this.masterTransactSourceOfWealth;
	}

	public void setMasterTransactSourceOfWealth(MasterTransactSourceOfWealth masterTransactSourceOfWealth) {
		this.masterTransactSourceOfWealth = masterTransactSourceOfWealth;
	}

	public MasterTransactOccupationCode getMasterTransactOccupationCode() {
		return this.masterTransactOccupationCode;
	}

	public void setMasterTransactOccupationCode(MasterTransactOccupationCode masterTransactOccupationCode) {
		this.masterTransactOccupationCode = masterTransactOccupationCode;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public MasterTransactIncome getMasterTransactIncome() {
		return masterTransactIncome;
	}

	public void setMasterTransactIncome(MasterTransactIncome masterTransactIncome) {
		this.masterTransactIncome = masterTransactIncome;
	}

}