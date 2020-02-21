package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the lookupFrequency database table.
 * 
 */
@Entity
@Table(name = "lookupFrequency")
@NamedQuery(name = "LookupFrequency.findAll", query = "SELECT l FROM LookupFrequency l")
public class LookupFrequency implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	// bi-directional many-to-one association to ClientAnnuity
	@OneToMany(mappedBy = "lookupFrequency")
	private List<ClientAnnuity> clientAnnuities;

	// bi-directional many-to-one association to ClientAtalPensionYojana
	@OneToMany(mappedBy = "lookupFrequency")
	private List<ClientAtalPensionYojana> clientAtalPensionYojanas;

	// bi-directional many-to-one association to ClientExpense
	@OneToMany(mappedBy = "lookupFrequency")
	private List<ClientExpense> clientExpenses;

	// bi-directional many-to-one association to ClientFamilyIncome
	@OneToMany(mappedBy = "lookupFrequency")
	private List<ClientFamilyIncome> clientFamilyIncomes;

	// bi-directional many-to-one association to ClientFixedIncome
	@OneToMany(mappedBy = "lookupFrequency1")
	private List<ClientFixedIncome> clientFixedIncomes1;

	// bi-directional many-to-one association to ClientFixedIncome
	@OneToMany(mappedBy = "lookupFrequency2")
	private List<ClientFixedIncome> clientFixedIncomes2;

	// bi-directional many-to-one association to ClientFixedIncome
	@OneToMany(mappedBy = "lookupFrequency3")
	private List<ClientFixedIncome> clientFixedIncomes3;

	/*// bi-directional many-to-one association to ClientGoal
	@OneToMany(mappedBy = "lookupFrequency")
	private List<ClientGoal> clientGoals;*/

	// bi-directional many-to-one association to ClientPPF
	@OneToMany(mappedBy = "lookupFrequency1")
	private List<ClientPPF> clientPpfs1;

	// bi-directional many-to-one association to ClientPPF
	@OneToMany(mappedBy = "lookupFrequency2")
	private List<ClientPPF> clientPpfs2;

	// bi-directional many-to-one association to ClientRealEstate
	@OneToMany(mappedBy = "lookupFrequency")
	private List<ClientRealEstate> clientRealEstates;

	// bi-directional many-to-one association to ClientSmallSaving
	@OneToMany(mappedBy = "lookupFrequency1")
	private List<ClientSmallSaving> clientSmallSavings1;

	// bi-directional many-to-one association to ClientSmallSaving
	@OneToMany(mappedBy = "lookupFrequency2")
	private List<ClientSmallSaving> clientSmallSavings2;

	// bi-directional many-to-one association to ClientSmallSaving
	@OneToMany(mappedBy = "lookupFrequency3")
	private List<ClientSmallSaving> clientSmallSavings3;

	// bi-directional many-to-one association to PurchaseISIP
	@OneToMany(mappedBy = "lookupFrequency")
	private List<PurchaseISIP> purchaseISIP;

	public LookupFrequency() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(byte displayOrder) {
		this.displayOrder = displayOrder;
	}

	public List<ClientAnnuity> getClientAnnuities() {
		return this.clientAnnuities;
	}

	public void setClientAnnuities(List<ClientAnnuity> clientAnnuities) {
		this.clientAnnuities = clientAnnuities;
	}

	public ClientAnnuity addClientAnnuity(ClientAnnuity clientAnnuity) {
		getClientAnnuities().add(clientAnnuity);
		clientAnnuity.setLookupFrequency(this);

		return clientAnnuity;
	}

	public ClientAnnuity removeClientAnnuity(ClientAnnuity clientAnnuity) {
		getClientAnnuities().remove(clientAnnuity);
		clientAnnuity.setLookupFrequency(null);

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
		clientAtalPensionYojana.setLookupFrequency(this);

		return clientAtalPensionYojana;
	}

	public ClientAtalPensionYojana removeClientAtalPensionYojana(ClientAtalPensionYojana clientAtalPensionYojana) {
		getClientAtalPensionYojanas().remove(clientAtalPensionYojana);
		clientAtalPensionYojana.setLookupFrequency(null);

		return clientAtalPensionYojana;
	}

	public List<ClientExpense> getClientExpenses() {
		return this.clientExpenses;
	}

	public void setClientExpenses(List<ClientExpense> clientExpenses) {
		this.clientExpenses = clientExpenses;
	}

	public ClientExpense addClientExpens(ClientExpense clientExpens) {
		getClientExpenses().add(clientExpens);
		clientExpens.setLookupFrequency(this);

		return clientExpens;
	}

	public ClientExpense removeClientExpens(ClientExpense clientExpens) {
		getClientExpenses().remove(clientExpens);
		clientExpens.setLookupFrequency(null);

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
		clientFamilyIncome.setLookupFrequency(this);

		return clientFamilyIncome;
	}

	public ClientFamilyIncome removeClientFamilyIncome(ClientFamilyIncome clientFamilyIncome) {
		getClientFamilyIncomes().remove(clientFamilyIncome);
		clientFamilyIncome.setLookupFrequency(null);

		return clientFamilyIncome;
	}

	public List<ClientFixedIncome> getClientFixedIncomes1() {
		return this.clientFixedIncomes1;
	}

	public void setClientFixedIncomes1(List<ClientFixedIncome> clientFixedIncomes1) {
		this.clientFixedIncomes1 = clientFixedIncomes1;
	}

	public ClientFixedIncome addClientFixedIncomes1(ClientFixedIncome clientFixedIncomes1) {
		getClientFixedIncomes1().add(clientFixedIncomes1);
		clientFixedIncomes1.setLookupFrequency1(this);

		return clientFixedIncomes1;
	}

	public ClientFixedIncome removeClientFixedIncomes1(ClientFixedIncome clientFixedIncomes1) {
		getClientFixedIncomes1().remove(clientFixedIncomes1);
		clientFixedIncomes1.setLookupFrequency1(null);

		return clientFixedIncomes1;
	}

	public List<ClientFixedIncome> getClientFixedIncomes2() {
		return this.clientFixedIncomes2;
	}

	public void setClientFixedIncomes2(List<ClientFixedIncome> clientFixedIncomes2) {
		this.clientFixedIncomes2 = clientFixedIncomes2;
	}

	public ClientFixedIncome addClientFixedIncomes2(ClientFixedIncome clientFixedIncomes2) {
		getClientFixedIncomes2().add(clientFixedIncomes2);
		clientFixedIncomes2.setLookupFrequency2(this);

		return clientFixedIncomes2;
	}

	public ClientFixedIncome removeClientFixedIncomes2(ClientFixedIncome clientFixedIncomes2) {
		getClientFixedIncomes2().remove(clientFixedIncomes2);
		clientFixedIncomes2.setLookupFrequency2(null);

		return clientFixedIncomes2;
	}

	public List<ClientFixedIncome> getClientFixedIncomes3() {
		return this.clientFixedIncomes3;
	}

	public void setClientFixedIncomes3(List<ClientFixedIncome> clientFixedIncomes3) {
		this.clientFixedIncomes3 = clientFixedIncomes3;
	}

	public ClientFixedIncome addClientFixedIncomes3(ClientFixedIncome clientFixedIncomes3) {
		getClientFixedIncomes3().add(clientFixedIncomes3);
		clientFixedIncomes3.setLookupFrequency3(this);

		return clientFixedIncomes3;
	}

	public ClientFixedIncome removeClientFixedIncomes3(ClientFixedIncome clientFixedIncomes3) {
		getClientFixedIncomes3().remove(clientFixedIncomes3);
		clientFixedIncomes3.setLookupFrequency3(null);

		return clientFixedIncomes3;
	}

	public List<ClientPPF> getClientPpfs1() {
		return this.clientPpfs1;
	}

	public void setClientPpfs1(List<ClientPPF> clientPpfs1) {
		this.clientPpfs1 = clientPpfs1;
	}

	public ClientPPF addClientPpfs1(ClientPPF clientPpfs1) {
		getClientPpfs1().add(clientPpfs1);
		clientPpfs1.setLookupFrequency1(this);

		return clientPpfs1;
	}

	public ClientPPF removeClientPpfs1(ClientPPF clientPpfs1) {
		getClientPpfs1().remove(clientPpfs1);
		clientPpfs1.setLookupFrequency1(null);

		return clientPpfs1;
	}

	public List<ClientPPF> getClientPpfs2() {
		return this.clientPpfs2;
	}

	public void setClientPpfs2(List<ClientPPF> clientPpfs2) {
		this.clientPpfs2 = clientPpfs2;
	}

	public ClientPPF addClientPpfs2(ClientPPF clientPpfs2) {
		getClientPpfs2().add(clientPpfs2);
		clientPpfs2.setLookupFrequency2(this);

		return clientPpfs2;
	}

	public ClientPPF removeClientPpfs2(ClientPPF clientPpfs2) {
		getClientPpfs2().remove(clientPpfs2);
		clientPpfs2.setLookupFrequency2(null);

		return clientPpfs2;
	}

	public List<ClientRealEstate> getClientRealEstates() {
		return this.clientRealEstates;
	}

	public void setClientRealEstates(List<ClientRealEstate> clientRealEstates) {
		this.clientRealEstates = clientRealEstates;
	}

	public ClientRealEstate addClientRealEstate(ClientRealEstate clientRealEstate) {
		getClientRealEstates().add(clientRealEstate);
		clientRealEstate.setLookupFrequency(this);

		return clientRealEstate;
	}

	public ClientRealEstate removeClientRealEstate(ClientRealEstate clientRealEstate) {
		getClientRealEstates().remove(clientRealEstate);
		clientRealEstate.setLookupFrequency(null);

		return clientRealEstate;
	}

	public List<ClientSmallSaving> getClientSmallSavings1() {
		return this.clientSmallSavings1;
	}

	public void setClientSmallSavings1(List<ClientSmallSaving> clientSmallSavings1) {
		this.clientSmallSavings1 = clientSmallSavings1;
	}

	public ClientSmallSaving addClientSmallSavings1(ClientSmallSaving clientSmallSavings1) {
		getClientSmallSavings1().add(clientSmallSavings1);
		clientSmallSavings1.setLookupFrequency1(this);

		return clientSmallSavings1;
	}

	public ClientSmallSaving removeClientSmallSavings1(ClientSmallSaving clientSmallSavings1) {
		getClientSmallSavings1().remove(clientSmallSavings1);
		clientSmallSavings1.setLookupFrequency1(null);

		return clientSmallSavings1;
	}

	public List<ClientSmallSaving> getClientSmallSavings2() {
		return this.clientSmallSavings2;
	}

	public void setClientSmallSavings2(List<ClientSmallSaving> clientSmallSavings2) {
		this.clientSmallSavings2 = clientSmallSavings2;
	}

	public ClientSmallSaving addClientSmallSavings2(ClientSmallSaving clientSmallSavings2) {
		getClientSmallSavings2().add(clientSmallSavings2);
		clientSmallSavings2.setLookupFrequency2(this);

		return clientSmallSavings2;
	}

	public ClientSmallSaving removeClientSmallSavings2(ClientSmallSaving clientSmallSavings2) {
		getClientSmallSavings2().remove(clientSmallSavings2);
		clientSmallSavings2.setLookupFrequency2(null);

		return clientSmallSavings2;
	}

	public List<ClientSmallSaving> getClientSmallSavings3() {
		return this.clientSmallSavings3;
	}

	public void setClientSmallSavings3(List<ClientSmallSaving> clientSmallSavings3) {
		this.clientSmallSavings3 = clientSmallSavings3;
	}

	public ClientSmallSaving addClientSmallSavings3(ClientSmallSaving clientSmallSavings3) {
		getClientSmallSavings3().add(clientSmallSavings3);
		clientSmallSavings3.setLookupFrequency3(this);

		return clientSmallSavings3;
	}

	public ClientSmallSaving removeClientSmallSavings3(ClientSmallSaving clientSmallSavings3) {
		getClientSmallSavings3().remove(clientSmallSavings3);
		clientSmallSavings3.setLookupFrequency3(null);

		return clientSmallSavings3;
	}

	public List<PurchaseISIP> getPurchaseISIP() {
		return purchaseISIP;
	}

	public void setPurchaseISIP(List<PurchaseISIP> purchaseISIP) {
		this.purchaseISIP = purchaseISIP;
	}

}