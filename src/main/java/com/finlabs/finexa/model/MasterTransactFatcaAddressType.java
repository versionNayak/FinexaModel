package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the masterTransactFatcaAddressType database table.
 * 
 */
@Entity
@Table(name="masterTransactFatcaAddressType")
@NamedQuery(name="MasterTransactFatcaAddressType.findAll", query="SELECT m FROM MasterTransactFatcaAddressType m")
public class MasterTransactFatcaAddressType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String code;

	private String details;

	public MasterTransactFatcaAddressType() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

}