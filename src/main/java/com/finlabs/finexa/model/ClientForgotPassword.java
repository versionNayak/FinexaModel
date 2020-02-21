package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the clientForgotPassword database table.
 * 
 */
@Entity
@Table(name="clientForgotPassword")
@NamedQuery(name="ClientForgotPassword.findAll", query="SELECT c FROM ClientForgotPassword c")
public class ClientForgotPassword implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private int id;

	private double timestamp;

	@Column(name="UUID")
	private String uUID;

	//bi-directional many-to-one association to ClientMaster
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="clientID")
	private ClientMaster clientMaster;

	public ClientForgotPassword() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(double timestamp) {
		this.timestamp = timestamp;
	}

	public String getUuid() {
		return this.uUID;
	}

	public void setUuid(String uuid) {
		this.uUID = uuid;
	}

	public ClientMaster getClientMaster() {
		return this.clientMaster;
	}

	public void setClientMaster(ClientMaster clientMaster) {
		this.clientMaster = clientMaster;
	}

}