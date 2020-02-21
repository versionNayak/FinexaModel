package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the lookupTransactKYCType database table.
 * 
 */
@Entity
@Table(name="lookupTransactKYCType")
@NamedQuery(name="LookupTransactKYCType.findAll", query="SELECT l FROM LookupTransactKYCType l")
public class LookupTransactKYCType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private byte id;

	private String description;

	private byte displayOrder;

	private String value;

	//bi-directional many-to-one association to ClientCKYCDetail
	@OneToMany(mappedBy="lookupTransactKyctype1")
	private List<ClientCKYCDetail> clientCkycdetails1;

	//bi-directional many-to-one association to ClientCKYCDetail
	@OneToMany(mappedBy="lookupTransactKyctype2")
	private List<ClientCKYCDetail> clientCkycdetails2;

	//bi-directional many-to-one association to ClientCKYCDetail
	@OneToMany(mappedBy="lookupTransactKyctype3")
	private List<ClientCKYCDetail> clientCkycdetails3;

	//bi-directional many-to-one association to ClientCKYCDetail
	@OneToMany(mappedBy="lookupTransactKyctype4")
	private List<ClientCKYCDetail> clientCkycdetails4;

	public LookupTransactKYCType() {
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

	public List<ClientCKYCDetail> getClientCkycdetails1() {
		return this.clientCkycdetails1;
	}

	public void setClientCkycdetails1(List<ClientCKYCDetail> clientCkycdetails1) {
		this.clientCkycdetails1 = clientCkycdetails1;
	}

	public ClientCKYCDetail addClientCkycdetails1(ClientCKYCDetail clientCkycdetails1) {
		getClientCkycdetails1().add(clientCkycdetails1);
		clientCkycdetails1.setLookupTransactKyctype1(this);

		return clientCkycdetails1;
	}

	public ClientCKYCDetail removeClientCkycdetails1(ClientCKYCDetail clientCkycdetails1) {
		getClientCkycdetails1().remove(clientCkycdetails1);
		clientCkycdetails1.setLookupTransactKyctype1(null);

		return clientCkycdetails1;
	}

	public List<ClientCKYCDetail> getClientCkycdetails2() {
		return this.clientCkycdetails2;
	}

	public void setClientCkycdetails2(List<ClientCKYCDetail> clientCkycdetails2) {
		this.clientCkycdetails2 = clientCkycdetails2;
	}

	public ClientCKYCDetail addClientCkycdetails2(ClientCKYCDetail clientCkycdetails2) {
		getClientCkycdetails2().add(clientCkycdetails2);
		clientCkycdetails2.setLookupTransactKyctype2(this);

		return clientCkycdetails2;
	}

	public ClientCKYCDetail removeClientCkycdetails2(ClientCKYCDetail clientCkycdetails2) {
		getClientCkycdetails2().remove(clientCkycdetails2);
		clientCkycdetails2.setLookupTransactKyctype2(null);

		return clientCkycdetails2;
	}

	public List<ClientCKYCDetail> getClientCkycdetails3() {
		return this.clientCkycdetails3;
	}

	public void setClientCkycdetails3(List<ClientCKYCDetail> clientCkycdetails3) {
		this.clientCkycdetails3 = clientCkycdetails3;
	}

	public ClientCKYCDetail addClientCkycdetails3(ClientCKYCDetail clientCkycdetails3) {
		getClientCkycdetails3().add(clientCkycdetails3);
		clientCkycdetails3.setLookupTransactKyctype3(this);

		return clientCkycdetails3;
	}

	public ClientCKYCDetail removeClientCkycdetails3(ClientCKYCDetail clientCkycdetails3) {
		getClientCkycdetails3().remove(clientCkycdetails3);
		clientCkycdetails3.setLookupTransactKyctype3(null);

		return clientCkycdetails3;
	}

	public List<ClientCKYCDetail> getClientCkycdetails4() {
		return this.clientCkycdetails4;
	}

	public void setClientCkycdetails4(List<ClientCKYCDetail> clientCkycdetails4) {
		this.clientCkycdetails4 = clientCkycdetails4;
	}

	public ClientCKYCDetail addClientCkycdetails4(ClientCKYCDetail clientCkycdetails4) {
		getClientCkycdetails4().add(clientCkycdetails4);
		clientCkycdetails4.setLookupTransactKyctype4(this);

		return clientCkycdetails4;
	}

	public ClientCKYCDetail removeClientCkycdetails4(ClientCKYCDetail clientCkycdetails4) {
		getClientCkycdetails4().remove(clientCkycdetails4);
		clientCkycdetails4.setLookupTransactKyctype4(null);

		return clientCkycdetails4;
	}

}