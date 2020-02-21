package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the masterTransactAccountType database table.
 * 
 */
@Entity
@Table(name="masterTransactAccountType")
@NamedQuery(name="MasterTransactAccountType.findAll", query="SELECT m FROM MasterTransactAccountType m")
public class MasterTransactAccountType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String code;

	private String details;

	//bi-directional many-to-one association to ClientMandateRegistration
	@OneToMany(mappedBy="masterTransactAccountType")
	private List<ClientMandateRegistration> clientMandateRegistrations;

	public MasterTransactAccountType() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	public List<ClientMandateRegistration> getClientMandateRegistrations() {
		return this.clientMandateRegistrations;
	}

	public void setClientMandateRegistrations(List<ClientMandateRegistration> clientMandateRegistrations) {
		this.clientMandateRegistrations = clientMandateRegistrations;
	}

	public ClientMandateRegistration addClientMandateRegistration(ClientMandateRegistration clientMandateRegistration) {
		getClientMandateRegistrations().add(clientMandateRegistration);
		clientMandateRegistration.setMasterTransactAccountType(this);

		return clientMandateRegistration;
	}

	public ClientMandateRegistration removeClientMandateRegistration(ClientMandateRegistration clientMandateRegistration) {
		getClientMandateRegistrations().remove(clientMandateRegistration);
		clientMandateRegistration.setMasterTransactAccountType(null);

		return clientMandateRegistration;
	}

}