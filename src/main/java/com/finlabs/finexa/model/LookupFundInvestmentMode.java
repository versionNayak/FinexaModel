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
 * The persistent class for the lookupFundInvestmentMode database table.
 * 
 */
@Entity
@Table(name = "lookupFundInvestmentMode")
@NamedQuery(name = "LookupFundInvestmentMode.findAll", query = "SELECT l FROM LookupFundInvestmentMode l")
public class LookupFundInvestmentMode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	// bi-directional many-to-one association to ClientMutualFund
	@OneToMany(mappedBy = "lookupFundInvestmentMode")
	private List<ClientMutualFund> clientMutualFunds;

	// bi-directional many-to-one association to ClientOtherAlternateAsset
	@OneToMany(mappedBy = "lookupFundInvestmentMode")
	private List<PurchaseLumpsumTransaction> purchaseLumpsumTransaction;

	public LookupFundInvestmentMode() {
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

	public List<ClientMutualFund> getClientMutualFunds() {
		return this.clientMutualFunds;
	}

	public void setClientMutualFunds(List<ClientMutualFund> clientMutualFunds) {
		this.clientMutualFunds = clientMutualFunds;
	}

	public ClientMutualFund addClientMutualFund(ClientMutualFund clientMutualFund) {
		getClientMutualFunds().add(clientMutualFund);
		clientMutualFund.setLookupFundInvestmentMode(this);

		return clientMutualFund;
	}

	public ClientMutualFund removeClientMutualFund(ClientMutualFund clientMutualFund) {
		getClientMutualFunds().remove(clientMutualFund);
		clientMutualFund.setLookupFundInvestmentMode(null);

		return clientMutualFund;
	}

	public List<PurchaseLumpsumTransaction> getPurchaseLumpsumTransaction() {
		return purchaseLumpsumTransaction;
	}

	public void setPurchaseLumpsumTransaction(List<PurchaseLumpsumTransaction> purchaseLumpsumTransaction) {
		this.purchaseLumpsumTransaction = purchaseLumpsumTransaction;
	}

}