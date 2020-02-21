package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class AccordSchemeIsinMasterPK implements Serializable{

	private static final long serialVersionUID = 1L;
	private int schemeCode;
	private String isin;
	public int getSchemeCode() {
		return schemeCode;
	}
	public void setSchemeCode(int schemeCode) {
		this.schemeCode = schemeCode;
	}
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	
	
	
	
}
