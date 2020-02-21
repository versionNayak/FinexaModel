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
 * The persistent class for the masterCash database table.
 * 
 */
@Entity
@Table(name = "masterCash")
@NamedQuery(name = "MasterCash.findAll", query = "SELECT m FROM MasterCash m")
public class MasterCash implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String name;

	// bi-directional many-to-one association to ClientCash
	@OneToMany(mappedBy = "masterCash")
	private List<ClientCash> clientCashs;

	public MasterCash() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ClientCash> getClientCashs() {
		return this.clientCashs;
	}

	public void setClientCashs(List<ClientCash> clientCashs) {
		this.clientCashs = clientCashs;
	}

	public ClientCash addClientCash(ClientCash clientCash) {
		getClientCashs().add(clientCash);
		clientCash.setMasterCash(this);

		return clientCash;
	}

	public ClientCash removeClientCash(ClientCash clientCash) {
		getClientCashs().remove(clientCash);
		clientCash.setMasterCash(null);

		return clientCash;
	}

	
}