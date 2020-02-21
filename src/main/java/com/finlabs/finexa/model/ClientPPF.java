package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the clientPPF database table.
 * 
 */
@Entity
@Table(name = "clientPPF")
@NamedQuery(name = "ClientPPF.findAll", query = "SELECT c FROM ClientPPF c")
public class ClientPPF implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private byte amountDepositFrequencyExt;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal currentBalance;

	private BigDecimal depositAmountExt;

	private byte extensionCompoundingFrequency;

	private BigDecimal extensionCurrentBalance;

	private String extensionFlag;

	private BigDecimal extensionInterestRate;

	@Temporal(TemporalType.DATE)
	private Date extensionStartDate;

	private byte extensionTenure;

	private String extTypeFlag;

	private BigDecimal interestRate;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	@Temporal(TemporalType.DATE)
	private Date maturityDate;

	private BigDecimal plannedDepositAmount;

	private byte ppfTenure;

	@Temporal(TemporalType.DATE)
	private Date startDate;

	// bi-directional many-to-one association to MasterProductClassification
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "financialAssetType")
	private MasterProductClassification masterProductClassification;

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "amountDepositFrequency")
	private LookupFrequency lookupFrequency1;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "compoundingFrequency")
	private LookupFrequency lookupFrequency2;

	public ClientPPF() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public byte getAmountDepositFrequencyExt() {
		return this.amountDepositFrequencyExt;
	}

	public void setAmountDepositFrequencyExt(byte amountDepositFrequencyExt) {
		this.amountDepositFrequencyExt = amountDepositFrequencyExt;
	}

	public byte getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(byte createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public BigDecimal getCurrentBalance() {
		return this.currentBalance;
	}

	public void setCurrentBalance(BigDecimal currentBalance) {
		this.currentBalance = currentBalance;
	}

	public BigDecimal getDepositAmountExt() {
		return this.depositAmountExt;
	}

	public void setDepositAmountExt(BigDecimal depositAmountExt) {
		this.depositAmountExt = depositAmountExt;
	}

	public byte getExtensionCompoundingFrequency() {
		return this.extensionCompoundingFrequency;
	}

	public void setExtensionCompoundingFrequency(byte extensionCompoundingFrequency) {
		this.extensionCompoundingFrequency = extensionCompoundingFrequency;
	}

	public BigDecimal getExtensionCurrentBalance() {
		return this.extensionCurrentBalance;
	}

	public void setExtensionCurrentBalance(BigDecimal extensionCurrentBalance) {
		this.extensionCurrentBalance = extensionCurrentBalance;
	}

	public String getExtensionFlag() {
		return this.extensionFlag;
	}

	public void setExtensionFlag(String extensionFlag) {
		this.extensionFlag = extensionFlag;
	}

	public BigDecimal getExtensionInterestRate() {
		return this.extensionInterestRate;
	}

	public void setExtensionInterestRate(BigDecimal extensionInterestRate) {
		this.extensionInterestRate = extensionInterestRate;
	}

	public Date getExtensionStartDate() {
		return this.extensionStartDate;
	}

	public void setExtensionStartDate(Date extensionStartDate) {
		this.extensionStartDate = extensionStartDate;
	}

	public byte getExtensionTenure() {
		return this.extensionTenure;
	}

	public void setExtensionTenure(byte extensionTenure) {
		this.extensionTenure = extensionTenure;
	}

	public String getExtTypeFlag() {
		return this.extTypeFlag;
	}

	public void setExtTypeFlag(String extTypeFlag) {
		this.extTypeFlag = extTypeFlag;
	}

	public BigDecimal getInterestRate() {
		return this.interestRate;
	}

	public void setInterestRate(BigDecimal interestRate) {
		this.interestRate = interestRate;
	}

	public byte getLastUpdateddBy() {
		return this.lastUpdateddBy;
	}

	public void setLastUpdateddBy(byte lastUpdateddBy) {
		this.lastUpdateddBy = lastUpdateddBy;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public Date getMaturityDate() {
		return this.maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public BigDecimal getPlannedDepositAmount() {
		return this.plannedDepositAmount;
	}

	public void setPlannedDepositAmount(BigDecimal plannedDepositAmount) {
		this.plannedDepositAmount = plannedDepositAmount;
	}

	public byte getPpfTenure() {
		return this.ppfTenure;
	}

	public void setPpfTenure(byte ppfTenure) {
		this.ppfTenure = ppfTenure;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public MasterProductClassification getMasterProductClassification() {
		return this.masterProductClassification;
	}

	public void setMasterProductClassification(MasterProductClassification masterProductClassification) {
		this.masterProductClassification = masterProductClassification;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

	public ClientFamilyMember getClientFamilyMember() {
		return this.clientFamilyMember;
	}

	public void setClientFamilyMember(ClientFamilyMember clientFamilyMember) {
		this.clientFamilyMember = clientFamilyMember;
	}

	public LookupFrequency getLookupFrequency1() {
		return this.lookupFrequency1;
	}

	public void setLookupFrequency1(LookupFrequency lookupFrequency1) {
		this.lookupFrequency1 = lookupFrequency1;
	}

	public LookupFrequency getLookupFrequency2() {
		return this.lookupFrequency2;
	}

	public void setLookupFrequency2(LookupFrequency lookupFrequency2) {
		this.lookupFrequency2 = lookupFrequency2;
	}

}