package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;
import javax.persistence.*;

/**
 * The persistent class for the clientGoal database table.
 * 
 */
@Entity
@Table(name = "clientGoal")
@NamedQuery(name = "ClientGoal.findAll", query = "SELECT c FROM ClientGoal c")

@NamedStoredProcedureQueries({
	  @NamedStoredProcedureQuery(
	    name = "ClientGoal.getLumpsumInvestmentForGoalPlanning", 
	    procedureName = "procGoalPlanningGetLumpsumInvestment", 
	    parameters = { 
	        @StoredProcedureParameter(name = "inClientId", type = Integer.class, mode = ParameterMode.IN),
	        @StoredProcedureParameter(name = "inGoalId", type = Integer.class, mode = ParameterMode.IN),
	        @StoredProcedureParameter( name = "inGlideNonGlideFlag", type = String.class, mode = ParameterMode.IN),
	        @StoredProcedureParameter( name = "outLumpsumInvestmentToday", type = BigDecimal.class, mode = ParameterMode.OUT)
	    
	    }),
	    @NamedStoredProcedureQuery(
			    name = "ClientGoal.getSipInvestmentForGoalPlanning", 
			    procedureName = "procGoalPlanningGetSipInvestment", 
			    parameters = { 
			        @StoredProcedureParameter(name = "inClientId", type = Integer.class, mode = ParameterMode.IN),
			        @StoredProcedureParameter(name = "inGoalId", type = Integer.class, mode = ParameterMode.IN),
			        @StoredProcedureParameter( name = "inGlideNonGlideFlag", type = String.class, mode = ParameterMode.IN),
			        @StoredProcedureParameter( name = "outLumpsumInvestmentToday", type = BigDecimal.class, mode = ParameterMode.OUT)
			    
			    }),
	  @NamedStoredProcedureQuery(
			    name = "ClientGoal.getCorpusReqdAtGoalStartOutput", 
			    procedureName = "procGoalPlanningCorpusReqdAtGoalStartOutput", 
			    parameters = { 
			        @StoredProcedureParameter(name = "inClientId", type = Integer.class, mode = ParameterMode.IN),
			        @StoredProcedureParameter(name = "inGoalId", type = Integer.class, mode = ParameterMode.IN),
			        @StoredProcedureParameter( name = "goalCorpusAtStart", type = BigDecimal.class, mode = ParameterMode.OUT)
			    
			    })
	  
	})
