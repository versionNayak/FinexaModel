package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the masterTransactIncome database table.
 * 
 */
@Entity
@Table(name="masterTransactIncome")
@NamedQuery(name="MasterTransactIncome.findAll", query="SELECT m FROM MasterTransactIncome m")
public class MasterTransactIncome implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String incomeCode;

	private String income;

	//bi-directional many-to-one association to ClientFatcaReport
	@OneToMany(mappedBy="masterTransactIncome")
	private List<ClientFatcaReport> clientFatcaReports;

	public MasterTransactIncome() {
	}

	public String getIncomeCode() {
		return this.incomeCode;
	}

	public void setIncomeCode(String incomeCode) {
		this.incomeCode = incomeCode;
	}

	public String getIncome() {
		return this.income;
	}

	public void setIncome(String income) {
		this.income = income;
	}

	public List<ClientFatcaReport> getClientFatcaReports() {
		return this.clientFatcaReports;
	}

	public void setClientFatcaReports(List<ClientFatcaReport> clientFatcaReports) {
		this.clientFatcaReports = clientFatcaReports;
	}

	/*public ClientFatcaReport addClientFatcaReport(ClientFatcaReport clientFatcaReport) {
		getClientFatcaReports().add(clientFatcaReport);
		clientFatcaReport.setMasterTransactIncome(this);

		return clientFatcaReport;
	}

	public ClientFatcaReport removeClientFatcaReport(ClientFatcaReport clientFatcaReport) {
		getClientFatcaReports().remove(clientFatcaReport);
		clientFatcaReport.setMasterTransactIncome(null);

		return clientFatcaReport;
	}*/

}