package com.finlabs.finexa.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
//import org.hibernate.annotations.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "lookupRole")
@NamedQuery(name = "LookupRole.findAll", query = "SELECT l FROM LookupRole l")
public class LookupRole implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	//@Cascade({CascadeType.ALL})
	private String description;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="supervisorID")
	private LookupRole supervisorID;

	@OneToMany(mappedBy="supervisorID")
	private List<LookupRole> roles = new ArrayList<LookupRole>();

	public LookupRole() {
	}

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

	public LookupRole getSupervisorID() {
		return supervisorID;
	}

	public void setSupervisorID(LookupRole supervisorID) {
		this.supervisorID = supervisorID;
	}

	public List<LookupRole> getRoles() {
		return roles;
	}

	public void setRoles(List<LookupRole> roles) {
		this.roles = roles;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

}