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
@Table(name = "lookupTransactInvestmentMode")
@NamedQuery(name = "LookupTransactInvestmentMode.findAll", query = "SELECT l FROM LookupTransactInvestmentMode l")
public class LookupTransactInvestmentMode implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private byte id;

	@Column(nullable = false, length = 50)
	private String description;

	// bi-directional many-to-one association 
	@OneToMany(mappedBy = "lookupTransactInvestmentMode")
	private List<Switch> swich;

	// bi-directional many-to-one association 
	@OneToMany(mappedBy = "lookupTransactInvestmentMode")
	private List<SystematicTransferPlan> stp;

	// bi-directional many-to-one association 
	@OneToMany(mappedBy = "lookupTransactInvestmentMode")
	private List<SystematicWithdrawalPlan> swp;

	public List<SystematicTransferPlan> getStp() {
		return stp;
	}

	public void setStp(List<SystematicTransferPlan> stp) {
		this.stp = stp;
	}

	public List<SystematicWithdrawalPlan> getSwp() {
		return swp;
	}

	public void setSwp(List<SystematicWithdrawalPlan> swp) {
		this.swp = swp;
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

	public List<Switch> getSwich() {
		return swich;
	}

	public void setSwich(List<Switch> swich) {
		this.swich = swich;
	}

}
