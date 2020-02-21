package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the masterTransactSourceOfWealth database table.
 * 
 */
@Entity
@Table(name="masterTransactSourceOfWealth")
@NamedQuery(name="MasterTransactSourceOfWealth.findAll", query="SELECT m FROM MasterTransactSourceOfWealth m")
public class MasterTransactSourceOfWealth implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String sourceCode;

	private String source;

	//bi-directional many-to-one association to ClientFatcaReport
	@OneToMany(mappedBy="masterTransactSourceOfWealth")
	private List<ClientFatcaReport> clientFatcaReports;

	public MasterTransactSourceOfWealth() {
	}

	public String getSourceCode() {
		return this.sourceCode;
	}

	public void setSourceCode(String sourceCode) {
		this.sourceCode = sourceCode;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public List<ClientFatcaReport> getClientFatcaReports() {
		return this.clientFatcaReports;
	}

	public void setClientFatcaReports(List<ClientFatcaReport> clientFatcaReports) {
		this.clientFatcaReports = clientFatcaReports;
	}

	/*public ClientFatcaReport addClientFatcaReport(ClientFatcaReport clientFatcaReport) {
		getClientFatcaReports().add(clientFatcaReport);
		clientFatcaReport.setMasterTransactSourceOfWealth(this);

		return clientFatcaReport;
	}

	public ClientFatcaReport removeClientFatcaReport(ClientFatcaReport clientFatcaReport) {
		getClientFatcaReports().remove(clientFatcaReport);
		clientFatcaReport.setMasterTransactSourceOfWealth(null);

		return clientFatcaReport;
	}*/

}