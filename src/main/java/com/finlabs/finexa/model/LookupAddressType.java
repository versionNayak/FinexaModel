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


@Entity
@Table(name = "lookupAddressType")
@NamedQuery(name = "LookupAddressType.findAll", query = "SELECT l FROM LookupAddressType l")
public class LookupAddressType implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	@Column(nullable = false, length = 50)
	private String description;

	// bi-directional many-to-one association 
	@OneToMany(mappedBy = "lookupAddressType")
	private List<FATCADeclaration> fatcaDeclaration;

	public byte getId() {
		return id;
	}

	public void setId(byte id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<FATCADeclaration> getFatcaDeclaration() {
		return fatcaDeclaration;
	}

	public void setFatcaDeclaration(List<FATCADeclaration> fatcaDeclaration) {
		this.fatcaDeclaration = fatcaDeclaration;
	}
	
	

}
