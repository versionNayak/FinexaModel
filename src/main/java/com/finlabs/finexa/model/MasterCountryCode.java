package com.finlabs.finexa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterCountryCode database table.
 * 
 */
@Entity
@Table(name = "masterCountryCode")
@NamedQuery(name = "MasterCountryCode.findAll", query = "SELECT m FROM MasterCountryCode m")
public class MasterCountryCode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String country;

	private String countryCode;

	private byte noOfDigitsInMobilePhone;

	private byte noOfDigitsInZipcode;

	public MasterCountryCode() {
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public byte getNoOfDigitsInMobilePhone() {
		return this.noOfDigitsInMobilePhone;
	}

	public void setNoOfDigitsInMobilePhone(byte noOfDigitsInMobilePhone) {
		this.noOfDigitsInMobilePhone = noOfDigitsInMobilePhone;
	}

	public byte getNoOfDigitsInZipcode() {
		return this.noOfDigitsInZipcode;
	}

	public void setNoOfDigitsInZipcode(byte noOfDigitsInZipcode) {
		this.noOfDigitsInZipcode = noOfDigitsInZipcode;
	}

}