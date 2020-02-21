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
 * The persistent class for the lookupIncomeExpenseDuration database table.
 * 
 */
@Entity
@Table(name = "lookupIncomeExpenseDuration")
@NamedQuery(name = "LookupIncomeExpenseDuration.findAll", query = "SELECT l FROM LookupIncomeExpenseDuration l")
public class LookupIncomeExpenseDuration implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	// bi-directional many-to-one association to ClientExpense
	@OneToMany(mappedBy = "lookupIncomeExpenseDuration")
	private List<ClientExpense> clientExpenses;

	// bi-directional many-to-one association to ClientFamilyIncome
	@OneToMany(mappedBy = "lookupIncomeExpenseDuration")
	private List<ClientFamilyIncome> clientFamilyIncomes;

	public LookupIncomeExpenseDuration() {
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

	public List<ClientExpense> getClientExpenses() {
		return this.clientExpenses;
	}

	public void setClientExpenses(List<ClientExpense> clientExpenses) {
		this.clientExpenses = clientExpenses;
	}

	public ClientExpense addClientExpens(ClientExpense clientExpens) {
		getClientExpenses().add(clientExpens);
		clientExpens.setLookupIncomeExpenseDuration(this);

		return clientExpens;
	}

	public ClientExpense removeClientExpens(ClientExpense clientExpens) {
		getClientExpenses().remove(clientExpens);
		clientExpens.setLookupIncomeExpenseDuration(null);

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
		clientFamilyIncome.setLookupIncomeExpenseDuration(this);

		return clientFamilyIncome;
	}

	public ClientFamilyIncome removeClientFamilyIncome(ClientFamilyIncome clientFamilyIncome) {
		getClientFamilyIncomes().remove(clientFamilyIncome);
		clientFamilyIncome.setLookupIncomeExpenseDuration(null);

		return clientFamilyIncome;
	}

}