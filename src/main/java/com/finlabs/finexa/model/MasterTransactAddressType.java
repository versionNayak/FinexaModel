package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the masterTransactAddressType database table.
 * 
 */
@Entity
@Table(name="masterTransactAddressType")
@NamedQuery(name="MasterTransactAddressType.findAll", query="SELECT m FROM MasterTransactAddressType m")
public class MasterTransactAddressType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String code;

	private String details;

	//bi-directional many-to-one association to ClientFatcaReport
	@OneToMany(mappedBy="masterTransactAddressType")
	private List<ClientFatcaReport> clientFatcaReports;

	public MasterTransactAddressType() {
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

	public List<ClientFatcaReport> getClientFatcaReports() {
		return this.clientFatcaReports;
	}

	public void setClientFatcaReports(List<ClientFatcaReport> clientFatcaReports) {
		this.clientFatcaReports = clientFatcaReports;
	}

	public ClientFatcaReport addClientFatcaReport(ClientFatcaReport clientFatcaReport) {
		getClientFatcaReports().add(clientFatcaReport);
		clientFatcaReport.setMasterTransactAddressType(this);

		return clientFatcaReport;
	}

	public ClientFatcaReport removeClientFatcaReport(ClientFatcaReport clientFatcaReport) {
		getClientFatcaReports().remove(clientFatcaReport);
		clientFatcaReport.setMasterTransactAddressType(null);

		return clientFatcaReport;
	}

}