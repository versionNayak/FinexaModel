package com.finlabs.finexa.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



/**
 * The persistent class for the clientMaster database table.
 * 
 */
@Entity
@Table(name = "clientMaster")
@NamedQuery(name = "ClientMaster.findAll", query = "SELECT c FROM ClientMaster c")
public class ClientMaster implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String finexaUser;
	
	private String aadhar;

	private String activeFlag;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private Integer createdBy;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createdOn;

	private String currDesignation;
	
	private String loginUsername;
	
	private String client;
	
	private String loginPassword;

	private String firstName;

	private String gender;
	
	private String loggedInFlag;

	private String lastName;

	private Integer lastUpdatedBy;

	private Timestamp lastUpdatedOn;

	private byte lifeExpectancy;

	private String middleName;

	private byte olderRiskProfile;

	private String orgName;

	private String otherEduQualification;

	private String otherEmploymentType;

	private String otherMaritalStatus;

	private String otherResidentType;

	private String pan;

	private String retiredFlag;

	private byte retirementAge;

	private Byte riskProfile;

	private String salutation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLoginTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastLogoutTime;

	// bi-directional many-to-one association to ClientAnnuity
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientAnnuity> clientAnnuities;

	// bi-directional many-to-one association to ClientAtalPensionYojana
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientAtalPensionYojana> clientAtalPensionYojanas;

	// bi-directional many-to-one association to ClientCash
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientCash> clientCashs;

	// bi-directional many-to-one association to ClientContact
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientContact> clientContacts;

	// bi-directional many-to-one association to ClientEPF
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientEPF> clientEpfs;

	// bi-directional many-to-one association to ClientEquity
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientEquity> clientEquities;

	// bi-directional many-to-one association to ClientExpense
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientExpense> clientExpenses;

	// bi-directional many-to-one association to ClientFamilyIncome
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientFamilyIncome> clientFamilyIncomes;

	// bi-directional many-to-one association to ClientFamilyMember
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientFamilyMember> clientFamilyMembers;

	// bi-directional many-to-one association to ClientFixedIncome
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientFixedIncome> clientFixedIncomes;

	// bi-directional many-to-one association to ClientGoal
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientGoal> clientGoals;

	// bi-directional many-to-one association to ClientGuardian
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientGuardian> clientGuardians;

	// bi-directional many-to-one association to ClientLifeInsurance
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientLifeInsurance> clientLifeInsurances;

	// bi-directional many-to-one association to ClientLoan
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientLoan> clientLoans;

	// bi-directional many-to-one association to ClientLumpsumInflow
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientLumpsumInflow> clientLumpsumInflows;

	// bi-directional many-to-one association to LookupMaritalStatus
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maritalStatus")
	private LookupMaritalStatus lookupMaritalStatus;

	// bi-directional many-to-one association to LookupEducationalQualification
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eduQualification")
	private LookupEducationalQualification lookupEducationalQualification;

	// bi-directional many-to-one association to LookupEmploymentType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "employmentType")
	private LookupEmploymentType lookupEmploymentType;

	// bi-directional many-to-one association to LookupResidentType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "residentType")
	private LookupResidentType lookupResidentType;

	// bi-directional many-to-one association to LookupCountry
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "countryOfResidence")
	private LookupCountry lookupCountry;

	// bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID")
	private AdvisorUser advisorUser;

	// bi-directional many-to-one association to ClientMutualFund
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientMutualFund> clientMutualFunds;

	// bi-directional many-to-one association to ClientNP
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientNPS> clientNps;

	// bi-directional many-to-one association to ClientNonLifeInsurance
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientNonLifeInsurance> clientNonLifeInsurances;

	// bi-directional many-to-one association to ClientOtherAlternateAsset
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientOtherAlternateAsset> clientOtherAlternateAssets;

	// bi-directional many-to-one association to ClientPPF
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientPPF> clientPpfs;

	// bi-directional many-to-one association to ClientPreciousMetal
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientPreciousMetal> clientPreciousMetals;

	// bi-directional many-to-one association to ClientRealEstate
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientRealEstate> clientRealEstates;

	// bi-directional many-to-one association to ClientRiskProfileResponse
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientRiskProfileResponse> clientRiskProfileResponses;

	// bi-directional many-to-one association to ClientSmallSaving
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientSmallSaving> clientSmallSavings;

	// bi-directional many-to-one association to ClientStructuredProduct
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientStructuredProduct> clientStructuredProducts;

	// bi-directional many-to-one association to ClientVehicle
	@OneToMany(mappedBy = "clientMaster")
	private List<ClientVehicle> clientVehicles;

	//bi-directional many-to-one association to ClientUCCDetail
	@OneToMany(mappedBy="clientMaster")
	private List<ClientUCCDetail> clientUccdetails;

	//bi-directional many-to-one association to ClientFatcaReport
	@OneToMany(mappedBy="clientMaster")
	private List<ClientFatcaReport> clientFatcaReports;

	//bi-directional many-to-one association to ClientMandateRegistration
	@OneToMany(mappedBy="clientMaster")
	private List<ClientMandateRegistration> clientMandateRegistrations;

	//bi-directional many-to-one association to ClientSWPSTPOrderRegistration
	@OneToMany(mappedBy="clientMaster")
	private List<ClientSWPOrderRegistration> clientSwpstporderRegistrations;

	//bi-directional many-to-one association to ClientUCCDetailsDraftMode
	@OneToMany(mappedBy="clientMaster")
	private List<ClientUCCDetailsDraftMode> clientUccdetailsDraftModes;

	//bi-directional many-to-one association to PurchaseOrderEntryParam
	@OneToMany(mappedBy="clientMaster")
	private List<PurchaseOrderEntryParam> purchaseOrderEntryParams;

	//bi-directional many-to-one association to XsipOrderEntryParam
	@OneToMany(mappedBy="clientMaster")
	private List<XsipOrderEntryParam> xsipOrderEntryParams;

	//bi-directional many-to-one association to ClientCKYCDetail
	@OneToMany(mappedBy="clientMaster")
	private List<ClientCKYCDetail> clientCkycdetails;

	//bi-directional many-to-one association to ClientTransactAOFDetail
	@OneToMany(mappedBy="clientMaster")
	private List<ClientTransactAOFDetail> clientTransactAofdetails;

	//bi-directional many-to-one association to ClientTransactMandateDetail
	@OneToMany(mappedBy="clientMaster")
	private List<ClientTransactMandateDetail> clientTransactMandateDetails;

	//bi-directional many-to-one association to ClientSwitchOrderEntryParam
	@OneToMany(mappedBy="clientMaster")
	private List<ClientSwitchOrderEntryParam> clientSwitchOrderEntryParams;

	// bi-directional many-to-one association to ClientContact
	@OneToMany(mappedBy = "clientMaster")
	private List<AdvisorProductReco> advisorProductReco;

	//bi-directional many-to-one association to AuxillaryInvestorMaster
	@OneToMany(mappedBy="clientMaster")
	private List<AuxillaryInvestorMaster> auxillaryInvestorMasters;
	
	//bi-directional many-to-one association to AuxillaryInvestorMaster
	@OneToMany(cascade =CascadeType.ALL, mappedBy="clientMaster")
	private List<ClientLoginInfo> clientLoginInfo;
	
	@OneToOne(mappedBy = "clientMaster", fetch = FetchType.LAZY)
	private ClientAccessRight clientAccessRight;
	
	//bi-directional many-to-one association to ClientARNMapping
	@OneToMany(mappedBy="clientMaster")
	private List<ClientARNMapping> clientArnmappings;

	public ClientMaster() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getActiveFlag() {
		return this.activeFlag;
	}

	public void setActiveFlag(String activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getCurrDesignation() {
		return this.currDesignation;
	}

	public void setCurrDesignation(String currDesignation) {
		this.currDesignation = currDesignation;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getLastUpdatedBy() {
		return this.lastUpdatedBy;
	}

	public void setLastUpdatedBy(Integer lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public Timestamp getLastUpdatedOn() {
		return this.lastUpdatedOn;
	}

	public void setLastUpdatedOn(Timestamp lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}

	public byte getLifeExpectancy() {
		return this.lifeExpectancy;
	}

	public void setLifeExpectancy(byte lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public byte getOlderRiskProfile() {
		return this.olderRiskProfile;
	}

	public void setOlderRiskProfile(byte olderRiskProfile) {
		this.olderRiskProfile = olderRiskProfile;
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOtherEduQualification() {
		return this.otherEduQualification;
	}

	public void setOtherEduQualification(String otherEduQualification) {
		this.otherEduQualification = otherEduQualification;
	}

	public String getOtherEmploymentType() {
		return this.otherEmploymentType;
	}

	public void setOtherEmploymentType(String otherEmploymentType) {
		this.otherEmploymentType = otherEmploymentType;
	}

	public String getOtherMaritalStatus() {
		return this.otherMaritalStatus;
	}

	public void setOtherMaritalStatus(String otherMaritalStatus) {
		this.otherMaritalStatus = otherMaritalStatus;
	}

	public String getOtherResidentType() {
		return this.otherResidentType;
	}

	public void setOtherResidentType(String otherResidentType) {
		this.otherResidentType = otherResidentType;
	}

	public String getPan() {
		return this.pan;
	}

	public void setPan(String pan) {
		this.pan = pan;
	}

	public String getRetiredFlag() {
		return this.retiredFlag;
	}

	public void setRetiredFlag(String retiredFlag) {
		this.retiredFlag = retiredFlag;
	}

	public byte getRetirementAge() {
		return this.retirementAge;
	}

	public void setRetirementAge(byte retirementAge) {
		this.retirementAge = retirementAge;
	}

	public Byte getRiskProfile() {
		return this.riskProfile;
	}

	public void setRiskProfile(Byte riskProfile) {
		this.riskProfile = riskProfile;
	}

	public String getSalutation() {
		return this.salutation;
	}

	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}

	public List<ClientAnnuity> getClientAnnuities() {
		return this.clientAnnuities;
	}

	public void setClientAnnuities(List<ClientAnnuity> clientAnnuities) {
		this.clientAnnuities = clientAnnuities;
	}

	public ClientAnnuity addClientAnnuity(ClientAnnuity clientAnnuity) {
		getClientAnnuities().add(clientAnnuity);
		clientAnnuity.setClientMaster(this);

		return clientAnnuity;
	}

	public ClientAnnuity removeClientAnnuity(ClientAnnuity clientAnnuity) {
		getClientAnnuities().remove(clientAnnuity);
		clientAnnuity.setClientMaster(null);

		return clientAnnuity;
	}

	public List<ClientAtalPensionYojana> getClientAtalPensionYojanas() {
		return this.clientAtalPensionYojanas;
	}

	public void setClientAtalPensionYojanas(List<ClientAtalPensionYojana> clientAtalPensionYojanas) {
		this.clientAtalPensionYojanas = clientAtalPensionYojanas;
	}

	public ClientAtalPensionYojana addClientAtalPensionYojana(ClientAtalPensionYojana clientAtalPensionYojana) {
		getClientAtalPensionYojanas().add(clientAtalPensionYojana);
		clientAtalPensionYojana.setClientMaster(this);

		return clientAtalPensionYojana;
	}

	public ClientAtalPensionYojana removeClientAtalPensionYojana(ClientAtalPensionYojana clientAtalPensionYojana) {
		getClientAtalPensionYojanas().remove(clientAtalPensionYojana);
		clientAtalPensionYojana.setClientMaster(null);

		return clientAtalPensionYojana;
	}

	public List<ClientCash> getClientCashs() {
		return this.clientCashs;
	}

	public void setClientCashs(List<ClientCash> clientCashs) {
		this.clientCashs = clientCashs;
	}

	public ClientCash addClientCash(ClientCash clientCash) {
		getClientCashs().add(clientCash);
		clientCash.setClientMaster(this);

		return clientCash;
	}

	public ClientCash removeClientCash(ClientCash clientCash) {
		getClientCashs().remove(clientCash);
		clientCash.setClientMaster(null);

		return clientCash;
	}

	public List<ClientContact> getClientContacts() {
		return this.clientContacts;
	}

	public void setClientContacts(List<ClientContact> clientContacts) {
		this.clientContacts = clientContacts;
	}

	public ClientContact addClientContact(ClientContact clientContact) {
		getClientContacts().add(clientContact);
		clientContact.setClientMaster(this);

		return clientContact;
	}

	public ClientContact removeClientContact(ClientContact clientContact) {
		getClientContacts().remove(clientContact);
		clientContact.setClientMaster(null);

		return clientContact;
	}

	public List<ClientEPF> getClientEpfs() {
		return this.clientEpfs;
	}

	public void setClientEpfs(List<ClientEPF> clientEpfs) {
		this.clientEpfs = clientEpfs;
	}

	public ClientEPF addClientEpf(ClientEPF clientEpf) {
		getClientEpfs().add(clientEpf);
		clientEpf.setClientMaster(this);

		return clientEpf;
	}

	public ClientEPF removeClientEpf(ClientEPF clientEpf) {
		getClientEpfs().remove(clientEpf);
		clientEpf.setClientMaster(null);

		return clientEpf;
	}

	public List<ClientEquity> getClientEquities() {
		return this.clientEquities;
	}

	public void setClientEquities(List<ClientEquity> clientEquities) {
		this.clientEquities = clientEquities;
	}

	public ClientEquity addClientEquity(ClientEquity clientEquity) {
		getClientEquities().add(clientEquity);
		clientEquity.setClientMaster(this);

		return clientEquity;
	}

	public ClientEquity removeClientEquity(ClientEquity clientEquity) {
		getClientEquities().remove(clientEquity);
		clientEquity.setClientMaster(null);

		return clientEquity;
	}

	public List<ClientExpense> getClientExpenses() {
		return this.clientExpenses;
	}

	public void setClientExpenses(List<ClientExpense> clientExpenses) {
		this.clientExpenses = clientExpenses;
	}

	public ClientExpense addClientExpens(ClientExpense clientExpens) {
		getClientExpenses().add(clientExpens);
		clientExpens.setClientMaster(this);

		return clientExpens;
	}

	public ClientExpense removeClientExpens(ClientExpense clientExpens) {
		getClientExpenses().remove(clientExpens);
		clientExpens.setClientMaster(null);

		return clientExpens;
	}

	public List<ClientFamilyIncome> getClientFamilyIncomes() {
		return this.clientFamilyIncomes;
	}

	public void setClientFamilyIncomes(List<ClientFamilyIncome> clientFamilyIncomes) {
		this.clientFamilyIncomes = clientFamilyIncomes;
	}

	public ClientFamilyIncome addClientFamilyIncome(ClientFamilyIncome clientFamilyIncome) {
		getClientFamilyIncomes().add(clientFamilyIncome);
		clientFamilyIncome.setClientMaster(this);

		return clientFamilyIncome;
	}

	public ClientFamilyIncome removeClientFamilyIncome(ClientFamilyIncome clientFamilyIncome) {
		getClientFamilyIncomes().remove(clientFamilyIncome);
		clientFamilyIncome.setClientMaster(null);

		return clientFamilyIncome;
	}

	public List<ClientFamilyMember> getClientFamilyMembers() {
		return this.clientFamilyMembers;
	}

	public void setClientFamilyMembers(List<ClientFamilyMember> clientFamilyMembers) {
		this.clientFamilyMembers = clientFamilyMembers;
	}

	public ClientFamilyMember addClientFamilyMember(ClientFamilyMember clientFamilyMember) {
		getClientFamilyMembers().add(clientFamilyMember);
		clientFamilyMember.setClientMaster(this);

		return clientFamilyMember;
	}

	public ClientFamilyMember removeClientFamilyMember(ClientFamilyMember clientFamilyMember) {
		getClientFamilyMembers().remove(clientFamilyMember);
		clientFamilyMember.setClientMaster(null);

		return clientFamilyMember;
	}

	public List<ClientFixedIncome> getClientFixedIncomes() {
		return this.clientFixedIncomes;
	}

	public void setClientFixedIncomes(List<ClientFixedIncome> clientFixedIncomes) {
		this.clientFixedIncomes = clientFixedIncomes;
	}

	public ClientFixedIncome addClientFixedIncome(ClientFixedIncome clientFixedIncome) {
		getClientFixedIncomes().add(clientFixedIncome);
		clientFixedIncome.setClientMaster(this);

		return clientFixedIncome;
	}

	public ClientFixedIncome removeClientFixedIncome(ClientFixedIncome clientFixedIncome) {
		getClientFixedIncomes().remove(clientFixedIncome);
		clientFixedIncome.setClientMaster(null);

		return clientFixedIncome;
	}

	public List<ClientGoal> getClientGoals() {
		return this.clientGoals;
	}

	public void setClientGoals(List<ClientGoal> clientGoals) {
		this.clientGoals = clientGoals;
	}

	public ClientGoal addClientGoal(ClientGoal clientGoal) {
		getClientGoals().add(clientGoal);
		clientGoal.setClientMaster(this);

		return clientGoal;
	}

	public ClientGoal removeClientGoal(ClientGoal clientGoal) {
		getClientGoals().remove(clientGoal);
		clientGoal.setClientMaster(null);

		return clientGoal;
	}

	public List<ClientGuardian> getClientGuardians() {
		return this.clientGuardians;
	}

	public void setClientGuardians(List<ClientGuardian> clientGuardians) {
		this.clientGuardians = clientGuardians;
	}

	public ClientGuardian addClientGuardian(ClientGuardian clientGuardian) {
		getClientGuardians().add(clientGuardian);
		clientGuardian.setClientMaster(this);

		return clientGuardian;
	}

	public ClientGuardian removeClientGuardian(ClientGuardian clientGuardian) {
		getClientGuardians().remove(clientGuardian);
		clientGuardian.setClientMaster(null);

		return clientGuardian;
	}

	public List<ClientLifeInsurance> getClientLifeInsurances() {
		return this.clientLifeInsurances;
	}

	public void setClientLifeInsurances(List<ClientLifeInsurance> clientLifeInsurances) {
		this.clientLifeInsurances = clientLifeInsurances;
	}

	public ClientLifeInsurance addClientLifeInsurance(ClientLifeInsurance clientLifeInsurance) {
		getClientLifeInsurances().add(clientLifeInsurance);
		clientLifeInsurance.setClientMaster(this);

		return clientLifeInsurance;
	}

	public ClientLifeInsurance removeClientLifeInsurance(ClientLifeInsurance clientLifeInsurance) {
		getClientLifeInsurances().remove(clientLifeInsurance);
		clientLifeInsurance.setClientMaster(null);

		return clientLifeInsurance;
	}

	public List<ClientLoan> getClientLoans() {
		return this.clientLoans;
	}

	public void setClientLoans(List<ClientLoan> clientLoans) {
		this.clientLoans = clientLoans;
	}

	public ClientLoan addClientLoan(ClientLoan clientLoan) {
		getClientLoans().add(clientLoan);
		clientLoan.setClientMaster(this);

		return clientLoan;
	}

	public ClientLoan removeClientLoan(ClientLoan clientLoan) {
		getClientLoans().remove(clientLoan);
		clientLoan.setClientMaster(null);

		return clientLoan;
	}

	public List<ClientLumpsumInflow> getClientLumpsumInflows() {
		return this.clientLumpsumInflows;
	}

	public void setClientLumpsumInflows(List<ClientLumpsumInflow> clientLumpsumInflows) {
		this.clientLumpsumInflows = clientLumpsumInflows;
	}

	public ClientLumpsumInflow addClientLumpsumInflow(ClientLumpsumInflow clientLumpsumInflow) {
		getClientLumpsumInflows().add(clientLumpsumInflow);
		clientLumpsumInflow.setClientMaster(this);

		return clientLumpsumInflow;
	}

	public ClientLumpsumInflow removeClientLumpsumInflow(ClientLumpsumInflow clientLumpsumInflow) {
		getClientLumpsumInflows().remove(clientLumpsumInflow);
		clientLumpsumInflow.setClientMaster(null);

		return clientLumpsumInflow;
	}

	public LookupMaritalStatus getLookupMaritalStatus() {
		return this.lookupMaritalStatus;
	}

	public void setLookupMaritalStatus(LookupMaritalStatus lookupMaritalStatus) {
		this.lookupMaritalStatus = lookupMaritalStatus;
	}

	public LookupEducationalQualification getLookupEducationalQualification() {
		return this.lookupEducationalQualification;
	}

	public void setLookupEducationalQualification(LookupEducationalQualification lookupEducationalQualification) {
		this.lookupEducationalQualification = lookupEducationalQualification;
	}

	public LookupEmploymentType getLookupEmploymentType() {
		return this.lookupEmploymentType;
	}

	public void setLookupEmploymentType(LookupEmploymentType lookupEmploymentType) {
		this.lookupEmploymentType = lookupEmploymentType;
	}

	public LookupResidentType getLookupResidentType() {
		return this.lookupResidentType;
	}

	public void setLookupResidentType(LookupResidentType lookupResidentType) {
		this.lookupResidentType = lookupResidentType;
	}

	public LookupCountry getLookupCountry() {
		return this.lookupCountry;
	}

	public void setLookupCountry(LookupCountry lookupCountry) {
		this.lookupCountry = lookupCountry;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public List<ClientMutualFund> getClientMutualFunds() {
		return this.clientMutualFunds;
	}

	public void setClientMutualFunds(List<ClientMutualFund> clientMutualFunds) {
		this.clientMutualFunds = clientMutualFunds;
	}

	public ClientMutualFund addClientMutualFund(ClientMutualFund clientMutualFund) {
		getClientMutualFunds().add(clientMutualFund);
		clientMutualFund.setClientMaster(this);

		return clientMutualFund;
	}

	public ClientMutualFund removeClientMutualFund(ClientMutualFund clientMutualFund) {
		getClientMutualFunds().remove(clientMutualFund);
		clientMutualFund.setClientMaster(null);

		return clientMutualFund;
	}

	public List<ClientNPS> getClientNps() {
		return this.clientNps;
	}

	public void setClientNps(List<ClientNPS> clientNps) {
		this.clientNps = clientNps;
	}

	public ClientNPS addClientNp(ClientNPS clientNp) {
		getClientNps().add(clientNp);
		clientNp.setClientMaster(this);

		return clientNp;
	}

	public ClientNPS removeClientNp(ClientNPS clientNp) {
		getClientNps().remove(clientNp);
		clientNp.setClientMaster(null);

		return clientNp;
	}

	public List<ClientNonLifeInsurance> getClientNonLifeInsurances() {
		return this.clientNonLifeInsurances;
	}

	public void setClientNonLifeInsurances(List<ClientNonLifeInsurance> clientNonLifeInsurances) {
		this.clientNonLifeInsurances = clientNonLifeInsurances;
	}

	public ClientNonLifeInsurance addClientNonLifeInsurance(ClientNonLifeInsurance clientNonLifeInsurance) {
		getClientNonLifeInsurances().add(clientNonLifeInsurance);
		clientNonLifeInsurance.setClientMaster(this);

		return clientNonLifeInsurance;
	}

	public ClientNonLifeInsurance removeClientNonLifeInsurance(ClientNonLifeInsurance clientNonLifeInsurance) {
		getClientNonLifeInsurances().remove(clientNonLifeInsurance);
		clientNonLifeInsurance.setClientMaster(null);

		return clientNonLifeInsurance;
	}

	public List<ClientOtherAlternateAsset> getClientOtherAlternateAssets() {
		return this.clientOtherAlternateAssets;
	}

	public void setClientOtherAlternateAssets(List<ClientOtherAlternateAsset> clientOtherAlternateAssets) {
		this.clientOtherAlternateAssets = clientOtherAlternateAssets;
	}

	public ClientOtherAlternateAsset addClientOtherAlternateAsset(ClientOtherAlternateAsset clientOtherAlternateAsset) {
		getClientOtherAlternateAssets().add(clientOtherAlternateAsset);
		clientOtherAlternateAsset.setClientMaster(this);

		return clientOtherAlternateAsset;
	}

	public ClientOtherAlternateAsset removeClientOtherAlternateAsset(
			ClientOtherAlternateAsset clientOtherAlternateAsset) {
		getClientOtherAlternateAssets().remove(clientOtherAlternateAsset);
		clientOtherAlternateAsset.setClientMaster(null);

		return clientOtherAlternateAsset;
	}

	public List<ClientPPF> getClientPpfs() {
		return this.clientPpfs;
	}

	public void setClientPpfs(List<ClientPPF> clientPpfs) {
		this.clientPpfs = clientPpfs;
	}

	public ClientPPF addClientPpf(ClientPPF clientPpf) {
		getClientPpfs().add(clientPpf);
		clientPpf.setClientMaster(this);

		return clientPpf;
	}

	public ClientPPF removeClientPpf(ClientPPF clientPpf) {
		getClientPpfs().remove(clientPpf);
		clientPpf.setClientMaster(null);

		return clientPpf;
	}

	public List<ClientPreciousMetal> getClientPreciousMetals() {
		return this.clientPreciousMetals;
	}

	public void setClientPreciousMetals(List<ClientPreciousMetal> clientPreciousMetals) {
		this.clientPreciousMetals = clientPreciousMetals;
	}

	public ClientPreciousMetal addClientPreciousMetal(ClientPreciousMetal clientPreciousMetal) {
		getClientPreciousMetals().add(clientPreciousMetal);
		clientPreciousMetal.setClientMaster(this);

		return clientPreciousMetal;
	}

	public ClientPreciousMetal removeClientPreciousMetal(ClientPreciousMetal clientPreciousMetal) {
		getClientPreciousMetals().remove(clientPreciousMetal);
		clientPreciousMetal.setClientMaster(null);

		return clientPreciousMetal;
	}

	public List<ClientRealEstate> getClientRealEstates() {
		return this.clientRealEstates;
	}

	public void setClientRealEstates(List<ClientRealEstate> clientRealEstates) {
		this.clientRealEstates = clientRealEstates;
	}

	public ClientRealEstate addClientRealEstate(ClientRealEstate clientRealEstate) {
		getClientRealEstates().add(clientRealEstate);
		clientRealEstate.setClientMaster(this);

		return clientRealEstate;
	}

	public ClientRealEstate removeClientRealEstate(ClientRealEstate clientRealEstate) {
		getClientRealEstates().remove(clientRealEstate);
		clientRealEstate.setClientMaster(null);

		return clientRealEstate;
	}

	public List<ClientRiskProfileResponse> getClientRiskProfileResponses() {
		return this.clientRiskProfileResponses;
	}

	public void setClientRiskProfileResponses(List<ClientRiskProfileResponse> clientRiskProfileResponses) {
		this.clientRiskProfileResponses = clientRiskProfileResponses;
	}

	public ClientRiskProfileResponse addClientRiskProfileRespons(ClientRiskProfileResponse clientRiskProfileRespons) {
		getClientRiskProfileResponses().add(clientRiskProfileRespons);
		clientRiskProfileRespons.setClientMaster(this);

		return clientRiskProfileRespons;
	}

	public ClientRiskProfileResponse removeClientRiskProfileRespons(
			ClientRiskProfileResponse clientRiskProfileRespons) {
		getClientRiskProfileResponses().remove(clientRiskProfileRespons);
		clientRiskProfileRespons.setClientMaster(null);

		return clientRiskProfileRespons;
	}

	public List<ClientSmallSaving> getClientSmallSavings() {
		return this.clientSmallSavings;
	}

	public void setClientSmallSavings(List<ClientSmallSaving> clientSmallSavings) {
		this.clientSmallSavings = clientSmallSavings;
	}

	public ClientSmallSaving addClientSmallSaving(ClientSmallSaving clientSmallSaving) {
		getClientSmallSavings().add(clientSmallSaving);
		clientSmallSaving.setClientMaster(this);

		return clientSmallSaving;
	}

	public ClientSmallSaving removeClientSmallSaving(ClientSmallSaving clientSmallSaving) {
		getClientSmallSavings().remove(clientSmallSaving);
		clientSmallSaving.setClientMaster(null);

		return clientSmallSaving;
	}

	public List<ClientStructuredProduct> getClientStructuredProducts() {
		return this.clientStructuredProducts;
	}

	public void setClientStructuredProducts(List<ClientStructuredProduct> clientStructuredProducts) {
		this.clientStructuredProducts = clientStructuredProducts;
	}

	public ClientStructuredProduct addClientStructuredProduct(ClientStructuredProduct clientStructuredProduct) {
		getClientStructuredProducts().add(clientStructuredProduct);
		clientStructuredProduct.setClientMaster(this);

		return clientStructuredProduct;
	}

	public ClientStructuredProduct removeClientStructuredProduct(ClientStructuredProduct clientStructuredProduct) {
		getClientStructuredProducts().remove(clientStructuredProduct);
		clientStructuredProduct.setClientMaster(null);

		return clientStructuredProduct;
	}

	public List<ClientVehicle> getClientVehicles() {
		return this.clientVehicles;
	}

	public void setClientVehicles(List<ClientVehicle> clientVehicles) {
		this.clientVehicles = clientVehicles;
	}

	public ClientVehicle addClientVehicle(ClientVehicle clientVehicle) {
		getClientVehicles().add(clientVehicle);
		clientVehicle.setClientMaster(this);

		return clientVehicle;
	}

	public ClientVehicle removeClientVehicle(ClientVehicle clientVehicle) {
		getClientVehicles().remove(clientVehicle);
		clientVehicle.setClientMaster(null);

		return clientVehicle;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public List<ClientUCCDetail> getClientUccdetails() {
		return this.clientUccdetails;
	}

	public void setClientUccdetails(List<ClientUCCDetail> clientUccdetails) {
		this.clientUccdetails = clientUccdetails;
	}

	public ClientUCCDetail addClientUccdetail(ClientUCCDetail clientUccdetail) {
		getClientUccdetails().add(clientUccdetail);
		clientUccdetail.setClientMaster(this);

		return clientUccdetail;
	}

	public ClientUCCDetail removeClientUccdetail(ClientUCCDetail clientUccdetail) {
		getClientUccdetails().remove(clientUccdetail);
		clientUccdetail.setClientMaster(null);

		return clientUccdetail;
	}
	public List<ClientFatcaReport> getClientFatcaReports() {
		return this.clientFatcaReports;
	}

	public void setClientFatcaReports(List<ClientFatcaReport> clientFatcaReports) {
		this.clientFatcaReports = clientFatcaReports;
	}

	public ClientFatcaReport addClientFatcaReport(ClientFatcaReport clientFatcaReport) {
		getClientFatcaReports().add(clientFatcaReport);
		clientFatcaReport.setClientMaster(this);

		return clientFatcaReport;
	}

	public ClientFatcaReport removeClientFatcaReport(ClientFatcaReport clientFatcaReport) {
		getClientFatcaReports().remove(clientFatcaReport);
		clientFatcaReport.setClientMaster(null);

		return clientFatcaReport;
	}
	public List<ClientMandateRegistration> getClientMandateRegistrations() {
		return this.clientMandateRegistrations;
	}

	public void setClientMandateRegistrations(List<ClientMandateRegistration> clientMandateRegistrations) {
		this.clientMandateRegistrations = clientMandateRegistrations;
	}

	public ClientMandateRegistration addClientMandateRegistration(ClientMandateRegistration clientMandateRegistration) {
		getClientMandateRegistrations().add(clientMandateRegistration);
		clientMandateRegistration.setClientMaster(this);

		return clientMandateRegistration;
	}

	public ClientMandateRegistration removeClientMandateRegistration(ClientMandateRegistration clientMandateRegistration) {
		getClientMandateRegistrations().remove(clientMandateRegistration);
		clientMandateRegistration.setClientMaster(null);

		return clientMandateRegistration;
	}

	public List<ClientSWPOrderRegistration> getClientSwpstporderRegistrations() {
		return this.clientSwpstporderRegistrations;
	}

	public void setClientSwpstporderRegistrations(List<ClientSWPOrderRegistration> clientSwpstporderRegistrations) {
		this.clientSwpstporderRegistrations = clientSwpstporderRegistrations;
	}

	public ClientSWPOrderRegistration addClientSwpstporderRegistration(ClientSWPOrderRegistration clientSwpstporderRegistration) {
		getClientSwpstporderRegistrations().add(clientSwpstporderRegistration);
		clientSwpstporderRegistration.setClientMaster(this);

		return clientSwpstporderRegistration;
	}

	public ClientSWPOrderRegistration removeClientSwpstporderRegistration(ClientSWPOrderRegistration clientSwpstporderRegistration) {
		getClientSwpstporderRegistrations().remove(clientSwpstporderRegistration);
		clientSwpstporderRegistration.setClientMaster(null);

		return clientSwpstporderRegistration;
	}
	public List<ClientUCCDetailsDraftMode> getClientUccdetailsDraftModes() {
		return this.clientUccdetailsDraftModes;
	}

	public void setClientUccdetailsDraftModes(List<ClientUCCDetailsDraftMode> clientUccdetailsDraftModes) {
		this.clientUccdetailsDraftModes = clientUccdetailsDraftModes;
	}

	public ClientUCCDetailsDraftMode addClientUccdetailsDraftMode(ClientUCCDetailsDraftMode clientUccdetailsDraftMode) {
		getClientUccdetailsDraftModes().add(clientUccdetailsDraftMode);
		clientUccdetailsDraftMode.setClientMaster(this);

		return clientUccdetailsDraftMode;
	}

	public ClientUCCDetailsDraftMode removeClientUccdetailsDraftMode(ClientUCCDetailsDraftMode clientUccdetailsDraftMode) {
		getClientUccdetailsDraftModes().remove(clientUccdetailsDraftMode);
		clientUccdetailsDraftMode.setClientMaster(null);

		return clientUccdetailsDraftMode;
	}

	public List<PurchaseOrderEntryParam> getPurchaseOrderEntryParams() {
		return this.purchaseOrderEntryParams;
	}

	public void setPurchaseOrderEntryParams(List<PurchaseOrderEntryParam> purchaseOrderEntryParams) {
		this.purchaseOrderEntryParams = purchaseOrderEntryParams;
	}

	public PurchaseOrderEntryParam addPurchaseOrderEntryParam(PurchaseOrderEntryParam purchaseOrderEntryParam) {
		getPurchaseOrderEntryParams().add(purchaseOrderEntryParam);
		purchaseOrderEntryParam.setClientMaster(this);

		return purchaseOrderEntryParam;
	}

	public PurchaseOrderEntryParam removePurchaseOrderEntryParam(PurchaseOrderEntryParam purchaseOrderEntryParam) {
		getPurchaseOrderEntryParams().remove(purchaseOrderEntryParam);
		purchaseOrderEntryParam.setClientMaster(null);

		return purchaseOrderEntryParam;
	}

	public List<XsipOrderEntryParam> getXsipOrderEntryParams() {
		return this.xsipOrderEntryParams;
	}

	public void setXsipOrderEntryParams(List<XsipOrderEntryParam> xsipOrderEntryParams) {
		this.xsipOrderEntryParams = xsipOrderEntryParams;
	}

	public XsipOrderEntryParam addXsipOrderEntryParam(XsipOrderEntryParam xsipOrderEntryParam) {
		getXsipOrderEntryParams().add(xsipOrderEntryParam);
		xsipOrderEntryParam.setClientMaster(this);

		return xsipOrderEntryParam;
	}

	public XsipOrderEntryParam removeXsipOrderEntryParam(XsipOrderEntryParam xsipOrderEntryParam) {
		getXsipOrderEntryParams().remove(xsipOrderEntryParam);
		xsipOrderEntryParam.setClientMaster(null);

		return xsipOrderEntryParam;
	}

	public List<ClientCKYCDetail> getClientCkycdetails() {
		return this.clientCkycdetails;
	}

	public void setClientCkycdetails(List<ClientCKYCDetail> clientCkycdetails) {
		this.clientCkycdetails = clientCkycdetails;
	}

	public ClientCKYCDetail addClientCkycdetail(ClientCKYCDetail clientCkycdetail) {
		getClientCkycdetails().add(clientCkycdetail);
		clientCkycdetail.setClientMaster(this);

		return clientCkycdetail;
	}

	public ClientCKYCDetail removeClientCkycdetail(ClientCKYCDetail clientCkycdetail) {
		getClientCkycdetails().remove(clientCkycdetail);
		clientCkycdetail.setClientMaster(null);

		return clientCkycdetail;
	}

	public List<ClientTransactAOFDetail> getClientTransactAofdetails() {
		return this.clientTransactAofdetails;
	}

	public void setClientTransactAofdetails(List<ClientTransactAOFDetail> clientTransactAofdetails) {
		this.clientTransactAofdetails = clientTransactAofdetails;
	}

	public ClientTransactAOFDetail addClientTransactAofdetail(ClientTransactAOFDetail clientTransactAofdetail) {
		getClientTransactAofdetails().add(clientTransactAofdetail);
		clientTransactAofdetail.setClientMaster(this);

		return clientTransactAofdetail;
	}

	public ClientTransactAOFDetail removeClientTransactAofdetail(ClientTransactAOFDetail clientTransactAofdetail) {
		getClientTransactAofdetails().remove(clientTransactAofdetail);
		clientTransactAofdetail.setClientMaster(null);

		return clientTransactAofdetail;
	}

	public List<ClientTransactMandateDetail> getClientTransactMandateDetails() {
		return this.clientTransactMandateDetails;
	}

	public void setClientTransactMandateDetails(List<ClientTransactMandateDetail> clientTransactMandateDetails) {
		this.clientTransactMandateDetails = clientTransactMandateDetails;
	}

	public ClientTransactMandateDetail addClientTransactMandateDetail(ClientTransactMandateDetail clientTransactMandateDetail) {
		getClientTransactMandateDetails().add(clientTransactMandateDetail);
		clientTransactMandateDetail.setClientMaster(this);

		return clientTransactMandateDetail;
	}

	public ClientTransactMandateDetail removeClientTransactMandateDetail(ClientTransactMandateDetail clientTransactMandateDetail) {
		getClientTransactMandateDetails().remove(clientTransactMandateDetail);
		clientTransactMandateDetail.setClientMaster(null);

		return clientTransactMandateDetail;
	}

	public List<ClientSwitchOrderEntryParam> getClientSwitchOrderEntryParams() {
		return this.clientSwitchOrderEntryParams;
	}

	public void setClientSwitchOrderEntryParams(List<ClientSwitchOrderEntryParam> clientSwitchOrderEntryParams) {
		this.clientSwitchOrderEntryParams = clientSwitchOrderEntryParams;
	}

	public ClientSwitchOrderEntryParam addClientSwitchOrderEntryParam(ClientSwitchOrderEntryParam clientSwitchOrderEntryParam) {
		getClientSwitchOrderEntryParams().add(clientSwitchOrderEntryParam);
		clientSwitchOrderEntryParam.setClientMaster(this);

		return clientSwitchOrderEntryParam;
	}

	public ClientSwitchOrderEntryParam removeClientSwitchOrderEntryParam(ClientSwitchOrderEntryParam clientSwitchOrderEntryParam) {
		getClientSwitchOrderEntryParams().remove(clientSwitchOrderEntryParam);
		clientSwitchOrderEntryParam.setClientMaster(null);

		return clientSwitchOrderEntryParam;
	}

	public List<AdvisorProductReco> getAdvisorProductReco() {
		return advisorProductReco;
	}

	public void setAdvisorProductReco(List<AdvisorProductReco> advisorProductReco) {
		this.advisorProductReco = advisorProductReco;
	}
	
	public List<AuxillaryInvestorMaster> getAuxillaryInvestorMasters() {
		return this.auxillaryInvestorMasters;
	}

	public void setAuxillaryInvestorMasters(List<AuxillaryInvestorMaster> auxillaryInvestorMasters) {
		this.auxillaryInvestorMasters = auxillaryInvestorMasters;
	}

	public AuxillaryInvestorMaster addAuxillaryInvestorMaster(AuxillaryInvestorMaster auxillaryInvestorMaster) {
		getAuxillaryInvestorMasters().add(auxillaryInvestorMaster);
		auxillaryInvestorMaster.setClientMaster(this);

		return auxillaryInvestorMaster;
	}

	public AuxillaryInvestorMaster removeAuxillaryInvestorMaster(AuxillaryInvestorMaster auxillaryInvestorMaster) {
		getAuxillaryInvestorMasters().remove(auxillaryInvestorMaster);
		auxillaryInvestorMaster.setClientMaster(null);

		return auxillaryInvestorMaster;
	}

	public String getLoginUsername() {
		return loginUsername;
	}

	public void setLoginUsername(String loginUsername) {
		this.loginUsername = loginUsername;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Date getLastLogoutTime() {
		return lastLogoutTime;
	}

	public void setLastLogoutTime(Date lastLogoutTime) {
		this.lastLogoutTime = lastLogoutTime;
	}
	public ClientAccessRight getClientAccessRight() {
		return this.clientAccessRight;
	}

	public void setClientAccessRight(ClientAccessRight clientAccessRight) {
		this.clientAccessRight = clientAccessRight;
	}
	
	public String getClient() {
		return this.client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public List<ClientLoginInfo> getClientLoginInfo() {
		return clientLoginInfo;
	}

	public void setClientLoginInfo(List<ClientLoginInfo> clientLoginInfo) {
		this.clientLoginInfo = clientLoginInfo;
	}
	

	public String getLoggedInFlag() {
		return loggedInFlag;
	}

	public void setLoggedInFlag(String loggedInFlag) {
		this.loggedInFlag = loggedInFlag;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getFinexaUser() {
		return finexaUser;
	}

	public void setFinexaUser(String finexaUser) {
		this.finexaUser = finexaUser;
	}


	public List<ClientARNMapping> getClientArnmappings() {
		return this.clientArnmappings;
	}

	public void setClientArnmappings(List<ClientARNMapping> clientArnmappings) {
		this.clientArnmappings = clientArnmappings;
	}

	public ClientARNMapping addClientArnmapping(ClientARNMapping clientArnmapping) {
		getClientArnmappings().add(clientArnmapping);
		clientArnmapping.setClientMaster(this);

		return clientArnmapping;
	}

	public ClientARNMapping removeClientArnmapping(ClientARNMapping clientArnmapping) {
		getClientArnmappings().remove(clientArnmapping);
		clientArnmapping.setClientMaster(null);

		return clientArnmapping;
	}


}