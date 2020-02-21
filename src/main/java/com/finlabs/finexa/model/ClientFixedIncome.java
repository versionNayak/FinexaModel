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
 * The persistent class for the clientFixedIncome database table.
 * 
 */
@Entity
@Table(name = "clientFixedIncome")
@NamedQuery(name = "ClientFixedIncome.findAll", query = "SELECT c FROM ClientFixedIncome c")
public class ClientFixedIncome implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private BigDecimal amount;

	private BigDecimal bondCurrentYield;

	private BigDecimal bondFaceValue;

	private int bondPurchased;

	private byte createdBy;

	private Timestamp createdOn;

	private BigDecimal interestCouponRate;

	@Temporal(TemporalType.DATE)
	private Date investmentDepositDate;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	@Temporal(TemporalType.DATE)
	private Date maturityDate;

	private Integer tenure;

	private int tenureRDMonths;

	private String tenureYearsDays;
	
	private String bankIssuerName;

	

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	// bi-directional many-to-one association to MasterProductClassification
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "financialAssetType")
	private MasterProductClassification masterProductClassification;

	// bi-directional many-to-one association to LookupFixedDepositType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fixedDepositType")
	private LookupFixedDepositType lookupFixedDepositType;

	// bi-directional many-to-one association to LookupBondType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bondType")
	private LookupBondType lookupBondType;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "compoundingFrequency")
	private LookupFrequency lookupFrequency1;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "payoutFrequency")
	private LookupFrequency lookupFrequency2;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "recurringDepositFrequency")
	private LookupFrequency lookupFrequency3;

	public ClientFixedIncome() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getBondCurrentYield() {
		return this.bondCurrentYield;
	}

	public void setBondCurrentYield(BigDecimal bondCurrentYield) {
		this.bondCurrentYield = bondCurrentYield;
	}

	public BigDecimal getBondFaceValue() {
		return this.bondFaceValue;
	}

	public void setBondFaceValue(BigDecimal bondFaceValue) {
		this.bondFaceValue = bondFaceValue;
	}

	public int getBondPurchased() {
		return this.bondPurchased;
	}

	public void setBondPurchased(int bondPurchased) {
		this.bondPurchased = bondPurchased;
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

	public BigDecimal getInterestCouponRate() {
		return this.interestCouponRate;
	}

	public void setInterestCouponRate(BigDecimal interestCouponRate) {
		this.interestCouponRate = interestCouponRate;
	}

	public Date getInvestmentDepositDate() {
		return this.investmentDepositDate;
	}

	public void setInvestmentDepositDate(Date investmentDepositDate) {
		this.investmentDepositDate = investmentDepositDate;
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

	public Integer getTenure() {
		return this.tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public int getTenureRDMonths() {
		return this.tenureRDMonths;
	}

	public void setTenureRDMonths(int tenureRDMonths) {
		this.tenureRDMonths = tenureRDMonths;
	}

	public String getTenureYearsDays() {
		return this.tenureYearsDays;
	}

	public void setTenureYearsDays(String tenureYearsDays) {
		this.tenureYearsDays = tenureYearsDays;
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

	public LookupFixedDepositType getLookupFixedDepositType() {
		return this.lookupFixedDepositType;
	}

	public void setLookupFixedDepositType(LookupFixedDepositType lookupFixedDepositType) {
		this.lookupFixedDepositType = lookupFixedDepositType;
	}

	public LookupBondType getLookupBondType() {
		return this.lookupBondType;
	}

	public void setLookupBondType(LookupBondType lookupBondType) {
		this.lookupBondType = lookupBondType;
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

	public LookupFrequency getLookupFrequency3() {
		return this.lookupFrequency3;
	}

	public void setLookupFrequency3(LookupFrequency lookupFrequency3) {
		this.lookupFrequency3 = lookupFrequency3;
	}
	
	public String getBankIssuerName() {
		return bankIssuerName;
	}

	public void setBankIssuerName(String bankIssuerName) {
		this.bankIssuerName = bankIssuerName;
	}
	
}