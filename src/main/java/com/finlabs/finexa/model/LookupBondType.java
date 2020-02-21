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
 * The persistent class for the lookupBondType database table.
 * 
 */
@Entity
@Table(name = "lookupBondType")
@NamedQuery(name = "LookupBondType.findAll", query = "SELECT l FROM LookupBondType l")
public class LookupBondType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	// bi-directional many-to-one association to ClientFixedIncome
	@OneToMany(mappedBy = "lookupBondType")
	private List<ClientFixedIncome> clientFixedIncomes;

	public LookupBondType() {
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

	public List<ClientFixedIncome> getClientFixedIncomes() {
		return this.clientFixedIncomes;
	}

	public void setClientFixedIncomes(List<ClientFixedIncome> clientFixedIncomes) {
		this.clientFixedIncomes = clientFixedIncomes;
	}

	public ClientFixedIncome addClientFixedIncome(ClientFixedIncome clientFixedIncome) {
		getClientFixedIncomes().add(clientFixedIncome);
		clientFixedIncome.setLookupBondType(this);

		return clientFixedIncome;
	}

	public ClientFixedIncome removeClientFixedIncome(ClientFixedIncome clientFixedIncome) {
		getClientFixedIncomes().remove(clientFixedIncome);
		clientFixedIncome.setLookupBondType(null);

		return clientFixedIncome;
	}

}