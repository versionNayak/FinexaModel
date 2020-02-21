package com.finlabs.finexa.model;

import java.io.Serializable;
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

/**
 * The persistent class for the masterProductClassification database table.
 * 
 */
@Entity
@Table(name = "masterProductClassification")
@NamedQuery(name = "MasterProductClassification.findAll", query = "SELECT m FROM MasterProductClassification m")
public class MasterProductClassification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String investmentAssetsFlag;

	private String lockedInFlag;

	private String marketLinkedFlag;

	private String maturityFlag;

	private String productName;

	// bi-directional many-to-one association to ClientAnnuity
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientAnnuity> clientAnnuities;

	// bi-directional many-to-one association to ClientAtalPensionYojana
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientAtalPensionYojana> clientAtalPensionYojanas;

	// bi-directional many-to-one association to ClientCash
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientCash> clientCashs;

	// bi-directional many-to-one association to ClientEPF
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientEPF> clientEpfs;

	// bi-directional many-to-one association to ClientEquity
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientEquity> clientEquities;

	// bi-directional many-to-one association to ClientFixedIncome
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientFixedIncome> clientFixedIncomes;

	// bi-directional many-to-one association to ClientMutualFund
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientMutualFund> clientMutualFunds;

	// bi-directional many-to-one association to ClientNP
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientNPS> clientNps;

	// bi-directional many-to-one association to ClientOtherAlternateAsset
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientOtherAlternateAsset> clientOtherAlternateAssets;

	// bi-directional many-to-one association to ClientPPF
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientPPF> clientPpfs;

	// bi-directional many-to-one association to ClientPreciousMetal
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientPreciousMetal> clientPreciousMetals;

	// bi-directional many-to-one association to ClientRealEstate
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientRealEstate> clientRealEstates;

	// bi-directional many-to-one association to ClientSmallSaving
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientSmallSaving> clientSmallSavings;

	// bi-directional many-to-one association to ClientStructuredProduct
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientStructuredProduct> clientStructuredProducts;

	// bi-directional many-to-one association to ClientVehicle
	@OneToMany(mappedBy = "masterProductClassification")
	private List<ClientVehicle> clientVehicles;

	// bi-directional many-to-one association to LookupAssetClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetClass")
	private LookupAssetClass lookupAssetClass;

	// bi-directional many-to-one association to LookupAssetSubClass
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "subAssetClass")
	private LookupAssetSubClass lookupAssetSubClass;

	// bi-directional many-to-one association to MasterProductType
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "productType")
	private MasterProductType masterProductType;

	public MasterProductClassification() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getInvestmentAssetsFlag() {
		return this.investmentAssetsFlag;
	}

	public void setInvestmentAssetsFlag(String investmentAssetsFlag) {
		this.investmentAssetsFlag = investmentAssetsFlag;
	}

	public String getLockedInFlag() {
		return this.lockedInFlag;
	}

	public void setLockedInFlag(String lockedInFlag) {
		this.lockedInFlag = lockedInFlag;
	}

	public String getMarketLinkedFlag() {
		return this.marketLinkedFlag;
	}

	public void setMarketLinkedFlag(String marketLinkedFlag) {
		this.marketLinkedFlag = marketLinkedFlag;
	}

	public String getMaturityFlag() {
		return this.maturityFlag;
	}

	public void setMaturityFlag(String maturityFlag) {
		this.maturityFlag = maturityFlag;
	}

	public String getProductName() {
		return this.productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public List<ClientAnnuity> getClientAnnuities() {
		return this.clientAnnuities;
	}

	public void setClientAnnuities(List<ClientAnnuity> clientAnnuities) {
		this.clientAnnuities = clientAnnuities;
	}

	public ClientAnnuity addClientAnnuity(ClientAnnuity clientAnnuity) {
		getClientAnnuities().add(clientAnnuity);
		clientAnnuity.setMasterProductClassification(this);

		return clientAnnuity;
	}

	public ClientAnnuity removeClientAnnuity(ClientAnnuity clientAnnuity) {
		getClientAnnuities().remove(clientAnnuity);
		clientAnnuity.setMasterProductClassification(null);

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
		clientAtalPensionYojana.setMasterProductClassification(this);

		return clientAtalPensionYojana;
	}

	public ClientAtalPensionYojana removeClientAtalPensionYojana(ClientAtalPensionYojana clientAtalPensionYojana) {
		getClientAtalPensionYojanas().remove(clientAtalPensionYojana);
		clientAtalPensionYojana.setMasterProductClassification(null);

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
		clientCash.setMasterProductClassification(this);

		return clientCash;
	}

	public ClientCash removeClientCash(ClientCash clientCash) {
		getClientCashs().remove(clientCash);
		clientCash.setMasterProductClassification(null);

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
		clientEpf.setMasterProductClassification(this);

		return clientEpf;
	}

	public ClientEPF removeClientEpf(ClientEPF clientEpf) {
		getClientEpfs().remove(clientEpf);
		clientEpf.setMasterProductClassification(null);

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
		clientEquity.setMasterProductClassification(this);

		return clientEquity;
	}

	public ClientEquity removeClientEquity(ClientEquity clientEquity) {
		getClientEquities().remove(clientEquity);
		clientEquity.setMasterProductClassification(null);

		return clientEquity;
	}

	public List<ClientFixedIncome> getClientFixedIncomes() {
		return this.clientFixedIncomes;
	}

	public void setClientFixedIncomes(List<ClientFixedIncome> clientFixedIncomes) {
		this.clientFixedIncomes = clientFixedIncomes;
	}

	public ClientFixedIncome addClientFixedIncome(ClientFixedIncome clientFixedIncome) {
		getClientFixedIncomes().add(clientFixedIncome);
		clientFixedIncome.setMasterProductClassification(this);

		return clientFixedIncome;
	}

	public ClientFixedIncome removeClientFixedIncome(ClientFixedIncome clientFixedIncome) {
		getClientFixedIncomes().remove(clientFixedIncome);
		clientFixedIncome.setMasterProductClassification(null);

		return clientFixedIncome;
	}

	public List<ClientMutualFund> getClientMutualFunds() {
		return this.clientMutualFunds;
	}

	public void setClientMutualFunds(List<ClientMutualFund> clientMutualFunds) {
		this.clientMutualFunds = clientMutualFunds;
	}

	public ClientMutualFund addClientMutualFund(ClientMutualFund clientMutualFund) {
		getClientMutualFunds().add(clientMutualFund);
		clientMutualFund.setMasterProductClassification(this);

		return clientMutualFund;
	}

	public ClientMutualFund removeClientMutualFund(ClientMutualFund clientMutualFund) {
		getClientMutualFunds().remove(clientMutualFund);
		clientMutualFund.setMasterProductClassification(null);

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
		clientNp.setMasterProductClassification(this);

		return clientNp;
	}

	public ClientNPS removeClientNp(ClientNPS clientNp) {
		getClientNps().remove(clientNp);
		clientNp.setMasterProductClassification(null);

		return clientNp;
	}

	public List<ClientOtherAlternateAsset> getClientOtherAlternateAssets() {
		return this.clientOtherAlternateAssets;
	}

	public void setClientOtherAlternateAssets(List<ClientOtherAlternateAsset> clientOtherAlternateAssets) {
		this.clientOtherAlternateAssets = clientOtherAlternateAssets;
	}

	public ClientOtherAlternateAsset addClientOtherAlternateAsset(ClientOtherAlternateAsset clientOtherAlternateAsset) {
		getClientOtherAlternateAssets().add(clientOtherAlternateAsset);
		clientOtherAlternateAsset.setMasterProductClassification(this);

		return clientOtherAlternateAsset;
	}

	public ClientOtherAlternateAsset removeClientOtherAlternateAsset(
			ClientOtherAlternateAsset clientOtherAlternateAsset) {
		getClientOtherAlternateAssets().remove(clientOtherAlternateAsset);
		clientOtherAlternateAsset.setMasterProductClassification(null);

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
		clientPpf.setMasterProductClassification(this);

		return clientPpf;
	}

	public ClientPPF removeClientPpf(ClientPPF clientPpf) {
		getClientPpfs().remove(clientPpf);
		clientPpf.setMasterProductClassification(null);

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
		clientPreciousMetal.setMasterProductClassification(this);

		return clientPreciousMetal;
	}

	public ClientPreciousMetal removeClientPreciousMetal(ClientPreciousMetal clientPreciousMetal) {
		getClientPreciousMetals().remove(clientPreciousMetal);
		clientPreciousMetal.setMasterProductClassification(null);

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
		clientRealEstate.setMasterProductClassification(this);

		return clientRealEstate;
	}

	public ClientRealEstate removeClientRealEstate(ClientRealEstate clientRealEstate) {
		getClientRealEstates().remove(clientRealEstate);
		clientRealEstate.setMasterProductClassification(null);

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
		clientSmallSaving.setMasterProductClassification(this);

		return clientSmallSaving;
	}

	public ClientSmallSaving removeClientSmallSaving(ClientSmallSaving clientSmallSaving) {
		getClientSmallSavings().remove(clientSmallSaving);
		clientSmallSaving.setMasterProductClassification(null);

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
		clientStructuredProduct.setMasterProductClassification(this);

		return clientStructuredProduct;
	}

	public ClientStructuredProduct removeClientStructuredProduct(ClientStructuredProduct clientStructuredProduct) {
		getClientStructuredProducts().remove(clientStructuredProduct);
		clientStructuredProduct.setMasterProductClassification(null);

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
		clientVehicle.setMasterProductClassification(this);

		return clientVehicle;
	}

	public ClientVehicle removeClientVehicle(ClientVehicle clientVehicle) {
		getClientVehicles().remove(clientVehicle);
		clientVehicle.setMasterProductClassification(null);

		return clientVehicle;
	}

	public LookupAssetClass getLookupAssetClass() {
		return this.lookupAssetClass;
	}

	public void setLookupAssetClass(LookupAssetClass lookupAssetClass) {
		this.lookupAssetClass = lookupAssetClass;
	}

	public LookupAssetSubClass getLookupAssetSubClass() {
		return this.lookupAssetSubClass;
	}

	public void setLookupAssetSubClass(LookupAssetSubClass lookupAssetSubClass) {
		this.lookupAssetSubClass = lookupAssetSubClass;
	}

	public MasterProductType getMasterProductType() {
		return this.masterProductType;
	}

	public void setMasterProductType(MasterProductType masterProductType) {
		this.masterProductType = masterProductType;
	}

}