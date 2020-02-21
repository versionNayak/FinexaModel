package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the masterNonNPSAnnuityProvider database table.
 * 
 */
@Entity
@Table(name = "masterNonNPSAnnuityProvider")
@NamedQuery(name = "MasterNonNPSAnnuityProvider.findAll", query = "SELECT m FROM MasterNonNPSAnnuityProvider m")
public class MasterNonNPSAnnuityProvider implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String name;

	public MasterNonNPSAnnuityProvider() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}