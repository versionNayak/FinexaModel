package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the clientSTPOrderRegistration database table.
 * 
 */
@Entity
@Table(name="clientSTPOrderRegistration")
@NamedQuery(name="ClientSTPOrderRegistration.findAll", query="SELECT c FROM ClientSTPOrderRegistration c")
public class ClientSTPOrderRegistration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private BigInteger id;

	private String bseResponse;

	private String bseResponseCode;

	private String buySellType;

	private String clientCode;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	private String euinDeclaration;

	private String euinNumber;

	private String firstOrderToday;

	private String folioNo;

	private String frequencyType;

	private BigInteger installmentAmount;

	private String internalRefNo;

	private Timestamp lastModifiedOn;

	@Column(name="NoOfTransfers")
	private int noOfTransfers;

	private String remarks;

	private String saveMode;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDate;

	@Column(name="`subBroker-ARN`")
	private String subBroker_ARN;

	private String subBrokerCode;

	private String transactionMode;

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
	@JoinColumn(name="fromBseSchemeCodePhysical")
	private MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme1;


	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fromBseSchemeCodePhysicalLive")
	private MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfphysicalSchemeLive;


	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="toBseSchemeCodePhysical")
	private MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme2;

	
	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="toBseSchemeCodePhysicalLive")
	private MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfTophysicalSchemeLive;

	private String purchaseMode;

	public ClientSTPOrderRegistration() {
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

	public String getEuinDeclaration() {
		return this.euinDeclaration;
	}

	public void setEuinDeclaration(String euinDeclaration) {
		this.euinDeclaration = euinDeclaration;
	}

	public String getEuinNumber() {
		return this.euinNumber;
	}

	public void setEuinNumber(String euinNumber) {
		this.euinNumber = euinNumber;
	}

	public String getFirstOrderToday() {
		return this.firstOrderToday;
	}

	public void setFirstOrderToday(String firstOrderToday) {
		this.firstOrderToday = firstOrderToday;
	}

	public String getFolioNo() {
		return this.folioNo;
	}

	public void setFolioNo(String folioNo) {
		this.folioNo = folioNo;
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

	public String getInternalRefNo() {
		return this.internalRefNo;
	}

	public void setInternalRefNo(String internalRefNo) {
		this.internalRefNo = internalRefNo;
	}

	public Timestamp getLastModifiedOn() {
		return this.lastModifiedOn;
	}

	public void setLastModifiedOn(Timestamp lastModifiedOn) {
		this.lastModifiedOn = lastModifiedOn;
	}

	public int getNoOfTransfers() {
		return this.noOfTransfers;
	}

	public void setNoOfTransfers(int noOfTransfers) {
		this.noOfTransfers = noOfTransfers;
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

	public String getSubBroker_ARN() {
		return this.subBroker_ARN;
	}

	public void setSubBroker_ARN(String subBroker_ARN) {
		this.subBroker_ARN = subBroker_ARN;
	}

	public String getSubBrokerCode() {
		return this.subBrokerCode;
	}

	public void setSubBrokerCode(String subBrokerCode) {
		this.subBrokerCode = subBrokerCode;
	}

	public String getTransactionMode() {
		return this.transactionMode;
	}

	public void setTransactionMode(String transactionMode) {
		this.transactionMode = transactionMode;
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

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
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