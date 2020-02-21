package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the purchaseOrderEntryParam database table.
 * 
 */
@Entity
@Table(name="purchaseOrderEntryParam")
@NamedQuery(name="PurchaseOrderEntryParam.findAll", query="SELECT p FROM PurchaseOrderEntryParam p")
public class PurchaseOrderEntryParam implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private BigInteger id;

	private String allRedeem;

	private BigInteger amount;

	private String bseResponse;

	private String bseResponseCode;

	private String buySell;

	private String buySellType;

	private String clientCode;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	private String dpc;

	private String dpTxn;

	private String euin;

	private String euinFlag;

	private String folioNo;

	private String ipAdd;

	private String kycStatus;

	private Timestamp lastUpdatedOn;

	private String minRedeem;

	private BigInteger orderID;

	private String param1;

	private String param2;

	private String param3;

	private BigInteger qty;

	private String refNo;

	private String remarks;

	private String saveMode;

	private String subBrCode;

	private String transactionCode;
	
	private String purchaseMode;

	@Column(name="URN")
	private String urn;

	//bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientID")
	private ClientMaster clientMaster;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorUser advisorUser;
	
	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="uniqueCodePhysical")
	private MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme;
	
	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="uniqueCodePhysicalLive")
		private MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfphysicalSchemeLive;

	public PurchaseOrderEntryParam() {
	}

	public String getAllRedeem() {
		return this.allRedeem;
	}

	public void setAllRedeem(String allRedeem) {
		this.allRedeem = allRedeem;
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

	public String getDpc() {
		return this.dpc;
	}

	public void setDpc(String dpc) {
		this.dpc = dpc;
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

	public String getIpAdd() {
		return this.ipAdd;
	}

	public void setIpAdd(String ipAdd) {
		this.ipAdd = ipAdd;
	}

	public String getKycStatus() {
		return this.kycStatus;
	}

	public void setKycStatus(String kycStatus) {
		this.kycStatus = kycStatus;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public String getMinRedeem() {
		return this.minRedeem;
	}

	public void setMinRedeem(String minRedeem) {
		this.minRedeem = minRedeem;
	}

	public BigInteger getOrderID() {
		return this.orderID;
	}

	public void setOrderID(BigInteger orderID) {
		this.orderID = orderID;
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

	public BigInteger getQty() {
		return this.qty;
	}

	public void setQty(BigInteger qty) {
		this.qty = qty;
	}

	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
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

	public String getUrn() {
		return this.urn;
	}

	public void setUrn(String urn) {
		this.urn = urn;
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

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public MasterTransactBSEMFPhysicalSchemeLive getMasterTransactBsemfphysicalSchemeLive() {
		return masterTransactBsemfphysicalSchemeLive;
	}

	public void setMasterTransactBsemfphysicalSchemeLive(
			MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfphysicalSchemeLive) {
		this.masterTransactBsemfphysicalSchemeLive = masterTransactBsemfphysicalSchemeLive;
	}

}