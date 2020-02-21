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

@Entity
@Table(name = "lookupTransactionType")
@NamedQuery(name = "LookupTransactionType.findAll", query = "SELECT l FROM LookupTransactionType l")
public class LookupTransactionType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	@Column(nullable = false, length = 50)
	private String description;

	// bi-directional many-to-one association 
	@OneToMany(mappedBy = "lookupTransactionType")
	private List<PurchaseLumpsumTransaction> purchaseLumpsumTransaction;

	// bi-directional many-to-one association
	@OneToMany(mappedBy = "lookupTransactionType")
	private List<Redemption> redemption;

	public byte getId() {
		return id;
	}

	

	public void setId(byte id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<PurchaseLumpsumTransaction> getPurchaseLumpsumTransaction() {
		return purchaseLumpsumTransaction;
	}

	public void setPurchaseLumpsumTransaction(List<PurchaseLumpsumTransaction> purchaseLumpsumTransaction) {
		this.purchaseLumpsumTransaction = purchaseLumpsumTransaction;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