public class ClientGoal implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private Byte createdBy;

	private Timestamp createdOn;

	private String description;

	private BigDecimal estimatedCostOfGoal;

	private Double expectedInflationRate;

	private BigDecimal expectedReturnOnCorpus;

	private Byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private Double loanInterestRate;

	private Double loanPercent;

	private String loanRequiredFlag;

	private Byte loanTenure;

	private Double postRetirementAnnualExpense;

	private Byte priority;

	private String recurringFlag;

	private String startMonthYear;

	private Byte yearsToGoal;
	
	@Transient
	private Integer monthsToGoal;

	// bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientID")
	private ClientMaster clientMaster;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	// bi-directional many-to-one association to LookupGoalType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "goalType")
	private LookupGoalType lookupGoalType;

	// bi-directional many-to-one association to
	// LookupGoalCorpusUtilizationFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "corpusUtilFrequency")
	private LookupGoalCorpusUtilizationFrequency lookupGoalCorpusUtilizationFrequency;

	// bi-directional many-to-one association to LookupFrequency
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "postRetirementExpectedPayoutFrequency")
	//private LookupFrequency lookupFrequency;
	private LookupGoalCorpusUtilizationFrequency lookupGoalCorpusUtilizationFrequencyForPayoutFrequency;
	
	// bi-directional many-to-one association to ClientContact
	@OneToMany(mappedBy = "clientMaster")
	private List<AdvisorProductReco> advisorProductReco;

	public ClientGoal() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Byte getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Byte createdBy) {
		this.createdBy = createdBy;
	}

	public Timestamp getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Timestamp createdOn) {
		this.createdOn = createdOn;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getEstimatedCostOfGoal() {
		return this.estimatedCostOfGoal;
	}

	public void setEstimatedCostOfGoal(BigDecimal estimatedCostOfGoal) {
		this.estimatedCostOfGoal = estimatedCostOfGoal;
	}

	public Double getExpectedInflationRate() {
		return this.expectedInflationRate;
	}

	public void setExpectedInflationRate(Double expectedInflationRate) {
		this.expectedInflationRate = expectedInflationRate;
	}

	public BigDecimal getExpectedReturnOnCorpus() {
		return this.expectedReturnOnCorpus;
	}

	public void setExpectedReturnOnCorpus(BigDecimal expectedReturnOnCorpus) {
		this.expectedReturnOnCorpus = expectedReturnOnCorpus;
	}

	public Byte getLastUpdateddBy() {
		return this.lastUpdateddBy;
	}

	public void setLastUpdateddBy(Byte lastUpdateddBy) {
		this.lastUpdateddBy = lastUpdateddBy;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public Double getLoanInterestRate() {
		return this.loanInterestRate;
	}

	public void setLoanInterestRate(Double loanInterestRate) {
		this.loanInterestRate = loanInterestRate;
	}

	public Double getLoanPercent() {
		return this.loanPercent;
	}

	public void setLoanPercent(Double loanPercent) {
		this.loanPercent = loanPercent;
	}

	public String getLoanRequiredFlag() {
		return this.loanRequiredFlag;
	}

	public void setLoanRequiredFlag(String loanRequiredFlag) {
		this.loanRequiredFlag = loanRequiredFlag;
	}

	public Byte getLoanTenure() {
		return this.loanTenure;
	}

	public void setLoanTenure(Byte loanTenure) {
		this.loanTenure = loanTenure;
	}

	public Double getPostRetirementAnnualExpense() {
		return this.postRetirementAnnualExpense;
	}

	public void setPostRetirementAnnualExpense(Double postRetirementAnnualExpense) {
		this.postRetirementAnnualExpense = postRetirementAnnualExpense;
	}

	public Byte getPriority() {
		return this.priority;
	}

	public void setPriority(Byte priority) {
		this.priority = priority;
	}

	public String getRecurringFlag() {
		return this.recurringFlag;
	}

	public void setRecurringFlag(String recurringFlag) {
		this.recurringFlag = recurringFlag;
	}

	public String getStartMonthYear() {
		return this.startMonthYear;
	}

	public void setStartMonthYear(String startMonthYear) {
		this.startMonthYear = startMonthYear;
	}

	public Byte getYearsToGoal() {
		return this.yearsToGoal;
	}

	public void setYearsToGoal(Byte yearsToGoal) {
		this.yearsToGoal = yearsToGoal;
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

	public LookupGoalType getLookupGoalType() {
		return this.lookupGoalType;
	}

	public void setLookupGoalType(LookupGoalType lookupGoalType) {
		this.lookupGoalType = lookupGoalType;
	}

	public LookupGoalCorpusUtilizationFrequency getLookupGoalCorpusUtilizationFrequency() {
		return this.lookupGoalCorpusUtilizationFrequency;
	}

	public void setLookupGoalCorpusUtilizationFrequency(
			LookupGoalCorpusUtilizationFrequency lookupGoalCorpusUtilizationFrequency) {
		this.lookupGoalCorpusUtilizationFrequency = lookupGoalCorpusUtilizationFrequency;
	}

	
	public LookupGoalCorpusUtilizationFrequency getLookupGoalCorpusUtilizationFrequencyForPayoutFrequency() {
		return lookupGoalCorpusUtilizationFrequencyForPayoutFrequency;
	}

	public void setLookupGoalCorpusUtilizationFrequencyForPayoutFrequency(
			LookupGoalCorpusUtilizationFrequency lookupGoalCorpusUtilizationFrequencyForPayoutFrequency) {
		this.lookupGoalCorpusUtilizationFrequencyForPayoutFrequency = lookupGoalCorpusUtilizationFrequencyForPayoutFrequency;
	}

	public Integer getMonthsToGoal() {
		return monthsToGoal;
	}

	public void setMonthsToGoal(Integer monthsToGoal) {
		this.monthsToGoal = monthsToGoal;
	}

	public List<AdvisorProductReco> getAdvisorProductReco() {
		return advisorProductReco;
	}

	public void setAdvisorProductReco(List<AdvisorProductReco> advisorProductReco) {
		this.advisorProductReco = advisorProductReco;
	}
	
	
}