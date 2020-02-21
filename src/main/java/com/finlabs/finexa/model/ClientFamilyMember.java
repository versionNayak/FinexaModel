package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the clientFamilyMember database table.
 * 
 */
@Entity
@Table(name="clientFamilyMember")
@NamedQuery(name="ClientFamilyMember.findAll", query="SELECT c FROM ClientFamilyMember c")
public class ClientFamilyMember implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;

	private BigInteger aadhar;

	@Temporal(TemporalType.DATE)
	private Date birthDate;

	private byte createdBy;

	private Timestamp createdOn;

	private String dependentFlag;

	private String firstName;

	private String hasDiseaseHistory;

	private String hasNormalBP;

	private String isProperBMI;

	private String isTobaccoUser;

	private String lastName;

	private byte lastUpdateddBy;

	private Timestamp lastUpdatedOn;

	private Byte lifeExpectancy;

	private String middleName;

	private String otherRelation;

	private String pan;

	private String retiredFlag;

	private Byte retirementAge;
	
	private String isFamilyHead;

	//bi-directional many-to-one association to ClientAnnuity
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientAnnuity> clientAnnuities;

	//bi-directional many-to-one association to ClientAtalPensionYojana
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientAtalPensionYojana> clientAtalPensionYojanas;

	//bi-directional many-to-one association to ClientCash
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientCash> clientCashs;

	//bi-directional many-to-one association to ClientEPF
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientEPF> clientEpfs;

	//bi-directional many-to-one association to ClientEquity
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientEquity> clientEquities;

	//bi-directional many-to-one association to ClientFamilyIncome
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientFamilyIncome> clientFamilyIncomes;

	//bi-directional many-to-one association to ClientMaster
	//@JsonIgnore********************************************Done by Smita
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientID")
	private ClientMaster clientMaster;

	//bi-directional many-to-one association to LookupRelation
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="relationID")
	private LookupRelation lookupRelation;

	//bi-directional many-to-one association to ClientFixedIncome
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientFixedIncome> clientFixedIncomes;

	//bi-directional many-to-one association to ClientFloaterCover
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientFloaterCover> clientFloaterCovers;

	//bi-directional many-to-one association to ClientGoal
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientGoal> clientGoals;

	//bi-directional many-to-one association to ClientLifeInsurance
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientLifeInsurance> clientLifeInsurances;

	//bi-directional many-to-one association to ClientLoan
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientLoan> clientLoans;

	//bi-directional many-to-one association to ClientMutualFund
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientMutualFund> clientMutualFunds;

	//bi-directional many-to-one association to ClientNP
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientNPS> clientNps;

	//bi-directional many-to-one association to ClientNonLifeInsurance
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientNonLifeInsurance> clientNonLifeInsurances;

	//bi-directional many-to-one association to ClientOtherAlternateAsset
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientOtherAlternateAsset> clientOtherAlternateAssets;

	//bi-directional many-to-one association to ClientPPF
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientPPF> clientPpfs;

	//bi-directional many-to-one association to ClientPreciousMetal
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientPreciousMetal> clientPreciousMetals;

	//bi-directional many-to-one association to ClientRealEstate
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientRealEstate> clientRealEstates;

	//bi-directional many-to-one association to ClientSmallSaving
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientSmallSaving> clientSmallSavings;

	//bi-directional many-to-one association to ClientStructuredProduct
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientStructuredProduct> clientStructuredProducts;

	//bi-directional many-to-one association to ClientVehicle
	@OneToMany(mappedBy="clientFamilyMember")
	private List<ClientVehicle> clientVehicles;
	
	//bi-directional many-to-one association to AuxillaryFamilyMember
	@OneToMany(mappedBy="clientFamilyMember")
	private List<AuxillaryFamilyMember> auxillaryFamilyMembers;


	public ClientFamilyMember() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(BigInteger aadhar) {
		this.aadhar = aadhar;
	}

	public Date getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
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

	public String getDependentFlag() {
		return this.dependentFlag;
	}

	public void setDependentFlag(String dependentFlag) {
		this.dependentFlag = dependentFlag;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getHasDiseaseHistory() {
		return this.hasDiseaseHistory;
	}

	public void setHasDiseaseHistory(String hasDiseaseHistory) {
		this.hasDiseaseHistory = hasDiseaseHistory;
	}

	public String getHasNormalBP() {
		return this.hasNormalBP;
	}

	public void setHasNormalBP(String hasNormalBP) {
		this.hasNormalBP = hasNormalBP;
	}

	public String getIsProperBMI() {
		return this.isProperBMI;
	}

	public void setIsProperBMI(String isProperBMI) {
		this.isProperBMI = isProperBMI;
	}

	public String getIsTobaccoUser() {
		return this.isTobaccoUser;
	}

	public void setIsTobaccoUser(String isTobaccoUser) {
		this.isTobaccoUser = isTobaccoUser;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Byte getLifeExpectancy() {
		return this.lifeExpectancy;
	}

	public void setLifeExpectancy(Byte lifeExpectancy) {
		this.lifeExpectancy = lifeExpectancy;
	}

	public String getMiddleName() {
		return this.middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getOtherRelation() {
		return this.otherRelation;
	}

	public void setOtherRelation(String otherRelation) {
		this.otherRelation = otherRelation;
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

	public Byte getRetirementAge() {
		return this.retirementAge;
	}

	public void setRetirementAge(Byte retirementAge) {
		this.retirementAge = retirementAge;
	}

	public List<ClientAnnuity> getClientAnnuities() {
		return this.clientAnnuities;
	}

	public void setClientAnnuities(List<ClientAnnuity> clientAnnuities) {
		this.clientAnnuities = clientAnnuities;
	}

	public ClientAnnuity addClientAnnuity(ClientAnnuity clientAnnuity) {
		getClientAnnuities().add(clientAnnuity);
		clientAnnuity.setClientFamilyMember(this);

		return clientAnnuity;
	}

	public ClientAnnuity removeClientAnnuity(ClientAnnuity clientAnnuity) {
		getClientAnnuities().remove(clientAnnuity);
		clientAnnuity.setClientFamilyMember(null);

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
		clientAtalPensionYojana.setClientFamilyMember(this);

		return clientAtalPensionYojana;
	}

	public ClientAtalPensionYojana removeClientAtalPensionYojana(ClientAtalPensionYojana clientAtalPensionYojana) {
		getClientAtalPensionYojanas().remove(clientAtalPensionYojana);
		clientAtalPensionYojana.setClientFamilyMember(null);

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
		clientCash.setClientFamilyMember(this);

		return clientCash;
	}

	public ClientCash removeClientCash(ClientCash clientCash) {
		getClientCashs().remove(clientCash);
		clientCash.setClientFamilyMember(null);

		return clientCash;
	}

	public List<ClientEPF> getClientEpfs() {
		return this.clientEpfs;
	}

	public void setClientEpfs(List<ClientEPF> clientEpfs) {
		this.clientEpfs = clientEpfs;
	}

	public ClientEPF addClientEpf(ClientEPF clientEpf) {
		getClientEpfs().add(clientEpf);
		clientEpf.setClientFamilyMember(this);

		return clientEpf;
	}

	public ClientEPF removeClientEpf(ClientEPF clientEpf) {
		getClientEpfs().remove(clientEpf);
		clientEpf.setClientFamilyMember(null);

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
		clientEquity.setClientFamilyMember(this);

		return clientEquity;
	}

	public ClientEquity removeClientEquity(ClientEquity clientEquity) {
		getClientEquities().remove(clientEquity);
		clientEquity.setClientFamilyMember(null);

		return clientEquity;
	}

	public List<ClientFamilyIncome> getClientFamilyIncomes() {
		return this.clientFamilyIncomes;
	}

	public void setClientFamilyIncomes(List<ClientFamilyIncome> clientFamilyIncomes) {
		this.clientFamilyIncomes = clientFamilyIncomes;
	}

	public ClientFamilyIncome addClientFamilyIncome(ClientFamilyIncome clientFamilyIncome) {
		getClientFamilyIncomes().add(clientFamilyIncome);
		clientFamilyIncome.setClientFamilyMember(this);

		return clientFamilyIncome;
	}

	public ClientFamilyIncome removeClientFamilyIncome(ClientFamilyIncome clientFamilyIncome) {
		getClientFamilyIncomes().remove(clientFamilyIncome);
		clientFamilyIncome.setClientFamilyMember(null);

		return clientFamilyIncome;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

	public LookupRelation getLookupRelation() {
		return this.lookupRelation;
	}

	public void setLookupRelation(LookupRelation lookupRelation) {
		this.lookupRelation = lookupRelation;
	}

	public List<ClientFixedIncome> getClientFixedIncomes() {
		return this.clientFixedIncomes;
	}

	public void setClientFixedIncomes(List<ClientFixedIncome> clientFixedIncomes) {
		this.clientFixedIncomes = clientFixedIncomes;
	}

	public ClientFixedIncome addClientFixedIncome(ClientFixedIncome clientFixedIncome) {
		getClientFixedIncomes().add(clientFixedIncome);
		clientFixedIncome.setClientFamilyMember(this);

		return clientFixedIncome;
	}

	public ClientFixedIncome removeClientFixedIncome(ClientFixedIncome clientFixedIncome) {
		getClientFixedIncomes().remove(clientFixedIncome);
		clientFixedIncome.setClientFamilyMember(null);

		return clientFixedIncome;
	}

	public List<ClientFloaterCover> getClientFloaterCovers() {
		return this.clientFloaterCovers;
	}

	public void setClientFloaterCovers(List<ClientFloaterCover> clientFloaterCovers) {
		this.clientFloaterCovers = clientFloaterCovers;
	}

	public ClientFloaterCover addClientFloaterCover(ClientFloaterCover clientFloaterCover) {
		getClientFloaterCovers().add(clientFloaterCover);
		clientFloaterCover.setClientFamilyMember(this);

		return clientFloaterCover;
	}

	public ClientFloaterCover removeClientFloaterCover(ClientFloaterCover clientFloaterCover) {
		getClientFloaterCovers().remove(clientFloaterCover);
		clientFloaterCover.setClientFamilyMember(null);

		return clientFloaterCover;
	}

	public List<ClientGoal> getClientGoals() {
		return this.clientGoals;
	}

	public void setClientGoals(List<ClientGoal> clientGoals) {
		this.clientGoals = clientGoals;
	}

	public ClientGoal addClientGoal(ClientGoal clientGoal) {
		getClientGoals().add(clientGoal);
		clientGoal.setClientFamilyMember(this);

		return clientGoal;
	}

	public ClientGoal removeClientGoal(ClientGoal clientGoal) {
		getClientGoals().remove(clientGoal);
		clientGoal.setClientFamilyMember(null);

		return clientGoal;
	}

	public List<ClientLifeInsurance> getClientLifeInsurances() {
		return this.clientLifeInsurances;
	}

	public void setClientLifeInsurances(List<ClientLifeInsurance> clientLifeInsurances) {
		this.clientLifeInsurances = clientLifeInsurances;
	}

	public ClientLifeInsurance addClientLifeInsurance(ClientLifeInsurance clientLifeInsurance) {
		getClientLifeInsurances().add(clientLifeInsurance);
		clientLifeInsurance.setClientFamilyMember(this);

		return clientLifeInsurance;
	}

	public ClientLifeInsurance removeClientLifeInsurance(ClientLifeInsurance clientLifeInsurance) {
		getClientLifeInsurances().remove(clientLifeInsurance);
		clientLifeInsurance.setClientFamilyMember(null);

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
		clientLoan.setClientFamilyMember(this);

		return clientLoan;
	}

	public ClientLoan removeClientLoan(ClientLoan clientLoan) {
		getClientLoans().remove(clientLoan);
		clientLoan.setClientFamilyMember(null);

		return clientLoan;
	}

	public List<ClientMutualFund> getClientMutualFunds() {
		return this.clientMutualFunds;
	}

	public void setClientMutualFunds(List<ClientMutualFund> clientMutualFunds) {
		this.clientMutualFunds = clientMutualFunds;
	}

	public ClientMutualFund addClientMutualFund(ClientMutualFund clientMutualFund) {
		getClientMutualFunds().add(clientMutualFund);
		clientMutualFund.setClientFamilyMember(this);

		return clientMutualFund;
	}

	public ClientMutualFund removeClientMutualFund(ClientMutualFund clientMutualFund) {
		getClientMutualFunds().remove(clientMutualFund);
		clientMutualFund.setClientFamilyMember(null);

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
		clientNp.setClientFamilyMember(this);

		return clientNp;
	}

	public ClientNPS removeClientNp(ClientNPS clientNp) {
		getClientNps().remove(clientNp);
		clientNp.setClientFamilyMember(null);

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
		clientNonLifeInsurance.setClientFamilyMember(this);

		return clientNonLifeInsurance;
	}

	public ClientNonLifeInsurance removeClientNonLifeInsurance(ClientNonLifeInsurance clientNonLifeInsurance) {
		getClientNonLifeInsurances().remove(clientNonLifeInsurance);
		clientNonLifeInsurance.setClientFamilyMember(null);

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
		clientOtherAlternateAsset.setClientFamilyMember(this);

		return clientOtherAlternateAsset;
	}

	public ClientOtherAlternateAsset removeClientOtherAlternateAsset(ClientOtherAlternateAsset clientOtherAlternateAsset) {
		getClientOtherAlternateAssets().remove(clientOtherAlternateAsset);
		clientOtherAlternateAsset.setClientFamilyMember(null);

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
		clientPpf.setClientFamilyMember(this);

		return clientPpf;
	}

	public ClientPPF removeClientPpf(ClientPPF clientPpf) {
		getClientPpfs().remove(clientPpf);
		clientPpf.setClientFamilyMember(null);

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
		clientPreciousMetal.setClientFamilyMember(this);

		return clientPreciousMetal;
	}

	public ClientPreciousMetal removeClientPreciousMetal(ClientPreciousMetal clientPreciousMetal) {
		getClientPreciousMetals().remove(clientPreciousMetal);
		clientPreciousMetal.setClientFamilyMember(null);

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
		clientRealEstate.setClientFamilyMember(this);

		return clientRealEstate;
	}

	public ClientRealEstate removeClientRealEstate(ClientRealEstate clientRealEstate) {
		getClientRealEstates().remove(clientRealEstate);
		clientRealEstate.setClientFamilyMember(null);

		return clientRealEstate;
	}

	public List<ClientSmallSaving> getClientSmallSavings() {
		return this.clientSmallSavings;
	}

	public void setClientSmallSavings(List<ClientSmallSaving> clientSmallSavings) {
		this.clientSmallSavings = clientSmallSavings;
	}

	public ClientSmallSaving addClientSmallSaving(ClientSmallSaving clientSmallSaving) {
		getClientSmallSavings().add(clientSmallSaving);
		clientSmallSaving.setClientFamilyMember(this);

		return clientSmallSaving;
	}

	public ClientSmallSaving removeClientSmallSaving(ClientSmallSaving clientSmallSaving) {
		getClientSmallSavings().remove(clientSmallSaving);
		clientSmallSaving.setClientFamilyMember(null);

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
		clientStructuredProduct.setClientFamilyMember(this);

		return clientStructuredProduct;
	}

	public ClientStructuredProduct removeClientStructuredProduct(ClientStructuredProduct clientStructuredProduct) {
		getClientStructuredProducts().remove(clientStructuredProduct);
		clientStructuredProduct.setClientFamilyMember(null);

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
		clientVehicle.setClientFamilyMember(this);

		return clientVehicle;
	}

	public ClientVehicle removeClientVehicle(ClientVehicle clientVehicle) {
		getClientVehicles().remove(clientVehicle);
		clientVehicle.setClientFamilyMember(null);

		return clientVehicle;
	}

	public String getIsFamilyHead() {
		return isFamilyHead;
	}

	public void setIsFamilyHead(String isFamilyHead) {
		this.isFamilyHead = isFamilyHead;
	}
	
	public List<AuxillaryFamilyMember> getAuxillaryFamilyMembers() {
		return this.auxillaryFamilyMembers;
	}

	public void setAuxillaryFamilyMembers(List<AuxillaryFamilyMember> auxillaryFamilyMembers) {
		this.auxillaryFamilyMembers = auxillaryFamilyMembers;
	}

	public AuxillaryFamilyMember addAuxillaryFamilyMember(AuxillaryFamilyMember auxillaryFamilyMember) {
		getAuxillaryFamilyMembers().add(auxillaryFamilyMember);
		auxillaryFamilyMember.setClientFamilyMember(this);

		return auxillaryFamilyMember;
	}

	public AuxillaryFamilyMember removeAuxillaryFamilyMember(AuxillaryFamilyMember auxillaryFamilyMember) {
		getAuxillaryFamilyMembers().remove(auxillaryFamilyMember);
		auxillaryFamilyMember.setClientFamilyMember(null);

		return auxillaryFamilyMember;
	}

}