package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the masterTransactStateCode database table.
 * 
 */
@Entity
@Table(name="masterTransactStateCode")
@NamedQuery(name="MasterTransactStateCode.findAll", query="SELECT m FROM MasterTransactStateCode m")
public class MasterTransactStateCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String code;

	private String details;

	//bi-directional many-to-one association to ClientUCCDetail
	@OneToMany(mappedBy="masterTransactStateCode")
	private List<ClientUCCDetail> clientUccdetails;

	public MasterTransactStateCode() {
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

	public List<ClientUCCDetail> getClientUccdetails() {
		return this.clientUccdetails;
	}

	public void setClientUccdetails(List<ClientUCCDetail> clientUccdetails) {
		this.clientUccdetails = clientUccdetails;
	}

	public ClientUCCDetail addClientUccdetail(ClientUCCDetail clientUccdetail) {
		getClientUccdetails().add(clientUccdetail);
		clientUccdetail.setMasterTransactStateCode(this);

		return clientUccdetail;
	}

	public ClientUCCDetail removeClientUccdetail(ClientUCCDetail clientUccdetail) {
		getClientUccdetails().remove(clientUccdetail);
		clientUccdetail.setMasterTransactStateCode(null);

		return clientUccdetail;
	}

}