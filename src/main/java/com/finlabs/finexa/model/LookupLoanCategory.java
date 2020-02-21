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
 * The persistent class for the lookupLoanCategory database table.
 * 
 */
@Entity
@Table(name = "lookupLoanCategory")
@NamedQuery(name = "LookupLoanCategory.findAll", query = "SELECT l FROM LookupLoanCategory l")
public class LookupLoanCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	// bi-directional many-to-one association to ClientLoan
	@OneToMany(mappedBy = "lookupLoanCategory")
	private List<ClientLoan> clientLoans;

	public LookupLoanCategory() {
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

	public List<ClientLoan> getClientLoans() {
		return this.clientLoans;
	}

	public void setClientLoans(List<ClientLoan> clientLoans) {
		this.clientLoans = clientLoans;
	}

	public ClientLoan addClientLoan(ClientLoan clientLoan) {
		getClientLoans().add(clientLoan);
		clientLoan.setLookupLoanCategory(this);

		return clientLoan;
	}

	public ClientLoan removeClientLoan(ClientLoan clientLoan) {
		getClientLoans().remove(clientLoan);
		clientLoan.setLookupLoanCategory(null);

		return clientLoan;
	}

}