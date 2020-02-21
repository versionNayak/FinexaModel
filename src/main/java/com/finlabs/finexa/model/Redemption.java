package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "redemption")
@NamedQuery(name = "Redemption.findAll", query = "SELECT r FROM Redemption r")
public class Redemption implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	@Column(columnDefinition = "ENUM('Y','N')", nullable = false)
	private String allUnits;

	@Column(columnDefinition = "Decimal(20,2)")
	private double unitsRedeemed;

	@Column(columnDefinition = "Decimal(20,2)")
	private double amountRedeemed;

	// bi-directional many-to-one association
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transactionType", nullable = false)
	private LookupTransactionType lookupTransactionType;

	// bi-directional many-to-one association
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "transactionMode", nullable = false)
	private LookupTransactionMode lookupTransactionMode;

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getAllUnits() {
		return allUnits;
	}

	public void setAllUnits(String allUnits) {
		this.allUnits = allUnits;
	}

	public double getUnitsRedeemed() {
		return unitsRedeemed;
	}

	public void setUnitsRedeemed(double unitsRedeemed) {
		this.unitsRedeemed = unitsRedeemed;
	}

	public double getAmountRedeemed() {
		return amountRedeemed;
	}

	public void setAmountRedeemed(double amountRedeemed) {
		this.amountRedeemed = amountRedeemed;
	}


	
	

	
}
