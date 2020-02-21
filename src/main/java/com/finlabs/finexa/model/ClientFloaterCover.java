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

/**
 * The persistent class for the clientFloaterCover database table.
 * 
 */
@Entity
@Table(name = "clientFloaterCover")
@NamedQuery(name = "ClientFloaterCover.findAll", query = "SELECT c FROM ClientFloaterCover c")
public class ClientFloaterCover implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	// bi-directional many-to-one association to ClientNonLifeInsurance
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "insuranceID")
	private ClientNonLifeInsurance clientNonLifeInsurance;

	// bi-directional many-to-one association to ClientFamilyMember
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "familyMemberID")
	private ClientFamilyMember clientFamilyMember;

	public ClientFloaterCover() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ClientNonLifeInsurance getClientNonLifeInsurance() {
		return this.clientNonLifeInsurance;
	}

	public void setClientNonLifeInsurance(ClientNonLifeInsurance clientNonLifeInsurance) {
		this.clientNonLifeInsurance = clientNonLifeInsurance;
	}

	public ClientFamilyMember getClientFamilyMember() {
		return this.clientFamilyMember;
	}

	public void setClientFamilyMember(ClientFamilyMember clientFamilyMember) {
		this.clientFamilyMember = clientFamilyMember;
	}

}