package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the brokerageMasterBO database table.
 * 
 */
@Embeddable
public class BrokerageMasterBOPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String transactionNumber;

	@Temporal(TemporalType.DATE)
	private java.util.Date processDate;

	@Temporal(TemporalType.DATE)
	private java.util.Date transactionDate;

	public BrokerageMasterBOPK() {
	}
	public String getTransactionNumber() {
		return this.transactionNumber;
	}
	public void setTransactionNumber(String transactionNumber) {
		this.transactionNumber = transactionNumber;
	}
	public java.util.Date getProcessDate() {
		return this.processDate;
	}
	public void setProcessDate(java.util.Date processDate) {
		this.processDate = processDate;
	}
	public java.util.Date getTransactionDate() {
		return this.transactionDate;
	}
	public void setTransactionDate(java.util.Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof BrokerageMasterBOPK)) {
			return false;
		}
		BrokerageMasterBOPK castOther = (BrokerageMasterBOPK)other;
		return 
			this.transactionNumber.equals(castOther.transactionNumber)
			&& this.processDate.equals(castOther.processDate)
			&& this.transactionDate.equals(castOther.transactionDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.transactionNumber.hashCode();
		hash = hash * prime + this.processDate.hashCode();
		hash = hash * prime + this.transactionDate.hashCode();
		
		return hash;
	}
}