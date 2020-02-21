package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the lookupInsuranceType database table.
 * 
 */
@Entity
@Table(name = "lookupInsuranceType")
@NamedQuery(name = "LookupInsuranceType.findAll", query = "SELECT l FROM LookupInsuranceType l")
public class LookupInsuranceType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	private String description;

	private byte displayOrder;

	// bi-directional many-to-one association to LookupInsurancePolicyType
	@OneToMany(mappedBy = "lookupInsuranceType")
	private List<LookupInsurancePolicyType> lookupInsurancePolicyTypes;

	public LookupInsuranceType() {
	}

	public byte getId() {
		return this.id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(byte displayOrder) {
		this.displayOrder = displayOrder;
	}

	public List<LookupInsurancePolicyType> getLookupInsurancePolicyTypes() {
		return this.lookupInsurancePolicyTypes;
	}

	public void setLookupInsurancePolicyTypes(List<LookupInsurancePolicyType> lookupInsurancePolicyTypes) {
		this.lookupInsurancePolicyTypes = lookupInsurancePolicyTypes;
	}

	public LookupInsurancePolicyType addLookupInsurancePolicyType(LookupInsurancePolicyType lookupInsurancePolicyType) {
		getLookupInsurancePolicyTypes().add(lookupInsurancePolicyType);
		lookupInsurancePolicyType.setLookupInsuranceType(this);

		return lookupInsurancePolicyType;
	}

	public LookupInsurancePolicyType removeLookupInsurancePolicyType(
			LookupInsurancePolicyType lookupInsurancePolicyType) {
		getLookupInsurancePolicyTypes().remove(lookupInsurancePolicyType);
		lookupInsurancePolicyType.setLookupInsuranceType(null);

		return lookupInsurancePolicyType;
	}

}