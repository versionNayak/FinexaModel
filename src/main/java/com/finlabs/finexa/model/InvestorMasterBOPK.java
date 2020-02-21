package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the investorMasterBO database table.
 * 
 */
@Embeddable
public class InvestorMasterBOPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String folioNumber;

	private String investorPAN;

	public InvestorMasterBOPK() {
	}
	public String getFolioNumber() {
		return this.folioNumber;
	}
	public void setFolioNumber(String folioNumber) {
		this.folioNumber = folioNumber;
	}
	public String getInvestorPAN() {
		return this.investorPAN;
	}
	public void setInvestorPAN(String investorPAN) {
		this.investorPAN = investorPAN;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof InvestorMasterBOPK)) {
			return false;
		}
		InvestorMasterBOPK castOther = (InvestorMasterBOPK)other;
		return 
			this.folioNumber.equals(castOther.folioNumber)
			&& this.investorPAN.equals(castOther.investorPAN);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.folioNumber.hashCode();
		hash = hash * prime + this.investorPAN.hashCode();
		
		return hash;
	}
}