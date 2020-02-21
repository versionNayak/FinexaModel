package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the masterTransactCountryNationality database table.
 * 
 */
@Entity
@Table(name="masterTransactCountryNationality")
@NamedQuery(name="MasterTransactCountryNationality.findAll", query="SELECT m FROM MasterTransactCountryNationality m")
public class MasterTransactCountryNationality implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String countryCode;

	private String country;

	public MasterTransactCountryNationality() {
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}