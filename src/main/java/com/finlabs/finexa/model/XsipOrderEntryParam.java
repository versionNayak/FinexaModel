package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the xsipOrderEntryParam database table.
 * 
 */
@Entity
@Table(name="xsipOrderEntryParam")
@NamedQuery(name="XsipOrderEntryParam.findAll", query="SELECT x FROM XsipOrderEntryParam x")
public class XsipOrderEntryParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private BigInteger id;

	private BigInteger brokerage;

	private String bseResponse;

	private String bseResponseCode;

	private String clientCode;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	private String dpc;

	private String dpTransactionMode;

	private String euin;

	private String euinFlag;

	private String firstOrderFlag;

	private String folioNo;

	private int frequencyAllowed;

	private String frequencyType;

	private BigInteger installmentAmount;

	private String ipAdd;

	@Column(name="IRN")
	private String irn;

	private Timestamp lastUpdatedOn;

	private int noOfInstallment;

	private String param1;

	private String param2;

	private String param3;

	private String remarks;

	private String saveMode;

	private String purchaseMode;

	@Temporal(TemporalType.DATE)
	private Date startDate;

	private String subBrCode;

	private String transactionCode;

	private String transMode;

	@Column(name="URN")
	private String urn;

	private String xsipMandateid;

	private int xsipRegId;

	private String regType;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorUser advisorUser;

	//bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientID")
	private ClientMaster clientMaster;
	
	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="uniqueCodePhysical")
	private MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme;


	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="uniqueCodePhysicalLive")
	private MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfphysicalSchemeLive;

	public XsipOrderEntryParam() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getBrokerage() {
		return this.brokerage;
	}

	public void setBrokerage(BigInteger brokerage) {
		this.brokerage = brokerage;
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

	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getDpc() {
		return this.dpc;
	}

	public void setDpc(String dpc) {
		this.dpc = dpc;
	}

	public String getDpTransactionMode() {
		return this.dpTransactionMode;
	}

	public void setDpTransactionMode(String dpTransactionMode) {
		this.dpTransactionMode = dpTransactionMode;
	}

	public String getEuin() {
		return this.euin;
	}

	public void setEuin(String euin) {
		this.euin = euin;
	}

	public String getEuinFlag() {
		return this.euinFlag;
	}

	public void setEuinFlag(String euinFlag) {
		this.euinFlag = euinFlag;
	}

	public String getFirstOrderFlag() {
		return this.firstOrderFlag;
	}

	public void setFirstOrderFlag(String firstOrderFlag) {
		this.firstOrderFlag = firstOrderFlag;
	}

	public String getFolioNo() {
		return this.folioNo;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}

	public int getFrequencyAllowed() {
		return this.frequencyAllowed;
	}

	public void setFrequencyAllowed(int frequencyAllowed) {
		this.frequencyAllowed = frequencyAllowed;
	}

	public String getFrequencyType() {
		return this.frequencyType;
	}

	public void setFrequencyType(String frequencyType) {
		this.frequencyType = frequencyType;
	}

	public BigInteger getInstallmentAmount() {
		return this.installmentAmount;
	}

	public void setInstallmentAmount(BigInteger installmentAmount) {
		this.installmentAmount = installmentAmount;
	}

	public String getIpAdd() {
		return this.ipAdd;
	}

	public void setIpAdd(String ipAdd) {
		this.ipAdd = ipAdd;
	}

	public String getIrn() {
		return this.irn;
	}

	public void setIrn(String irn) {
		this.irn = irn;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public int getNoOfInstallment() {
		return this.noOfInstallment;
	}

	public void setNoOfInstallment(int noOfInstallment) {
		this.noOfInstallment = noOfInstallment;
	}

	public String getParam1() {
		return this.param1;
	}

	public void setParam1(String param1) {
		this.param1 = param1;
	}

	public String getParam2() {
		return this.param2;
	}

	public void setParam2(String param2) {
		this.param2 = param2;
	}

	public String getParam3() {
		return this.param3;
	}

	public void setParam3(String param3) {
		this.param3 = param3;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getSaveMode() {
		return this.saveMode;
	}

	public void setSaveMode(String saveMode) {
		this.saveMode = saveMode;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public String getSubBrCode() {
		return this.subBrCode;
	}

	public void setSubBrCode(String subBrCode) {
		this.subBrCode = subBrCode;
	}

	public String getTransactionCode() {
		return this.transactionCode;
	}

	public void setTransactionCode(String transactionCode) {
		this.transactionCode = transactionCode;
	}

	public String getTransMode() {
		return this.transMode;
	}

	public void setTransMode(String transMode) {
		this.transMode = transMode;
	}

	public String getUrn() {
		return this.urn;
	}

	public void setUrn(String urn) {
		this.urn = urn;
	}

	public String getXsipMandateid() {
		return this.xsipMandateid;
	}

	public void setXsipMandateid(String xsipMandateid) {
		this.xsipMandateid = xsipMandateid;
	}

	public int getXsipRegId() {
		return this.xsipRegId;
	}

	public void setXsipRegId(int xsipRegId) {
		this.xsipRegId = xsipRegId;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}
	
	public MasterTransactBSEMFPhysicalScheme getMasterTransactBsemfphysicalScheme() {
		return this.masterTransactBsemfphysicalScheme;
	}

	public void setMasterTransactBsemfphysicalScheme(MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme) {
		this.masterTransactBsemfphysicalScheme = masterTransactBsemfphysicalScheme;
	}

	public String getPurchaseMode() {
		return purchaseMode;
	}

	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}

	public String getRegType() {
		return regType;
	}

	public void setRegType(String regType) {
		this.regType = regType;
	}

	public MasterTransactBSEMFPhysicalSchemeLive getMasterTransactBsemfphysicalSchemeLive() {
		return masterTransactBsemfphysicalSchemeLive;
	}

	public void setMasterTransactBsemfphysicalSchemeLive(
			MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfphysicalSchemeLive) {
		this.masterTransactBsemfphysicalSchemeLive = masterTransactBsemfphysicalSchemeLive;
	}

}