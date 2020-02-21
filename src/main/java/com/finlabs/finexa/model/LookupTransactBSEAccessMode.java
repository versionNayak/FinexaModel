package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the lookupTransactBSEAccessMode database table.
 * 
 */
@Entity
@Table(name="lookupTransactBSEAccessMode")
@NamedQuery(name="LookupTransactBSEAccessMode.findAll", query="SELECT l FROM LookupTransactBSEAccessMode l")
public class LookupTransactBSEAccessMode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private byte id;

	private String description;

	private Byte displayOrder;

	private String value;

	//bi-directional many-to-one association to AdvisorUser
	@OneToMany(mappedBy="lookupTransactBseaccessMode")
	private List<AdvisorUser> advisorUsers;

	public LookupTransactBSEAccessMode() {
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

	public Byte getDisplayOrder() {
		return this.displayOrder;
	}

	public void setDisplayOrder(Byte displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public List<AdvisorUser> getAdvisorUsers() {
		return this.advisorUsers;
	}

	public void setAdvisorUsers(List<AdvisorUser> advisorUsers) {
		this.advisorUsers = advisorUsers;
	}

	public AdvisorUser addAdvisorUser(AdvisorUser advisorUser) {
		getAdvisorUsers().add(advisorUser);
		advisorUser.setLookupTransactBseaccessMode(this);

		return advisorUser;
	}

	public AdvisorUser removeAdvisorUser(AdvisorUser advisorUser) {
		getAdvisorUsers().remove(advisorUser);
		advisorUser.setLookupTransactBseaccessMode(null);

		return advisorUser;
	}

}