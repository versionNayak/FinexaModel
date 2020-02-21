package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the lookupTansactHoldingType database table.
 * 
 */
@Entity
@Table(name="lookupTansactHoldingType")
@NamedQuery(name="LookupTansactHoldingType.findAll", query="SELECT l FROM LookupTansactHoldingType l")
public class LookupTansactHoldingType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private byte id;

	private String description;

	private byte displayOrder;

	private String value;

	//bi-directional many-to-one association to ClientUCCDetail
	@OneToMany(mappedBy="lookupTansactHoldingType")
	private List<ClientUCCDetail> clientUccdetails;

	public LookupTansactHoldingType() {
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

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<ClientUCCDetail> getClientUccdetails() {
		return this.clientUccdetails;
	}

	public void setClientUccdetails(List<ClientUCCDetail> clientUccdetails) {
		this.clientUccdetails = clientUccdetails;
	}

	public ClientUCCDetail addClientUccdetail(ClientUCCDetail clientUccdetail) {
		getClientUccdetails().add(clientUccdetail);
		clientUccdetail.setLookupTansactHoldingType(this);

		return clientUccdetail;
	}

	public ClientUCCDetail removeClientUccdetail(ClientUCCDetail clientUccdetail) {
		getClientUccdetails().remove(clientUccdetail);
		clientUccdetail.setLookupTansactHoldingType(null);

		return clientUccdetail;
	}

}