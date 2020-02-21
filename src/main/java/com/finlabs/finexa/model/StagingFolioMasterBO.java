package com.finlabs.finexa.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the stagingfoliomasterbo database table.
 * 
 */
@Entity
@Table(name = "stagingFolioMasterBO")
@NamedQuery(name="StagingFolioMasterBO.findAll", query="SELECT s FROM StagingFolioMasterBO s")
public class StagingFolioMasterBO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String investorFolio;

	//bi-directional many-to-one association to Staginginvestormasterbo
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="stagingInvestorMasterID")
	private StagingInvestorMasterBO staginginvestormasterbo;

	public StagingFolioMasterBO() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInvestorFolio() {
		return this.investorFolio;
	}

	public void setInvestorFolio(String investorFolio) {
		this.investorFolio = investorFolio;
	}

	public StagingInvestorMasterBO getStaginginvestormasterbo() {
		return this.staginginvestormasterbo;
	}

	public void setStaginginvestormasterbo(StagingInvestorMasterBO staginginvestormasterbo) {
		this.staginginvestormasterbo = staginginvestormasterbo;
	}

}