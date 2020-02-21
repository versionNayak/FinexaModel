package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;
import java.math.BigInteger;


/**
 * The persistent class for the clientSWPSTPOrderRegistration database table.
 * 
 */
@Entity
@Table(name="clientSWPOrderRegistration")
@NamedQuery(name="ClientSWPOrderRegistration.findAll", query="SELECT c FROM ClientSWPOrderRegistration c")
public class ClientSWPOrderRegistration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private BigInteger id;

	private String bseResponse;

	private String bseResponseCode;

	private String clientCode;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdAt;

	private String euinDeclaration;

	private String euinNumber;

	private String firstOrderToday;

	private String folioNo;

	private String frequencyType;

	private BigInteger installmentAmount;

	private BigInteger installmentUnit;

	private String internalRefNo;

	private Timestamp lastModifiedOn;

	private String purchaseMode;

	@Column(name="NoOfWithDrawals")
	private BigInteger noOfWithDrawals;

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
	@JoinColumn(name="bseSchemeCodePhysical")
	private MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme;

	//bi-directional many-to-one association to MasterTransactBSEMFPhysicalScheme
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="bseSchemeCodePhysicalLive")
	private MasterTransactBSEMFPhysicalSchemeLive masterTransactBsemfphysicalSchemeLive;

	public ClientSWPOrderRegistration() {
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

	public BigInteger getInstallmentUnit() {
		return this.installmentUnit;
	}

	public void setInstallmentUnit(BigInteger installmentUnit) {
		this.installmentUnit = installmentUnit;
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

	public BigInteger getNoOfWithDrawals() {
		return this.noOfWithDrawals;
	}

	public void setNoOfWithDrawals(BigInteger noOfWithDrawals) {
		this.noOfWithDrawals = noOfWithDrawals;
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
	
	public MasterTransactBSEMFPhysicalScheme getMasterTransactBsemfphysicalScheme() {
		return this.masterTransactBsemfphysicalScheme;
	}
	
	public void setMasterTransactBsemfphysicalScheme(MasterTransactBSEMFPhysicalScheme masterTransactBsemfphysicalScheme) {
		this.masterTransactBsemfphysicalScheme = masterTransactBsemfphysicalScheme;
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

}