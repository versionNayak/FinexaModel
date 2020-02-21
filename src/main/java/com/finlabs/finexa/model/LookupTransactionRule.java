package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the lookupTransactionRule database table.
 * 
 */
@Entity
@Table(name="lookupTransactionRule")
@NamedQuery(name="LookupTransactionRule.findAll", query="SELECT l FROM LookupTransactionRule l")
public class LookupTransactionRule implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String code;

	private String description;

	private String effect;

	//bi-directional many-to-one association to TransactionMasterBO
	@OneToMany(mappedBy="lookupTransactionRule")
	private List<TransactionMasterBO> transactionMasterBos;

	public LookupTransactionRule() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEffect() {
		return this.effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public List<TransactionMasterBO> getTransactionMasterBos() {
		return this.transactionMasterBos;
	}

	public void setTransactionMasterBos(List<TransactionMasterBO> transactionMasterBos) {
		this.transactionMasterBos = transactionMasterBos;
	}

	public TransactionMasterBO addTransactionMasterBo(TransactionMasterBO transactionMasterBo) {
		getTransactionMasterBos().add(transactionMasterBo);
		transactionMasterBo.setLookupTransactionRule(this);

		return transactionMasterBo;
	}

	public TransactionMasterBO removeTransactionMasterBo(TransactionMasterBO transactionMasterBo) {
		getTransactionMasterBos().remove(transactionMasterBo);
		transactionMasterBo.setLookupTransactionRule(null);

		return transactionMasterBo;
	}

}