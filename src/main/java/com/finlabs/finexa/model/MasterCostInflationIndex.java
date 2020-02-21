package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the masterCostInflationIndex database table.
 * 
 */
@Entity
@Table(name="masterCostInflationIndex")
@NamedQuery(name="MasterCostInflationIndex.findAll", query="SELECT m FROM MasterCostInflationIndex m")
public class MasterCostInflationIndex implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private int costInflationIndex;

	private String financialYear;

	public MasterCostInflationIndex() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCostInflationIndex() {
		return this.costInflationIndex;
	}

	public void setCostInflationIndex(int costInflationIndex) {
		this.costInflationIndex = costInflationIndex;
	}

	public String getFinancialYear() {
		return this.financialYear;
	}

	public void setFinancialYear(String financialYear) {
		this.financialYear = financialYear;
	}

}