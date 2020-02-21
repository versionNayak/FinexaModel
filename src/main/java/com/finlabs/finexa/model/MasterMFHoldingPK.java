package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The primary key class for the masterMFHolding database table.
 * 
 */
@Embeddable
public class MasterMFHoldingPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;
	// bi-directional many-to-one association to MasterMutualFundETF
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "isin")
	private MasterMutualFundETF masterMutualFundEtf;

	// bi-directional many-to-one association to MasterInstrumentsList
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "assetTypeCode")
	private MasterInstrumentsList masterInstrumentsList;
	private int amfiCode;

	private int companyCode;

	@Temporal(TemporalType.DATE)
	private java.util.Date assetDate;

	public MasterMFHoldingPK() {
	}

	public int getAmfiCode() {
		return this.amfiCode;
	}

	public void setAmfiCode(int amfiCode) {
		this.amfiCode = amfiCode;
	}

	public int getCompanyCode() {
		return this.companyCode;
	}

	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}

	public java.util.Date getAssetDate() {
		return this.assetDate;
	}

	public void setAssetDate(java.util.Date assetDate) {
		this.assetDate = assetDate;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof MasterMFHoldingPK)) {
			return false;
		}
		MasterMFHoldingPK castOther = (MasterMFHoldingPK) other;
		return this.masterMutualFundEtf.getIsin().equals(castOther.masterMutualFundEtf.getIsin())
				&& (this.amfiCode == castOther.amfiCode) && (this.companyCode == castOther.companyCode)
				&& (this.masterInstrumentsList.getInstrumentCode() == castOther.masterInstrumentsList
						.getInstrumentCode())
				&& this.assetDate.equals(castOther.assetDate);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.masterMutualFundEtf.getIsin().hashCode();
		hash = hash * prime + this.amfiCode;
		hash = hash * prime + this.companyCode;
		hash = hash * prime + this.masterInstrumentsList.getInstrumentCode();
		hash = hash * prime + this.assetDate.hashCode();

		return hash;
	}

	public MasterMutualFundETF getMasterMutualFundEtf() {
		return masterMutualFundEtf;
	}

	public void setMasterMutualFundEtf(MasterMutualFundETF masterMutualFundEtf) {
		this.masterMutualFundEtf = masterMutualFundEtf;
	}

	
	public MasterInstrumentsList getMasterInstrumentsList() {
		return masterInstrumentsList;
	}

	public void setMasterInstrumentsList(MasterInstrumentsList masterInstrumentsList) {
		this.masterInstrumentsList = masterInstrumentsList;
	}

}