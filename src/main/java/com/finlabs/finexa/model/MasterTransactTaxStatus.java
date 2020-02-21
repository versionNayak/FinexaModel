package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the masterTransactTaxStatus database table.
 * 
 */
@Entity
@Table(name="masterTransactTaxStatus")
@NamedQuery(name="MasterTransactTaxStatus.findAll", query="SELECT m FROM MasterTransactTaxStatus m")
public class MasterTransactTaxStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String code;

	private String taxStatus;
	
	private String categoryCode;
	
	private String categoryDesc;

	//bi-directional many-to-one association to ClientUCCDetail
	@OneToMany(mappedBy="masterTransactTaxStatus")
	private List<ClientUCCDetail> clientUccdetails;

	public MasterTransactTaxStatus() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTaxStatus() {
		return this.taxStatus;
	}

	public void setTaxStatus(String taxStatus) {
		this.taxStatus = taxStatus;
	}

	public List<ClientUCCDetail> getClientUccdetails() {
		return this.clientUccdetails;
	}

	public void setClientUccdetails(List<ClientUCCDetail> clientUccdetails) {
		this.clientUccdetails = clientUccdetails;
	}

	public ClientUCCDetail addClientUccdetail(ClientUCCDetail clientUccdetail) {
		getClientUccdetails().add(clientUccdetail);
		clientUccdetail.setMasterTransactTaxStatus(this);

		return clientUccdetail;
	}

	public ClientUCCDetail removeClientUccdetail(ClientUCCDetail clientUccdetail) {
		getClientUccdetails().remove(clientUccdetail);
		clientUccdetail.setMasterTransactTaxStatus(null);

		return clientUccdetail;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryDesc() {
		return categoryDesc;
	}

	public void setCategoryDesc(String categoryDesc) {
		this.categoryDesc = categoryDesc;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}