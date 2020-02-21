package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the pdfParserCount database table.
 * 
 */
@Embeddable
public class PdfParserCountPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String pan;

	@Temporal(TemporalType.DATE)
	private java.util.Date date;

	public PdfParserCountPK() {
	}
	public String getPan() {
		return this.pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public java.util.Date getDate() {
		return this.date;
	}
	public void setDate(java.util.Date date) {
		this.date = date;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof PdfParserCountPK)) {
			return false;
		}
		PdfParserCountPK castOther = (PdfParserCountPK)other;
		return 
			this.pan.equals(castOther.pan)
			&& this.date.equals(castOther.date);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.pan.hashCode();
		hash = hash * prime + this.date.hashCode();
		
		return hash;
	}
}