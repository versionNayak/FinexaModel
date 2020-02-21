package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the aumMasterBO database table.
 * 
 */
@Entity
@Table(name="aumMasterBO")
@NamedQuery(name="AumMasterBO.findAll", query="SELECT a FROM AumMasterBO a")
public class AumMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AumMasterBOPK id;

	@Column(name="amc_code")
	private String amcCode;

	@Column(name="current_value")
	private String currentValue;

	private String distributorarncode;

	@Column(name="investor_name")
	private String investorName;

	private String nav;

	@Column(name="pin_code")
	private String pinCode;

	@Column(name="scheme_name")
	private String schemeName;

	@Column(name="sub_broker_code")
	private String subBrokerCode;

	@Column(name="unit_balance")
	private String unitBalance;

	//bi-directional many-to-one association to AdvisorUser
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="advisorID")
	private AdvisorUser advisorUser;

	//bi-directional many-to-one association to LookupRTABO
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="rtaID")
	private LookupRTABO lookupRtabo;

	public AumMasterBO() {
	}

	public AumMasterBOPK getId() {
		return this.id;
	}

	public void setId(AumMasterBOPK id) {
		this.id = id;
	}

	public String getAmcCode() {
		return this.amcCode;
	}

	public void setAmcCode(String amcCode) {
		this.amcCode = amcCode;
	}

	public String getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}

	public String getDistributorarncode() {
		return this.distributorarncode;
	}

	public void setDistributorarncode(String distributorarncode) {
		this.distributorarncode = distributorarncode;
	}

	public String getInvestorName() {
		return this.investorName;
	}

	public void setInvestorName(String investorName) {
		this.investorName = investorName;
	}

	public String getNav() {
		return this.nav;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}

	public String getPinCode() {
		return this.pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSubBrokerCode() {
		return this.subBrokerCode;
	}

	public void setSubBrokerCode(String subBrokerCode) {
		this.subBrokerCode = subBrokerCode;
	}

	public String getUnitBalance() {
		return this.unitBalance;
	}

	public void setUnitBalance(String unitBalance) {
		this.unitBalance = unitBalance;
	}

	public AdvisorUser getAdvisorUser() {
		return this.advisorUser;
	}

	public void setAdvisorUser(AdvisorUser advisorUser) {
		this.advisorUser = advisorUser;
	}

	public LookupRTABO getLookupRtabo() {
		return this.lookupRtabo;
	}

	public void setLookupRtabo(LookupRTABO lookupRtabo) {
		this.lookupRtabo = lookupRtabo;
	}

}