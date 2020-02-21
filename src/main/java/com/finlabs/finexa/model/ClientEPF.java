package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the clientEPF database table.
 * 
 */
@Entity
@Table(name="clientEPF")
@NamedQuery(name="ClientEPF.findAll", query="SELECT c FROM ClientEPF c")
public class ClientEPF implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	private BigDecimal annualContributionIncrease;

	private byte contributionUptoAge;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal epfCurrentBalance;

	private BigDecimal epfoInterestRate;

	private byte epfWithdrawalAge;

	private BigDecimal epsCurrentBalance;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private BigDecimal monthlyBasicDA;

	private String salaryIncreaseRefMonth;

	private Byte serviceYears;

	//bi-directional many-to-one association to ClientAnnuity
	@OneToMany(mappedBy="clientEpf")
	private List<ClientAnnuity> clientAnnuities;

	//bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientID")
	private ClientMaster clientMaster;

	//bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	//bi-directional many-to-one association to MasterProductClassification
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="financialAssetType")
	private MasterProductClassification masterProductClassification;

	public ClientEPF() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAnnualContributionIncrease() {
		return this.annualContributionIncrease;
	}

	public void setAnnualContributionIncrease(BigDecimal annualContributionIncrease) {
		this.annualContributionIncrease = annualContributionIncrease;
	}

	public byte getContributionUptoAge() {
		return this.contributionUptoAge;
	}

	public void setContributionUptoAge(byte contributionUptoAge) {
		this.contributionUptoAge = contributionUptoAge;
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

	public BigDecimal getEpfCurrentBalance() {
		return this.epfCurrentBalance;
	}

	public void setEpfCurrentBalance(BigDecimal epfCurrentBalance) {
		this.epfCurrentBalance = epfCurrentBalance;
	}

	public BigDecimal getEpfoInterestRate() {
		return this.epfoInterestRate;
	}

	public void setEpfoInterestRate(BigDecimal epfoInterestRate) {
		this.epfoInterestRate = epfoInterestRate;
	}

	public byte getEpfWithdrawalAge() {
		return this.epfWithdrawalAge;
	}

	public void setEpfWithdrawalAge(byte epfWithdrawalAge) {
		this.epfWithdrawalAge = epfWithdrawalAge;
	}

	public BigDecimal getEpsCurrentBalance() {
		return this.epsCurrentBalance;
	}

	public void setEpsCurrentBalance(BigDecimal epsCurrentBalance) {
		this.epsCurrentBalance = epsCurrentBalance;
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

	public BigDecimal getMonthlyBasicDA() {
		return this.monthlyBasicDA;
	}

	public void setMonthlyBasicDA(BigDecimal monthlyBasicDA) {
		this.monthlyBasicDA = monthlyBasicDA;
	}

	public String getSalaryIncreaseRefMonth() {
		return this.salaryIncreaseRefMonth;
	}

	public void setSalaryIncreaseRefMonth(String salaryIncreaseRefMonth) {
		this.salaryIncreaseRefMonth = salaryIncreaseRefMonth;
	}

	public Byte getServiceYears() {
		return this.serviceYears;
	}

	public void setServiceYears(Byte serviceYears) {
		this.serviceYears = serviceYears;
	}

	public List<ClientAnnuity> getClientAnnuities() {
		return this.clientAnnuities;
	}

	public void setClientAnnuities(List<ClientAnnuity> clientAnnuities) {
		this.clientAnnuities = clientAnnuities;
	}

	public ClientAnnuity addClientAnnuity(ClientAnnuity clientAnnuity) {
		getClientAnnuities().add(clientAnnuity);
		clientAnnuity.setClientEpf(this);

		return clientAnnuity;
	}

	public ClientAnnuity removeClientAnnuity(ClientAnnuity clientAnnuity) {
		getClientAnnuities().remove(clientAnnuity);
		clientAnnuity.setClientEpf(null);

		return clientAnnuity;
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

	public MasterProductClassification getMasterProductClassification() {
		return this.masterProductClassification;
	}

	public void setMasterProductClassification(MasterProductClassification masterProductClassification) {
		this.masterProductClassification = masterProductClassification;
	}

}