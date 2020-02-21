package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterInstrumentsList database table.
 * 
 */
@Entity
@Table(name = "masterInstrumentsList")
@NamedQuery(name = "MasterInstrumentsList.findAll", query = "SELECT m FROM MasterInstrumentsList m")
public class MasterInstrumentsList implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int instrumentCode;

	private String instrumentAbbreviation;

	private String instrumentDescription;

	private String instrumentType;

	public MasterInstrumentsList() {
	}

	public int getInstrumentCode() {
		return this.instrumentCode;
	}

	public void setInstrumentCode(int instrumentCode) {
		this.instrumentCode = instrumentCode;
	}

	public String getInstrumentAbbreviation() {
		return this.instrumentAbbreviation;
	}

	public void setInstrumentAbbreviation(String instrumentAbbreviation) {
		this.instrumentAbbreviation = instrumentAbbreviation;
	}

	public String getInstrumentDescription() {
		return this.instrumentDescription;
	}

	public void setInstrumentDescription(String instrumentDescription) {
		this.instrumentDescription = instrumentDescription;
	}

	public String getInstrumentType() {
		return this.instrumentType;
	}

	public void setInstrumentType(String instrumentType) {
		this.instrumentType = instrumentType;
	}

}