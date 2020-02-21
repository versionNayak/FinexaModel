package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

/**
 * The persistent class for the masterpacoverreco database table.
 * 
 */
@Entity
@Table(name = "masterPACoverReco")
@NamedQuery(name="MasterPaCoverReco.findAll", query="SELECT m FROM MasterPaCoverReco m")
public class MasterPaCoverReco implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pACoverIncomeMultiplierId;

	@Temporal(TemporalType.DATE)
	private Date fromDate;

	private double pACoverIncomeMultiplier;

	@Temporal(TemporalType.DATE)
	private Date toDate;

	public MasterPaCoverReco() {
	}

	public int getPACoverIncomeMultiplierId() {
		return this.pACoverIncomeMultiplierId;
	}

	public void setPACoverIncomeMultiplierId(int pACoverIncomeMultiplierId) {
		this.pACoverIncomeMultiplierId = pACoverIncomeMultiplierId;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public double getPACoverIncomeMultiplier() {
		return this.pACoverIncomeMultiplier;
	}

	public void setPACoverIncomeMultiplier(double pACoverIncomeMultiplier) {
		this.pACoverIncomeMultiplier = pACoverIncomeMultiplier;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

}