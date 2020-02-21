package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the masterTransactIdentificationType database table.
 * 
 */
@Entity
@Table(name="masterTransactIdentificationType")
@NamedQuery(name="MasterTransactIdentificationType.findAll", query="SELECT m FROM MasterTransactIdentificationType m")
public class MasterTransactIdentificationType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String code;

	private String details;

	public MasterTransactIdentificationType() {
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