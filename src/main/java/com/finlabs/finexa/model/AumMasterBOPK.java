package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the aumMasterBO database table.
 * 
 */
@Embeddable
public class AumMasterBOPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String schemertacode;

	@Column(name="folio_number")
	private String folioNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="report_date")
	private java.util.Date reportDate;

	public AumMasterBOPK() {
	}
	public String getSchemertacode() {
		return this.schemertacode;
	}
	public void setSchemertacode(String schemertacode) {
		this.schemertacode = schemertacode;
	}
	public String getFolioNumber() {
		return this.folioNumber;
	}
	public void setFolioNumber(String folioNumber) {
		this.folioNumber = folioNumber;
	}
	public java.util.Date getReportDate() {
		return this.reportDate;
	}
	public void setReportDate(java.util.Date reportDate) {
		this.reportDate = reportDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AumMasterBOPK)) {
			return false;
		}
		AumMasterBOPK castOther = (AumMasterBOPK)other;
		return 
			this.schemertacode.equals(castOther.schemertacode)
			&& this.folioNumber.equals(castOther.folioNumber)
			&& this.reportDate.equals(castOther.reportDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.schemertacode.hashCode();
		hash = hash * prime + this.folioNumber.hashCode();
		hash = hash * prime + this.reportDate.hashCode();
		
		return hash;
	}
}