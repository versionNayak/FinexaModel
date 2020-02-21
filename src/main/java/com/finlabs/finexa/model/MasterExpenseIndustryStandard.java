package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 * The persistent class for the masterExpenseIndustryStandard database table.
 * 
 */
@Entity
@Table(name = "masterExpenseIndustryStandard")
@NamedQuery(name = "MasterExpenseIndustryStandard.findAll", query = "SELECT m FROM MasterExpenseIndustryStandard m")
public class MasterExpenseIndustryStandard implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	private String expenseCategory;

	private BigDecimal percentOfTotal;

	public MasterExpenseIndustryStandard() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getExpenseCategory() {
		return this.expenseCategory;
	}

	public void setExpenseCategory(String expenseCategory) {
		this.expenseCategory = expenseCategory;
	}

	public BigDecimal getPercentOfTotal() {
		return this.percentOfTotal;
	}

	public void setPercentOfTotal(BigDecimal percentOfTotal) {
		this.percentOfTotal = percentOfTotal;
	}

}