package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the masterTransactSIP database table.
 * 
 */
@Entity
@Table(name="masterTransactSIP")
@NamedQuery(name="MasterTransactSIP.findAll", query="SELECT m FROM MasterTransactSIP m")
public class MasterTransactSIP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private int id;

	private String amcCode;

	private String amcName;

	private String schemeCode;

	private String schemeIsin;

	private String schemeName;

	private String schemeType;

	private String sipDates;

	private String sipFrequency;

	private Integer sipInstallmentGap;

	private Integer sipMaximumGap;

	private Integer sipMaximumInstallmentAmount;

	private Integer sipMaximumInstallmentNumbers;

	private Integer sipMinimumGap;

	private Integer sipMinimumInstallmentAmount;

	private Integer sipMinimumInstallmentNumbers;

	private Integer sipMultiplierAmount;

	private Integer sipStatus;

	private String sipTransactionMode;

	public MasterTransactSIP() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAmcCode() {
		return this.amcCode;
	}

	public void setAmcCode(String amcCode) {
		this.amcCode = amcCode;
	}

	public String getAmcName() {
		return this.amcName;
	}

	public void setAmcName(String amcName) {
		this.amcName = amcName;
	}

	public String getSchemeCode() {
		return this.schemeCode;
	}

	public void setSchemeCode(String schemeCode) {
		this.schemeCode = schemeCode;
	}

	public String getSchemeIsin() {
		return this.schemeIsin;
	}

	public void setSchemeIsin(String schemeIsin) {
		this.schemeIsin = schemeIsin;
	}

	public String getSchemeName() {
		return this.schemeName;
	}

	public void setSchemeName(String schemeName) {
		this.schemeName = schemeName;
	}

	public String getSchemeType() {
		return this.schemeType;
	}

	public void setSchemeType(String schemeType) {
		this.schemeType = schemeType;
	}

	public String getSipDates() {
		return this.sipDates;
	}

	public void setSipDates(String sipDates) {
		this.sipDates = sipDates;
	}

	public String getSipFrequency() {
		return this.sipFrequency;
	}

	public void setSipFrequency(String sipFrequency) {
		this.sipFrequency = sipFrequency;
	}

	public Integer getSipInstallmentGap() {
		return this.sipInstallmentGap;
	}

	public void setSipInstallmentGap(Integer sipInstallmentGap) {
		this.sipInstallmentGap = sipInstallmentGap;
	}

	public Integer getSipMaximumGap() {
		return this.sipMaximumGap;
	}

	public void setSipMaximumGap(Integer sipMaximumGap) {
		this.sipMaximumGap = sipMaximumGap;
	}

	public Integer getSipMaximumInstallmentAmount() {
		return this.sipMaximumInstallmentAmount;
	}

	public void setSipMaximumInstallmentAmount(Integer sipMaximumInstallmentAmount) {
		this.sipMaximumInstallmentAmount = sipMaximumInstallmentAmount;
	}

	public Integer getSipMaximumInstallmentNumbers() {
		return this.sipMaximumInstallmentNumbers;
	}

	public void setSipMaximumInstallmentNumbers(Integer sipMaximumInstallmentNumbers) {
		this.sipMaximumInstallmentNumbers = sipMaximumInstallmentNumbers;
	}

	public Integer getSipMinimumGap() {
		return this.sipMinimumGap;
	}

	public void setSipMinimumGap(Integer sipMinimumGap) {
		this.sipMinimumGap = sipMinimumGap;
	}

	public Integer getSipMinimumInstallmentAmount() {
		return this.sipMinimumInstallmentAmount;
	}

	public void setSipMinimumInstallmentAmount(Integer sipMinimumInstallmentAmount) {
		this.sipMinimumInstallmentAmount = sipMinimumInstallmentAmount;
	}

	public Integer getSipMinimumInstallmentNumbers() {
		return this.sipMinimumInstallmentNumbers;
	}

	public void setSipMinimumInstallmentNumbers(Integer sipMinimumInstallmentNumbers) {
		this.sipMinimumInstallmentNumbers = sipMinimumInstallmentNumbers;
	}

	public Integer getSipMultiplierAmount() {
		return this.sipMultiplierAmount;
	}

	public void setSipMultiplierAmount(Integer sipMultiplierAmount) {
		this.sipMultiplierAmount = sipMultiplierAmount;
	}

	public Integer getSipStatus() {
		return this.sipStatus;
	}

	public void setSipStatus(Integer sipStatus) {
		this.sipStatus = sipStatus;
	}

	public String getSipTransactionMode() {
		return this.sipTransactionMode;
	}

	public void setSipTransactionMode(String sipTransactionMode) {
		this.sipTransactionMode = sipTransactionMode;
	}

}