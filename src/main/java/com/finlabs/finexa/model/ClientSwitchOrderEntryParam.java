package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the clientSwitchOrderEntryParam database table.
 * 
 */
@Entity
@Table(name="clientSwitchOrderEntryParam")
@NamedQuery(name="ClientSwitchOrderEntryParam.findAll", query="SELECT c FROM ClientSwitchOrderEntryParam c")
public class ClientSwitchOrderEntryParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private BigInteger id;

	private String allUnitsFlag;

	private BigInteger amount;

	private String bseResponse;

	private String bseResponseCode;

	private String buySell;

	private String buySellType;

	private String clientCode;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	private String createdBy;

	private String dpTxn;

	private String euin;

	private String euinFlag;

	private String folioNo;

	private String ipAddress;

	private String kycStatus;

	private Timestamp lastModifiedAt;

	private String lastModifiedBy;

	private String minRedeem;

	private String param1;

	private String param2;

	private String param3;

	private String remarks;

	private String saveMode;

	private String subBrokerCode;

	private String transCode;

	private BigInteger units;

	private String urn;

	private String purchaseMode;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorId")
	private AdvisorUser advisorUser;

	//bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientId")
	private ClientMaster clientMaster;
	
	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fromSchemePhysical")
	private MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme1;

	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fromSchemePhysicalLive")
	private MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfphysicalSchemeLive;
	
	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="toSchemePhysical")
	private MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme2;

	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="toSchemePhysicalLive")
	private MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfTophysicalSchemeLive;


	public ClientSwitchOrderEntryParam() {
	}

	public BigInteger getId() {
		return this.id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getAllUnitsFlag() {
		return this.allUnitsFlag;
	}

	public void setAllUnitsFlag(String allUnitsFlag) {
		this.allUnitsFlag = allUnitsFlag;
	}

	public BigInteger getAmount() {
		return this.amount;
	}

	public void setAmount(BigInteger amount) {
		this.amount = amount;
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

	public String getBuySell() {
		return this.buySell;
	}

	public void setBuySell(String buySell) {
		this.buySell = buySell;
	}

	public String getBuySellType() {
		return this.buySellType;
	}

	public void setBuySellType(String buySellType) {
		this.buySellType = buySellType;
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

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getDpTxn() {
		return this.dpTxn;
	}

	public void setDpTxn(String dpTxn) {
		this.dpTxn = dpTxn;
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

	public String getFolioNo() {
		return this.folioNo;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getKycStatus() {
		return this.kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}

	public Timestamp getLastModifiedAt() {
		return this.lastModifiedAt;
	}

	public void setLastModifiedAt(Timestamp lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	public String getLastModifiedBy() {
		return this.lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

	public String getMinRedeem() {
		return this.minRedeem;
	}

	public void setMinRedeem(String minRedeem) {
		this.minRedeem = minRedeem;
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

	public String getSubBrokerCode() {
		return this.subBrokerCode;
	}

	public void setSubBrokerCode(String subBrokerCode) {
		this.subBrokerCode = subBrokerCode;
	}

	public String getTransCode() {
		return this.transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public BigInteger getUnits() {
		return this.units;
	}

	public void setUnits(BigInteger units) {
		this.units = units;
	}

	public String getUrn() {
		return this.urn;
	}

	public void setUrn(String urn) {
		this.urn = urn;
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
	
	public MasterTransactBSEMFPhysicalScheme getMasterTransactBsemfphysicalScheme1() {
		return this.masterTransactBsemfphysicalScheme1;
	}

	public void setMasterTransactBsemfphysicalScheme1(MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme1) {
		this.masterTransactBsemfphysicalScheme1 = masterTransactBsemfphysicalScheme1;
	}
	
	public MasterTransactBSEMFPhysicalScheme getMasterTransactBsemfphysicalScheme2() {
		return this.masterTransactBsemfphysicalScheme2;
	}

	public void setMasterTransactBsemfphysicalScheme2(MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme2) {
		this.masterTransactBsemfphysicalScheme2 = masterTransactBsemfphysicalScheme2;
	}

	public String getPurchaseMode() {
		return purchaseMode;
	}

	public void setPurchaseMode(String purchaseMode) {
		this.purchaseMode = purchaseMode;
	}

	public MasterTransactBSEMFPhysicalSchemeLive getMasterTransactBsemfphysicalSchemeLive() {
		return masterTransactBsemfphysicalSchemeLive;
	}

	public void setMasterTransactBsemfphysicalSchemeLive(
			MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfphysicalSchemeLive) {
		this.masterTransactBsemfphysicalSchemeLive = masterTransactBsemfphysicalSchemeLive;
	}

	public MasterTransactBSEMFPhysicalSchemeLive getMasterTransactBsemfTophysicalSchemeLive() {
		return masterTransactBsemfTophysicalSchemeLive;
	}

	public void setMasterTransactBsemfTophysicalSchemeLive(
			MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfTophysicalSchemeLive) {
		this.masterTransactBsemfTophysicalSchemeLive = masterTransactBsemfTophysicalSchemeLive;
	}

}